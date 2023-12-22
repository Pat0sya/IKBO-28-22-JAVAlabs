package mirea.javalabs.lab3;
import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email =  email;
        this.gender = gender;
    }
    public String GetName(){
        return name;
    }
    public String GetEmail(){
        return email;
    }
    public char GetGender(){
        return gender;
    }
    public String toString() {
        String GenderStr;
        if (gender == 'M') {
            GenderStr = "(m)";
        } else if (gender == 'F') {
            GenderStr = "(f)";
        } else {
            GenderStr = "Unknown";
        }
        return name + " " + GenderStr + " at " + email;
    }

}
