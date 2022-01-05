package Week2.Opdracht1;

import java.util.Scanner;

public class TafelTonenWhile {

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

        // de 'while' zoals opdracht
        int i = 1;
        while (i < 11 ){
            System.out.printf("%d X %d = %d\n",i,tafelGetal,i*tafelGetal );
            i++;
        }
    }
}
