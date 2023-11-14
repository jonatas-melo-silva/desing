package com.ada.desingpatterns.adapter.problem;

import java.math.BigDecimal;

import com.ada.desingpatterns.adapter.OperacoesContaCorrente;

public class ClienteLibOperacoesContaCorrente {
  private OperacoesContaCorrente operacoesContaCorrente;

  public ClienteLibOperacoesContaCorrente(OperacoesContaCorrente operacoesContaCorrente) {
    this.operacoesContaCorrente = operacoesContaCorrente;
  }

  public void depositar(BigDecimal valor) {
    operacoesContaCorrente.depositar(valor);
  }

  public void sacar(BigDecimal valor) {
    operacoesContaCorrente.sacar(valor);
  }

  public boolean temSaldo(BigDecimal valor) {
    return operacoesContaCorrente.temSaldo(valor);
  }
}
