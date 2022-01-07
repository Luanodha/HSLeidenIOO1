package Week99;

import java.util.Scanner;

public class Slagerij {

    public static void main(String[] args) {
        String[] vleesSoorten = {"Rund", "Lam", "Paard", "Varken", "Geit"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welk vleessoort zou u graag gehad willen hebben ? ");
        String input = scanner.next().toLowerCase();

        boolean welInAssortiment = false;
        for (int i = 0; i < vleesSoorten.length; i++) {
            if (vleesSoorten[i].toLowerCase().equals(input)) {
                System.out.println("De vleessoort komt WEL voor in het assortiment.");
                welInAssortiment = true;
            }
        }
        if (!welInAssortiment) {
            System.out.println("De vleessoort komt NIET voor in het assortiment.");
        }
    }
}
