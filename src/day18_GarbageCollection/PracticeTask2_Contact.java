package day18_GarbageCollection;

public class PracticeTask2_Contact {
    public String name;
    public long phoneNumber;
    public String email;

    public void setInfo(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void call(){
        System.out.println("Calling "+name+" now");
    }

    public void sendMassage(){
        System.out.println("sending message to "+phoneNumber+" now");
    }

    public void sendEmail(){
        System.out.println("sending email to "+email+" now");
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
