public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван Иванов", "1", 50000);
        employees[1] = new Employee("Егор Виноградов", "2", 60000);
        employees[2] = new Employee("Ксения Волкова", "3", 70000);
        employees[3] = new Employee("Юрий Листовой", "4", 80000);
        employees[4] = new Employee("Александр Пистолетов", "5", 90000);
        employees[5] = new Employee("Елена Антипова", "1", 55000);
        employees[6] = new Employee("Ольга Романова", "2", 65000);
        employees[7] = new Employee("Георгий Зурабов", "3", 75000);
        employees[8] = new Employee("Николай Калчу", "4", 85000);
        employees[9] = new Employee("Никита Грачёв", "5", 95000);

        printAllEmployees(employees);
        printTotalSalary(employees);
        printEmployeeWithMinimumSalary(employees);
        printEmployeeWithMaximumSalary(employees);
        printAverageSalary(employees);
        printAllEmployeeNames(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        // Получить список всех сотрудников со всеми имеющимися по ним данными
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void printTotalSalary(Employee[] employees) {
        // Посчитать сумму затрат на зарплаты в месяц
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты: " + totalSalary);
    }

    public static void printEmployeeWithMinimumSalary(Employee[] employees) {
        // Найти сотрудника с минимальной зарплатой
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee.toString());
    }

    public static void printEmployeeWithMaximumSalary(Employee[] employees) {
        // Найти сотрудника с максимальной зарплатой
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee.toString());
    }

    public static void printAverageSalary(Employee[] employees) {
        // Подсчитать среднее значение зарплат
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = totalSalary / employees.length;
        System.out.println("Среднее значение зарплат: " + averageSalary);
    }

    public static void printAllEmployeeNames(Employee[] employees) {
        // Получить Ф. И. О. всех сотрудников
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}