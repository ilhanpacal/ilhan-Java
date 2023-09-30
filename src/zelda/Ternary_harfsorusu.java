package zelda;

import java.util.Scanner;

public class Ternary_harfsorusu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenharf = scanner.next().charAt(0);

        if (girilenharf >= 'a' && girilenharf <= 'z') {

            System.out.println(Character.toUpperCase(girilenharf));

        } else {

            System.out.println(girilenharf);
        }

    }
}
