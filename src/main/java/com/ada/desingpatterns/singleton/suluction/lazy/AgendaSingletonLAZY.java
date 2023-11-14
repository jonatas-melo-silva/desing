package com.ada.desingpatterns.singleton.suluction.lazy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.ada.desingpatterns.singleton.DiasEnum;

import lombok.Data;

@Data
public class AgendaSingletonLAZY {
  private static AgendaSingletonLAZY INSTANCE = null;
  private Map<DiasEnum, Boolean> diasDisponiveis = new HashMap<>();

  public AgendaSingletonLAZY() {
    diasDisponiveis.put(DiasEnum.SEGUNDA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.TERCA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUARTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUINTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SEXTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SABADO, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.DOMINGO, Boolean.TRUE);
  }

  public static AgendaSingletonLAZY getInstance() {
    if (Objects.isNull(INSTANCE)) {
      INSTANCE = new AgendaSingletonLAZY();
    }
    return INSTANCE;
  }

  public void ocuparDia(DiasEnum dia) {
    diasDisponiveis.put(dia, Boolean.FALSE);
  }
}
