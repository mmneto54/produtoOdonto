package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.CarenciasType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DadosPlanoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosPlano   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("codigoRegistroAns")
  private Long codigoRegistroAns = null;

  @JsonProperty("abrangencia")
  private String abrangencia = null;

  @JsonProperty("nomeProduto")
  private String nomeProduto = null;

  @JsonProperty("descricaoRegulamentacao")
  private String descricaoRegulamentacao = null;

  @JsonProperty("tipoAcomodacao")
  private String tipoAcomodacao = null;

  @JsonProperty("segmentacaoAssistencial")
  private String segmentacaoAssistencial = null;

  @JsonProperty("tipoContratacao")
  private String tipoContratacao = null;

  @JsonProperty("dataInicio")
  private LocalDate dataInicio = null;

  @JsonProperty("validadeCarteirinha")
  private LocalDate validadeCarteirinha = null;

  @JsonProperty("viaCarteirinha")
  private String viaCarteirinha = null;

  @JsonProperty("dataCpt")
  private LocalDate dataCpt = null;

  @JsonProperty("dataCarenciaUrgenciaEmergencia")
  private LocalDate dataCarenciaUrgenciaEmergencia = null;

  @JsonProperty("dataCarenciaConsultaExameBasico")
  private LocalDate dataCarenciaConsultaExameBasico = null;

  @JsonProperty("dataCarenciaTerapiaExamesEspeciais")
  private LocalDate dataCarenciaTerapiaExamesEspeciais = null;

  @JsonProperty("carencias")
  private CarenciasType carencias = null;

  public DadosPlano codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(value = "")

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public DadosPlano nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(value = "")

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public DadosPlano codigoRegistroAns(Long codigoRegistroAns) {
    this.codigoRegistroAns = codigoRegistroAns;
    return this;
  }

  /**
   * Get codigoRegistroAns
   * @return codigoRegistroAns
  **/
  @ApiModelProperty(value = "")

  public Long getCodigoRegistroAns() {
    return codigoRegistroAns;
  }

  public void setCodigoRegistroAns(Long codigoRegistroAns) {
    this.codigoRegistroAns = codigoRegistroAns;
  }

  public DadosPlano abrangencia(String abrangencia) {
    this.abrangencia = abrangencia;
    return this;
  }

  /**
   * Get abrangencia
   * @return abrangencia
  **/
  @ApiModelProperty(value = "")

  public String getAbrangencia() {
    return abrangencia;
  }

  public void setAbrangencia(String abrangencia) {
    this.abrangencia = abrangencia;
  }

  public DadosPlano nomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
    return this;
  }

  /**
   * Get nomeProduto
   * @return nomeProduto
  **/
  @ApiModelProperty(value = "")

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public DadosPlano descricaoRegulamentacao(String descricaoRegulamentacao) {
    this.descricaoRegulamentacao = descricaoRegulamentacao;
    return this;
  }

  /**
   * Get descricaoRegulamentacao
   * @return descricaoRegulamentacao
  **/
  @ApiModelProperty(value = "")

  public String getDescricaoRegulamentacao() {
    return descricaoRegulamentacao;
  }

  public void setDescricaoRegulamentacao(String descricaoRegulamentacao) {
    this.descricaoRegulamentacao = descricaoRegulamentacao;
  }

  public DadosPlano tipoAcomodacao(String tipoAcomodacao) {
    this.tipoAcomodacao = tipoAcomodacao;
    return this;
  }

  /**
   * Get tipoAcomodacao
   * @return tipoAcomodacao
  **/
  @ApiModelProperty(value = "")

  public String getTipoAcomodacao() {
    return tipoAcomodacao;
  }

  public void setTipoAcomodacao(String tipoAcomodacao) {
    this.tipoAcomodacao = tipoAcomodacao;
  }

  public DadosPlano segmentacaoAssistencial(String segmentacaoAssistencial) {
    this.segmentacaoAssistencial = segmentacaoAssistencial;
    return this;
  }

  /**
   * Get segmentacaoAssistencial
   * @return segmentacaoAssistencial
  **/
  @ApiModelProperty(value = "")

  public String getSegmentacaoAssistencial() {
    return segmentacaoAssistencial;
  }

  public void setSegmentacaoAssistencial(String segmentacaoAssistencial) {
    this.segmentacaoAssistencial = segmentacaoAssistencial;
  }

  public DadosPlano tipoContratacao(String tipoContratacao) {
    this.tipoContratacao = tipoContratacao;
    return this;
  }

  /**
   * Get tipoContratacao
   * @return tipoContratacao
  **/
  @ApiModelProperty(value = "")

  public String getTipoContratacao() {
    return tipoContratacao;
  }

  public void setTipoContratacao(String tipoContratacao) {
    this.tipoContratacao = tipoContratacao;
  }

  public DadosPlano dataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Get dataInicio
   * @return dataInicio
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }

  public DadosPlano validadeCarteirinha(LocalDate validadeCarteirinha) {
    this.validadeCarteirinha = validadeCarteirinha;
    return this;
  }

  /**
   * Get validadeCarteirinha
   * @return validadeCarteirinha
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getValidadeCarteirinha() {
    return validadeCarteirinha;
  }

  public void setValidadeCarteirinha(LocalDate validadeCarteirinha) {
    this.validadeCarteirinha = validadeCarteirinha;
  }

  public DadosPlano viaCarteirinha(String viaCarteirinha) {
    this.viaCarteirinha = viaCarteirinha;
    return this;
  }

  /**
   * Get viaCarteirinha
   * @return viaCarteirinha
  **/
  @ApiModelProperty(value = "")

  public String getViaCarteirinha() {
    return viaCarteirinha;
  }

  public void setViaCarteirinha(String viaCarteirinha) {
    this.viaCarteirinha = viaCarteirinha;
  }

  public DadosPlano dataCpt(LocalDate dataCpt) {
    this.dataCpt = dataCpt;
    return this;
  }

  /**
   * Get dataCpt
   * @return dataCpt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataCpt() {
    return dataCpt;
  }

  public void setDataCpt(LocalDate dataCpt) {
    this.dataCpt = dataCpt;
  }

  public DadosPlano dataCarenciaUrgenciaEmergencia(LocalDate dataCarenciaUrgenciaEmergencia) {
    this.dataCarenciaUrgenciaEmergencia = dataCarenciaUrgenciaEmergencia;
    return this;
  }

  /**
   * Get dataCarenciaUrgenciaEmergencia
   * @return dataCarenciaUrgenciaEmergencia
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataCarenciaUrgenciaEmergencia() {
    return dataCarenciaUrgenciaEmergencia;
  }

  public void setDataCarenciaUrgenciaEmergencia(LocalDate dataCarenciaUrgenciaEmergencia) {
    this.dataCarenciaUrgenciaEmergencia = dataCarenciaUrgenciaEmergencia;
  }

  public DadosPlano dataCarenciaConsultaExameBasico(LocalDate dataCarenciaConsultaExameBasico) {
    this.dataCarenciaConsultaExameBasico = dataCarenciaConsultaExameBasico;
    return this;
  }

  /**
   * Get dataCarenciaConsultaExameBasico
   * @return dataCarenciaConsultaExameBasico
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataCarenciaConsultaExameBasico() {
    return dataCarenciaConsultaExameBasico;
  }

  public void setDataCarenciaConsultaExameBasico(LocalDate dataCarenciaConsultaExameBasico) {
    this.dataCarenciaConsultaExameBasico = dataCarenciaConsultaExameBasico;
  }

  public DadosPlano dataCarenciaTerapiaExamesEspeciais(LocalDate dataCarenciaTerapiaExamesEspeciais) {
    this.dataCarenciaTerapiaExamesEspeciais = dataCarenciaTerapiaExamesEspeciais;
    return this;
  }

  /**
   * Get dataCarenciaTerapiaExamesEspeciais
   * @return dataCarenciaTerapiaExamesEspeciais
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataCarenciaTerapiaExamesEspeciais() {
    return dataCarenciaTerapiaExamesEspeciais;
  }

  public void setDataCarenciaTerapiaExamesEspeciais(LocalDate dataCarenciaTerapiaExamesEspeciais) {
    this.dataCarenciaTerapiaExamesEspeciais = dataCarenciaTerapiaExamesEspeciais;
  }

  public DadosPlano carencias(CarenciasType carencias) {
    this.carencias = carencias;
    return this;
  }

  /**
   * Get carencias
   * @return carencias
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CarenciasType getCarencias() {
    return carencias;
  }

  public void setCarencias(CarenciasType carencias) {
    this.carencias = carencias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosPlano dadosPlano = (DadosPlano) o;
    return Objects.equals(this.codigo, dadosPlano.codigo) &&
        Objects.equals(this.nome, dadosPlano.nome) &&
        Objects.equals(this.codigoRegistroAns, dadosPlano.codigoRegistroAns) &&
        Objects.equals(this.abrangencia, dadosPlano.abrangencia) &&
        Objects.equals(this.nomeProduto, dadosPlano.nomeProduto) &&
        Objects.equals(this.descricaoRegulamentacao, dadosPlano.descricaoRegulamentacao) &&
        Objects.equals(this.tipoAcomodacao, dadosPlano.tipoAcomodacao) &&
        Objects.equals(this.segmentacaoAssistencial, dadosPlano.segmentacaoAssistencial) &&
        Objects.equals(this.tipoContratacao, dadosPlano.tipoContratacao) &&
        Objects.equals(this.dataInicio, dadosPlano.dataInicio) &&
        Objects.equals(this.validadeCarteirinha, dadosPlano.validadeCarteirinha) &&
        Objects.equals(this.viaCarteirinha, dadosPlano.viaCarteirinha) &&
        Objects.equals(this.dataCpt, dadosPlano.dataCpt) &&
        Objects.equals(this.dataCarenciaUrgenciaEmergencia, dadosPlano.dataCarenciaUrgenciaEmergencia) &&
        Objects.equals(this.dataCarenciaConsultaExameBasico, dadosPlano.dataCarenciaConsultaExameBasico) &&
        Objects.equals(this.dataCarenciaTerapiaExamesEspeciais, dadosPlano.dataCarenciaTerapiaExamesEspeciais) &&
        Objects.equals(this.carencias, dadosPlano.carencias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nome, codigoRegistroAns, abrangencia, nomeProduto, descricaoRegulamentacao, tipoAcomodacao, segmentacaoAssistencial, tipoContratacao, dataInicio, validadeCarteirinha, viaCarteirinha, dataCpt, dataCarenciaUrgenciaEmergencia, dataCarenciaConsultaExameBasico, dataCarenciaTerapiaExamesEspeciais, carencias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPlanoDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    codigoRegistroAns: ").append(toIndentedString(codigoRegistroAns)).append("\n");
    sb.append("    abrangencia: ").append(toIndentedString(abrangencia)).append("\n");
    sb.append("    nomeProduto: ").append(toIndentedString(nomeProduto)).append("\n");
    sb.append("    descricaoRegulamentacao: ").append(toIndentedString(descricaoRegulamentacao)).append("\n");
    sb.append("    tipoAcomodacao: ").append(toIndentedString(tipoAcomodacao)).append("\n");
    sb.append("    segmentacaoAssistencial: ").append(toIndentedString(segmentacaoAssistencial)).append("\n");
    sb.append("    tipoContratacao: ").append(toIndentedString(tipoContratacao)).append("\n");
    sb.append("    dataInicio: ").append(toIndentedString(dataInicio)).append("\n");
    sb.append("    validadeCarteirinha: ").append(toIndentedString(validadeCarteirinha)).append("\n");
    sb.append("    viaCarteirinha: ").append(toIndentedString(viaCarteirinha)).append("\n");
    sb.append("    dataCpt: ").append(toIndentedString(dataCpt)).append("\n");
    sb.append("    dataCarenciaUrgenciaEmergencia: ").append(toIndentedString(dataCarenciaUrgenciaEmergencia)).append("\n");
    sb.append("    dataCarenciaConsultaExameBasico: ").append(toIndentedString(dataCarenciaConsultaExameBasico)).append("\n");
    sb.append("    dataCarenciaTerapiaExamesEspeciais: ").append(toIndentedString(dataCarenciaTerapiaExamesEspeciais)).append("\n");
    sb.append("    carencias: ").append(toIndentedString(carencias)).append("\n");
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
