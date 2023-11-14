package com.ada.desingpatterns.proxy.problem;

import java.time.LocalDate;

import com.ada.desingpatterns.proxy.Pessoa;
import com.ada.desingpatterns.proxy.PessoaRepository;
import com.ada.desingpatterns.proxy.PessoaService;

public class TestePessoa {
  public static void main(String[] args) {
    // PessoaService pessoaService = new PessoaService(new PessoaRepository());

    // Pessoa pessoa = Pessoa.builder()
    //     .nome("João")
    //     .sobrenome("Silva")
    //     .documento("12345678900")
    //     .email("joao@email.com")
    //     .apelido("joaozinho")
    //     .dataNascimento(LocalDate.of(1990, 1, 1))
    //     .build();

    // pessoaService.save(pessoa);

    // Pessoa pessoaEncontrada = pessoaService.findById(1L);
    // System.out.println(pessoaEncontrada);
  }
}
