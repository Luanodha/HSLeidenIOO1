package Week2;

import java.util.Scanner;

public class TafelTonenFor {

    public static void main(String[] args) {

        int tafelGetal;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Van welk getal tussen de 1en 100 wil je de tafel zien? ");
            int invoer = scanner.nextInt();
            if (invoer <= 0 || invoer > 100) {
                System.out.println("Dit getal mag niet.");
                continue;
            } else {
                tafelGetal = invoer;
                break;
            }
        }

        // de 'for' zoals opdracht
        for (int i = 1; i <11 ; i++) {
            System.out.printf("%d X %d = %d\n",i,tafelGetal,i*tafelGetal );
        }
    }
}
