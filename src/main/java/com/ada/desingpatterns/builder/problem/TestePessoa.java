package com.ada.desingpatterns.builder.problem;

import java.time.LocalDate;

public class TestePessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa(
        "Jonatas",
        "Leon",
        "123456789",
        "jonatas@email.com",
        "dudu",
        LocalDate.of(1990, 10, 15));

    System.out.println(pessoa);
  }
}
