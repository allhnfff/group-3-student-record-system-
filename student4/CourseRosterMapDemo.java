package student4;

import shared.Student;

public class CourseRosterMapDemo {

    public static void main(String[] args) {
        CourseRosterMap map = new CourseRosterMap();

        Student s1 = new Student("NIM001", "Fajar Nugroho");
        Student s2 = new Student("NIM002", "Laila Fitriani");
        Student s3 = new Student("NIM003", "Rizky Pratama");

        map.enrollStudent("IF101", s1);
        map.enrollStudent("IF101", s2);
        map.enrollStudent("SI201", s3);

        map.listCourses();
        map.getStudentsInCourse("IF101");
        map.dropStudent("IF101", "NIM002");
        map.getStudentsInCourse("IF101");
        System.out.println("Jumlah matakuliah: " + map.size());
    }
}
