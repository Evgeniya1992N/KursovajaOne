public class Main {

    private static final Employee[] employees = new Employee[]{
            new Employee("Ivanov Ivan Ivanovich1", 1, 1000),
            new Employee("Ivanov Ivan Ivanovich2", 1, 1001),
            new Employee("Ivanov Ivan Ivanovich3", 2, 1002),
            new Employee("Ivanov Ivan Ivanovich4", 2, 1003),
            new Employee("Ivanov Ivan Ivanovich5", 3, 1004),
            new Employee("Ivanov Ivan Ivanovich6", 3, 2005),
            new Employee("Ivanov Ivan Ivanovich7", 4, 2010),
            new Employee("Ivanov Ivan Ivanovich8", 4, 2007),
            new Employee("Ivanov Ivan Ivanovich9", 5, 2008),
            new Employee("Ivanov Ivan Ivanovich10", 5, 2009)
    };


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (int k = 0; k < employees.length; k++) {
            sum += employees[k].getSalary();
        }
        return sum;
    }

    public static int caclulateAverageSalary() {
        // int average = 0;
        // for (int k = 0; k < employees.length; k++) {
        //     average = (average + employees[k].getSalary()) / employees.length;
        // }
        //  return average;
        //}
        return calculateTotalSalary() / Employee.getCounter();
    }

    public static Employee findEmployeeWithMinSalary() {
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

    public static Employee findEmployeeWithMaxSalary() {
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

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


    public static void increaseSalary(int percentOfIncrease) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            double increase = currentSalary * percentOfIncrease * 0.01;
            employee.setSalary((int) (currentSalary + increase));
        }
    }


    public static Employee findEmployeeWithMinSalaryDep(int department) {
        Employee result = employees[0];
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalaryDep(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }

    public static int calculateTotalSalaryInDep(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static int calculateAverageSalaryInDep(int department) {
        int membersNumber = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                membersNumber = membersNumber + 1;
            }
        }
        return calculateTotalSalaryInDep(department) / membersNumber;
    }

    public static void increaseSalaryInDep(int department, int percentOfIncrease) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int currentSalary = employee.getSalary();
                double increase = currentSalary * percentOfIncrease * 0.01;
                employee.setSalary((int) (currentSalary + increase));
            }
        }
    }

    public static void printEmployeesOfDep(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Name: " + employee.getName() + " ,ID: " + employee.getId() + ", Salary: " + employee.getSalary() + ".");
            }
        }
    }

    public static void checkIfSalaryIsLess(int minSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                System.out.println("Name: " + employee.getName() + " ,ID: " + employee.getId() + ", Salary: " + employee.getSalary() + ".");
            }
        }
    }

    public static void checkIfSalaryIsMore(int minSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= minSalary) {
                System.out.println("Name: " + employee.getName() + " ,ID: " + employee.getId() + ", Salary: " + employee.getSalary() + ".");
            }
        }
    }

        public static void main (String[] args) {

        }
        }






