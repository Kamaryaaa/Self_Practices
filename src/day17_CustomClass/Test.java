package day17_CustomClass;

import com.sun.jdi.request.ClassUnloadRequest;

public class Test {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setInfo(7925,"Jones Branch Dr","McLean","Va",22012);
        System.out.println(address1);
        System.out.println("===============================");

        Item item1=new Item();

        item1.setInfo("Banana",0.89,1.5);
        System.out.println(item1);
        System.out.println("=============================");

        SalaryCalculator salary1 = new SalaryCalculator();

        salary1.setInfo(60,5,13,40);
        System.out.println(salary1);




    }
}
