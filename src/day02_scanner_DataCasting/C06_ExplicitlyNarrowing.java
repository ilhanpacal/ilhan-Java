package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {


    public static void main(String[] args) {

        int sayi = 20;

        byte byt = (byte) sayi;
        System.out.println("20'nin byte olarak karsiligi : " + byt);
        // 20'nin byte olarak karsiligi : 20

        sayi = 130;
        byt = (byte)sayi;
        System.out.println("130'un byte olarak karsiligi : " + byt);
        // 130'un byte olarak karsiligi : -126



        sayi = 256;
        byt = (byte)sayi;
        System.out.println("256'nin byte olarak karsiligi : " + byt);
        // 256'nin byte olarak karsiligi : 0


        sayi = 567;
        byt = (byte)sayi;
        System.out.println("567'nin byte olarak karsiligi : " + byt);
        // 567'nin byte olarak karsiligi : 55


        sayi = 640;
        byt = (byte)sayi;
        System.out.println("640'in byte olarak karsiligi : " + byt);
        // 640'in byte olarak karsiligi : -128;



        double dbl = 34.7;
        sayi = (int)dbl;
        System.out.println("34.7 nin int olarak degeri : " + sayi);

        /*
        String str = (String)sayi ;
         */
    }

}
