package TranigClass.Cognitviei_Test_03;
import java.util.Scanner;
public class EmployeeID_Name_01 {



        public static void main(String[] args) {
            int[] employeeIds = new int[5];
            String[] employeeNames = new String[5];
            double[] employeeSalaries = new double[5];

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter employee details:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Employee " + (i + 1) + ":");
                System.out.print("ID: ");
                employeeIds[i] = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Name: ");
                employeeNames[i] = scanner.nextLine();

                System.out.print("Salary: ");
                employeeSalaries[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.println(); // Empty line for readability
            }

            display(employeeIds, employeeNames, employeeSalaries);

            scanner.close();
        }

        public static void display(int[] ids, String[] names, double[] salaries) {
            System.out.println("Employee Details:");
            System.out.println("ID\tName\t\tSalary");
            System.out.println("---------------------------------");

            for (int i = 0; i < ids.length; i++) {
                System.out.printf("%d\t%s\t\t%.2f%n", ids[i], names[i], salaries[i]);
            }
        }
    }
