package Day1;

class Student2 {

    private int studentId;
    private String studentName;
    private String department;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Exp18 {

    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.setStudentId(101);
        s1.setStudentName("Nivetha");
        s1.setDepartment("CSE");
        System.out.println("Student Id : " + s1.getStudentId());
        System.out.println("Student Name : " + s1.getStudentName());
        System.out.println("Department : " + s1.getDepartment());
    }
}
