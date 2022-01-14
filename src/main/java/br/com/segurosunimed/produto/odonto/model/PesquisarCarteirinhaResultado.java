package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.ListaDadosPesquisarCarteirinha;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PesquisarCarteirinhaResultadoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class PesquisarCarteirinhaResultado   {
  @JsonProperty("listaCarteirinha")
  private ListaDadosPesquisarCarteirinha listaCarteirinha = null;

  public PesquisarCarteirinhaResultado listaCarteirinha(ListaDadosPesquisarCarteirinha listaCarteirinha) {
    this.listaCarteirinha = listaCarteirinha;
    return this;
  }

  /**
   * Get listaCarteirinha
   * @return listaCarteirinha
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaDadosPesquisarCarteirinha getListaCarteirinha() {
    return listaCarteirinha;
  }

  public void setListaCarteirinha(ListaDadosPesquisarCarteirinha listaCarteirinha) {
    this.listaCarteirinha = listaCarteirinha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PesquisarCarteirinhaResultado pesquisarCarteirinhaResultado = (PesquisarCarteirinhaResultado) o;
    return Objects.equals(this.listaCarteirinha, pesquisarCarteirinhaResultado.listaCarteirinha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaCarteirinha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PesquisarCarteirinhaResultadoDTO {\n");
    
    sb.append("    listaCarteirinha: ").append(toIndentedString(listaCarteirinha)).append("\n");
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
