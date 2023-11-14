package com.ada.desingpatterns.singleton;

public enum DiasSemanaEnum {

  SEGUNDA(true), TERCA(true), QUARTA(true), QUINTA(true), SEXTA(true), SABADO(false), DOMINGO(false);

  private boolean diaUtil;

  DiasSemanaEnum(boolean diaUtil) {
    this.diaUtil = diaUtil;
  }

  public boolean isDiaUtil() {
    return diaUtil;
  }
}
