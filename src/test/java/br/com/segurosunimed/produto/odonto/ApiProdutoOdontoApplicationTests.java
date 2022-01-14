package br.com.segurosunimed.produto.odonto;

import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.model.PesquisarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.rest.CarteirinhaApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={br.com.segurosunimed.produto.odonto.ApiProdutoOdontoApplication.class})
@Configuration
public class ApiProdutoOdontoApplicationTests {


	@Autowired
	CarteirinhaApi carteirinhaApi;

	private static final String TOKEN_EXAMPLE = "7ed88775-2518-44b1-8e3e-77a0d59b6bd8";
	private static final String CPF_EXAMPLE = "11774667401";
	private static final String CPF_NOT_FOUND_EXAMPLE = "92892787068";
	private static final String CPF_ERROR = "****";
	private static final String CARTEIRINHA_NUMERO  =  "90000001660320007";
	private static final String CARTEIRINHA_NUMERO_NOT_FOUND_EXAMPLE  = "00000000000000000";




	@Test
	public void carteirinhaclientecpfSucess() throws Exception {

		String token  = TOKEN_EXAMPLE;
		String cpf = CPF_EXAMPLE;

		CompletableFuture<ResponseEntity<PesquisarCarteirinhaType>> response = carteirinhaApi.carteirinhaclientecpf(cpf,token);
		assertEquals(HttpStatus.OK, response.get().getStatusCode()) ;

	}


	@Test
	public void carteirinhaclientecpfNotFound() throws Exception {

		String token  = TOKEN_EXAMPLE;
		String cpf = CPF_NOT_FOUND_EXAMPLE;

		CompletableFuture<ResponseEntity<PesquisarCarteirinhaType>> response = carteirinhaApi.carteirinhaclientecpf(cpf,token);
		assertEquals(HttpStatus.NOT_FOUND, response.get().getStatusCode()) ;

	}

	@Test
	public void carteirinhaclientecpfInternalErrror() throws Exception {

		String token  = TOKEN_EXAMPLE;
		String cpf = CPF_ERROR;

		CompletableFuture<ResponseEntity<PesquisarCarteirinhaType>> response = carteirinhaApi.carteirinhaclientecpf(cpf,token);
		assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.get().getStatusCode()) ;

	}

	@Test
	public void carteirinhanumerocpfcpfSucess() throws Exception {

		String token  = TOKEN_EXAMPLE;
		String cpf = CPF_NOT_FOUND_EXAMPLE;
		String numero  =  CARTEIRINHA_NUMERO;

		CompletableFuture<ResponseEntity<ConsultarCarteirinhaType>> response = carteirinhaApi.carteirinhanumerocpfcpf(numero,cpf,token);
		assertEquals(HttpStatus.OK, response.get().getStatusCode()) ;

	}


}
