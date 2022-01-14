package br.com.segurosunimed.produto.odonto.model;

import java.util.Objects;
import br.com.segurosunimed.produto.odonto.model.DadosInfoComplementar;
import br.com.segurosunimed.produto.odonto.model.Endereco;
import br.com.segurosunimed.produto.odonto.model.EnumTipoBeneficiarioType;
import br.com.segurosunimed.produto.odonto.model.ListaBeneficio;
import br.com.segurosunimed.produto.odonto.model.ListaCobertura;
import br.com.segurosunimed.produto.odonto.model.ListaDadosDependente;
import br.com.segurosunimed.produto.odonto.model.ListaDadosPlano;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DadosBeneficiarioDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-27T12:21:56.306-03:00[America/Sao_Paulo]")
public class DadosBeneficiario   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("numero")
  private Long numero = null;

  @JsonProperty("dataNascimento")
  private LocalDate dataNascimento = null;

  @JsonProperty("situacao")
  private String situacao = null;

  @JsonProperty("numeroCns")
  private Long numeroCns = null;

  @JsonProperty("dataInclusaoPlano")
  private LocalDate dataInclusaoPlano = null;

  @JsonProperty("tipoContrato")
  private String tipoContrato = null;

  /**
   * Gets or Sets categoriaTipoContrato
   */
  public enum CategoriaTipoContratoEnum {
    Adesao("Adesao"),

    Empresarial("Empresarial"),

    Individual("Individual");

    private String value;

    CategoriaTipoContratoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoriaTipoContratoEnum fromValue(String text) {
      for (CategoriaTipoContratoEnum b : CategoriaTipoContratoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("categoriaTipoContrato")
  private CategoriaTipoContratoEnum categoriaTipoContrato = null;

  @JsonProperty("numeroContrato")
  private Long numeroContrato = null;

  @JsonProperty("nomeEmpresa")
  private String nomeEmpresa = null;

  @JsonProperty("endereco")
  private Endereco endereco = null;

  @JsonProperty("listaPlano")
  private ListaDadosPlano listaPlano = null;

  @JsonProperty("listaCobertura")
  private ListaCobertura listaCobertura = null;

  @JsonProperty("listaBeneficio")
  private ListaBeneficio listaBeneficio = null;

  @JsonProperty("infoComplementar")
  private DadosInfoComplementar infoComplementar = null;

  @JsonProperty("listaDependente")
  private ListaDadosDependente listaDependente = null;

  @JsonProperty("tipo")
  private EnumTipoBeneficiarioType tipo = null;

  public DadosBeneficiario nome(String nome) {
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

  public DadosBeneficiario numero(Long numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public DadosBeneficiario dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public DadosBeneficiario situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

  /**
   * Get situacao
   * @return situacao
  **/
  @ApiModelProperty(value = "")

  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public DadosBeneficiario numeroCns(Long numeroCns) {
    this.numeroCns = numeroCns;
    return this;
  }

  /**
   * Get numeroCns
   * @return numeroCns
  **/
  @ApiModelProperty(value = "")

  public Long getNumeroCns() {
    return numeroCns;
  }

  public void setNumeroCns(Long numeroCns) {
    this.numeroCns = numeroCns;
  }

  public DadosBeneficiario dataInclusaoPlano(LocalDate dataInclusaoPlano) {
    this.dataInclusaoPlano = dataInclusaoPlano;
    return this;
  }

  /**
   * Get dataInclusaoPlano
   * @return dataInclusaoPlano
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getDataInclusaoPlano() {
    return dataInclusaoPlano;
  }

  public void setDataInclusaoPlano(LocalDate dataInclusaoPlano) {
    this.dataInclusaoPlano = dataInclusaoPlano;
  }

  public DadosBeneficiario tipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
    return this;
  }

  /**
   * Get tipoContrato
   * @return tipoContrato
  **/
  @ApiModelProperty(value = "")

  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public DadosBeneficiario categoriaTipoContrato(CategoriaTipoContratoEnum categoriaTipoContrato) {
    this.categoriaTipoContrato = categoriaTipoContrato;
    return this;
  }

  /**
   * Get categoriaTipoContrato
   * @return categoriaTipoContrato
  **/
  @ApiModelProperty(value = "")

  public CategoriaTipoContratoEnum getCategoriaTipoContrato() {
    return categoriaTipoContrato;
  }

  public void setCategoriaTipoContrato(CategoriaTipoContratoEnum categoriaTipoContrato) {
    this.categoriaTipoContrato = categoriaTipoContrato;
  }

  public DadosBeneficiario numeroContrato(Long numeroContrato) {
    this.numeroContrato = numeroContrato;
    return this;
  }

  /**
   * Get numeroContrato
   * @return numeroContrato
  **/
  @ApiModelProperty(value = "")

  public Long getNumeroContrato() {
    return numeroContrato;
  }

  public void setNumeroContrato(Long numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  public DadosBeneficiario nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }

  /**
   * Get nomeEmpresa
   * @return nomeEmpresa
  **/
  @ApiModelProperty(value = "")

  public String getNomeEmpresa() {
    return nomeEmpresa;
  }

  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  public DadosBeneficiario endereco(Endereco endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public DadosBeneficiario listaPlano(ListaDadosPlano listaPlano) {
    this.listaPlano = listaPlano;
    return this;
  }

  /**
   * Get listaPlano
   * @return listaPlano
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaDadosPlano getListaPlano() {
    return listaPlano;
  }

  public void setListaPlano(ListaDadosPlano listaPlano) {
    this.listaPlano = listaPlano;
  }

  public DadosBeneficiario listaCobertura(ListaCobertura listaCobertura) {
    this.listaCobertura = listaCobertura;
    return this;
  }

  /**
   * Get listaCobertura
   * @return listaCobertura
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaCobertura getListaCobertura() {
    return listaCobertura;
  }

  public void setListaCobertura(ListaCobertura listaCobertura) {
    this.listaCobertura = listaCobertura;
  }

  public DadosBeneficiario listaBeneficio(ListaBeneficio listaBeneficio) {
    this.listaBeneficio = listaBeneficio;
    return this;
  }

  /**
   * Get listaBeneficio
   * @return listaBeneficio
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaBeneficio getListaBeneficio() {
    return listaBeneficio;
  }

  public void setListaBeneficio(ListaBeneficio listaBeneficio) {
    this.listaBeneficio = listaBeneficio;
  }

  public DadosBeneficiario infoComplementar(DadosInfoComplementar infoComplementar) {
    this.infoComplementar = infoComplementar;
    return this;
  }

  /**
   * Get infoComplementar
   * @return infoComplementar
  **/
  @ApiModelProperty(value = "")

  @Valid
  public DadosInfoComplementar getInfoComplementar() {
    return infoComplementar;
  }

  public void setInfoComplementar(DadosInfoComplementar infoComplementar) {
    this.infoComplementar = infoComplementar;
  }

  public DadosBeneficiario listaDependente(ListaDadosDependente listaDependente) {
    this.listaDependente = listaDependente;
    return this;
  }

  /**
   * Get listaDependente
   * @return listaDependente
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListaDadosDependente getListaDependente() {
    return listaDependente;
  }

  public void setListaDependente(ListaDadosDependente listaDependente) {
    this.listaDependente = listaDependente;
  }

  public DadosBeneficiario tipo(EnumTipoBeneficiarioType tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public EnumTipoBeneficiarioType getTipo() {
    return tipo;
  }

  public void setTipo(EnumTipoBeneficiarioType tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosBeneficiario dadosBeneficiario = (DadosBeneficiario) o;
    return Objects.equals(this.nome, dadosBeneficiario.nome) &&
        Objects.equals(this.numero, dadosBeneficiario.numero) &&
        Objects.equals(this.dataNascimento, dadosBeneficiario.dataNascimento) &&
        Objects.equals(this.situacao, dadosBeneficiario.situacao) &&
        Objects.equals(this.numeroCns, dadosBeneficiario.numeroCns) &&
        Objects.equals(this.dataInclusaoPlano, dadosBeneficiario.dataInclusaoPlano) &&
        Objects.equals(this.tipoContrato, dadosBeneficiario.tipoContrato) &&
        Objects.equals(this.categoriaTipoContrato, dadosBeneficiario.categoriaTipoContrato) &&
        Objects.equals(this.numeroContrato, dadosBeneficiario.numeroContrato) &&
        Objects.equals(this.nomeEmpresa, dadosBeneficiario.nomeEmpresa) &&
        Objects.equals(this.endereco, dadosBeneficiario.endereco) &&
        Objects.equals(this.listaPlano, dadosBeneficiario.listaPlano) &&
        Objects.equals(this.listaCobertura, dadosBeneficiario.listaCobertura) &&
        Objects.equals(this.listaBeneficio, dadosBeneficiario.listaBeneficio) &&
        Objects.equals(this.infoComplementar, dadosBeneficiario.infoComplementar) &&
        Objects.equals(this.listaDependente, dadosBeneficiario.listaDependente) &&
        Objects.equals(this.tipo, dadosBeneficiario.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, numero, dataNascimento, situacao, numeroCns, dataInclusaoPlano, tipoContrato, categoriaTipoContrato, numeroContrato, nomeEmpresa, endereco, listaPlano, listaCobertura, listaBeneficio, infoComplementar, listaDependente, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBeneficiarioDTO {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    numeroCns: ").append(toIndentedString(numeroCns)).append("\n");
    sb.append("    dataInclusaoPlano: ").append(toIndentedString(dataInclusaoPlano)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    categoriaTipoContrato: ").append(toIndentedString(categoriaTipoContrato)).append("\n");
    sb.append("    numeroContrato: ").append(toIndentedString(numeroContrato)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    listaPlano: ").append(toIndentedString(listaPlano)).append("\n");
    sb.append("    listaCobertura: ").append(toIndentedString(listaCobertura)).append("\n");
    sb.append("    listaBeneficio: ").append(toIndentedString(listaBeneficio)).append("\n");
    sb.append("    infoComplementar: ").append(toIndentedString(infoComplementar)).append("\n");
    sb.append("    listaDependente: ").append(toIndentedString(listaDependente)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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
