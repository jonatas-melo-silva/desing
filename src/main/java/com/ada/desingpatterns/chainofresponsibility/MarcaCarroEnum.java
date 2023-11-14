package com.ada.desingpatterns.chainofresponsibility;

public enum MarcaCarroEnum {

  FIAT("FIAT"),
  FORD("FORD"),
  CHEVROLET("CHEVROLET"),
  VOLKSWAGEN("VOLKSWAGEN");

  private String marca;

  MarcaCarroEnum(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }
}
