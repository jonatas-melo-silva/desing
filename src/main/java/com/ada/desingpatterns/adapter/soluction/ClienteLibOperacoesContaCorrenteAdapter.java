package com.ada.desingpatterns.adapter.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.adapter.OperacoesContaCorrente;

public class ClienteLibOperacoesContaCorrenteAdapter {
  private OperacoesContaCorrente operacoesContaCorrente;

  public ClienteLibOperacoesContaCorrenteAdapter(OperacoesContaCorrente operacoesContaCorrente) {
    this.operacoesContaCorrente = operacoesContaCorrente;
  }

  public void depositar(BigDecimal valor) {
    operacoesContaCorrente.depositar(valor);
  }

  public void sacar(BigDecimal valor) {
    operacoesContaCorrente.sacar(valor);
  }
}
