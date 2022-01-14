package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class DadosBeneficioDTO {

  private String codigo = null;

  private String nome = null;

  private LocalDate dataInicioVigencia = null;

  private LocalDate dataFimVigencia = null;

}
