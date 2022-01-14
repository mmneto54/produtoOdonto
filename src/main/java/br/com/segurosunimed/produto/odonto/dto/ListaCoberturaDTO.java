package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.util.List;


@Data
public class ListaCoberturaDTO {

  private List<DadosCoberturaDTO> cobertura = null;

}
