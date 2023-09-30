package day06_StringManipulation;

public class C05_lenght {
    public static void main(String[] args) {

        String str = "Java ogrenen issiz kalmaz";
        System.out.println(str.length()); //26

        // sondan 2. karakteri giriniz

        System.out.println(str.charAt(26-2)); // z

        str = "Java";

        System.out.println(str.charAt(str.length()-2)); // v


        // Kodlamada DINAMIK kod yazmak onemlidir
        // Dinamik kod input'dan bilgileri alip,
        // input degisse bile calismaya devam eden kod demektir
    }
}
