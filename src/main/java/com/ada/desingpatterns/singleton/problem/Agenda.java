package com.ada.desingpatterns.singleton.problem;

import java.util.HashMap;
import java.util.Map;

import com.ada.desingpatterns.singleton.DiasEnum;

import lombok.ToString;

@ToString
public class Agenda {
  private Map<DiasEnum, Boolean> diasDisponiveis = new HashMap<>();

  public Agenda() {
    diasDisponiveis.put(DiasEnum.SEGUNDA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.TERCA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUARTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUINTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SEXTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SABADO, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.DOMINGO, Boolean.TRUE);
  }

  public void ocuparDia(DiasEnum dia) {
    diasDisponiveis.put(dia, Boolean.FALSE);
  }
}
