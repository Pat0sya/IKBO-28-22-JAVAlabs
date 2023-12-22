package mirea.javalabs.lab11;

public class StudentTest {
    public static void main(String[] args){
        Student[] students = new Student[5];
        students[0] = new Student("John", 123);
        students[1] = new Student("Alice", 456);
        students[2] = new Student("Vine", 876);
        students[3] = new Student("Max", 895);
        students[4] = new Student("Alex", 245);
        insertSort(students);
        for (Student student : students){
            System.out.println(student);
        }

    }
    public static void insertSort(Student[] students){
        for(int i =1; i < students.length; i++){
            Student key = students[i];
            int j = i-1;
            while (j>=0&&students[j].getiDNumber()>key.getiDNumber()){
                students[j+1] = students[j];
                j--;
            }
            students[j+1] = key;
        }
    }
}
class Student{
    private String name;
    private int iDNumber;
    public Student(String name, int iDNumber){
        this.name = name;
        this.iDNumber = iDNumber;
    }
    public String getName(){
        return name;
    }
    public int getiDNumber(){
        return iDNumber;
    }
    @Override
    public String toString(){
        return "Student{" +"name='"+name+'\''+", iDNumber="+iDNumber+'}';
    }
}