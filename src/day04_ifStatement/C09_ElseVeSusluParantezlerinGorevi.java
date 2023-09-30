package day04_ifStatement;

import java.util.Scanner;

public class C09_ElseVeSusluParantezlerinGorevi {
    public static void main(String[] args) {


        // Musteriden satin aldigi urun adedini isteyin
        // adet 100'den fazla ise "% 20 indirim kazandiniz"
        //adet 50'den fazla ise %10 indirim kazandiniz"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int adet = scanner.nextInt();

        if (adet>100){
            System.out.println("%20 indirim kazandiniz");

        } else if (adet>50){
            System.out.println("%10 indirim kazandiniz");
        }





    }
}
