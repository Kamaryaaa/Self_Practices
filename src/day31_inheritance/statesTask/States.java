package day31_inheritance.statesTask;

public class States {

    private String name, abbreviation,politicalParty,governor,senator;
    private long population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty,
                  String governor, String senator, long population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null||abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println("Invalid entry: "+abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null||politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println("Invalid entry: "+politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor==null||governor.isEmpty()||governor.isBlank()){
            System.err.println("Invalid entry: "+governor);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator==null||senator.isEmpty()||senator.isBlank()){
            System.err.println("Invalid entry: "+senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if(population<=0){
            System.err.println("Population can not be zero or negative: "+population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("State tax can not be negative: "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+" {" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                ", stateTax=" + getStateTax() +
                '}';
    }
}
