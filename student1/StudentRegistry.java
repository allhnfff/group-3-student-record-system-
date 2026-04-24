package student1;

import shared.Student;

public class StudentRegistry {

    Student[] students = new Student[2]; 
    int size = 0;

    public void addStudent(Student s) {

        if (size == students.length) {

            Student[] newStudents = new Student[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[size] = s;
        size++;
    }

    public void listAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i].nim + " - " + students[i].name);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public void findByNim(String nim) {
        for (int i = 0; i < size; i++) {
            if (students[i].nim.equals(nim)) {
                System.out.println("Ditemukan: " + students[i].name);
                return;
            }
        }
        System.out.println("Data tidak ditemukan");
    }

    public void findByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].name.equals(name)) {
                System.out.println("Ditemukan: " + students[i].nim);
                return;
            }
        }
        System.out.println("Mahasiswa tidak ditemukan");
    }

    public void removeStudent(String nim) {
        for (int i = 0; i < size; i++) {

            if (students[i].nim.equals(nim)) {

                // geser data ke kiri
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }

                size--;

                System.out.println("Data berhasil dihapus");
                return;
            }
        }

        System.out.println("Data mahasiswa tidak ditemukan");
    }
}
