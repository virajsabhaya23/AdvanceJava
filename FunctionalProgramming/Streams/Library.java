package FunctionalProgramming.Streams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {

         ArrayList<Book> books = populateLibrary();
        
         //this stream method is called LAZY METHODS
         // books.stream().filter(book -> {
        //     return book.getAuthor().startsWith("J");
        // }).filter(book -> {
        //     return book.getTitle().startsWith("E");
        // }).forEach(System.out::println);    //without for each u will get no output
    
        //parallel stream
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println); 
    }
 
    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Alice Walker","E1he Color Purple"));
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Jlice Walker","1The Color Purple"));
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Jlice Walker","2The Color Purple"));
        books. add (new Book ("Alice Walker","The Color Purple"));
        books. add (new Book ("Alice Walker","E2he Color Purple"));
        return books;
    }
}
