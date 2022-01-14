package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.EspecialidadeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CarenciaDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class CarenciaType   {
  @JsonProperty("especialidade")
  private EspecialidadeType especialidade = null;

  @JsonProperty("dataFim")
  private LocalDate dataFim = null;

  public CarenciaType especialidade(EspecialidadeType especialidade) {
    this.especialidade = especialidade;
    return this;
  }

  /**
   * Get especialidade
   * @return especialidade
  **/
  @ApiModelProperty(value = "")

  @Valid
  public EspecialidadeType getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(EspecialidadeType especialidade) {
    this.especialidade = especialidade;
  }

  public CarenciaType dataFim(LocalDate dataFim) {
    this.dataFim = dataFim;
    return this;
  }

  /**
   * Get dataFim
   * @return dataFim
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataFim() {
    return dataFim;
  }

  public void setDataFim(LocalDate dataFim) {
    this.dataFim = dataFim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarenciaType carenciaType = (CarenciaType) o;
    return Objects.equals(this.especialidade, carenciaType.especialidade) &&
        Objects.equals(this.dataFim, carenciaType.dataFim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(especialidade, dataFim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarenciaDTO {\n");
    
    sb.append("    especialidade: ").append(toIndentedString(especialidade)).append("\n");
    sb.append("    dataFim: ").append(toIndentedString(dataFim)).append("\n");
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
