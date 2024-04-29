import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTipoDeCambio {
    public TipoDeCambio consultaTipo(String base_code, String target_code){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9cbffa31b2113c8e638820c0/pair/" + base_code + "/" + target_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TipoDeCambio.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

