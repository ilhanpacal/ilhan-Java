import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {


        // Soru 5- Kulanicidan ismini soyismini ve yasini alip asagidaki formatta yazdirin.
        //         girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in); // consol'da veri girebilmek icin, Scanner class cagirilir

        System.out.println("isminizin ilk harfini giriniz:");
        char basHarf = scanner.nextLine().charAt(0);

        System.out.println("Soyisminizi giriniz:");
        String soyisim = scanner.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();

     //   String bosluk = " ";
        System.out.println(basHarf+" "+soyisim+", "+yas);
        System.out.println(soyisim+" "+yas);
    }
}
