package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosBeneficiario;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultarCarteirinhaResultadoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ConsultarCarteirinhaResultado   {
  @JsonProperty("beneficiario")
  private DadosBeneficiario beneficiario = null;

  public ConsultarCarteirinhaResultado beneficiario(DadosBeneficiario beneficiario) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarCarteirinhaResultado consultarCarteirinhaResultado = (ConsultarCarteirinhaResultado) o;
    return Objects.equals(this.beneficiario, consultarCarteirinhaResultado.beneficiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarCarteirinhaResultadoDTO {\n");
    
    sb.append("    beneficiario: ").append(toIndentedString(beneficiario)).append("\n");
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
