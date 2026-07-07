package student1;

import shared.Student;

public class StudentSorter {

    private Student[] students;
    private int size;

    public StudentSorter(Student[] students) {
        this.students = students;
        this.size = students.length;
    }

    // Selection Sort berdasarkan Nama
    public void sortByName() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (students[j].getName()
                        .compareToIgnoreCase(students[minIndex].getName()) < 0) {

                    minIndex = j;
                }
            }

            Student temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    // Insertion Sort berdasarkan Tahun
    public void sortByYear() {

        for (int i = 1; i < size; i++) {

            Student key = students[i];
            int j = i - 1;

            while (j >= 0 &&
                    students[j].getYear() > key.getYear()) {

                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }

    // Menampilkan data
    public void printList(String title) {

        System.out.println(title);

        for (int i = 0; i < size; i++) {

            System.out.println(
                    students[i].getNim() + " | "
                    + students[i].getName() + " | "
                    + students[i].getMajor() + " | "
                    + students[i].getYear());
        }

        System.out.println();
    }
}