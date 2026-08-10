package student5;

import shared.Grade;

public class GradeHeap {

    private Grade[] heap;
    private int size;
    private int capacity;

    public GradeHeap() {
        capacity = 10;
        heap = new Grade[capacity];
        size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        Grade temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resizeIfNeeded() {
        if (size == capacity) {
            capacity = capacity * 2;
            Grade[] newHeap = new Grade[capacity];
            for (int i = 0; i < size; i++) {
                newHeap[i] = heap[i];
            }
            heap = newHeap;
        }
    }

    public void insert(Grade grade) {
        resizeIfNeeded();
        heap[size] = grade;
        heapifyUp(size);
        size++;
    }

    private void heapifyUp(int i) {
        while (i > 0 && heap[i].getScore() < heap[parent(i)].getScore()) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public Grade extractMin() {
        if (isEmpty()) {
            System.out.println("Error: Heap kosong.");
            return null;
        }

        Grade min = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = null;
        size--;
        heapifyDown(0);

        System.out.println("Intervensi: " + min.getNim() + " (score " + min.getScore() + ")");
        return min;
    }

    private void heapifyDown(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l].getScore() < heap[smallest].getScore()) {
            smallest = l;
        }
        if (r < size && heap[r].getScore() < heap[smallest].getScore()) {
            smallest = r;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    public Grade peekMin() {
        if (isEmpty()) {
            return null;
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("=== Daftar Nilai (kosong) ===");
            return;
        }

        Grade[] sorted = new Grade[size];
        for (int i = 0; i < size; i++) {
            sorted[i] = heap[i];
        }

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (sorted[j].getScore() < sorted[minIndex].getScore()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Grade temp = sorted[i];
                sorted[i] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }

        System.out.println("=== Daftar Nilai (Min-Heap, nilai terendah paling atas) ===");
        for (int i = 0; i < size; i++) {
            Grade g = sorted[i];
            System.out.println("Score " + g.getScore() + ": [" + g.getNim() + "] "
                    + g.getCourseCode() + " — " + g.getLetterGrade());
        }
    }
}