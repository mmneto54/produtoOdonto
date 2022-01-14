package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosPesquisarCarteirinha;
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
 * ListaDadosPesquisarCarteirinhaDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class ListaDadosPesquisarCarteirinha   {
  @JsonProperty("carteirinha")
  @Valid
  private List<DadosPesquisarCarteirinha> carteirinha = null;

  public ListaDadosPesquisarCarteirinha carteirinha(List<DadosPesquisarCarteirinha> carteirinha) {
    this.carteirinha = carteirinha;
    return this;
  }

  public ListaDadosPesquisarCarteirinha addCarteirinhaItem(DadosPesquisarCarteirinha carteirinhaItem) {
    if (this.carteirinha == null) {
      this.carteirinha = new ArrayList<>();
    }
    this.carteirinha.add(carteirinhaItem);
    return this;
  }

  /**
   * Get carteirinha
   * @return carteirinha
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DadosPesquisarCarteirinha> getCarteirinha() {
    return carteirinha;
  }

  public void setCarteirinha(List<DadosPesquisarCarteirinha> carteirinha) {
    this.carteirinha = carteirinha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaDadosPesquisarCarteirinha listaDadosPesquisarCarteirinha = (ListaDadosPesquisarCarteirinha) o;
    return Objects.equals(this.carteirinha, listaDadosPesquisarCarteirinha.carteirinha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carteirinha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDadosPesquisarCarteirinhaDTO {\n");
    
    sb.append("    carteirinha: ").append(toIndentedString(carteirinha)).append("\n");
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
