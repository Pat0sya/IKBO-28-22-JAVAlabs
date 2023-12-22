package mirea.javalabs.lab17;
import java.util.Arrays;
class StudentDatabase {
    private Student[] students;
    private int size;

    public StudentDatabase(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public void addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        }
    }

    public Student findStudentByFullName(String fullName) {
        for (Student student : students) {
            if (student != null && student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО " + fullName + " не найден.");
    }

    public void sortByAverageScore() {
        Arrays.sort(students, 0, size, (s1, s2) -> Double.compare(s2.getAverageScore(), s1.getAverageScore()));
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }
}
