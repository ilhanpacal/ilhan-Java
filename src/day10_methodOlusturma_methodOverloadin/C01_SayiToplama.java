package day10_methodOlusturma_methodOverloadin;

import java.util.Scanner;

public class C01_SayiToplama {
    public static void main(String[] args) {


        // Verilen iki sayiyi toplayip sonucu yazdiran bir method olusturun

        toplaYazdir(5,6.6);
        toplaYazdir(7,6);

        Scanner scanner = new Scanner(System.in);
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        toplaYazdir(sayi1,sayi2);


    }

    public static void toplaYazdir(double sayi1,double sayi2){

        System.out.println("Verilen iki sayinin toplami : " + (sayi1+sayi2));


    }



}
