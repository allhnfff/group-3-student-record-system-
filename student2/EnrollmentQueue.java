package student2;

import java.util.LinkedList;

public class EnrollmentQueue {
    private LinkedList<Student> queue;

    public EnrollmentQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Student student) {
        queue.addLast(student);
        System.out.println(student.getName() + " masuk antrian");
    }
    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Student s = queue.removeFirst();
            System.out.println(s.getName() + " keluar dari antrian");
        }
    }
    public void peek() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan: " + queue.getFirst().getName());
        }
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("isi antrian:");
            for (Student s : queue) {
                System.out.println(s.getName());
            }
        }
    }
}


