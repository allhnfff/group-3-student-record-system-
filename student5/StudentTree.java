package student5;
import shared.Student;

public class StudentTree {
    // Ini kerangka dasar, silakan isi logika tree-mu di sini
    public void insert(Student s) {
        System.out.println("Menambahkan: " + s.getName());
    }

    public void traverse() {
        System.out.println("Menampilkan data Tree...");
    }

    public Student search(String nim) {
        return null; // Ganti dengan logika search milikmu
    }
}