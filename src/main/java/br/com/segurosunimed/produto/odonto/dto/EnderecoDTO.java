package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;


@Data
public class EnderecoDTO {

  private String cep = null;

  private String tipoLogradouro = null;

  private String logradouro = null;

  private Long numero = null;

  private String complemento = null;

  private String bairro = null;

  private String cidade = null;

  private EnumUfDTO estado = null;

}
