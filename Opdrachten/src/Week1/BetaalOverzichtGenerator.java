package Week1;

import java.util.Scanner;

public class BetaalOverzichtGenerator {
    double btw = 21;
    double kostprijsAppel = 0.50;
    double kostprijsPeer = 0.70;
    double kostprijsAardappel = 0.65;

    double verkoopprijsAppel = kostprijsAppel * (1 + btw / 100);
    double verkoopprijsPeer = kostprijsPeer * (1 + btw / 100);
    double verkoopprijsAardappel = kostprijsAardappel * (1 + btw / 100);

    String customerName;
    int orderNumberApples;
    int orderNumberPears;
    int orderNumberPotatoes;

    public void inputOrder() { // VOID geeft aan dat de functie geen return waarde geeft


        System.out.println("Wat is je naam: ");
        Scanner userInput = new Scanner(System.in);
        customerName = userInput.next();

        System.out.println("De BTW is: " + btw);

        System.out.println("De verkoopprijs van een appel is: " + verkoopprijsAppel);
        System.out.println("Hoeveel appels wil je kopen ?: ");
        Scanner userInputOrderNumberApples = new Scanner(System.in);
        orderNumberApples = userInputOrderNumberApples.nextInt();

        System.out.println("De verkoopprijs van een peer is: " + verkoopprijsPeer);
        System.out.println("Hoeveel peren wil je kopen ?: ");
        Scanner userInputOrderNumberPears = new Scanner(System.in);
        orderNumberPears = userInputOrderNumberApples.nextInt();

        System.out.println("De verkoopprijs van een aardappel is: " + verkoopprijsAardappel);
        System.out.println("Hoeveel aardappels wil je kopen ?: ");
        Scanner userInputOrderNumberPotatoes = new Scanner(System.in);
        orderNumberPotatoes = userInputOrderNumberPotatoes.nextInt();

    }

    public void printOrder() {
        double omzetAppels = (orderNumberApples * kostprijsAppel) * 1.21;
        double omzetPeren = (orderNumberPears * kostprijsPeer) * 1.21;
        double omzetAardappels = (orderNumberPears * kostprijsAardappel) * 1.21;

        double omzetAppelsBTW = (orderNumberApples * kostprijsAppel) * 0.21;
        double omzetPerenBTW = (orderNumberPears * kostprijsPeer) * 0.21;
        double omzetAardappelsBTW = (orderNumberPears * kostprijsAardappel) * 0.21;


        System.out.println("Beste " + customerName);
        System.out.println("Hieronder volgt het betaaloverzicht ");
        System.out.println("====================================");

        System.out.println("Appels aantal: \t\t\t" + orderNumberApples);
        System.out.println("Totaal kostprijs: \t\t" + orderNumberApples * kostprijsAppel);
        System.out.println("Totaal BTW: \t\t\t" + (orderNumberApples * kostprijsAppel) * 0.21);
        System.out.println("Subtotaal omzet: \t\t" + omzetAppels);

        System.out.println("Peren aantal: \t\t\t" + orderNumberPears);
        System.out.println("Totaal kostprijs: \t\t" + orderNumberPears * kostprijsPeer);
        System.out.println("Totaal BTW: \t\t\t" + (orderNumberPears * kostprijsPeer) * 0.21);
        System.out.println("Subtotaal omzet: \t\t" + omzetPeren);

        System.out.println("Aardappels aantal: \t\t" + orderNumberPotatoes);
        System.out.println("Totaal kostprijs: \t\t" + orderNumberPotatoes * kostprijsAardappel);
        System.out.println("Totaal BTW: \t\t\t" + (orderNumberPotatoes * kostprijsAardappel) * 0.21);
        System.out.println("Subtotaal omzet: \t\t" + omzetAardappels);

        System.out.println("Totale omzet incl. BTW: " + (omzetAardappels + omzetAppels + omzetPeren));
        System.out.println("Totale BTW: \t\t\t" + (omzetAardappelsBTW + omzetAppelsBTW + omzetPerenBTW)+ "\n\n");
    }

    public static void main(String[] args) {
        BetaalOverzichtGenerator betaalOverzichtGenerator = new BetaalOverzichtGenerator();
        betaalOverzichtGenerator.inputOrder();
        betaalOverzichtGenerator.printOrder();
    }
}






