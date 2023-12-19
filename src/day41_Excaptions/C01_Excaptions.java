package day41_Excaptions;

public class C01_Excaptions {


    public static void main(String[] args) {

        int sayi=10;


        try {
            System.out.println("satir1");
            if (sayi<0) throw new IllegalArgumentException();
            System.out.println("satir2");
            if (sayi%2==0) throw new RuntimeException();
            System.out.println("satir3");


            System.out.println("satir4");
            System.out.println("satir5");
        } catch (IllegalArgumentException e) {

        }catch (RuntimeException e){

        }


        System.out.println("buradan itibaren çalışmya devam");
    }
}
