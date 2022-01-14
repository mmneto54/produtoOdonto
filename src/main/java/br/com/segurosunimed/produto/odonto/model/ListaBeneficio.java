package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosBeneficio;
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
 * ListaBeneficioDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ListaBeneficio   {
  @JsonProperty("beneficio")
  @Valid
  private List<DadosBeneficio> beneficio = null;

  public ListaBeneficio beneficio(List<DadosBeneficio> beneficio) {
    this.beneficio = beneficio;
    return this;
  }

  public ListaBeneficio addBeneficioItem(DadosBeneficio beneficioItem) {
    if (this.beneficio == null) {
      this.beneficio = new ArrayList<>();
    }
    this.beneficio.add(beneficioItem);
    return this;
  }

  /**
   * Get beneficio
   * @return beneficio
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DadosBeneficio> getBeneficio() {
    return beneficio;
  }

  public void setBeneficio(List<DadosBeneficio> beneficio) {
    this.beneficio = beneficio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaBeneficio listaBeneficio = (ListaBeneficio) o;
    return Objects.equals(this.beneficio, listaBeneficio.beneficio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaBeneficioDTO {\n");
    
    sb.append("    beneficio: ").append(toIndentedString(beneficio)).append("\n");
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
