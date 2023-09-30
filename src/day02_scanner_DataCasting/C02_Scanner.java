package day02_scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 4- kullanicidan bir dikdortgenin 2 kenari uzunlugunu alip,
        //         dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani: " + kenar1*kenar2);


    }
}
