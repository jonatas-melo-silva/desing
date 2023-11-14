package com.ada.desingpatterns.singleton.suluction.eager;

import java.util.HashMap;
import java.util.Map;

import com.ada.desingpatterns.singleton.DiasEnum;

import lombok.Data;

@Data
public class AgendaSingletonEAGER {
  private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
  private Map<DiasEnum, Boolean> diasDisponiveis = new HashMap<>();

  public AgendaSingletonEAGER() {
    diasDisponiveis.put(DiasEnum.SEGUNDA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.TERCA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUARTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.QUINTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SEXTA, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.SABADO, Boolean.TRUE);
    diasDisponiveis.put(DiasEnum.DOMINGO, Boolean.TRUE);
  }

  public static AgendaSingletonEAGER getInstance() {
    return INSTANCE;
  }

  public void ocuparDia(DiasEnum dia) {
    diasDisponiveis.put(dia, Boolean.FALSE);
  }
}
