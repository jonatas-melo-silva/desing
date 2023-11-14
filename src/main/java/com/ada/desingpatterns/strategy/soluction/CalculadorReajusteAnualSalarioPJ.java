package com.ada.desingpatterns.strategy.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.strategy.Funcionario;

public class CalculadorReajusteAnualSalarioPJ implements CalculadorReajusteAnualSalario{
  private static final BigDecimal PERCENTUAL_REAJUSTE_PJ = new BigDecimal(0.05);

  @Override
  public void calcularReajuste(Funcionario funcionario) {
    BigDecimal salario = funcionario.getSalario();
    funcionario.setSalario(salario.add(salario.multiply(PERCENTUAL_REAJUSTE_PJ)));
  }


}
