package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {


        int[] arr = {3,4,5,3};

        // kullanicidan bir deger alip array'e ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'e eklemek icn bir tamsayi giriniz");
        int eklenecekSayi = scanner.nextInt();

        arr =C02_ArraysElemanEkleme.arrayeElemanEkle(arr, eklenecekSayi);

        System.out.println("Array'in yeni hali ; "+ Arrays.toString(arr));
    }
}