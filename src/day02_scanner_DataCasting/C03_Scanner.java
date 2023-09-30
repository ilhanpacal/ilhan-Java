package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 5- Kulanicidan ismini soyismini ve yasini alip asagidaki formatta yazdirin.
        //         girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + "" + soyisim + ", " + yas);


        String name = "Esra";

        name = "ilhan";

        System.out.println(name);

        int not;

        not = 80;

        not = 90;
        System.out.println(not);

    }
}
