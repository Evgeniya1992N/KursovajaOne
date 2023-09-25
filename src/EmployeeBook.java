public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public int caclulateAverageSalary() {
        return calculateTotalSalary() / Employee.getCounter();
    }

    public Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = Integer.MAX_VALUE;
        if (employees[0] == null) {
            throw new RuntimeException();
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public Employee findEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new RuntimeException();
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }

    public void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public void increaseSalary(int percentOfIncrease) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            double increase = currentSalary * percentOfIncrease * 0.01;
            employee.setSalary((int) (currentSalary + increase));
        }
    }

    //High Level Task 4 Add two new methods: add employee and remove employee:

    public void addEmployee(String fullName, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
            } else {
                System.out.println("Database is full");
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            } else {
                System.out.println("No employee found");
            }
        }
    }

    //Task 5 Change salary and department
    public void modifyEmployee(int id, int newSalary, int newDepartment, boolean salary, boolean department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                if (salary = true) {
                    employees[i].setSalary(newSalary);
                }
                if (department = true) {
                    employees[i].setDepartment(newDepartment);
                }
            }
        }

    }

    //Task 6 FIO and department
    public void printOutEmployeeWithDep() {
        int[] depNumber = new int[]{1, 2, 3, 4, 5};
        for (int k = 0; k < depNumber.length; k++) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == depNumber[k]) {
                    System.out.println("Employee: " + employees[i].getName() + ", Department: " + depNumber[k] + ".");
                } else if (employees[i].getDepartment() == 2) {
                    System.out.println("Employee: " + employees[i].getName() + ", Department: " + depNumber[k] + ".");
                } else if (employees[i].getDepartment() == 3) {
                    System.out.println("Employee: " + employees[i].getName() + ", Department: " + depNumber[k] + ".");
                } else if (employees[i].getDepartment() == 4) {
                    System.out.println("Employee: " + employees[i].getName() + ", Department: " + depNumber[k] + ".");
                } else {
                    System.out.println("Employee: " + employees[i].getName() + ", Department: " + depNumber[k] + ".");
                }
            }
        }
    }
}









