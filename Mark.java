import java.util.Scanner;
public class Mark {


    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        String Name, FatherName, Department;
        int RollNo;
        char Gender;
        int Age;
        double Percentage;

        System.out.print("Enter Your Name: ");
        Name = scanner.nextLine();
        System.out.print("Enter Your Father Name: ");
        FatherName = scanner.nextLine();
        System.out.print("Enter Your Department: ");
        Department = scanner.nextLine();
        System.out.print("Enter Your Roll Number: ");
        RollNo = scanner.nextInt();
        System.out.print("Enter Your Gender: ");
        Gender = scanner.next().charAt(0);
        System.out.print("Enter Your Age: ");
        Age = scanner.nextInt();
        System.out.print("Enter Your Percentage: ");
        Percentage = scanner.nextDouble();


        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Name: " + Name);
        System.out.println("Father Name: " + FatherName);
        System.out.println("Department: " + Department);
        System.out.println("Roll Number: " + RollNo);
        System.out.println("Gender: " + Gender);
        System.out.println("Age: " + Age);
        System.out.println("Percentage: " + Percentage);
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        scanner.close();

    }

}