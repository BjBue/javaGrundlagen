
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpClient {


	public static void main(String[] args) {
        try {
            // Erstelle einen HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Erstelle die HTTP-Anfrage
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .build();

            // Sende die Anfrage und erhalte die Antwort
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Gib den Statuscode und den Antworttext aus
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
