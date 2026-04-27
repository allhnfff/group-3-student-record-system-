package shared;

public class Student {

    public String nim;
    public String name;

    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }
}