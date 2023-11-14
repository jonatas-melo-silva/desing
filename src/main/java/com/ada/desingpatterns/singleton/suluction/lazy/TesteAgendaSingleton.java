package com.ada.desingpatterns.singleton.suluction.lazy;

import com.ada.desingpatterns.singleton.DiasEnum;

public class TesteAgendaSingleton {
  public static void main(String[] args) {
    AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
    AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
    System.err.println(agenda1.hashCode());
    System.err.println(agenda2.hashCode());
    
    reservaDiaLAZY(DiasEnum.SEXTA);
    reservaDiaLAZY(DiasEnum.SABADO);
  }

  public static void reservaDiaLAZY(DiasEnum dia) {
    AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
    agenda.ocuparDia(dia);
    System.err.println(agenda);
  }
}
