package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class DadosPesquisarCarteirinhaDTO {

  private String produto = null;

  private Long numero = null;

  private LocalDate inicioVigencia = null;

  private DadosBeneficiarioDTO beneficiario = null;

  private String status = null;

}
