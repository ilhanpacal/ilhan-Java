package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {


        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse "sinifini Gectin",
        //         50'den kucukse "Maalesef kaldin" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not>= 50) {
            System.out.println("Sinifi gectin");
        }

        if (not<50){
            System.out.println("Maalesef kaldin");

        }


    }
}
