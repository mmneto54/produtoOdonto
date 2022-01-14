package br.com.segurosunimed.produto.odonto.service.Impl;

import br.com.segurosunimed.produto.odonto.client.CarteirinhaProdutoClient;
import br.com.segurosunimed.produto.odonto.mapper.ConsultarCarteirinhaMapper;
import br.com.segurosunimed.produto.odonto.mapper.PesquisarCarteirinhaTypeMapper;
import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.model.PesquisarCarteirinhaType;
import br.com.segurosunimed.produto.odonto.service.SeguradoOdontoService;
import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SeguradoOdontoServiceImpl implements SeguradoOdontoService {


    @Autowired
    PesquisarCarteirinhaTypeMapper pesquisarCarteirinhaTypeMapper;

    @Autowired
    ConsultarCarteirinhaMapper consultarCarteirinhaMapper;

    @Autowired
    CarteirinhaProdutoClient carteirinhaProdutoClient;

    private final Logger LOGGER = LoggerFactory.getLogger(SeguradoOdontoServiceImpl.class);

    @Override
    public PesquisarCarteirinhaType carteirinhaclientecpf(String cpf, String tokenUnimed) {

       PesquisarCarteirinhaType pesquisarCarteirinhaType = new PesquisarCarteirinhaType() ;

       try {
           pesquisarCarteirinhaType  = pesquisarCarteirinhaTypeMapper.toDto(carteirinhaProdutoClient.carteirinhaclientecpf(tokenUnimed,cpf));

       }catch (FeignException ex){

         pesquisarCarteirinhaType.setCodigo(ex.status());
         pesquisarCarteirinhaType.descricao("");
         LOGGER.error(ex.getMessage());

       }catch (Exception ex){

         pesquisarCarteirinhaType.setCodigo(500);
         pesquisarCarteirinhaType.descricao("Internal error");
         LOGGER.error(ex.getMessage());

       }
       return pesquisarCarteirinhaType;
    }

    @Override
    public ConsultarCarteirinhaType carteirinhanumerocpfcpf(String numero, String cpf, String tokenUnimed) {

        ConsultarCarteirinhaType consultarCarteirinhaType = new ConsultarCarteirinhaType();

        try{

          consultarCarteirinhaType = consultarCarteirinhaMapper.toDto(carteirinhaProdutoClient.carteirinhanumerocpfcpf(tokenUnimed,numero,cpf));

        }catch (FeignException ex){

          consultarCarteirinhaType.setCodigo(ex.status());
          consultarCarteirinhaType.descricao("");
          LOGGER.error(ex.getMessage());

        }catch (Exception ex){

          consultarCarteirinhaType.setCodigo(500);
          consultarCarteirinhaType.descricao("Internal error");
          LOGGER.error(ex.getMessage());

        }

        return consultarCarteirinhaType;
    }


}
