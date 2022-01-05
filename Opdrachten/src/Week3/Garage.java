package Week3;

import java.util.Scanner;

public class Garage {

    static Auto[] voorraad = new Auto[5];
    static Klant[] klantenbestand = new Klant[5];
    static int startKapitaal = 40000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Garage garage = new Garage();
        autoVoorraad();                 // Bij starten programma de voorraad inladen
        klantenBestand();               // Bij starten programme klanten inladen

        // klanten weergeven bij start:
        weergaveKlanten();

        // Klant logt in:
        int klantLoginId = getKlantLoginId();

        // tonen alle auto's die te koop zijn
        weergaveVoorraad();

        koopAuto();
        }





        static void klantenBestand(){
        klantenbestand[0] = new Klant(1,"Alfred",100000,null);
        klantenbestand[1] = new Klant(2,"Bruce",250000,null);
        klantenbestand[2] = new Klant(3,"Cat",200000,null);
        klantenbestand[3] = new Klant(4,"Grayson",15000,null);
        klantenbestand[4] = new Klant(5,"Robin",10000,null);
        }


        static void autoVoorraad(){
            voorraad[0] = new Auto("Rolls Royce","Zilver",100000);
            voorraad[1] = new Auto("Batmobiel","Zwart",250000);
            voorraad[2] = new Auto("CatMobile","Zwart",200000);
            voorraad[3] = new Auto("Kawasaki Ninja (Motor)","Blauw",15000);
            voorraad[4] = new Auto("Kawasaki Ninja (Motor)","Rood",10000);
        }

        static void weergaveKlanten() {
            for (int i = 0; i < klantenbestand.length; i++) {
                System.out.printf("Klant id.%d - %s\n", klantenbestand[i].getId(), klantenbestand[i].getNaam());
            }
        }

    static void weergaveVoorraad() {
        System.out.println("Dit staat in de showroom:");
        for (int i = 0; i < voorraad.length; i++) {
            System.out.printf("\t%d - %s - %s - %s euro\n", i+1, voorraad[i].getNaam(), voorraad[i].getKleur(),voorraad[i].getVerkoopPrijs());
        }
    }

        static int getKlantLoginId(){
            int keuze;
            while (true){
                System.out.print("Typ je klantID om in te loggen: ");
                keuze = scanner.nextInt();
                System.out.println();
                if (keuze >0 && keuze <klantenbestand.length+1){
                    System.out.printf("Welkom %s bij de garage - kies een auto.\n ",klantenbestand[keuze-1].getNaam());
                    break;
                }
                else {
                    System.out.println("Klant id bestaat niet");
                }
            }
            return keuze;
        }

        static boolean koopAuto(int klantId, int autoID){
        // hier bezig
        return klantId,autoID;
        }




}
