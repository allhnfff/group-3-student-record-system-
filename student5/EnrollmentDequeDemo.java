package student5;

import shared.Student;

public class EnrollmentDequeDemo {

    public static void main(String[] args) {
        EnrollmentDeque deque = new EnrollmentDeque();

        // Data sesuai soal
        Student s1 = new Student("001", "Student One");
        deque.addRear(s1);
        
        Student s2 = new Student("002", "Student Two");
        deque.addRear(s2);
        
        Student s3 = new Student("003", "Student Three");
        deque.addFront(s3);

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