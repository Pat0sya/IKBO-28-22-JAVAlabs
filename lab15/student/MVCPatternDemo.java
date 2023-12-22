package mirea.javalabs.lab15.student;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Обновляем представление
        controller.updateView();

        // Обновляем модель и снова обновляем представление
        controller.setStudentName("Головкин Сергей");
        controller.setStudentRollNo("12345");
        controller.updateView();
    }
}
