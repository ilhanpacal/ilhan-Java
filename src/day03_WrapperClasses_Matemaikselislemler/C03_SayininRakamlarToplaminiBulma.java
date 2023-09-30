package day03_WrapperClasses_Matemaikselislemler;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi alip
        // sayinin rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int rakam = 0;

        // girilen sayi : 257 , rakam : 0 , rakamlar toplami = 0

        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        // girilen sayi : 25 , rakam : 7 rakamlar toplami = 7

        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;
        girilenSayi = girilenSayi / 10;

        // girilen sayi : 2 rakam : 5 , rakamlar toplami = 12

        rakam = girilenSayi % 10; // 2 % 10 ==> 2
        rakamlarToplami = rakamlarToplami + rakam; // 12 + 2 ==> 14
        girilenSayi = girilenSayi / 10; // 2 / 10 ==> 0.2 ==> 0

        System.out.println("Girilen sayinin rakamlari toplami : " + rakamlarToplami);


    }




}
