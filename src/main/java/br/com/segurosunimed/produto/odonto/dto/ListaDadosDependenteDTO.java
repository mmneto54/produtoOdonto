package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.util.List;


@Data
public class ListaDadosDependenteDTO {

  private List<DadosDependenteDTO> dependente = null;

}
