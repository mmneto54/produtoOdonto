package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;


@Data
public class StatusStatusProcessamentoDTO {

  private Integer codigo = null;

  private String descricao = null;

  private String detalhe = null;

  private StatusMensagensDTO mensagens = null;

}
