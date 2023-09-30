package day05_nestedIfElseStatement;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunliklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println( kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0

                          ?
                      "Eskenar ucgen"
                          :
                       "Eskenar degil"
                          );
    }
}
