package zelda;

import java.util.Scanner;

public class on_unKati {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi<0){
            if(sayi%2 != 0){
                System.out.println(sayi+ " = negatif bir tek sayi");

            }else{
                System.out.println(sayi+ " negatif bir cift sayi");
            }

        }else if(sayi>0) {
            if (sayi % 10 == 0) {
                System.out.println(sayi + " pozitif 10'un kati bir cift sayi");
            } else if(sayi%2 != 0){
                System.out.println(sayi + " pozitif bir tek sayi");

            }else if(sayi%2 ==0) {
                System.out.println(sayi + " pozitif bir cift sayidir");

            }
        }



    }

    public static class ternary_1 {
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scanner.nextInt();

            if (sayi%5 == 0) {
                System.out.println(sayi + " 5'in kati");
            }else{
                System.out.println("sayi = " + sayi);
            }


        }
    }
}
