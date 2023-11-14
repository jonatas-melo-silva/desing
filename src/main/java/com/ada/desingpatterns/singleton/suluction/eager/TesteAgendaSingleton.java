package com.ada.desingpatterns.singleton.suluction.eager;

import com.ada.desingpatterns.singleton.DiasEnum;

public class TesteAgendaSingleton {
  public static void main(String[] args) {
    AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
    AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
    System.err.println(agenda1.hashCode());
    System.err.println(agenda2.hashCode());
    
    reservaDiaEAGER(DiasEnum.SEXTA);
    reservaDiaEAGER(DiasEnum.SABADO);
  }

  public static void reservaDiaEAGER(DiasEnum dia) {
    AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
    agenda.ocuparDia(dia);
    System.err.println(agenda);
  }
}
