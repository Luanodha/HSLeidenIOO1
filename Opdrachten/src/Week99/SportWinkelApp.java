package Week99;

public class SportWinkelApp {

    public static void main(String[] args) {

        SportSchoenen sportSchoenen = new SportSchoenen(50, true, "tennis");
        SportShirt sportShirt = new SportShirt(20, false, true);

        sportSchoenen.setPrijs(55);

        System.out.printf("%s %.1f %b\n", sportSchoenen.getType(), sportSchoenen.getPrijs(), sportSchoenen.isInStock());
        System.out.printf("%b %.1f %b\n", sportShirt.getBedrukt(), sportShirt.getPrijs(), sportShirt.isInStock());

        // zo kan ook, maar met printf kun je de Double mooi afronden op x-cijfers achter de punt.
        //System.out.println(sportSchoenen.getType() + " " + sportSchoenen.getPrijs() + " " + sportSchoenen.isInStock());
        //System.out.println(sportShirt.getBedrukt() + " " + sportShirt.getPrijs() + " " + sportShirt.isInStock());
    }
}
