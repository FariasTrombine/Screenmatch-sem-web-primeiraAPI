package br.com.alura.ScreenMatch.Service;

import br.com.alura.ScreenMatch.Model.DadosSerie;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.exc.JsonNodeException;

import java.io.IOException;

public class ConverterDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
        return mapper.readValue(json, classe); // aqui estou pedindo para o mapper ler json e tenta
        //transformar na classe que a pessoa passou
    } catch (JsonNodeException e) {
            throw new RuntimeException(e);
        }

    }
}
