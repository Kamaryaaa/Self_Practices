package day31_inheritance.statesTask;

public class Virginia extends States {


    public Virginia( String abbreviation, String politicalParty,
                    String governor, String senator, long population, double stateTax) {
        super("Virginia", abbreviation, politicalParty, governor, senator,
                population, stateTax);
    }
}
