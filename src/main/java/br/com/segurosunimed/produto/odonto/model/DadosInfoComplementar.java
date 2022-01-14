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
 * DadosInfoComplementarDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosInfoComplementar   {
  @JsonProperty("codigoRegistroOperadora")
  private String codigoRegistroOperadora = null;

  @JsonProperty("nomeOperadora")
  private String nomeOperadora = null;

  @JsonProperty("numeroSac")
  private String numeroSac = null;

  @JsonProperty("numeroAns")
  private String numeroAns = null;

  @JsonProperty("siteAns")
  private String siteAns = null;

  public DadosInfoComplementar codigoRegistroOperadora(String codigoRegistroOperadora) {
    this.codigoRegistroOperadora = codigoRegistroOperadora;
    return this;
  }

  /**
   * Get codigoRegistroOperadora
   * @return codigoRegistroOperadora
  **/
  @ApiModelProperty(value = "")

  public String getCodigoRegistroOperadora() {
    return codigoRegistroOperadora;
  }

  public void setCodigoRegistroOperadora(String codigoRegistroOperadora) {
    this.codigoRegistroOperadora = codigoRegistroOperadora;
  }

  public DadosInfoComplementar nomeOperadora(String nomeOperadora) {
    this.nomeOperadora = nomeOperadora;
    return this;
  }

  /**
   * Get nomeOperadora
   * @return nomeOperadora
  **/
  @ApiModelProperty(value = "")

  public String getNomeOperadora() {
    return nomeOperadora;
  }

  public void setNomeOperadora(String nomeOperadora) {
    this.nomeOperadora = nomeOperadora;
  }

  public DadosInfoComplementar numeroSac(String numeroSac) {
    this.numeroSac = numeroSac;
    return this;
  }

  /**
   * Get numeroSac
   * @return numeroSac
  **/
  @ApiModelProperty(value = "")

  public String getNumeroSac() {
    return numeroSac;
  }

  public void setNumeroSac(String numeroSac) {
    this.numeroSac = numeroSac;
  }

  public DadosInfoComplementar numeroAns(String numeroAns) {
    this.numeroAns = numeroAns;
    return this;
  }

  /**
   * Get numeroAns
   * @return numeroAns
  **/
  @ApiModelProperty(value = "")

  public String getNumeroAns() {
    return numeroAns;
  }

  public void setNumeroAns(String numeroAns) {
    this.numeroAns = numeroAns;
  }

  public DadosInfoComplementar siteAns(String siteAns) {
    this.siteAns = siteAns;
    return this;
  }

  /**
   * Get siteAns
   * @return siteAns
  **/
  @ApiModelProperty(value = "")

  public String getSiteAns() {
    return siteAns;
  }

  public void setSiteAns(String siteAns) {
    this.siteAns = siteAns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosInfoComplementar dadosInfoComplementar = (DadosInfoComplementar) o;
    return Objects.equals(this.codigoRegistroOperadora, dadosInfoComplementar.codigoRegistroOperadora) &&
        Objects.equals(this.nomeOperadora, dadosInfoComplementar.nomeOperadora) &&
        Objects.equals(this.numeroSac, dadosInfoComplementar.numeroSac) &&
        Objects.equals(this.numeroAns, dadosInfoComplementar.numeroAns) &&
        Objects.equals(this.siteAns, dadosInfoComplementar.siteAns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoRegistroOperadora, nomeOperadora, numeroSac, numeroAns, siteAns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosInfoComplementarDTO {\n");
    
    sb.append("    codigoRegistroOperadora: ").append(toIndentedString(codigoRegistroOperadora)).append("\n");
    sb.append("    nomeOperadora: ").append(toIndentedString(nomeOperadora)).append("\n");
    sb.append("    numeroSac: ").append(toIndentedString(numeroSac)).append("\n");
    sb.append("    numeroAns: ").append(toIndentedString(numeroAns)).append("\n");
    sb.append("    siteAns: ").append(toIndentedString(siteAns)).append("\n");
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
