package TranigClass.Cognitvie_Test_02;

public class Mobile_04 {
        private String PhoneNumber;

        public Mobile_04(String phoneNumber) {
            this.PhoneNumber = PhoneNumber;
        }

        public void dial(String number) {
            System.out.println("Dialing " + number + " from " + PhoneNumber);
        }

        public void receive() {
            System.out.println("Receiving a call on " + PhoneNumber);
        }

        public void message(String recipient, String message) {
            System.out.println("Sending a message to " + recipient + ": " + message);
        }

        public static void main(String[] args) {
            Mobile_04 myMobile = new Mobile_04("1234567890");

            myMobile.dial("9876543210");
            myMobile.receive();
            myMobile.message("John", "Hello, how are you?");

    }

}
