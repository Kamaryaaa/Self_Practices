package day34_abstraction_interface.carTask;

import day31_inheritance.studentTask.Test;

public class CarShop {
    public static void main(String[] args) {


        BMW bmw=new BMW("audi","as",2000,30000,"Black");
        Audi audi=new Audi("audi","as",2000,30000,"Black");
        Tesla tesla=new Tesla("audi","as",2000,30000,"Black");
        Mercedes mercedes=new Mercedes("audi","as",2000,30000,"Black");
        Nio nio=new Nio("audi","as",2000,30000,"Black");
        Honda honda=new Honda("audi","as",2000,30000,"Black");
        Toyota toyota=new Toyota("audi","as",2000,30000,"Black");
        CydeoCar cydeoCar=new CydeoCar("audi","as",2000,30000,"Black");


      bmw.drive();
      bmw.start();
      bmw.stop();
        System.out.println(tesla);
        System.out.println(honda);
        System.out.println(nio);
        System.out.println(mercedes);
        System.out.println(cydeoCar);
        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(bmw);






    }
}
