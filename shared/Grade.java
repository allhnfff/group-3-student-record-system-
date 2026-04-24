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

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    @Override
    public String toString() {
        return nim + " | " + courseCode + " | skor: " + score + " -> " + letterGrade;
    }
}