package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CarenciaDTO {

  private EspecialidadeDTO especialidade = null;

  private LocalDate dataFim = null;

}
