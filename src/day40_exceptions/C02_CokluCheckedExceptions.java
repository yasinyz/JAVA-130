package day40_exceptions;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedExceptions {


    public static void main(String[] args){

        String dosyaYolu="src/day40_exceptions/yazı.txt";

        FileInputStream fis= null;
        try


        {

            fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        int k=0;
        while(true) {
            try {
                if (!((k= fis.read() ) != (-1))) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char) k);

        }

    }
}
