package day08_stringManipulations;

import java.util.Scanner;

public class C05_stringManipulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        String buyukCumle = cumle.toUpperCase();

        if (buyukCumle.contains("EV") && buyukCumle.contains("IS")){
            System.out.println("Hem ev lazim hem is");
        } else if (buyukCumle.contains("EV")) {
            System.out.println("home home sweet home");
        } else if (buyukCumle.contains("IS")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }
    }
}
