package student1;

import shared.Student;

public class StudentSorterDemo {

    public static void main(String[] args) {

        Student[] students = {

            new Student(
                "23001",
                "Budi",
                "Informatika",
                2023
            ),

            new Student(
                "23002",
                "Andi",
                "Sistem Informasi",
                2024
            ),

            new Student(
                "23003",
                "Citra",
                "Informatika",
                2022
            ),

            new Student(
                "23004",
                "Dimas",
                "Teknik Elektro",
                2021
            ),

            new Student(
                "23005",
                "Aisyah",
                "Sistem Informasi",
                2023
            )

        };

        StudentSorter sorter = new StudentSorter(students);

        sorter.sortByName();
        sorter.printList("=== Data Berdasarkan Nama ===");

        System.out.println();

        sorter.sortByYear();
        sorter.printList("=== Data Berdasarkan Tahun ===");

    }

}