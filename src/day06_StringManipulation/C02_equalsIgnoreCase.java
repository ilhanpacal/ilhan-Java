package day06_StringManipulation;

import java.util.Scanner;

public class C02_equalsIgnoreCase {
    public static void main(String[] args) {


        // Kullanicidan bir harf isteyin
        // kullanici a yazarsa "Aile"
        // i yazarsa "Is" yazdirin
        // bu harflerin disinda bir karakter girerse
        // "Bu harfi bilmiyorum" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);

        // kullanici kucuk veya buyuk harf girmis olabilir
        // Stringleri buyuk kucuk harf gozetmzksizin karsilastirabiliriz

        String harf = girilenHarf +"";

        if (harf.equals("a") || harf.equals("A")) {
            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("Is");

        }else  {
            System.out.println("Bu harfi bilmiyorum");

        }
    }
}
