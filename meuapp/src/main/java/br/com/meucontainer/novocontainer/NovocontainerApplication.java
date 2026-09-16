package br.com.meugrupo.meuapp; // define o pacote ao qual a classe pertence

// importa a classe que possui o método que permite iniciar uma app SB
import org.springframework.boot.SpringApplication;
// importa a anotação que reune várias configurações do SB
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuappApplication.class, args);
	}

}
