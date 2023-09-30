package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C01_faktoryel {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         5! = 5*4*3*2*1 => 120


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        int factoryelSonuc = 1;

        for (int i = sayi; i >=1 ; i--) {

            factoryelSonuc *= i;

        }

        System.out.println("Verilen sayinin factoryel degeri : " + factoryelSonuc);





    }
}
