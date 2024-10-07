package br.com.alura.ScreenMatch_Yuri;

import br.com.alura.ScreenMatch_Yuri.model.DadosSerie;
import br.com.alura.ScreenMatch_Yuri.service.ConsumoAPI;
import br.com.alura.ScreenMatch_Yuri.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchYuriApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchYuriApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumoAPI  = new ConsumoAPI();
		var json = consumoAPI.obterDados("http://www.omdbapi.com/?t=supernatural&apikey=f11113ee");
//		System.out.println(json);
//		json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
