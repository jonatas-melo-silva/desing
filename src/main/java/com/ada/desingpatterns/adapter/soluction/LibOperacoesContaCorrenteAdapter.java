package com.ada.desingpatterns.adapter.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.adapter.LibOperacoesContaCorrente;
import com.ada.desingpatterns.adapter.OperacoesContaCorrente;

public class LibOperacoesContaCorrenteAdapter implements OperacoesContaCorrente {
  private LibOperacoesContaCorrente libOperacoesContaCorrente;

  public LibOperacoesContaCorrenteAdapter(LibOperacoesContaCorrente libOperacoesContaCorrente) {
    this.libOperacoesContaCorrente = libOperacoesContaCorrente;
  }

  public void depositar(BigDecimal valor) {
    libOperacoesContaCorrente.depositar(valor);
  }

  public void sacar(BigDecimal valor) {
    if (!libOperacoesContaCorrente.temSaldo(valor)) {
      throw new IllegalArgumentException("Saldo insuficiente");
    }
    libOperacoesContaCorrente.sacar(valor);
  }

  @Override
  public boolean temSaldo(BigDecimal valor) {
    throw new UnsupportedOperationException("Unimplemented method 'temSaldo'");
  }
}
