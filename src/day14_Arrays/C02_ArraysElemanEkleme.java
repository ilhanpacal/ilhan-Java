package day14_Arrays;

import java.util.Arrays;

public class C02_ArraysElemanEkleme {
    public static void main(String[] args) {

        //Soru 7- Verilen bir array’eistenen bir elemani ekleyip bize donduren
        //        bir method yazin eski array’e yeni degeri atayin.

        int[] arr1 = {4, 5, 6, 7};

        // bu array'e 5. element olarak 8'i atayin
        // arr1[4]  = 8; calitirinca hata verir

        int[] yeniArr = {4, 5, 6, 7, 8};

        arr1 = yeniArr;

        System.out.println("arr1'in son hali : " + Arrays.toString(arr1));

    }

    public static int[] arrayeElemanEkle(int[] arr , int eklenecekEleman){

        int[] yeniArr = new int[arr.length+1];

        // eski array'deki tum elementleri yeni array'e atayalim

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }

        // yeni array'deki son elementi olarak istenen sayiyi atayalim

        yeniArr[yeniArr.length-1] = eklenecekEleman;

        return yeniArr;




    }
}
