package br.com.alura.ScreenMatch.Model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//serve para ignorar oque a gente não quer
public record DadosSerie(@JsonAlias("Title") String titulo,
                       @JsonAlias("Year")  Integer anoDeLancamento,
                       @JsonAlias ("totalSeasons")  String totalDeTemporadas,
                       @JsonAlias("imdbRating")  String avaliacao){

}