package day31_inheritance.statesTask;

public class Florida extends States{

    public Florida( String abbreviation, String politicalParty,
                   String governor, String senator, long population, double stateTax) {
        super("Florida", abbreviation, politicalParty, governor, senator,
                population, stateTax);
    }
}
