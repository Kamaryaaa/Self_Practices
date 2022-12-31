package day31_inheritance.studentTask;

public class Student  extends Person{

    private String studentId, fieldOfStudy,schoolName;

    private char grade;

    public Student(String name, int age, char gender, String studentId,
                   String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy==null||fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.err.println("Invalid entry: "+fieldOfStudy);
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName==null||schoolName.isEmpty()||schoolName.isBlank()){
            System.err.println("Invalid entry: "+schoolName);
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade=='A'||grade=='B'|grade=='C'||grade=='D'|| grade=='F'){
            this.grade = grade;
        }else {
            System.err.println("Invalid Grade: "+grade);
            System.exit(1);
        }
    }

    public void study(){
        System.out.println(name+"is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
