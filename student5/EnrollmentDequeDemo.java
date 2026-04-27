package student5;

import shared.Student;

public class EnrollmentDequeDemo {

    public static void main(String[] args) {
        EnrollmentDeque deque = new EnrollmentDeque();

        // Data sesuai soal
        deque.addRear(new Student("001", "Fajar Nugroho", "TI", 2023));
        deque.addRear(new Student("002", "Laila Fitriani", "TI", 2023));
        deque.addFront(new Student("003", "Rizky Pratama", "TI", 2023));

        // Display awal
        deque.display();

        // Peek 
        System.out.println("Prioritas: " + deque.peekFront().getName());
    
        // Remove
        deque.removeFront();
        deque.removeRear();

        // Display akhir
        deque.display();

    }

}