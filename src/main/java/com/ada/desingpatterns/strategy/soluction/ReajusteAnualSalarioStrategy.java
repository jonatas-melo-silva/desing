package com.ada.desingpatterns.strategy.soluction;

import com.ada.desingpatterns.strategy.Funcionario;

public class ReajusteAnualSalarioStrategy {
  public void reajustarSalario(Funcionario funcionario, CalculadorReajusteAnualSalario calculadorReajusteAnualSalario) {
    calculadorReajusteAnualSalario.calcularReajuste(funcionario);
  }
}
