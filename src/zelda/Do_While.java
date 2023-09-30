package zelda;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        /*Soru : Kullanicidan Kullanicidan sifre
        isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip,
                kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu
        islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile
        kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
                - sifrenin son karakteri sayi olmali

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sifre giriniz");

        String sifre = scan.nextLine();

        char ilkHarf = 
        do(sifre.substring(0).equals( )& sifre.substring(0)<="z" && sifre.length()-1== 1){

        }
    }
}
