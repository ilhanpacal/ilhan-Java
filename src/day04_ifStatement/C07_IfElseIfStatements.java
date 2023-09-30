package day04_ifStatement;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullancidan pozitif birtam sayi isteyin
        // sayi 3'e bolunuyorsa 3'e bolunuyor
        // sayi 5'e bolunuyorsa 5'e bolunuyor
        // hem 3, hem 5'e bulunuyorsa "super sayi"
        // ne 3 ne de 5'e bulunuyorsa "Cope at gitsin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) {
            System.out.println("super sayi");

        }else if (girilenSayi % 3 == 0) {
            System.out.println("3'e bolunuyor");
        }else  if (girilenSayi % 5 == 0){
            System.out.println("5'e bolunur");

        }else {
            System.out.println("Cope at gitsin");
        }
    }
}
