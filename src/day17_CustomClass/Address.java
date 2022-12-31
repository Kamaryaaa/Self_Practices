package day17_CustomClass;

public class Address {

       public int buildingNumber;
       public String streetName;
       public String cityName;
       public String stateName;
       public int zipCode;

    public void setInfo(int buildingNumber, String streetName, String cityName, String stateName, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "\n\t"+buildingNumber +" "+streetName+"\n\t"+cityName+" "+stateName+", "+zipCode;

    }
}
/*
Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */