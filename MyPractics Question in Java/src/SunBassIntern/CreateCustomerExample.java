package SunBassIntern;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class CreateCustomerExample {
    public static void main(String[] args) {

                // API endpoint for creating a new customer
                String createCustomerUrl = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp";

                // Authorization token obtained from the authentication API call
                String authToken = "your_received_bearer_token";

                // Customer data to be sent in the request body
                Map<String, String> customerData = new HashMap<>();
                customerData.put("cmd", "create");
                customerData.put("first_name", "Jane");
                customerData.put("last_name", "Doe");
                customerData.put("street", "Elvnu Street");
                customerData.put("address", "H no 2");
                customerData.put("city", "Delhi");
                customerData.put("state", "Delhi");
                customerData.put("email", "sam@gmail.com");
                customerData.put("phone", "12345678");

                // Make the POST request to create a new customer
                String response = createNewCustomer(createCustomerUrl, authToken, customerData);

                // Process the response
                if (response != null) {
                    System.out.println("API Response: " + response);
                } else {
                    System.out.println("Error in API Request");
                }
            }

            private static String createNewCustomer(String url, String authToken, Map<String, String> data) {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + authToken)
                        .POST(buildJsonBody(data))
                        .build();

                try {
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    return response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            private static HttpRequest.BodyPublisher buildJsonBody(Map<String, String> data) {
                // Build the JSON request body from the provided data
                StringBuilder jsonBuilder = new StringBuilder("{");
                for (Map.Entry<String, String> entry : data.entrySet()) {
                    jsonBuilder.append("\"").append(entry.getKey()).append("\":\"").append(entry.getValue()).append("\",");
                }
                jsonBuilder.deleteCharAt(jsonBuilder.length() - 1); // Remove the trailing comma
                jsonBuilder.append("}");

                return HttpRequest.BodyPublishers.ofString(jsonBuilder.toString());


    }
}
