package day11_whileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {


        // 1'den 10'a kadar olan sayilari yazdirin

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + " ");

        }
        System.out.println("");


        // soruyu while loop ile yapmak istersek
        // while loop'da
        //      - loop icinde kullanilacak variable
        //      - bitis sarti
        //      - artis/azalis yontemini bizim yazmamiz gereklidir


        int sayi = 1;
        while (sayi <=10){
            System.out.println(sayi + " ");
            sayi++;
        }

        // for loop ile yapilabilecek bir islem
        // for loop ile yapmak tercih edilir
    }
}
