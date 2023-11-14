package com.ada.desingpatterns.prototype;

public enum TipoBordaEnum {
  
  SOLIDA("Sólida"), TRACEJADA("Tracejada"), PONTILHADA("Pontilhada");

  private String descricao;

  TipoBordaEnum(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }
}
