package day39_exceptions;

import java.util.Scanner;

public class C05_ {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir cümle giriniz...");

        String cumle=scanner.nextLine();

        System.out.println("lütfen bir tamsayı giriniz ...");

        int sayı=scanner.nextInt();

        System.out.println(cumle.charAt(7));
    }
}
