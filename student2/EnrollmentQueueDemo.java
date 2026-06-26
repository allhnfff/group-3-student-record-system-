package student2;

import shared.Student;

public class EnrollmentQueueDemo {

    public static void main(String[] args) {

        EnrollmentQueue queue = new EnrollmentQueue();

        Student s1 = new Student("001", "Andi");
        Student s2 = new Student("002", "Budi");
        Student s3 = new Student("003", "Siti");

        // Tambah data
        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);

        System.out.println();

        // Tampilkan antrian
        queue.displayQueue();

        System.out.println();

        // Hapus data
        queue.dequeue();

        System.out.println();

        // Lihat data depan
        queue.peek();

        System.out.println();

        // Tampilkan lagi
        queue.displayQueue();
    }
}