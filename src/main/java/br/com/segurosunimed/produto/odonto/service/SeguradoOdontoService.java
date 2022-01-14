package br.com.segurosunimed.produto.odonto.service;

import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.model.PesquisarCarteirinhaType;


public interface SeguradoOdontoService {

    PesquisarCarteirinhaType carteirinhaclientecpf(String cpf, String tokenUnimed);
    ConsultarCarteirinhaType carteirinhanumerocpfcpf(String numero, String cpf, String tokenUnimed);

}
