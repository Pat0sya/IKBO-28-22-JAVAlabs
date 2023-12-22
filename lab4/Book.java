package mirea.javalabs.lab4;

public class Book {
    private String title;
    private String autor;
    private int year;
    public Book(String title, String autor, int year){
        this.title = title;
        this.autor = autor;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + autor);
        System.out.println("Year: " + year);
    }
}

