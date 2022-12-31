package day31_inheritance.studentTask;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int age, char gender, String studentId,
                                String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        super.study();
    }
}
