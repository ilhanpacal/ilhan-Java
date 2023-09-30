package day04_ifStatement;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        int a = 250;
        int b = 40;

        // a 'b'den buyuk mu ?
        if (a > b) {
            System.out.println("a b'den buyuk");
            }

        // a cift sayi mi ?
        if (a % 2 == 0){
            System.out.println("a cift sayi");
        }

        // b 5 ile tam bolunebiliyor mu ?
        if (b % 5 == 0){
            System.out.println("b 5 ile tam bolunur");
        }

        // a 3 basamakli bir sayi mi ?
        if (a >=100 && a<=999){
            System.out.println("a sayisi 3 basamakli");
        }

        // a ile b'nin toplami 100'den buyuk mu ?
        boolean sart = a + b > 100;
        System.out.println(sart); // false





    }

}