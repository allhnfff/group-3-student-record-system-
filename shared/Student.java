package shared;

public class Student {
    private String nim;
    private String name;
    private String major;
    private int year;

    public Student(String nim, String name, String major, int year) {
        this.nim = nim;
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }
}