package br.com.alura.codechella;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodechellaApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.directory("src")
				.filename(".env")
				.load();

		System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		System.setProperty("DB_USER", dotenv.get("DB_USER"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		SpringApplication.run(CodechellaApplication.class, args);
	}

}
