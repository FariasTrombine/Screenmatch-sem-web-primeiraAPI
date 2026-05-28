package br.com.alura.ScreenMatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
        //Utilizamos esse T para tipos que vai ser generico (quando não sabemos)
        // ai colocamos as <>


}
