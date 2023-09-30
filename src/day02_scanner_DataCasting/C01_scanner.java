package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_scanner {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        //        girilen degerleri aciklamalariyla yazdirin.


        // adim 1 = scanner objesi olustutalim
        Scanner scanner = new Scanner(System.in);

        // adim 2 = kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen isminizi giriniz");

        // adim 3 = girilen bilgiye uygun bir variable olusturup
        //          data turune uygun next....() ile bilgiyi alip kaydedin
       String girilenIsim= scanner.next(); // sadece ilk ismi alir




        // ikinci olarak bir tamsayi isteyelim mesela yasini isteyelim

        System.out.println("Lutfen yasininizi giriniz");
        int yas = scanner.nextInt();


        // emekli misiniz? true / folse

        System.out.println("Emekli misiniz ? true veya false olarak giriniz");
        boolean emekliMi = scanner.nextBoolean();


        System.out.println("Girdiginiz isim : "+ girilenIsim );
        System.out.println("Yasiniz : " + yas);
        System.out.println("Emekli misiniz?" + emekliMi);




    }
}
