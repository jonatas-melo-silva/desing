package com.ada.desingpatterns.adapter;

import java.math.BigDecimal;

public class LibOperacoesContaCorrente implements OperacoesContaCorrente {

  @Override
  public void depositar(BigDecimal valor) {
    System.out.println("Deposito realizado com sucesso");
  }

  @Override
  public void sacar(BigDecimal valor) {
    System.out.println("Saque realizado com sucesso");
  }

  @Override
  public boolean temSaldo(BigDecimal valor) {
    System.out.println("Saldo disponivel");
    return true;
  }

}
