package day31_inheritance.statesTask;

public class California extends States{

    public California( String abbreviation, String politicalParty,
                      String governor, String senator, long population, double stateTax) {
        super("California", abbreviation, politicalParty, governor,
                senator, population, stateTax);
    }
}
