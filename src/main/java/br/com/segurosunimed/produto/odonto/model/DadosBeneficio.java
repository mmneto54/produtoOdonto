package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DadosBeneficioDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosBeneficio   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("dataInicioVigencia")
  private LocalDate dataInicioVigencia = null;

  @JsonProperty("dataFimVigencia")
  private LocalDate dataFimVigencia = null;

  public DadosBeneficio codigo(String codigo) {
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

  public DadosBeneficio nome(String nome) {
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

  public DadosBeneficio dataInicioVigencia(LocalDate dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

  /**
   * Get dataInicioVigencia
   * @return dataInicioVigencia
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(LocalDate dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public DadosBeneficio dataFimVigencia(LocalDate dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

  /**
   * Get dataFimVigencia
   * @return dataFimVigencia
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(LocalDate dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosBeneficio dadosBeneficio = (DadosBeneficio) o;
    return Objects.equals(this.codigo, dadosBeneficio.codigo) &&
        Objects.equals(this.nome, dadosBeneficio.nome) &&
        Objects.equals(this.dataInicioVigencia, dadosBeneficio.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, dadosBeneficio.dataFimVigencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nome, dataInicioVigencia, dataFimVigencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBeneficioDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
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
