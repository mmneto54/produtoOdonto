package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosBeneficiario;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DadosPesquisarCarteirinhaDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosPesquisarCarteirinha   {
  @JsonProperty("produto")
  private String produto = null;

  @JsonProperty("numero")
  private Long numero = null;

  @JsonProperty("inicioVigencia")
  private LocalDate inicioVigencia = null;

  @JsonProperty("beneficiario")
  private DadosBeneficiario beneficiario = null;

  @JsonProperty("status")
  private String status = null;

  public DadosPesquisarCarteirinha produto(String produto) {
    this.produto = produto;
    return this;
  }

  /**
   * Get produto
   * @return produto
  **/
  @ApiModelProperty(value = "")

  public String getProduto() {
    return produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }

  public DadosPesquisarCarteirinha numero(Long numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public DadosPesquisarCarteirinha inicioVigencia(LocalDate inicioVigencia) {
    this.inicioVigencia = inicioVigencia;
    return this;
  }

  /**
   * Get inicioVigencia
   * @return inicioVigencia
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getInicioVigencia() {
    return inicioVigencia;
  }

  public void setInicioVigencia(LocalDate inicioVigencia) {
    this.inicioVigencia = inicioVigencia;
  }

  public DadosPesquisarCarteirinha beneficiario(DadosBeneficiario beneficiario) {
    this.beneficiario = beneficiario;
    return this;
  }

  /**
   * Get beneficiario
   * @return beneficiario
  **/
  @ApiModelProperty(value = "")

  @Valid
  public DadosBeneficiario getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(DadosBeneficiario beneficiario) {
    this.beneficiario = beneficiario;
  }

  public DadosPesquisarCarteirinha status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosPesquisarCarteirinha dadosPesquisarCarteirinha = (DadosPesquisarCarteirinha) o;
    return Objects.equals(this.produto, dadosPesquisarCarteirinha.produto) &&
        Objects.equals(this.numero, dadosPesquisarCarteirinha.numero) &&
        Objects.equals(this.inicioVigencia, dadosPesquisarCarteirinha.inicioVigencia) &&
        Objects.equals(this.beneficiario, dadosPesquisarCarteirinha.beneficiario) &&
        Objects.equals(this.status, dadosPesquisarCarteirinha.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(produto, numero, inicioVigencia, beneficiario, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPesquisarCarteirinhaDTO {\n");
    
    sb.append("    produto: ").append(toIndentedString(produto)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    inicioVigencia: ").append(toIndentedString(inicioVigencia)).append("\n");
    sb.append("    beneficiario: ").append(toIndentedString(beneficiario)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
