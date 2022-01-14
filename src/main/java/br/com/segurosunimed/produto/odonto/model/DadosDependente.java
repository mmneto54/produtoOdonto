package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosInfoComplementar;
import br.com.segurosunimed.produto.odonto.model.ListaBeneficio;
import br.com.segurosunimed.produto.odonto.model.ListaCobertura;
import br.com.segurosunimed.produto.odonto.model.ListaDadosPlano;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DadosDependenteDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosDependente   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("dataNascimento")
  private LocalDate dataNascimento = null;

  @JsonProperty("listaPlano")
  private ListaDadosPlano listaPlano = null;

  @JsonProperty("listaCobertura")
  private ListaCobertura listaCobertura = null;

  @JsonProperty("listaBeneficio")
  private ListaBeneficio listaBeneficio = null;

  @JsonProperty("infoComplementar")
  private DadosInfoComplementar infoComplementar = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("numeroCNS")
  private String numeroCNS = null;

  @JsonProperty("situacao")
  private String situacao = null;

  public DadosDependente nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(value = "")

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public DadosDependente dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public DadosDependente listaPlano(ListaDadosPlano listaPlano) {
    this.listaPlano = listaPlano;
    return this;
  }

  /**
   * Get listaPlano
   * @return listaPlano
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaDadosPlano getListaPlano() {
    return listaPlano;
  }

  public void setListaPlano(ListaDadosPlano listaPlano) {
    this.listaPlano = listaPlano;
  }

  public DadosDependente listaCobertura(ListaCobertura listaCobertura) {
    this.listaCobertura = listaCobertura;
    return this;
  }

  /**
   * Get listaCobertura
   * @return listaCobertura
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaCobertura getListaCobertura() {
    return listaCobertura;
  }

  public void setListaCobertura(ListaCobertura listaCobertura) {
    this.listaCobertura = listaCobertura;
  }

  public DadosDependente listaBeneficio(ListaBeneficio listaBeneficio) {
    this.listaBeneficio = listaBeneficio;
    return this;
  }

  /**
   * Get listaBeneficio
   * @return listaBeneficio
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaBeneficio getListaBeneficio() {
    return listaBeneficio;
  }

  public void setListaBeneficio(ListaBeneficio listaBeneficio) {
    this.listaBeneficio = listaBeneficio;
  }

  public DadosDependente infoComplementar(DadosInfoComplementar infoComplementar) {
    this.infoComplementar = infoComplementar;
    return this;
  }

  /**
   * Get infoComplementar
   * @return infoComplementar
  **/
  @ApiModelProperty(value = "")

  @Valid
  public DadosInfoComplementar getInfoComplementar() {
    return infoComplementar;
  }

  public void setInfoComplementar(DadosInfoComplementar infoComplementar) {
    this.infoComplementar = infoComplementar;
  }

  public DadosDependente numero(String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DadosDependente numeroCNS(String numeroCNS) {
    this.numeroCNS = numeroCNS;
    return this;
  }

  /**
   * Get numeroCNS
   * @return numeroCNS
  **/
  @ApiModelProperty(value = "")

  public String getNumeroCNS() {
    return numeroCNS;
  }

  public void setNumeroCNS(String numeroCNS) {
    this.numeroCNS = numeroCNS;
  }

  public DadosDependente situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

  /**
   * Get situacao
   * @return situacao
  **/
  @ApiModelProperty(value = "")

  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosDependente dadosDependente = (DadosDependente) o;
    return Objects.equals(this.nome, dadosDependente.nome) &&
        Objects.equals(this.dataNascimento, dadosDependente.dataNascimento) &&
        Objects.equals(this.listaPlano, dadosDependente.listaPlano) &&
        Objects.equals(this.listaCobertura, dadosDependente.listaCobertura) &&
        Objects.equals(this.listaBeneficio, dadosDependente.listaBeneficio) &&
        Objects.equals(this.infoComplementar, dadosDependente.infoComplementar) &&
        Objects.equals(this.numero, dadosDependente.numero) &&
        Objects.equals(this.numeroCNS, dadosDependente.numeroCNS) &&
        Objects.equals(this.situacao, dadosDependente.situacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, dataNascimento, listaPlano, listaCobertura, listaBeneficio, infoComplementar, numero, numeroCNS, situacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDependenteDTO {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    listaPlano: ").append(toIndentedString(listaPlano)).append("\n");
    sb.append("    listaCobertura: ").append(toIndentedString(listaCobertura)).append("\n");
    sb.append("    listaBeneficio: ").append(toIndentedString(listaBeneficio)).append("\n");
    sb.append("    infoComplementar: ").append(toIndentedString(infoComplementar)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    numeroCNS: ").append(toIndentedString(numeroCNS)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
