package Week2.opdracht2;

import java.util.Scanner;

public class GetallenInvoeren {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] bla = (pakAlleEvenGetallen(voerInGetallen(5)));
        for (int i = 0; i <bla.length ; i++) {
            System.out.println(bla[i]);

        }

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
        System.out.println("lengte arraygetallen "+lengteArrayEvenGetallen); // for debugging

        int[] evenGetallen = new int[lengteArrayEvenGetallen];
        for (int i = 0; i < eenArray.length ; i++) {
            int teller = 0;
            if (eenArray[i] % 2 == 0) {
                evenGetallen[teller] = eenArray[i];
                teller = teller + 1;
            }
        }
        return evenGetallen;

    }

}


