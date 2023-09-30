package day02_scanner_DataCasting;

import java.util.Scanner;

public class C07_asciiTable {


    public static void main(String[] args) {


        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println("chr1 + chr2"); // 97 + 98 = 195

        int sayi1 = chr1;



        System.out.println("char 'a' nin int karsiligi : " + sayi1);
        // char 'a' nin alt karsiligi : 97

        // kullanicidan bir char alip
        // ascii table'da o karakterden sonra gelen 3 karakteri yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen ascii table'dan bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter : "+(char)(krk + 1));
        System.out.println("girilen karakterden 2 sonraki karakter : "+(char)(krk + 2));
        System.out.println("girilen karakterden 3 sonraki karakter : "+(char)(krk + 3));

    }
}
