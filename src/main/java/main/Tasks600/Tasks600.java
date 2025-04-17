package main.Tasks600;

public class Tasks600 {


    public static void main(String[] args) {

        //Раздел 3.
        //задание 3.1 - ok
        //fTempToC(72.0);

        //задание 3.2 - ок
        //smToDuim(75);

        //задание 3.10 - ок       (евро в руб=93,53)
        Requests requests = new Requests();
        double kursEuro = requests.getRequests();
        moneyTripCount(50, 50, kursEuro);

    }


    //задание 3.1
    public static void fTempToC(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;    //(72°F ? 32) ? 5/9 = 22,222 °C  - фарингейт в цельсия
        System.out.println("Celcia: " + tempC);
    }
    //задание 3.2
    public static void smToDuim(double santimetr) {
        double duim = santimetr / 2.54;
        System.out.println("Duim: " + duim);
    }
    //задание 3.10
    public static double moneyTripCount(double vasyEarned, double fromParents, double kursEuroPar) {
        double vasyHas = (vasyEarned + fromParents) / kursEuroPar;
        System.out.println("Vasy has in euro: " + vasyHas);
        return vasyHas;
    }

}
