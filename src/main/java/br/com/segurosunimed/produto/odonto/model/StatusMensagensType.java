package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.StatusMensagem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusMensagensDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class StatusMensagensType   {
  @JsonProperty("mensagem")
  @Valid
  private List<StatusMensagem> mensagem = null;

  public StatusMensagensType mensagem(List<StatusMensagem> mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  public StatusMensagensType addMensagemItem(StatusMensagem mensagemItem) {
    if (this.mensagem == null) {
      this.mensagem = new ArrayList<>();
    }
    this.mensagem.add(mensagemItem);
    return this;
  }

  /**
   * Get mensagem
   * @return mensagem
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<StatusMensagem> getMensagem() {
    return mensagem;
  }

  public void setMensagem(List<StatusMensagem> mensagem) {
    this.mensagem = mensagem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMensagensType statusMensagensType = (StatusMensagensType) o;
    return Objects.equals(this.mensagem, statusMensagensType.mensagem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mensagem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMensagensDTO {\n");
    
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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
