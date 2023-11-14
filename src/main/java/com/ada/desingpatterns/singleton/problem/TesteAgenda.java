package com.ada.desingpatterns.singleton.problem;

import com.ada.desingpatterns.singleton.DiasEnum;

public class TesteAgenda {
  public static void main(String[] args) {
    reservaDia(DiasEnum.SEXTA);
    reservaDia(DiasEnum.SABADO);
  }

  public static void reservaDia(DiasEnum dia) {
    Agenda agenda = new Agenda();
    agenda.ocuparDia(dia);
    System.err.println(agenda);
  }
}
