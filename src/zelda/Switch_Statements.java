package zelda;

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {


        // Kullanicidan gun numarasi alip haftaici veya hafta sonu yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        int gunNo = scanner.nextInt();


        switch (gunNo){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftici bir gun");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu bir gun");
            default:
                System.out.println("Gecersiz gun numarasi");
        }



    }
}
