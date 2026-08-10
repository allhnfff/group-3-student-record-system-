package student5;

import shared.Grade;

public class GradeHeapDemo {
    public static void main(String[] args) {
        GradeHeap heap = new GradeHeap();
        // insert(grade) — min-heap by score, lowest score = needs intervention
        heap.insert(new Grade("NIM001", "IF101", 82, "B"));
        heap.insert(new Grade("NIM002", "IF101", 55, "D"));
        heap.insert(new Grade("NIM003", "IF101", 91, "A"));
        heap.insert(new Grade("NIM004", "IF101", 48, "E"));
        heap.display();
        heap.extractMin(); // most at-risk student
        heap.extractMin();
        heap.display();
    }
}
