package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

@Data
public class DadosCoberturaDTO {

  private String codigo = null;

  private String nome = null;

  private Integer quantidadeLimiteUso = null;

  private String flagReembolso = null;

}
