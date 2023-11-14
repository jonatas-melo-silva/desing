package com.ada.desingpatterns.proxy.soluction;

import java.time.LocalDate;

import com.ada.desingpatterns.proxy.Pessoa;
import com.ada.desingpatterns.proxy.PessoaService;

public class TestePessoaProxy {
  public static void main(String[] args) {
    PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());

    Pessoa pessoa = Pessoa.builder()
        .nome("João")
        .sobrenome("Silva")
        .documento("12345678900")
        .email("joao@email.com")
        .apelido("joaozinho")
        .dataNascimento(LocalDate.of(1990, 1, 1))
        .build();

    pessoaService.save(pessoa);

    Pessoa pessoaEncontradaNoBancoDeDados = pessoaService.findById(1L);
    System.out.println(pessoaEncontradaNoBancoDeDados);

    Pessoa pessoaEncontradaNoCache = pessoaService.findById(1L);
    System.out.println(pessoaEncontradaNoCache);
  }
}
