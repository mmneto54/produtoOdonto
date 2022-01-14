package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosCobertura;
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
 * ListaCoberturaDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ListaCobertura   {
  @JsonProperty("cobertura")
  @Valid
  private List<DadosCobertura> cobertura = null;

  public ListaCobertura cobertura(List<DadosCobertura> cobertura) {
    this.cobertura = cobertura;
    return this;
  }

  public ListaCobertura addCoberturaItem(DadosCobertura coberturaItem) {
    if (this.cobertura == null) {
      this.cobertura = new ArrayList<>();
    }
    this.cobertura.add(coberturaItem);
    return this;
  }

  /**
   * Get cobertura
   * @return cobertura
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DadosCobertura> getCobertura() {
    return cobertura;
  }

  public void setCobertura(List<DadosCobertura> cobertura) {
    this.cobertura = cobertura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaCobertura listaCobertura = (ListaCobertura) o;
    return Objects.equals(this.cobertura, listaCobertura.cobertura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cobertura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaCoberturaDTO {\n");
    
    sb.append("    cobertura: ").append(toIndentedString(cobertura)).append("\n");
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
