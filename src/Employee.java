public class Employee {
    private String name;
    private int department;
    private int salary;
    private static int counter = 0;
    public int id;


    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter(){
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "id" + id +
                        "; Сотрудник: " + name +
                        "; Зарплата: " + salary +
                        "; Отдел: " + department +
                        ";";
    }



}
