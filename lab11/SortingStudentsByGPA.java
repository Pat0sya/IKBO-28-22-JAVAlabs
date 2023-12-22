package mirea.javalabs.lab11;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<StudentClass>{
    public static void main(String[] args){
        StudentClass[] students = {
                new StudentClass("John", 3.5),
                new StudentClass("Alice", 4.2),
                new StudentClass("Vine", 4.2),
                new StudentClass("Max", 1.9),
                new StudentClass("Alex", 2.5)
        };
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length-1);
        for(StudentClass student:students){
            System.out.println(student);
        }
    }
    public void quickSort(StudentClass[] students, int low, int high){
        if (low < high){
            int index = part(students, low, high);
            quickSort(students, low, index-1);
            quickSort(students, index+1, high);
        }
    }
    public int part(StudentClass[] students, int low, int high){
        StudentClass pivot = students[high];
        int i = low-1;
        for (int j = low; j < high; j++){
            if(compare(students[j], pivot)>0){
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i+1, high);
        return i+1;
    }
    public void swap(StudentClass[] students, int i, int j){
        StudentClass temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
    @Override
    public int compare(StudentClass student1, StudentClass student2){
        if(student1.getGPA() <student2.getGPA()){
            return 1;
        }else if (student1.getGPA()>student2.getGPA()){
            return -1;
        }
        return 0;
    }
}
class StudentClass{
    private String name;
    private double GPA;
    public StudentClass(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return GPA;
    }
    @Override
    public String toString(){
        return "Student{" + "name='"+name+'\''+", GPA="+GPA+'}';
    }
}