package day15_multiDimensionalArrays_arraysLists;

public class C03_MDA_EnbuyukEnkucukElemanlariBulma {
    public static void main(String[] args) {

        // Verilen bir MDA'de en buyuk ve en kucuk sayilari bulup, yazdiran
        // bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};


    }

    public static void enBuyukEnkucukElemanBul(int[][] arr) {

        int maxElement = arr[0][0];
        int minElement = arr[0][0];

        enBuyukEnkucukElemanBul(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                }

                if (arr[i][j] < minElement) {

                }

            }
        }

        System.out.println("Array'deki en buyuk sayi : " + maxElement);
        System.out.println("Array'deki en kucuk sayi : " + minElement);

    }
    }

