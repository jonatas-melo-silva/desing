package com.ada.desingpatterns.singleton.suluction.comenum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.ada.desingpatterns.singleton.DiasEnum;

public class TesteAgendaSingleton {
  public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
      IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
    AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
    System.err.println(agenda1.hashCode());
    System.err.println(agenda2.hashCode());

    // reflection
    Constructor<AgendaSingletonEnum> constructorMaroto = AgendaSingletonEnum.class.getDeclaredConstructor();
    constructorMaroto.setAccessible(true);
    AgendaSingletonEnum agendaMarota = constructorMaroto.newInstance();
    System.err.println(agendaMarota.hashCode());

    reservaDiaEnum(DiasEnum.SEXTA);
    reservaDiaEnum(DiasEnum.SABADO);
  }

  public static void reservaDiaEnum(DiasEnum dia) {
    AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
    agenda.ocuparDia(dia);
    System.err.println(agenda.getDiasDisponiveis());
  }
}
