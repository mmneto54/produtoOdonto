package br.com.segurosunimed.produto.odonto.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class DadosBeneficiarioDTO {

  private String nome = null;

  private Long numero = null;

  private LocalDate dataNascimento = null;

  private String situacao = null;

  private Long numeroCns = null;

  private LocalDate dataInclusaoPlano = null;

  private String tipoContrato = null;


  public enum CategoriaTipoContratoEnum {
    Adesao("Adesao"),

    Empresarial("Empresarial"),

    Individual("Individual");

    private String value;

    CategoriaTipoContratoEnum(String value) {
      this.value = value;
    }

    public String toString() {
      return String.valueOf(value);
    }

    public static CategoriaTipoContratoEnum fromValue(String text) {
      for (CategoriaTipoContratoEnum b : CategoriaTipoContratoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private CategoriaTipoContratoEnum categoriaTipoContrato = null;

  private Long numeroContrato = null;

  private String nomeEmpresa = null;

  private EnderecoDTO enderecoDTO = null;

  private ListaDadosPlanoDTO listaPlano = null;

  private ListaCoberturaDTO listaCoberturaDTO = null;

  private ListaBeneficioDTO listaBeneficioDTO = null;

  private DadosInfoComplementarDTO infoComplementar = null;

  private ListaDadosDependenteDTO listaDependente = null;

  private EnumTipoBeneficiarioDTO tipo = null;

}
