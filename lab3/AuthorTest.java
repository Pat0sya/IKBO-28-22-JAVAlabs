package mirea.javalabs.lab3;
import java.lang.*;
public class AuthorTest {
    public static void main(String[] args){
        Author author1 = new Author("Egor Skidanov", "EgSkid@kkindzadza.ku", 'M');
        System.out.println(author1);
        Author author2 = new Author("Alex Yavchenkova", "AlexYav@cardinalia.cad", 'F');
        System.out.println(author2);
    }
}
