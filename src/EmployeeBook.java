public class EmployeeBook {
    private  int count;
   // private static final Employee[] employees = new Employee[10];

   // public static Employee[] getEmployees() {
   private static final Employee[] employees = new Employee[]{
                new Employee("Ivanov Ivan Ivanovich1", 1, 1000),
                new Employee("Ivanov Ivan Ivanovich2", 1, 1001),
                new Employee("Ivanov Ivan Ivanovich3", 1, 1001),
                new Employee("Ivanov Ivan Ivanovich4", 2, 1003),
                new Employee("Ivanov Ivan Ivanovich5", 3, 1004),
                new Employee("Ivanov Ivan Ivanovich6", 3, 2005),
                new Employee("Ivanov Ivan Ivanovich7", 4, 2010),
                new Employee("Ivanov Ivan Ivanovich8", 4, 2007),
                new Employee("Ivanov Ivan Ivanovich9", 5, 2008),
                new Employee("Ivanov Ivan Ivanovich10", 5, 2009)
        };
       // return EmployeeBook.employees


    public static Employee[] getEmployees() {
        return employees;
    }

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
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int caclulateAverageSalary() {
        for (Employee employee : employees) {
            if (employee != null) {
                count++;}
        }
        if (count != 0){
        return calculateTotalSalary()/count ;};

        return 0;
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
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void increaseSalary(int percentOfIncrease) {
        for (Employee employee : employees) {
            if (employee != null) {
                int currentSalary = employee.getSalary();
                double increase = currentSalary * percentOfIncrease * 0.01;
                employee.setSalary((int) (currentSalary + increase));
            }
        }
    }

    //High Level Task 4 Add two new methods: add employee and remove employee:

    public void addEmployee(String fullName, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length && employees[i] != null ; i++) {
                if (employees[i].getId() == id) {
                 employees[id] = null;
                };
            }
        }

        //Task 5 Change salary and department
        public void modifyEmployee(int id, int newSalary, int newDepartment, boolean salary, boolean department){
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    if (employees[i].getId() == id) {
                        if (salary) {
                            employees[i].setSalary(newSalary);
                        }
                        if (department) {
                            employees[i].setDepartment(newDepartment);
                        }
                    }
                }
            }
        }


        //Task 6 FIO and department
        public void printOutEmployeeWithDep() {
            int[] depNumber = new int[]{1, 2, 3, 4, 5};
            for (int k = 0; k < depNumber.length; k++) {
                for (int i = 0; i < employees.length; i++) {
                    if (depNumber[k] == employees[i].getDepartment() && employees != null) {
                        System.out.println("Employee: " + employees[i].getName() + ", Department: " + depNumber[k] + ".");
                    }
                }
            }
        }
        //return percentOfIncrease;
    }


//comments







