package com.ada.desingpatterns.builder.solution;

import java.time.LocalDate;

public class TestePessoaBuilder {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa.PessoaBuilder()
        .nome("Jonatas")
        .sobrenome("Leon")
        .documento("123456789")
        .email("jonatas@email.com")
        .apelido("dudu")
        .dataNascimento(LocalDate.of(1990, 10, 15))
        .build();

    System.out.println(pessoa);
  }
}
