import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10, startPrice = 10;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz : ");
        km = girdi.nextInt();


        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar :" +total);


    }
}
