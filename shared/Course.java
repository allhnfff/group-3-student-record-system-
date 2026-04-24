package shared;

public class Course {
    private String code;
    private String name;
    private int credits;
    private String lecturer;

    public Course(String code, String name, int credits, String lecturer) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.lecturer = lecturer;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "[" + code + "] " + name + " - " + credits + " SKS, Dosen: " + lecturer;
    }
}