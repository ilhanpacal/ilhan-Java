package day07_StringManipulation;

public class C2_indexOf {
    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan.";

        // str Selenium iceriyor mu?

        System.out.println(str.contains("Selenium")); // true

        // str Selenium ile mi bitiyor?

        System.out.println(str.endsWith("Selenium")); // false

        // str Selenium ile mi bitiyor?

        System.out.println(str.startsWith("Selenium")); // false

        // Peki Selenium nerde?

        System.out.println(str.indexOf("Selenium")); // 13

        // olmayan bir metin aratilirsa

        System.out.println(str.indexOf("x")); // -1

        // contains() kullanmadan str'in java icarip icermedigini yazdirin

        System.out.println(str.indexOf("java"));

        // str'daki ilk a harfini index'ini yazdirin

        System.out.println(str.indexOf("a")); // 1

        // str'daki ikinci a harfini index'ini yazdirin

        System.out.println(str.indexOf("a", 1)); // 1

        // str'daki ikinci a harfinin index'ini yazdirin

        System.out.println(str.indexOf("a", 2)); // 3

        // str'daki 3. a harfinin index'ini yazdirin

        System.out.println(str.indexOf("a", 4)); // 6

        // str'daki 4.a varsa index'ini yazdirin
        // yoksa "str sadece 3 tane a iceriyor" yazdirin

        if (str.indexOf("a",7) == -1 ) {
            System.out.println("4. a'nin index'i : " + str.indexOf("a", 7));
        } // 4. a'nin index'i : 27


        // str'da 5.a varsa index'ini yazdirin
        // yoksa "str sadece 4 tane a iceriyor" yazdirin

        if (str.indexOf("a",28) == -1){
            System.out.println("str sadece 4 tane a iceriyor");
        }else {
            System.out.println("5. a'nin index'i : " + str.indexOf("a", 28));

        }
    }
}
