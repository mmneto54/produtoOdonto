package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosPlano;
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
 * ListaDadosPlanoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ListaDadosPlano   {
  @JsonProperty("plano")
  @Valid
  private List<DadosPlano> plano = null;

  public ListaDadosPlano plano(List<DadosPlano> plano) {
    this.plano = plano;
    return this;
  }

  public ListaDadosPlano addPlanoItem(DadosPlano planoItem) {
    if (this.plano == null) {
      this.plano = new ArrayList<>();
    }
    this.plano.add(planoItem);
    return this;
  }

  /**
   * Get plano
   * @return plano
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DadosPlano> getPlano() {
    return plano;
  }

  public void setPlano(List<DadosPlano> plano) {
    this.plano = plano;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaDadosPlano listaDadosPlano = (ListaDadosPlano) o;
    return Objects.equals(this.plano, listaDadosPlano.plano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDadosPlanoDTO {\n");
    
    sb.append("    plano: ").append(toIndentedString(plano)).append("\n");
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
