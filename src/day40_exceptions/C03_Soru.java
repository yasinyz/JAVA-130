package day40_exceptions;

import java.util.Scanner;

public class C03_Soru {

    public static void main(String[] args) {

        // kullanıcıdan istediği kadar sayı girmesini soyleyin
        // girdig sayılardan pozitif olanları toplayın
        // toplama işlemini bitirmek için kullanıcı Q ya basmalıdır
        // negatif sayı veya Q girerse toplama ekleyın
        // kullanıcı Q ya bastığında
        // toplam kaç pozitif sayı girdigini ve
        // toplamların kac oldugunu yazdırın


        int toplananSayıAdedi=0;
        int toplam=0;
        int girilenSayı=0;
        String girilenHarf= "a";
        Scanner scanner=new Scanner(System.in);


        while (!girilenHarf.equalsIgnoreCase("Q")){
            System.out.println("lütfen toplamak uzere pozitif sayılar girin"+"\nBitirmek için Q ya basın");


            girilenSayı=scanner.nextInt();

            if (girilenSayı>0){
                toplam+=girilenSayı;
                toplananSayıAdedi++;
               
            }

        }

    }
}
