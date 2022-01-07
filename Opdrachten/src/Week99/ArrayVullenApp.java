package Week99;

public class ArrayVullenApp {

    public static void main(String[] args) {

        ArrayVullen arrayVullen = new ArrayVullen();
        int[] bla = arrayVullen.maakArray();
        int[] finalBla = arrayVullen.veranderArray(bla);

        int counter = 0;
        for (int i = 0; i < finalBla.length; i++) {
            counter = counter + finalBla[i];
        }
            System.out.println(counter);
        }
}
