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
 * StatusMensagemResDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class StatusMensagemType   {
  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("detalhe")
  private String detalhe = null;

  public StatusMensagemType descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(value = "")

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public StatusMensagemType detalhe(String detalhe) {
    this.detalhe = detalhe;
    return this;
  }

  /**
   * Get detalhe
   * @return detalhe
  **/
  @ApiModelProperty(value = "")

  public String getDetalhe() {
    return detalhe;
  }

  public void setDetalhe(String detalhe) {
    this.detalhe = detalhe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMensagemType statusMensagemType = (StatusMensagemType) o;
    return Objects.equals(this.descricao, statusMensagemType.descricao) &&
        Objects.equals(this.detalhe, statusMensagemType.detalhe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, detalhe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMensagemResDTO {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    detalhe: ").append(toIndentedString(detalhe)).append("\n");
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
