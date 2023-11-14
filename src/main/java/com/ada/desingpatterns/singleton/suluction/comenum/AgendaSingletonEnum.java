package com.ada.desingpatterns.singleton.suluction.comenum;

import java.util.HashMap;
import java.util.Map;

import com.ada.desingpatterns.singleton.DiasEnum;

public enum AgendaSingletonEnum {
  INSTANCE;

  private Map<DiasEnum, Boolean> diasDisponiveis = new HashMap<>();

  private AgendaSingletonEnum() {
    diasDisponiveis.put(DiasEnum.SEGUNDA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.TERCA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUARTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUINTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SEXTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SABADO, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.DOMINGO, Boolean.TRUE);
  }

  public static AgendaSingletonEnum getInstance() {
    return INSTANCE;
  }

  public void ocuparDia(DiasEnum dia) {
    diasDisponiveis.put(dia, Boolean.FALSE);
  }

  public Map<DiasEnum, Boolean> getDiasDisponiveis() {
    return diasDisponiveis;
  }
}
