package shared;

public class Grade {
    private String nim;
    private String courseCode;
    private int score;
    private String letterGrade;

    public Grade(String nim, String courseCode, int score, String letterGrade) {
        this.nim = nim;
        this.courseCode = courseCode;
        this.score = score;
        this.letterGrade = letterGrade;
    }

    public String getNim() {
        return nim;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getScore() {
        return score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
}