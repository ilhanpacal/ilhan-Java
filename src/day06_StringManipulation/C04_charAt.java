package day06_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor.";

        // ilk harfi yazdirin
        System.out.println(str.charAt(0)); // J

        System.out.println(str.charAt(4)); // espace

        // str'da 31 karakter var
        // son karakter olan .'nin indeksi 30 olur

        // son karakteri yazdirin
        System.out.println(str.charAt(31-1));

        // sondan 5. karakteri yazdirin
        System.out.println(str.charAt(31-5));
    }
}
