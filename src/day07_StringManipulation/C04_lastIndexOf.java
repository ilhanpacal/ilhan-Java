package day07_StringManipulation;

public class C04_lastIndexOf {

    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan";

        // str a le mi baslar?

        System.out.println(str.startsWith("a")); // false

        // a'nin ilk kullanildigi index'i yazdirin

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.endsWith("a")); // false

        // a'nin son kullanimini index'ini yazdirin

        System.out.println(str.lastIndexOf("a")); // 27

        //can kelimesinin ilk index'ini bulun

        System.out.println(str.indexOf("can"));

        // can kelimesinin son kullanimini index'ini yazdirin

        System.out.println(str.lastIndexOf("can")); // 26

        // Selenium kelimesinin ilk kullanimini ve son kullanimini yazdirin

        System.out.println(str.indexOf("Selenium")); // 13

        System.out.println(str.lastIndexOf("Selenium")); // 13
    }

}
