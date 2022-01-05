package Week2;

import java.util.Scanner;

public class TafelDingMooi {

    public static void main(String[] args) {

        tafelWeergave(getTafelGetal());

    }

    public static void tafelWeergave(int tafelGetal){
        for (int i = 1; i <11 ; i++) {
            System.out.println(i+"x"+tafelGetal+"="+i*tafelGetal);
        }
    }

    public static int getTafelGetal() {
        Scanner scanner = new Scanner(System.in);
        int tafelGetal = 0;
        while (tafelGetal <= 0 || tafelGetal > 100) {
            System.out.print("Van welk getal tussen de 1 en 100 wil je de tafel zien?: ");
            tafelGetal = scanner.nextInt();
            if (tafelGetal <= 0 || tafelGetal > 100) {
                System.out.println("Dit getal mag niet!");
            }
        }
        return tafelGetal;
    }

}
