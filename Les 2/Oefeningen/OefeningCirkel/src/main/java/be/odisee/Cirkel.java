package be.odisee;
/**
 * stelt eenn cirkel voor dat een vaste van oorsprong van een diameter
 */

public class Cirkel {
    private double oorsprongX;
    private double oorsprongY;
    private double diameter;

    /**
     * stelt eenn cirkel voor dat een vaste van oorsprong van een diameter
     */
    public Cirkel(double oorsprongX, double oorsprongY, double diameter;) {

    }

        //getters toegevoegd omdat de overloop berekeningen nodig hebben


    /**
     * @Return x coordinaat van de oorpsrong
     */
    public double getOorsprongX () {}

    /**
     * @Return y coordinaat van de oorpsrong
     */
   public double getOorsprongY () {}


    /**
     * @Return diameter van de cirkel
     */
    public double getDiamter() {return diameter;}

    /**
    *berekent of er tussen 2 opgegeven cirkels overlap is
    *@Return true als de cirkels elkaar raken
     */

    public boolean overlap (Cirkel other) {}

}
