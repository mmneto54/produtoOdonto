package br.com.segurosunimed.produto.odonto.dto;


public enum EnumTipoBeneficiarioDTO {

  Titular("Titular"),
  Dependente("Dependente");

  private String tipo;

  EnumTipoBeneficiarioDTO(String value) {
    this.tipo = value;
  }

  public String toString() {
    return String.valueOf(tipo);
  }

  public static EnumTipoBeneficiarioDTO fromValue(String text) {
    for (EnumTipoBeneficiarioDTO b : EnumTipoBeneficiarioDTO.values()) {
      if (String.valueOf(b.tipo).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
