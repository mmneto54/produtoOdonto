package br.com.segurosunimed.produto.odonto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiProdutoOdontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProdutoOdontoApplication.class, args);
	}

}
