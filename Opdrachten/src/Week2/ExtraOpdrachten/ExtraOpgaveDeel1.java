package Week2.ExtraOpdrachten;

import java.util.Scanner;

public class ExtraOpgaveDeel1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        geefOverzicht();

        while (true){
            System.out.print("Maak je keuze: ");
            String keuze = scanner.next();
            if (keuze.equals("-1")){
                break;
            }

            switch (keuze) {
                case "1":
                    schreeuw();
                    break;
                case "2":
                    stelVraagGesteldheidPersoon();
                    break;
                case "3":
                    roepBoe();
                    break;
                case "4":
                    geefBevelTotLopen();
                    break;
                case "5":
                    spring();
                    break;
                default:
                    break;
            }

        }

    }

    public static void geefOverzicht(){
        System.out.println("Je kunt kiezen voor de volgende opties:\n" +
                "1. Hallelujah\n" +
                "2. Hoe gaat het met je ?\n" +
                "3. Boe!!!!\n" +
                "4. Lopen jij !!!\n" +
                "5. Ik sprint!!\n");
    }
    public static void schreeuw(){
        System.out.println("Hallelujah!!");
    }
    public static void stelVraagGesteldheidPersoon(){
        System.out.println("Hoe gaat het met je?");
    }
    public static void roepBoe(){
        System.out.println("Boe!!!!");
    }
    public static void geefBevelTotLopen(){
        System.out.println("Lopen, jij!!!");
    }
    public static void spring(){
        System.out.println("Ik spring!!");
    }
}
