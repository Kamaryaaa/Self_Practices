package day31_inheritance.studentTask;

public class TestStudentObjects {
    public static void main(String[] args) {


        CydeoStudent cydeoStudent = new CydeoStudent("Aziza", 34, 'F',
                "10120A", "Software engineering", "GBC",
                'A', 28, 3, "Java");

        GraduateStudent graduateStudent = new GraduateStudent("Arzu", 23, 'F',
                "ABCD", "Medical", "Harvard", 'A');

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Arzu", 23,
                'F',
                "ABCD", "Medical", "Harvard", 'A');

        System.out.println(cydeoStudent);

        System.out.println(graduateStudent);

        System.out.println(undergraduateStudent);


    }


}
