import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, fatherName, department;
        int rollNo, semester;
        int ict, dld, oops, pf, ds;

        // Input Section
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

        // Processing
        int totalMarks = ict + pf + ds + dld + oops;
        float Perc = (totalMarks * 100.0f) / 500;

        // Output Section (Formatted)
        System.out.println("\n=====================================");
        System.out.println("            MARKSHEET                ");
        System.out.println("=====================================");

        System.out.printf("%-20s: %s\n", "Name", name);
        System.out.printf("%-20s: %s\n", "Father Name", fatherName);
        System.out.printf("%-20s: %s\n", "Department", department);
        System.out.printf("%-20s: %d\n", "Roll Number", rollNo);
        System.out.printf("%-20s: %d\n", "Semester", semester);

        System.out.println("-------------------------------------");
        System.out.printf("%-20s | %s\n", "Subject", "Marks");
        System.out.println("-------------------------------------");
        System.out.printf("%-20s | %d\n", "ICT", ict);
        System.out.printf("%-20s | %d\n", "DLD", dld);
        System.out.printf("%-20s | %d\n", "OOPS", oops);
        System.out.printf("%-20s | %d\n", "DS", ds);
        System.out.printf("%-20s | %d\n", "PF", pf);
        System.out.println("-------------------------------------");

        System.out.printf("%-20s: %d / 500\n", "Total Marks", totalMarks);
        System.out.printf("%-20s: %.2f%%\n", "Percentage", Perc);

        System.out.print("Grade: ");
        if (Perc >= 80) {
            System.out.println("A1");
        } else if (Perc >= 70) {
            System.out.println("A");
        } else if (Perc >= 60) {
            System.out.println("B");
        } else if (Perc >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail :( ");
        }

        System.out.println("=====================================");

        scanner.close();
    }
}
