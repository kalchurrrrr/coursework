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
        indexSalary(employees, 15);
        System.out.println("Зарплата после индексации:");
        printAllEmployees(employees);
        printEmployeeWithMinimumSalaryByDepartment(employees, "5");
        printEmployeeWithMaximumSalaryByDepartment(employees, "3");
        printTotalSalaryByDepartment(employees, "2");
        printAverageSalaryByDepartment(employees, "1");
        indexSalaryByDepartment(employees, "3", 20);
        System.out.println("Зарплата в отделе после индексации:");
        printAllEmployeesByDepartment(employees, "3");
        System.out.println("Данные сотрудников без отдела");
        printAllEmployeesByDepartment(employees, "1");
        System.out.println("Сотрудники с зарплатой меньше заданного числа");
        printEmployeesWithSalaryLessThan(employees, 60000);
        System.out.println("Сотрудники с зарплатой больше или равной заданному числу");
        printEmployeesWithSalaryGreaterThan(employees, 75000);
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
    // Дополнительные методы
    public static void indexSalary(Employee[] employees, double percent) {
        // Индексировать зарплату всех сотрудников на заданный процент
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * (1 + percent / 100);
            employee.setSalary(newSalary);
        }
    }

    public static void printEmployeeWithMinimumSalaryByDepartment(Employee[] employees, String department) {
        // Найти сотрудника с минимальной зарплатой в отделе
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        if (minSalaryEmployee != null) {
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + minSalaryEmployee.toString());
        } else {
            System.out.println("Сотрудники в отделе не найдены " + department);
        }
    }

    public static void printEmployeeWithMaximumSalaryByDepartment(Employee[] employees, String department) {
        // Найти сотрудника с максимальной зарплатой в отделе
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        if (maxSalaryEmployee != null) {
            System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + maxSalaryEmployee.toString());
        } else {
            System.out.println("Сотрудники в отделе не найдены " + department);
        }
    }

    public static void printTotalSalaryByDepartment(Employee[] employees, String department) {
        // Посчитать сумму затрат на зарплаты в месяц по отделу
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц по отделу " + department + ": " + totalSalary);
    }

    public static void printAverageSalaryByDepartment(Employee[] employees, String department) {
        // Подсчитать среднее значение зарплат по отделу
        double totalSalary = 0;
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                totalSalary += employee.getSalary();
                employeeCount++;
            }
        }
        if (employeeCount > 0) {
            double averageSalary = totalSalary / employeeCount;
            System.out.println("Среднее значение зарплат по отделу " + department + ": " + averageSalary);
        } else {
            System.out.println("Сотрудники в отделе не найдены " + department);
        }
    }

    public static void indexSalaryByDepartment(Employee[] employees, String department, double percent) {
        // Индексировать зарплату всех сотрудников отдела на заданный процент
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public static void printAllEmployeesByDepartment(Employee[] employees, String department) {
        // Получить список всех сотрудников отдела со всеми имеющимися по ним данными, кроме отдела
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                System.out.println("Сотурдник: " +
                        "id=" + employee.getId() +
                        ", имя='" + employee.getName() + '\'' +
                        ", зарплата=" + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(Employee[] employees, double salary) {
        // Получить список всех сотрудников с зарплатой меньше заданного числа
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("Сотрудник: " +
                        "id=" + employee.getId() +
                        ", имя='" + employee.getName() + '\'' +
                        ", зарплата=" + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryGreaterThan(Employee[] employees, double salary) {
        // Получить список всех сотрудников с зарплатой больше или равной заданному числу
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("Сотрудник: " +
                        "id=" + employee.getId() +
                        ", имя='" + employee.getName() + '\'' +
                        ", зарплата=" + employee.getSalary());
            }
        }
    }
}