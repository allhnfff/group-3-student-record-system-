package student2;

import shared.Student;

class Node {
    Student data;
    Node next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }
}

public class EnrollmentQueue {

    private Node front;
    private Node rear;

    public EnrollmentQueue() {
        front = null;
        rear = null;
    }

// Menambahkan data ke antrian
public void enqueue(Student student) {

    Node newNode = new Node(student);

    if (rear == null) {
        front = newNode;
        rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
        rear.next = newNode;
        rear = newNode;
    }

    System.out.println(student.name + " masuk ke antrian");
}
// Menghapus data dari antrian
public void dequeue() {

    if (front == null) {
        System.out.println("Antrian kosong");
        return;
    }

    System.out.println(front.data.name + " keluar dari antrian");

    front = front.next;

    if (front == null) {
        rear = null;
    }
}

// Melihat data terdepan
public void peek() {

    if (front == null) {
        System.out.println("Antrian kosong");
        return;
    }

    System.out.println("Data terdepan: " + front.data.name);
}

// Menampilkan seluruh antrian
public void displayQueue() {
    if (front == null) {
        System.out.println("Antrian kosong");
        return;
    }

    Node current = front;

    System.out.println("Isi Antrian:");

    while (current != null) {
        System.out.println(current.data.name);
        current = current.next;
    }
  }
}