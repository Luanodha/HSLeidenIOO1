package Week2.opdracht2;

import java.util.Scanner;

public class GetallenInvoeren {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Hoeveel hele getallen wil je invoeren? ");
        int[] arrayInvoer = voerInGetallen(scanner.nextInt());
        toonGetallen(arrayInvoer);

        System.out.println("Het maximum is: "+(bepaalMaximum(arrayInvoer)));
        System.out.println("Het minumum is: "+(bepaalMinimum(arrayInvoer)));

        System.out.println("Alle even getallen zijn: ");
        toonGetallen(pakAlleEvenGetallen(arrayInvoer));


    }

    public static int[] voerInGetallen(int getallen) {
        int[] getallenArray = new int[getallen];
        for (int i = 0; i < getallen ; i++) {
            System.out.print("Voer getal "+(i+1)+" in: ");
            getallenArray[i] = scanner.nextInt();
        }
        return getallenArray;
    }

    public static int bepaalMaximum(int[] eenArray){
        int maximum = eenArray[0];
        for (int i = 1; i < eenArray.length ; i++) {
            if (eenArray[i] > maximum) {
                maximum = eenArray[i];
            }
        }
        return maximum;
    }

    public static int bepaalMinimum(int[] eenArray){
        int minimum = eenArray[0];
        for (int i = 1; i < eenArray.length ; i++) {
            if (eenArray[i] < minimum) {
                minimum = eenArray[i];
            }
        }
        return minimum;
    }

    public static int[] pakAlleEvenGetallen(int[] eenArray){
        int lengteArrayEvenGetallen = 0;
        for (int i = 0; i < eenArray.length ; i++) {
            if (eenArray[i] % 2 == 0) {
                lengteArrayEvenGetallen++;
            }
        }
        int[] evenGetallen = new int[lengteArrayEvenGetallen];
        int teller = 0;
        for (int i = 0; i < eenArray.length ; i++) {
            if (eenArray[i] % 2 == 0) {
                evenGetallen[teller] = eenArray[i];
                teller++;
            }
        }
        return evenGetallen;

    }

    public static void toonGetallen(int[] eenArray){
        for (int i = 0; i < eenArray.length; i++) {
            System.out.printf("Getal %d: %d\n", i+1,eenArray[i]);
        }
    }

}


