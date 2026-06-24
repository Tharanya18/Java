package Day1;

class Person {

    void displayPerson() {

        System.out.println("Person class method");
    }
}

class Student3 extends Person {

    void displayStudent() {

        System.out.println("Student class method");
    }
}

class Faculty extends Person {

    void displayFaculty() {

        System.out.println("Faculty class method");
    }
}

public class Exp20 {

    public static void main(String[] args) {

        Student3 s1 = new Student3();
        s1.displayPerson();
        s1.displayStudent();
        System.out.println();
        Faculty f1 = new Faculty();

        f1.displayPerson();
        f1.displayFaculty();
        
    }
}