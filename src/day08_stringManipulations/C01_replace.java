package day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace("Java","x")); // X candir

        System.out.println(str.replace("Java", "Tava")); // Tava candir

        System.out.println(str.replace('a', 'q')); // Jqvq candir

        System.out.println(str.replace('x', 'y')); // Java candir

        System.out.println(str.replace("a", "e").replace("i", "a"));

        System.out.println(str.replace("i", "a").replace("a", "e"));

        // degisecek metin sadece ilk deger icin degissin diyorsak
        // replace() yerine replaceFirst() kullanilir

        System.out.println(str.replaceFirst("a", "x"));

        // regex : regular expressions : belirlenmis kisaltmalar

        System.out.println(str.replaceFirst("\\w", "*"));

        // ilk harfi * yapalim
        str = "Java 44candir";

        System.out.println(str.replaceFirst("\\d", "+"));
    }
}
