package com.ada.desingpatterns.strategy;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Funcionario {
  private String nome;
  private BigDecimal salario;
  private TipoContratacaoEnum tipoContratacao;
}
