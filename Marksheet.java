import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, fatherName, department;
        int rollNo, semester;
        int ict, dld, oops, pf, ds;

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your Father Name: ");
        fatherName = scanner.nextLine();

        System.out.print("Enter Your Department: ");
        department = scanner.nextLine();

        System.out.print("Enter Your Roll Number: ");
        rollNo = scanner.nextInt();

        System.out.print("Enter Your Semester: ");
        semester = scanner.nextInt();

        System.out.print("Enter Your ICT Marks: ");
        ict = scanner.nextInt();

        System.out.print("Enter Your DLD Marks: ");
        dld = scanner.nextInt();

        System.out.print("Enter Your OOPS Marks: ");
        oops = scanner.nextInt();

        System.out.print("Enter Your DS Marks: ");
        ds = scanner.nextInt();

        System.out.print("Enter Your PF Marks: ");
        pf = scanner.nextInt();

        int totalMarks = ict + pf + ds + dld + oops;
        float Perc = (totalMarks * 100.0f) / 500;

        System.out.println("\n===============================");
        System.out.println("           MARKSHEET           ");
        System.out.println("===============================");
        System.out.println("Name        : " + name);
        System.out.println("Father Name : " + fatherName);
        System.out.println("Department  : " + department);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Semester    : " + semester);

        System.out.println("-------------------------------");
        System.out.println("ICT   : " + ict);
        System.out.println("DLD   : " + dld);
        System.out.println("OOPS  : " + oops);
        System.out.println("DS    : " + ds);
        System.out.println("PF    : " + pf);
        System.out.println("-------------------------------");
        System.out.println("Total Marks : " + totalMarks + "/500");
        System.out.println("Percentage  : " + Perc + "%");

        if (Perc >= 80) {
            System.out.println("Grade       : A1");
        } else if (Perc >= 70) {
            System.out.println("Grade       : A");
        } else if (Perc >= 60) {
            System.out.println("Grade       : B");
        } else if (Perc >= 50) {
            System.out.println("Grade       : C");
        } else {
            System.out.println("Grade       : Fail");
        }

        System.out.println("===============================");

        scanner.close();
    }
}
