package day24_inheriance_constructorCall;

public class G_GrandParent {

    G_GrandParent(){
        System.out.println("GP parametresiz ");
    }

    G_GrandParent(String str){
        System.out.println("GP String ");
    }

    G_GrandParent(int sayi){
        System.out.println("GP int ");
    }

    G_GrandParent(boolean bl){
        System.out.println("GP boolean ");
    }
}
