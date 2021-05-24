import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Author author1 = new Author("valod","valod@gmail.com");


//        obj.setEmail("bazuk@gmail.com");
//        System.out.println(author1.getEmail());
//        System.out.println(author1.toString());
    Book book1 = new Book("Fight Club","Fight",author1,20000,60);

        System.out.println(book1.getAuthor());
    }
}

