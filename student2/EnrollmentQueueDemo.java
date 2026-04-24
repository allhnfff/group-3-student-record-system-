package student2;

public class EnrollmentQueueDemo {
    public static void main(String[] args) {
        EnrollmentQueue queue = new EnrollmentQueue();

        Student s1 = new Student( "001", "syifa", "SI", 2023);
        Student s2 = new Student( nim: "002", "Budi", "TI", 2022);
        Student s3 = new Student( "003", "Lani", "TI", 2025);

        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);

        queue.displayQueue();

        queue.dequeue();

        queue.peek();
    }  
}
