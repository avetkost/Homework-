import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Author obj = new Author("valod","boxk@gmail.com");


        obj.setEmail("bazuk@gmail.com");
        System.out.println(obj.getEmail());
        System.out.println(obj.toString());

    }
}

