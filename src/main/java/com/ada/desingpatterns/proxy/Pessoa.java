package com.ada.desingpatterns.proxy;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
  private String nome;
  private String sobrenome;
  private String documento;
  private String email;
  private String apelido;
  private LocalDate dataNascimento;
}
