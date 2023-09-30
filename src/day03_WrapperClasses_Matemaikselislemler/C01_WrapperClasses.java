package day03_WrapperClasses_Matemaikselislemler;

public class C01_WrapperClasses {
    public static void main(String[] args) {


        int sayi = 20;
        String str = "Java";

        Integer sayi2 = 30;

        sayi = sayi2;

        sayi2 = sayi;

        char chr1 = 'j';
        Character chr2 = chr1;

        Boolean bl = true;
        Short shr = 3;
        Double dbl = 3.5;
        Float flt = 2.3f;

        // primitive data turleri ile o turun wrapper class'i arasinda gecis mumkundur


        System.out.println(Integer.MAX_VALUE); //
        System.out.println(Short.MAX_VALUE); //

        String str1 = "34";
        String str2 = "45";


        // str1 ve str2 nin degerlerini (str1 + str2); // 3445

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); // 79



    }
}
