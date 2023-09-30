package day10_methodOlusturma_methodOverloadin;

public class C03_AsalSayiBulma {
    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // asal olup olmadigini kontol edip
        // asal ise true, asal degil ise false yazdiran bir method olusturun


        asalMiyazdir(45); // false
    }



    public static void asalMiyazdir(int sayi){

        boolean flag = true;

        for (int i = 2; i <=sayi ; i++) {

            if (sayi % i == 0 ){
                flag = false;
            }

        }
        System.out.println(flag);
    }

}
