package day31_inheritance.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber,groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId,
                        String fieldOfStudy, String schoolName, char grade,
                        int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Batch number can not be zero or negative: "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {

        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("Group number can not be zero or negative: "+groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()) {
            System.err.println("Programming language should not be set to null, bank or empty: " + programmingLanguage);
            System.exit(1);
        }
            this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void drink(String drink) {
        super.drink(drink);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", Batch number='"+batchNumber+'\''+'}'+
                ", Group number='"+groupNumber+'\''+'}' +
                ", Programing language='"+programmingLanguage+'\''+'}';
    }
}
