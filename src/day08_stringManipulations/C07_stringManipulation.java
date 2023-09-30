package day08_stringManipulations;

import java.util.Scanner;

public class C07_stringManipulation {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin ve
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         	- ilk harf kucuk harf olmali
        //         	- son karakter rakam olmali
        //         	- sifre bosluk icermemeli
        //         	- uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin = scanner.nextLine();

        int uzunluk = girilenMetin.length();
        String yeniHal = "";

        if (uzunluk % 2 == 0) { // uzunluk cift ise

            yeniHal = girilenMetin.substring(0, uzunluk / 2) + ":)" + girilenMetin.substring(uzunluk/2); //substring(uzunluk/2);

        }else { // uzunluk tek ise
            yeniHal = girilenMetin.substring(0, uzunluk / 2) + ":(" + girilenMetin.substring((uzunluk+1)/2);

        }

        System.out.println(girilenMetin+"yazdiniz ve ben onu degistirdim : " +yeniHal);


    }
}
