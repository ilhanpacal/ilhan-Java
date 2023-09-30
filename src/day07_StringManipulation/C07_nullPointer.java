package day07_StringManipulation;

public class C07_nullPointer {
    public static void main(String[] args) {

        String str;

        // System.out.println(str);
        // Java'da main method icerisinde deger atamadan bir variable olusturabiliriz
        // ANCAK deger atamadan kullanmayiz

        String str2 = "";
        System.out.println(str2); // hiclik yazdirir
         // str2 kullanabilmek icin hiclik degeri atayabiliriz
        // Ancak hiclik degeri atanan variable'lari
        // Java deger atanmamis olarak siniflandirmaz
        // deger atananlar grubuna koyar

        /*
             java deger atanmamis variable'lari isaretlemek icin *
             ozel bir keyword olusturmustur

         Asagidaki ornekte

         str4'e hiclik degeri atanmistir
         str5'e Tava degeri atanmistir
         str3'e null olarak ISARETLENMISTIR

         null bir deger degil ISARETCIDIR
         str3'un olusturuldugunu ve bir deger atanmadan kullanilmak istendigini gosterir
       */


        String str3 = null;
        String str4 = "";
        str2 = "ilhan";

        // System.out.println(str); null

        // System.out.println(str3.substring(0,1)); // NullPointerException
    }
}
