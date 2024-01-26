import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Buscamain {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=lord+of+the+rings&apikey=f7aa70f2"))
                .build();
         HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
