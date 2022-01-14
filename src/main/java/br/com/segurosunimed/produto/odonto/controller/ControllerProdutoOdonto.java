package br.com.segurosunimed.produto.odonto.controller;

import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.model.PesquisarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.rest.CarteirinhaApi;
import br.com.segurosunimed.produto.odonto.service.SeguradoOdontoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.concurrent.CompletableFuture;

@Controller
@Api(value = "API Controller", tags = {"produto"} )
public class ControllerProdutoOdonto implements CarteirinhaApi {

    @Autowired
    SeguradoOdontoService seguradoOdontoService;

    @Override
    public CompletableFuture<ResponseEntity<PesquisarCarteirinhaType>> carteirinhaclientecpf(String cpf, String tokenUnimed) {

        HttpStatus status = HttpStatus.OK;

        PesquisarCarteirinhaType pesquisarCarteirinhaType = seguradoOdontoService.carteirinhaclientecpf(cpf,tokenUnimed);

        if (pesquisarCarteirinhaType.getCodigo() == 404)
            status = HttpStatus.NOT_FOUND;
        if (pesquisarCarteirinhaType.getCodigo() == 500)
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        return carteirinhaclientecpf(status, pesquisarCarteirinhaType);

    }

    @Override
    public CompletableFuture<ResponseEntity<ConsultarCarteirinhaType>> carteirinhanumerocpfcpf(String numero, String cpf, String tokenUnimed) {


        HttpStatus status = HttpStatus.OK;

        ConsultarCarteirinhaType consultarCarteirinhaType = seguradoOdontoService.carteirinhanumerocpfcpf(numero,cpf,tokenUnimed);

        if (consultarCarteirinhaType.getCodigo() == 404)
            status = HttpStatus.NOT_FOUND;
        if (consultarCarteirinhaType.getCodigo() == 500)
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        return carteirinhanumerocpfcpf(status, consultarCarteirinhaType);

    }

    private CompletableFuture<ResponseEntity<PesquisarCarteirinhaType>> carteirinhaclientecpf(HttpStatus status, PesquisarCarteirinhaType pesquisarCarteirinhaType  ){
        return CompletableFuture.completedFuture(new ResponseEntity<>(pesquisarCarteirinhaType, status));
    }

    private CompletableFuture<ResponseEntity<ConsultarCarteirinhaType>> carteirinhanumerocpfcpf(HttpStatus status, ConsultarCarteirinhaType consultarCarteirinhaType  ){
        return CompletableFuture.completedFuture(new ResponseEntity<>(consultarCarteirinhaType, status));
    }
}

