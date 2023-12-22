package mirea.javalabs.lab15.employee;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Обновляем представление
        controller.updateView();

        // Обновляем модель и снова обновляем представление
        controller.setEmployeeName("Шумкин Антон");
        controller.setEmployeeSalary(50000.0);
        controller.updateView();
    }
}