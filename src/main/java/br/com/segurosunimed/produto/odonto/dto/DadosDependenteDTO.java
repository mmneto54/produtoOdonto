package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class DadosDependenteDTO {

  private String nome = null;

  private LocalDate dataNascimento = null;

  private ListaDadosPlanoDTO listaPlano = null;

  private ListaCoberturaDTO listaCoberturaDTO = null;

  private ListaBeneficioDTO listaBeneficioDTO = null;

  private DadosInfoComplementarDTO infoComplementar = null;

  private String numero = null;

  private String numeroCNS = null;

  private String situacao = null;

}
