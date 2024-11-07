package org.anime;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Random;

public class KitsuClient {
    private static final String API_ULR = "https://kitsu.io/api/edge/anime?page[limit]=20";

    public List<Anime> fetchAnimes() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(API_ULR))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
        Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);

            return gson.fromJson(jsonObject.get("data"), new TypeToken<List<Anime>>() {}.getType());
        } else {
            throw new RuntimeException("Erro ao buscar animes: " + response.statusCode());
        }
    }

    public Anime getRandomAnime() throws  Exception {
        List<Anime> animes = fetchAnimes();
        return animes.get(new Random().nextInt(animes.size()));
    }
}
