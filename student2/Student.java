package student2;
public class Student {
    String nim;
    String name;
    String major;
    int year;

    public Student(String nim, String name, String major, int year) {
        this.nim = nim;
        this.name = name;
        this.major = major;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public String getNim() {
        return nim;
    }
}