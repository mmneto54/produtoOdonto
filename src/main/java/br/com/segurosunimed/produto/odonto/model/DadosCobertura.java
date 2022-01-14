package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DadosCoberturaDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosCobertura   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("quantidadeLimiteUso")
  private Integer quantidadeLimiteUso = null;

  @JsonProperty("flagReembolso")
  private String flagReembolso = null;

  public DadosCobertura codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(value = "")

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public DadosCobertura nome(String nome) {
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

  public DadosCobertura quantidadeLimiteUso(Integer quantidadeLimiteUso) {
    this.quantidadeLimiteUso = quantidadeLimiteUso;
    return this;
  }

  /**
   * Get quantidadeLimiteUso
   * @return quantidadeLimiteUso
  **/
  @ApiModelProperty(value = "")

  public Integer getQuantidadeLimiteUso() {
    return quantidadeLimiteUso;
  }

  public void setQuantidadeLimiteUso(Integer quantidadeLimiteUso) {
    this.quantidadeLimiteUso = quantidadeLimiteUso;
  }

  public DadosCobertura flagReembolso(String flagReembolso) {
    this.flagReembolso = flagReembolso;
    return this;
  }

  /**
   * Get flagReembolso
   * @return flagReembolso
  **/
  @ApiModelProperty(value = "")

  public String getFlagReembolso() {
    return flagReembolso;
  }

  public void setFlagReembolso(String flagReembolso) {
    this.flagReembolso = flagReembolso;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosCobertura dadosCobertura = (DadosCobertura) o;
    return Objects.equals(this.codigo, dadosCobertura.codigo) &&
        Objects.equals(this.nome, dadosCobertura.nome) &&
        Objects.equals(this.quantidadeLimiteUso, dadosCobertura.quantidadeLimiteUso) &&
        Objects.equals(this.flagReembolso, dadosCobertura.flagReembolso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nome, quantidadeLimiteUso, flagReembolso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCoberturaDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    quantidadeLimiteUso: ").append(toIndentedString(quantidadeLimiteUso)).append("\n");
    sb.append("    flagReembolso: ").append(toIndentedString(flagReembolso)).append("\n");
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
