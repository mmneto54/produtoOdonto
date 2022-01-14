package br.com.segurosunimed.produto.odonto.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets enumTipoBeneficiarioType
 */
public enum EnumTipoBeneficiarioType {
  Titular("Titular"),
  Dependente("Dependente");

  private String tipo;

  EnumTipoBeneficiarioType(String value) {
    this.tipo = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(tipo);
  }

  @JsonCreator
  public static EnumTipoBeneficiarioType fromValue(String text) {
    for (EnumTipoBeneficiarioType b : EnumTipoBeneficiarioType.values()) {
      if (String.valueOf(b.tipo).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
