package Week1;

import java.math.BigInteger;
import java.util.Scanner;

public class SecondenOmrekenen {
    public void calculate() {
        long nsec; // nsec --> input number of seconds

        System.out.println("Vul aantal seconden in: ");
        Scanner userInput = new Scanner(System.in);
        nsec = userInput.nextLong();
        System.out.println("Aantal seconden :" + nsec + "\n");

        long cyears = nsec / (24 * 3600 * 365); // cyear --> calculated years

        nsec = nsec % ( 24 * 3600 * 365);
        long cdays = nsec / (24 * 3600); // cdays --> calculated day

        nsec = nsec % (24 * 3600);
        long chours = nsec / 3600;  // chours --> calculated hour

        nsec = nsec % 3600;
        long cminutes = nsec / 60 ; // cminutes -- calculated minutes

        nsec = nsec % 60;
        long cseconds = nsec; // cseconds --> calculated seconds

        System.out.println("Aantal jaar :" + cyears);
        System.out.println("Aantal dagen :" + cdays );
        System.out.println("Aantal uren : " + chours);
        System.out.println("Aantal minuten : " + cminutes);
        System.out.println("Aantal seconden : " + cseconds);

    }

    public static void main(String[] args) {
        SecondenOmrekenen secondenOmrekenen = new SecondenOmrekenen();
        secondenOmrekenen.calculate();
    }
}
