package student4;

import shared.Student;

public class CourseRosterMap {

    private class Entry {
        String courseCode;
        Student[] students;
        int studentCount;
        Entry next;

        Entry(String courseCode) {
            this.courseCode = courseCode;
            this.students = new Student[10];
            this.studentCount = 0;
            this.next = null;
        }

        void addStudent(Student student) {
            if (studentCount == students.length) {
                Student[] newStudents = new Student[students.length * 2];
                for (int i = 0; i < students.length; i++) {
                    newStudents[i] = students[i];
                }
                students = newStudents;
            }
            students[studentCount] = student;
            studentCount++;
        }

        boolean removeStudentByNim(String nim) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].nim.equals(nim)) {
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[studentCount - 1] = null;
                    studentCount--;
                    return true;
                }
            }
            return false;
        }
    }

    private Entry[] buckets;
    private int size;

    public CourseRosterMap() {
        buckets = new Entry[10];
        size = 0;
    }

    private int hash(String courseCode) {
        int hash = 0;
        for (int i = 0; i < courseCode.length(); i++) {
            hash += courseCode.charAt(i);
        }
        return hash % buckets.length;
    }

    public void enrollStudent(String courseCode, Student student) {
        int index = hash(courseCode);
        Entry current = buckets[index];

        while (current != null) {
            if (current.courseCode.equals(courseCode)) {
                current.addStudent(student);
                return;
            }
            current = current.next;
        }

        Entry newEntry = new Entry(courseCode);
        newEntry.addStudent(student);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
        size++;
    }

    public void getStudentsInCourse(String courseCode) {
        int index = hash(courseCode);
        Entry current = buckets[index];

        while (current != null) {
            if (current.courseCode.equals(courseCode)) {
                System.out.println("=== Peserta " + courseCode + " ===");
                for (int i = 0; i < current.studentCount; i++) {
                    System.out.println((i + 1) + ". [" + current.students[i].nim + "] " + current.students[i].name);
                }
                return;
            }
            current = current.next;
        }

        System.out.println("Matakuliah " + courseCode + " tidak ditemukan.");
    }

    public void dropStudent(String courseCode, String nim) {
        int index = hash(courseCode);
        Entry current = buckets[index];

        while (current != null) {
            if (current.courseCode.equals(courseCode)) {
                for (int i = 0; i < current.studentCount; i++) {
                    if (current.students[i].nim.equals(nim)) {
                        String nama = current.students[i].name;
                        current.removeStudentByNim(nim);
                        System.out.println(nama + " keluar dari " + courseCode + ".");
                        return;
                    }
                }
                System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan di " + courseCode + ".");
                return;
            }
            current = current.next;
        }

        System.out.println("Matakuliah " + courseCode + " tidak ditemukan.");
    }

    public void listCourses() {
        System.out.println("=== Daftar Matakuliah ===");
        for (int i = 0; i < buckets.length; i++) {
            Entry current = buckets[i];
            while (current != null) {
                System.out.println("- " + current.courseCode + " : " + current.studentCount + " mahasiswa");
                current = current.next;
            }
        }
    }

    public int size() {
        return size;
    }
}