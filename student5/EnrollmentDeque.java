 package student5;

 import shared.Student;

 public class EnrollmentDeque {

    // Inner Node class (Doubly Linked List)
    private class Node {
        Student data;
        Node next;
        Node prev;

        Node(Student data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Constructor
    public EnrollmentDeque() {
        front = null;
        rear = null;
        size = 0;
    }

    // Add to front (urgent student)
    public void addFront(Student student) {
        Node newNode = new Node(student);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }

        size++;
    }

    // Add to rear (normal student)
    public void addRear(Student student) {
        Node newNode = new Node(student);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }


        size ++;
    }

    // Remove from front 
    public void removeFront() {
        if (isEmpty()) {
            System.out.println("Error: Deque kosong.");
            return;
        }

        System.out.println("Didaftarkan dari depan: " + front.data.getName());

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }

        size --;
    }

    // Remove from rear 
    public void removeRear() {
        if (isEmpty()) {
            System.out.println("Error: Deque kosong.");
            return;
        }

        System.out.println("Dihapus dari belakang: " + rear.data.getName());

        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }

        size--;
    }

    // Peak front
    public Student peekFront() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    // Peak rear
    public Student peekRear() {
        if (isEmpty()) {
            return null;
        }
        return rear.data;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Size 
    public int size() {
        return size;
    }

    // Display deque
    public void display() {
        if (isEmpty()) {
            System.out.println("=== Antrian Pendaftaran (Deque, 0 mahasiswa) ===");
            return;
        }

        System.out.println("=== Antrian Pendaftaran (Deque, " + size + " mahasiswa) ===");

        Node currenct = front;

        System.out.println("Depan --> ");
        
        while (currenct != null) {
            System.out.println("[" + currenct.data.getNim() + "] " + currenct.data.getName());
            if (currenct.next != null) {
                System.out.println(" | ");
            }
            currenct = currenct.next;
        }
        System.out.println(" <-- Belakang");

    }
}
    