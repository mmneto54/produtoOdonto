package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.StatusMensagensType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusStatusProcessamentoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class StatusStatusProcessamentoType   {
  @JsonProperty("codigo")
  private Integer codigo = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("detalhe")
  private String detalhe = null;

  @JsonProperty("mensagens")
  private StatusMensagensType mensagens = null;

  public StatusStatusProcessamentoType codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public StatusStatusProcessamentoType descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public StatusStatusProcessamentoType detalhe(String detalhe) {
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

  public StatusStatusProcessamentoType mensagens(StatusMensagensType mensagens) {
    this.mensagens = mensagens;
    return this;
  }

  /**
   * Get mensagens
   * @return mensagens
  **/
  @ApiModelProperty(value = "")

  @Valid
  public StatusMensagensType getMensagens() {
    return mensagens;
  }

  public void setMensagens(StatusMensagensType mensagens) {
    this.mensagens = mensagens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusStatusProcessamentoType statusStatusProcessamentoType = (StatusStatusProcessamentoType) o;
    return Objects.equals(this.codigo, statusStatusProcessamentoType.codigo) &&
        Objects.equals(this.descricao, statusStatusProcessamentoType.descricao) &&
        Objects.equals(this.detalhe, statusStatusProcessamentoType.detalhe) &&
        Objects.equals(this.mensagens, statusStatusProcessamentoType.mensagens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descricao, detalhe, mensagens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusStatusProcessamentoDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    detalhe: ").append(toIndentedString(detalhe)).append("\n");
    sb.append("    mensagens: ").append(toIndentedString(mensagens)).append("\n");
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
