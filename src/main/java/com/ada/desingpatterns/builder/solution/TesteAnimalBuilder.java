package com.ada.desingpatterns.builder.solution;

public class TesteAnimalBuilder {
  public static void main(String[] args) {
    Animal animal = Animal.builder()
        .nome("Bilu")
        .especie("Cachorro")
        .raca("Vira-lata")
        .build();

    System.out.println(animal);
  }
}
