package Week2.ExtraOpdrachten;

public class ExtraOpgaveDeel2 {

    public static void main(String[] args) {

        System.out.println(celsiusNaarFahrenheit(50));

        System.out.println(farenheidNaarCelcius(25));


    }

    public static double celsiusNaarFahrenheit(double graden){
        double farenheit = (graden*1.8) + 32;
        return farenheit;
    }

    public static double farenheidNaarCelcius(double farenheit) {
        double celcius = (farenheit - 32) / 1.8;
        return celcius;
    }
}
