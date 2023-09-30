package zelda;

import java.util.Scanner;

public class ternary_eskenarucgen {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 & kenar2 == kenar3) {
        System.out.println("Eskenar ucgen");

        }else{
            System.out.println("Eskenar ucgen degil");
        }

    }
}
