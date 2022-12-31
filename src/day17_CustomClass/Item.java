package day17_CustomClass;

public class Item {

public String name;
public double unitPrice;
public double quantity;

    public void setInfo(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=$" + unitPrice +
                ", quantity=" + quantity +
                ",total price=$"+calcCost()+
                '}';
    }
}
/*
Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement,
        it should display the full information of the item object

 */