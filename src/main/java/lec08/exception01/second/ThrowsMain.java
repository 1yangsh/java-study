package lec08.exception01.second;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsMain {

    public static void main(String[] args) {

        try {
            FileOutputStream fis = new FileOutputStream("C:/");
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
