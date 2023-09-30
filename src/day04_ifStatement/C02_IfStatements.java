package day04_ifStatement;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {

        // Soru- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //       ucgen eskenar ise "Eskenar ucgen" yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        // Java 2'li karsilastirmalari kabul eder
        // daha fazla karsilastirmaya ihtiyac varsa
        // mantiksal operatorler kullanarak sartlar ayri ayri yazilip, birlestirir

        if (kenar1==kenar2 && kenar2==kenar3){

            System.out.println("Verilen kenar uzunluklari es kenar ucgen olusturur");
        }
    }
}
