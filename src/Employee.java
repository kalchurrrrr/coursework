public class Employee {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.id = idCounter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id сотрудника " +
                id +
                ", Имя='" + name + '\'' +
                ", отдел='" + department + '\'' +
                ", зарплата=" + salary;
    }
}