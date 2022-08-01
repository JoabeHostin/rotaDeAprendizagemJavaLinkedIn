
import java.util.Scanner;

public class Student {

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            int studentAge = 28;

            boolean hasPerfectAttendance = true;
            String studentFirstName = "Joabe";
            String studentLastName = "Hostin";
            double gpa = input.nextDouble();
            char studentFirstInitial = studentFirstName.charAt(0);
            char studentFirstLastName = studentLastName.charAt(0);

            System.out.println(studentAge);
            System.out.println(gpa);
            System.out.println(hasPerfectAttendance);
            System.out.printf("%s %s %n", studentFirstName, studentLastName);
            System.out.println(studentFirstInitial);
            System.out.println(studentFirstLastName);
        }

    }
}
