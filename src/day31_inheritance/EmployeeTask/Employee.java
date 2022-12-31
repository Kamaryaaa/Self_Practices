package day31_inheritance.EmployeeTask;

public class Employee {

    private String name, id, jobTitle,companyName;
    private int age;

    private char gender;

    public Employee(String name, String id, String jobTitle, String companyName,
                    int age, char gender, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            System.err.println("Gender must be valid");
        }
        this.gender = gender;
    }

    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){
            System.err.println("Age can not be less than 18: "+age);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary can not be negative: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return getClass().getSimpleName()+" {" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
