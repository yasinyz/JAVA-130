package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckdExceptions {


    public static void main(String[] args) {

        String dosyaYolu="src/day40_exceptions/yazı.txt";

        // java da pc de var olan bir dosyaya ulaşmak için
        // FileInputStream class i kullanılır

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
