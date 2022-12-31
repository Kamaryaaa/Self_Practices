package day31_inheritance.EmployeeTask;

public class Developer extends Employee{

    private String programingLanguage;


    public Developer(String name, String id, String jobTitle, String companyName,
                     int age, char gender, double salary) {
        super(name, id, jobTitle, companyName, age, gender, salary);
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + getName() + " is coding in "+programingLanguage);
    }
}
