package day31_inheritance.statesTask;

public class Texas extends States {

    public Texas( String abbreviation, String politicalParty,
                 String governor, String senator, long population, double stateTax) {
        super("Texas", abbreviation, politicalParty, governor, senator,
                population, stateTax);
    }
}
