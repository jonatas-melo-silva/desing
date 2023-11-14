package com.ada.desingpatterns.strategy;

public enum TipoContratacaoEnum {

  CLT("CLT"), PJ("PJ"), ESTAGIARIO("ESTAGIARIO");

  private String tipoContratacao;

  TipoContratacaoEnum(String tipoContratacao) {
    this.tipoContratacao = tipoContratacao;
  }

  public String getTipoContratacao() {
    return tipoContratacao;
  }

  public void setTipoContratacao(String tipoContratacao) {
    this.tipoContratacao = tipoContratacao;
  }
}
