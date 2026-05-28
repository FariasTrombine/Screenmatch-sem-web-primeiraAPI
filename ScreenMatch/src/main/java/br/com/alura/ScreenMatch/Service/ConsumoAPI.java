package br.com.alura.ScreenMatch.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class ConsumoAPI {

    public String obterDados (String endereco){

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)).build();

        HttpResponse<String> response = null;
        try{
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
        catch (InterruptedException e ){
            throw new RuntimeException(e);
        }
        String json =  response.body();
        return json;

    }


}
