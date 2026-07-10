package Day3;

public class StudentInfo {
    public static void main(String[] args) {

        int rollNo = Integer.parseInt(args[0]);
        String name = args[1];
        String department = args[2];
        int mark = Integer.parseInt(args[3]);

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Mark: " + mark);
    }
}