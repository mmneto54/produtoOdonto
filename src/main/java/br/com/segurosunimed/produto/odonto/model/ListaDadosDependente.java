package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosDependente;
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
 * ListaDadosDependenteDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ListaDadosDependente   {
  @JsonProperty("dependente")
  @Valid
  private List<DadosDependente> dependente = null;

  public ListaDadosDependente dependente(List<DadosDependente> dependente) {
    this.dependente = dependente;
    return this;
  }

  public ListaDadosDependente addDependenteItem(DadosDependente dependenteItem) {
    if (this.dependente == null) {
      this.dependente = new ArrayList<>();
    }
    this.dependente.add(dependenteItem);
    return this;
  }

  /**
   * Get dependente
   * @return dependente
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DadosDependente> getDependente() {
    return dependente;
  }

  public void setDependente(List<DadosDependente> dependente) {
    this.dependente = dependente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaDadosDependente listaDadosDependente = (ListaDadosDependente) o;
    return Objects.equals(this.dependente, listaDadosDependente.dependente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDadosDependenteDTO {\n");
    
    sb.append("    dependente: ").append(toIndentedString(dependente)).append("\n");
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
