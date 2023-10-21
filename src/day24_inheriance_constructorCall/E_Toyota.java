package day24_inheriance_constructorCall;

public class E_Toyota extends D_Car{


    E_Toyota(){
        super();// once parent'daki parametresiz cons. calistir

    }

    String marka = "Toyota";
    String uretimYeri = "Japonya ve Turkiye";

    String sanziman = "otomatik veya manuel";
    String lastik = "Pirelli";
    String guvenlik = "Toyota araclar ekstra guvenlik donanimina sahiptir";
    String aku = "Aku atanmadi";
}
