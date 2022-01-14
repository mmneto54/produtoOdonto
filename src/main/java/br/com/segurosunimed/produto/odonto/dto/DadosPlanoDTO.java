package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;
import java.time.LocalDate;



@Data
public class DadosPlanoDTO {

  private String codigo = null;

  private String nome = null;

  private Long codigoRegistroAns = null;

  private String abrangencia = null;

  private String nomeProduto = null;

  private String descricaoRegulamentacao = null;

  private String tipoAcomodacao = null;

  private String segmentacaoAssistencial = null;

  private String tipoContratacao = null;

  private LocalDate dataInicio = null;

  private LocalDate validadeCarteirinha = null;

  private String viaCarteirinha = null;

  private LocalDate dataCpt = null;

  private LocalDate dataCarenciaUrgenciaEmergencia = null;

  private LocalDate dataCarenciaConsultaExameBasico = null;

  private LocalDate dataCarenciaTerapiaExamesEspeciais = null;

}
