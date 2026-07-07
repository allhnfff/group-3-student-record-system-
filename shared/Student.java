package shared;

public class Student {

    public String nim;
    public String name;
    public String major;
    public int year;

    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    public Student(String nim, String name, String major, int year) {
        this.nim = nim;
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public String getNim() { return nim; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getYear() { return year; }
}