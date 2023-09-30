package day11_whileLoop_doWhileLoop;

public class C10_DoWhileLoop {
    public static void main(String[] args) {


        int sayi = 10;

        // do-while loop ile verilen sayidan baslayip , birer azaltarak
        //3'e kadar olan sayilari yazdirin

        do {
            System.out.println(sayi + " ");
            sayi--;
        }while (sayi>3);

        System.out.println("");
        sayi = 2;
        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);
    }
}
