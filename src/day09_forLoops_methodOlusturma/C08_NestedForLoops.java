package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C08_NestedForLoops {
    public static void main(String[] args) {

       /* Kullanicidan satir ve sutun sayisini alip
        asagidaki gibi *'lardan olusan bir sekil cizdirin

        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.println(i + " ");

            }

            System.out.println("");

        }

    }
}
