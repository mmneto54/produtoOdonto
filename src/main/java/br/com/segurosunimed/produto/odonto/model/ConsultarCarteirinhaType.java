package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.ConsultarCarteirinhaResultado;
import br.com.segurosunimed.produto.odonto.model.StatusMensagensType;
import br.com.segurosunimed.produto.odonto.model.StatusStatusProcessamentoType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultarCarteirinhaDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ConsultarCarteirinhaType extends StatusStatusProcessamentoType  {
  @JsonProperty("resultado")
  private ConsultarCarteirinhaResultado resultado = null;

  public ConsultarCarteirinhaType resultado(ConsultarCarteirinhaResultado resultado) {
    this.resultado = resultado;
    return this;
  }

  /**
   * Get resultado
   * @return resultado
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ConsultarCarteirinhaResultado getResultado() {
    return resultado;
  }

  public void setResultado(ConsultarCarteirinhaResultado resultado) {
    this.resultado = resultado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarCarteirinhaType consultarCarteirinhaType = (ConsultarCarteirinhaType) o;
    return Objects.equals(this.resultado, consultarCarteirinhaType.resultado) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultado, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarCarteirinhaDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
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
