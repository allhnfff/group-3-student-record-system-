package student2;

import shared.Student;

public class PriorityEnrollmentQueueDemo {
    public static void main(String[] args) {
        PriorityEnrollmentQueue pq = new PriorityEnrollmentQueue();

        // Menggunakan constructor Student(id,name)
        pq.enqueue(new Student("NIM003", "Rizky"), 3.45);
        pq.enqueue(new Student("NIM001", "Fajar"), 3.80);
        pq.enqueue(new Student("NIM004", "Hana"), 2.95);

        //cetak daftar antrian (terurut dari IPK tertinggi)
        pq.display();

        System.out.println();
        
        // Dequeue sesuai urutan prioritas IPK
        pq.dequeueMax();
        pq.dequeueMax();
        pq.dequeueMax();

    
    }
}

