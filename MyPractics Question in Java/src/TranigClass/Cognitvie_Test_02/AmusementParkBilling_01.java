package TranigClass.Cognitvie_Test_02;
import java.util.Scanner;
public class AmusementParkBilling_01 {


        public static void main(String[] args) {
            final int TICKET_PRICE = 400;
            final double DISCOUNT_PERCENTAGE = 0.1;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of tickets sold: ");
            int ticketCount = scanner.nextInt();

            double discount = 0;
            if (ticketCount >= 10) {
                discount = TICKET_PRICE * ticketCount * DISCOUNT_PERCENTAGE;
            }

            double totalBill = TICKET_PRICE * ticketCount - discount;
            System.out.println("Total Bill: Rs" + totalBill);

            scanner.close();

    }

}
