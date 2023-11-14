package com.ada.desingpatterns.strategy.problem;

import java.math.BigDecimal;

import com.ada.desingpatterns.strategy.Funcionario;

import lombok.var;

public class ReajusteAnualSalario {

  private static final BigDecimal PERCENTUAL_REAJUSTE_CLT = new BigDecimal(0.10);
  private static final BigDecimal PERCENTUAL_REAJUSTE_PJ = new BigDecimal(0.05);
  private static final BigDecimal PERCENTUAL_REAJUSTE_ESTAGIARIO = new BigDecimal(0.02);

  private BigDecimal calcularAjuste(BigDecimal salario, BigDecimal percentual) {
    return salario.add(salario.multiply(percentual));
  }

  public void reajustarSalario(Funcionario funcionario) {
    var salario = funcionario.getSalario();
    final var TIPO_CONTRATO = funcionario.getTipoContratacao().name();

    switch (TIPO_CONTRATO) {
      case "CLT":
        funcionario.setSalario(calcularAjuste(salario, PERCENTUAL_REAJUSTE_CLT));
        break;
      case "PJ":
        funcionario.setSalario(calcularAjuste(salario, PERCENTUAL_REAJUSTE_PJ));
        break;
      case "ESTAGIARIO":
        funcionario.setSalario(calcularAjuste(salario, PERCENTUAL_REAJUSTE_ESTAGIARIO));
        break;
      default:
        new IllegalArgumentException("Tipo de contratação inválido");
        break;
    }
  }
}
