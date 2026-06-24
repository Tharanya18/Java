package Day1;

class Employee {

    int empId;
    String empName;
    double salary;
    
    Employee(int empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {

        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}

public class Exp12 {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Tharanya", 35000);
        Employee e2 = new Employee(102, "Mithula", 42000);

        e1.display();
        e2.display();
    }
}