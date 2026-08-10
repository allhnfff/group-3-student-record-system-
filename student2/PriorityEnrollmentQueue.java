package student2;

import shared.Student;

public class PriorityEnrollmentQueue {

    // Custom Inner Node Class (Singly-Linked)
private class Node{
    Student data;
    double gpa;
    Node next;

    Node(Student data, double gpa) {
        this.data = data;
        this.gpa = gpa;
        this.next = null;
    }
}

private Node front;
private int count;

public PriorityEnrollmentQueue() {
    this.front = null;
    this.count = 0;
}

// Enqueue dengan Sorted Insertion (IPK tertinggi di depan)
public void enqueue(Student student, double gpa) {
    Node newNode = new Node(student, gpa);
    if (isEmpty() || gpa > front.gpa) {
        newNode.next = front;
        front = newNode;
    } else {
        Node current= front;
        while (current.next != null && current.next.gpa >= gpa) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    count++;
}

// Dequeue elemen dengan IPK tertinggi (terdepan)
public Student dequeueMax() {
    if (isEmpty()) {
        System.out.println("Error: Antrian pendaftaran prioritas kosong.");
        return null;
    }
    Student removedStudent = front.data;
    double removedGpa = front.gpa;
    front = front.next;
    count--;
    System.out.println("Mendaftar (IPK " + String.format("%.2f", removedGpa) + "): " + removedStudent.getName());
    return removedStudent;
} 

public boolean isEmpty() {
    return front == null;
}

public int size() {
    return count;
}

public void display() {
    System.out.println("=== Antrian Pendaftaran Prioritas ===");
    Node current = front;
    while (current != null) {
        System.out.println("[IPK=" + String.format("%.2f", current.gpa) + "] " + current.data.getName());
        current = current.next;
    }
}






}