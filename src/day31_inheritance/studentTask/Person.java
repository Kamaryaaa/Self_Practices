package day31_inheritance.studentTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid entry: "+name);
            System.exit(1);
        }

        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age should not be negative");
        }
        this.age = age;
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

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
        }
        public void sleep(){
            System.out.println(name+" is sleeping");
        }

    public String toString() {
        return getClass().getSimpleName()+ " {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
