package day08_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "45Java /+can789dir";

        // metindeki sayi ve karakterleri temizleyip
        // sadece harflerden olusan "Java candir" sekline donusturun

        // tum sayilari yok edelim

        str = str.replaceAll("\\d","");

        // space'i korumak icin, space yerine bir rakam atayalim
        str = str.replaceFirst("\\s","5");

        // ozel karakterleri yok edelim
        str = str.replaceAll("\\W","");

        // W harf, rakam ve _ 'yi degistirmez
        // _'yi yok etmek icin alttaki satiri kullanabiliriz

        str = str.replaceAll("_"," ");

        // space yerine yazdigimiz sayiyi, yeniden space yapalim
        str = str.replaceAll("5"," ");

        System.out.println(str);
    }
}
