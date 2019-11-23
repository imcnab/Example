package Chapter01;/*
    Try This 1-2

    This program displays a conversion
    table of gallons to litres.

    Call this program "Chapter01.GalToLitTable.java".
 */

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litres;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100 ; gallons++) {
            litres = gallons * 3.7854;  // convert to litres
            System.out.println(gallons + " gallons is " + litres + " litres.");
            counter++;

            // every 10th lines, print a blank line
            if (counter==10) {
                System.out.println();
                counter = 0;    // reset the line counter
            }
        }
    }
}
