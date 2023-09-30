package day10_methodOlusturma_methodOverloadin;

public class C08_MethodOverLoading {

    public static void main(String[] args) {

         /*
            Bir Method Call yapildiginda
            Java hangi method'un calisacagina karar vermek icin
            asagidakileri kontrolleri yapar

            1- isim
            2- argument sayisi ile parametre sayisi
            3- argument olarak yazilan DEGERler ile PARAMETRElerin data turunun uyumlu olmasi

            devami C10'da
         */

        toplama(5,7); // Iki int sayinin toplami : 12

        toplama('a','b'); // Iki int sayinin toplami : 195

        // toplama(4.5,6.5);
    }


    public static void toplama(int sayi1, int sayi2){

        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    }
}
