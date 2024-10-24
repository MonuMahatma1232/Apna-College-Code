package TranigClass.Cognitviei_Test_03;

public class EmployeeDetails {


        // Function to display content of employee ID array and employee name array
        public static void display(int[] empIDs, String[] empNames) {
            // Check if the lengths of the arrays match
            if (empIDs.length != empNames.length) {
                System.out.println("Error: Array lengths do not match");
                return;
            }

            // Display the content of the arrays
            System.out.println("Employee Details:");
            for (int i = 0; i < empIDs.length; i++) {
                System.out.println("ID: " + empIDs[i] + ", Name: " + empNames[i]);
          /*      System.out.println(empIDs[i]);

                System.out.println(empNames[i]);*/
            }
        }

        // Function to display a single employee ID and employee name
        public static void display(int empID, String empName) {
            System.out.println("Employee Details:");
            //System.out.println("ID: " + empID + ", Name: " + empName);
            System.out.print(empID);
            System.out.print(empName);
        }

        // Main method to test the display function
        public static void main(String[] args) {
            // Example with array parameters
            int[] empIDs = {001,002,003,004,005};
            String[] empNames = {"John", "Clark", "Nancy", "Joe", "Mary"};
            display(empIDs, empNames);

            // Example with individual parameters
            int empID = 5;
            String empName = "Alice";
            display(empID, empName);

            //

        }
    }

