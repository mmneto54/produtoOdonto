package br.com.segurosunimed.produto.odonto.client;


import br.com.segurosunimed.produto.odonto.dto.ConsultarCarteirinhaDTO;
import br.com.segurosunimed.produto.odonto.dto.PesquisarCarteirinhaDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "${produto-odonto.endpoint}", name = "CarteirinhaProdutoClient")
public interface CarteirinhaProdutoClient {

    @GetMapping("produto-odonto/carteirinha/cliente/{cpf}")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    PesquisarCarteirinhaDTO  carteirinhaclientecpf(@RequestHeader(value = "X-IBM-Client-Id", required = true) String ibmClientId,
                                                   @PathVariable("cpf") String cpf);

    @GetMapping("produto-odonto/carteirinha/{numero}/cpf/{cpf}")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    ConsultarCarteirinhaDTO carteirinhanumerocpfcpf(@RequestHeader(value = "X-IBM-Client-Id", required = true) String ibmClientId,
                                                    @PathVariable("numero") String numero,
                                                    @PathVariable("cpf") String cpf);
}
