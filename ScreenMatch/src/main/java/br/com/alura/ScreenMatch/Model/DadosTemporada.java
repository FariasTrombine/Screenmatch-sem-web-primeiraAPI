package br.com.alura.ScreenMatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("totalSeasons") Integer numero,
                             @JsonAlias("Episodes")List<DadosEpisodios> dadosEpisodios)
                         //    @JsonAlias("Runtime")Double DuracaoEpisodio)
                             {
}
