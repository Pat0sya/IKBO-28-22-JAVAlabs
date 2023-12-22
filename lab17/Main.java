package mirea.javalabs.lab17;

public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase(10);

        database.addStudent(new Student("Иванов Иван Иванович", 4.5));
        database.addStudent(new Student("Петров Петр Петрович", 3.7));
        database.addStudent(new Student("Сидоров Сидор Сидорович", 4.0));

        database.sortByAverageScore();
        database.printStudents();

        try {
            Student foundStudent = database.findStudentByFullName("Петров П Петрович");
            System.out.println("Найден студент: " + foundStudent);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}