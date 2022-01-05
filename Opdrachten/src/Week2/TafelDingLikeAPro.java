package Week2;

import java.util.Scanner;

public class TafelDingLikeAPro {

    public static void main(String[] args) {
        tafelWeergave(getTafelGetal());
    }

    public static void tafelWeergave(int tafelGetal){
        for (int i = 1; i <11 ; i++) {
            System.out.printf("%d x %d = %d\n",i,tafelGetal,i*tafelGetal);
        }
    }

    public static int getTafelGetal() {
        Scanner scanner = new Scanner(System.in);
        int tafelGetal= 0;
        while (tafelGetal <1 || tafelGetal > 100) {
            System.out.print("Van welk getal tussen de 1 en 100 wil je de tafel zien?: ");
            tafelGetal = scanner.nextInt();
        }
        return tafelGetal;
    }
}
