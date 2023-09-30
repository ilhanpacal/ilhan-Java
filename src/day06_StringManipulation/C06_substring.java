package day06_StringManipulation;

public class C06_substring {
    public static void main(String[] args) {

        String str ="Java en guzel programlama dili";

        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.substring(1));



        // son 4 karakteri yazdirin

        System.out.println(str.substring(str.length()-4));

        // sadece "Java" yi yazdirin

        System.out.println(str.substring(0,4));

        // 0. index'den basla 4 karakter yazdir
        // veya 0. index (dahil) ile 4. index (haric) arasi

        System.out.println(str.substring(8,13));

    }
}
