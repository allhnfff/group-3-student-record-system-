package student1;

import shared.Student;

public class StudentRegistryDemo {
    public static void main(String[] args) {

        StudentRegistry reg = new StudentRegistry();

        System.out.println("=== PROGRAM DATA MAHASISWA ===");

        // tambah data
        reg.addStudent(new Student("001", "Andi"));
        reg.addStudent(new Student("002", "Budi"));
        reg.addStudent(new Student("003", "Citra"));

        // tampilkan semua
        System.out.println("\nData Awal:");
        reg.listAll();

        // FIND BY NIM
        System.out.println("\nCari NIM 002:");
        reg.findByNim("002");

        // REMOVE
        System.out.println("\nHapus NIM 002");
        reg.removeStudent("002");

        // tampilkan lagi setelah hapus
        System.out.println("\nData Setelah Dihapus:");
        reg.listAll();

        System.out.println("\nJumlah mahasiswa: " + reg.size());

        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}