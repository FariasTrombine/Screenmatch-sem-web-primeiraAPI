package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.Model.DadosSerie;
import br.com.alura.ScreenMatch.Service.ConsumoAPI;
import br.com.alura.ScreenMatch.Service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		var api = new ConsumoAPI();
		var json = api.obterDados("https://www.omdbapi.com/?t=matrix&apikey=44cd9ac2");
		//System.out.println(json);
		//json = api.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverterDados converter = new ConverterDados();
		DadosSerie dados = converter.obterDados(json, DadosSerie.class);
		System.out.println(dados);


	}
}
