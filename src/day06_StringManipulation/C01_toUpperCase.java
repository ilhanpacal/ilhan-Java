package day06_StringManipulation;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        str = str.toLowerCase(); // java candir


        // I yerine kucuk harf sectigimizde i gelir
        // I yerine Turkce karakter olarak ı gelmesini isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır



    }
}
