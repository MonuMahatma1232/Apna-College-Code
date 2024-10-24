package TranigClass.Cognitvie_Test_02;
import java.util.Scanner;
public class MovieTicketBooking_02 {



        public static void main(String[] args) {
            final int SILVER_TICKET_PRICE = 150;
            final int GOLDEN_TICKET_PRICE = 200;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the category of ticket (Silver/Golden): ");
            String category = sc.nextLine();

            int ticketPrice = 0;

            if (category.equalsIgnoreCase("Silver")) {
                ticketPrice = SILVER_TICKET_PRICE;
            } else if (category.equalsIgnoreCase("Golden")) {
                ticketPrice = GOLDEN_TICKET_PRICE;
            } else {
                System.out.println("Invalid category entered!");
                System.exit(0);
            }

            int totalBill = ticketPrice * 2;
            System.out.println("Total Bill: Rs" + totalBill);

            sc.close();
        }
    }
