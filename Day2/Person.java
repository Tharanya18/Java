package Day2;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Emp extends Person {
    int empId;
    String department;

    Emp(String name, int age, int empId, String department) {
        super(name, age);

        this.empId = empId;
        this.department = department;
    }

    public void displayDetail() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        Emp emp = new Emp("Arul", 22, 101, "Java Development");

        emp.displayDetail();
    }
}