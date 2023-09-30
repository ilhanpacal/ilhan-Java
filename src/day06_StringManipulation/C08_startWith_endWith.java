package day06_StringManipulation;

public class C08_startWith_endWith {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.contains("a")); // true

        System.out.println(str.startsWith("a")); // false

        System.out.println(str.endsWith("a")); // false

        System.out.println(str.endsWith("candir")); // false
        System.out.println(str.startsWith("")); // true
        System.out.println(str.endsWith("")); // true
    }
}
