package Week3;

import java.util.Scanner;

public class Garage {

    // start met maken van de attributes van de garage:
    static Auto[] voorraad = new Auto[5];
    static Klant[] klantenbestand = new Klant[5];
    static int startKapitaal = 40000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Garage garageVeelVoorWeinig = new Garage(); //hier doe ik niks mee ! Waarom ?

        autoVoorraad();                 // Bij starten programma de voorraad inladen
        klantenBestand();               // Bij starten programme klanten inladen

        // klanten weergeven bij start:
        weergaveKlanten();

        // Klant logt in door zijn nummer te typen:
        int klantLoginId = getKlantLoginId();

        // tonen alle auto's die te koop zijn
        weergaveVoorraad();

        // ingelogde klant koopt auto:
        koopAuto(klantLoginId);

        System.out.println("\n\n\t ---Bye ! end of program---");
    }


    static void klantenBestand() {
        klantenbestand[0] = new Klant(1, "Alfred", 100000, null);
        klantenbestand[1] = new Klant(2, "Bruce", 250000, null);
        klantenbestand[2] = new Klant(3, "Cat", 200000, null);
        klantenbestand[3] = new Klant(4, "Grayson", 15000, null);
        klantenbestand[4] = new Klant(5, "Robin", 10000, null);
    }


    static void autoVoorraad() {
        voorraad[0] = new Auto("Rolls Royce", "Zilver", 100000);
        voorraad[1] = new Auto("Batmobiel", "Zwart", 250000);
        voorraad[2] = new Auto("CatMobile", "Zwart", 200000);
        voorraad[3] = new Auto("Kawasaki Ninja (Motor)", "Blauw", 15000);
        voorraad[4] = new Auto("Kawasaki Ninja (Motor)", "Rood", 10000);
    }

    static void weergaveKlanten() {
        for (int i = 0; i < klantenbestand.length; i++) {
            System.out.printf("Klant id.%d - %s\n", klantenbestand[i].getId(), klantenbestand[i].getNaam());
        }
    }

    static void weergaveVoorraad() {
        System.out.println("Dit staat in de showroom:");
        for (int i = 0; i < voorraad.length; i++) {
            System.out.printf("\t%d - %s - %s - %s euro\n", i + 1, voorraad[i].getNaam(), voorraad[i].getKleur(), voorraad[i].getVerkoopPrijs());
        }
    }

    static int getKlantLoginId() {
        int klantId;
        while (true) {
            System.out.print("\nTyp je klantID om in te loggen: ");
            klantId = scanner.nextInt()-1;     // -1 omdat in de weergave de nummering start bij 1 en niet bij 0
            System.out.println();
            if (klantId > 0 && klantId < klantenbestand.length + 1) {
                System.out.printf("Welkom %s bij de garage - kies een auto.\n ", klantenbestand[klantId].getNaam());
                break;
            } else {
                System.out.println("Klant id bestaat niet");
            }
        }
        return klantId;
    }

    static void koopAuto(int klantID){
        int vermogenKlant = klantenbestand[klantID].getBedrag();    // eerst vermogen van de klant vaststellen
        int verkoopprijsAuto;               // int variable maken om verkoopprijs auto in op te slaan na keuze
        System.out.print("\nTyp het nummer van het voertuig dat je wilt kopen:");
        int autoID = scanner.nextInt()-1;
        verkoopprijsAuto = voorraad[autoID].getVerkoopPrijs();

        if( verkoopprijsAuto <= vermogenKlant){
            System.out.printf("Dank voor je aankoop - je hebt de %s gekocht.\n", voorraad[autoID].getNaam());
            klantenbestand[klantID].setBedrag(vermogenKlant - verkoopprijsAuto); // afboeken bedrag rekening klant
            startKapitaal = startKapitaal + verkoopprijsAuto;
            System.out.printf("De garage heeft nu %d in de kassa.",startKapitaal);
        }
        else {
            System.out.println("Niet genoeg budget");
        }
    }

}



