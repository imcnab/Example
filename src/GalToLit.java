/*
    Try This 1-1

    This program converts gallons to litres.

    Call this program GalToLit.java
 */

public class GalToLit {
    public static void main(String[] args) {
        double gallons;     // holds the number of gallons
        double litres;      // holds conversion to liters

        gallons = 10;                   // start with 10 gallons
        litres = gallons * 3.7854;      // convert to litres

        System.out.println(gallons + " gallons is " + litres + " litres.");
    }
}
