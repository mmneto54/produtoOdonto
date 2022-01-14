package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.util.List;


@Data
public class ListaDadosPlanoDTO {

  private List<DadosPlanoDTO> plano = null;

}
