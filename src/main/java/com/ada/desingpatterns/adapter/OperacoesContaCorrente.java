package com.ada.desingpatterns.adapter;

import java.math.BigDecimal;

public interface OperacoesContaCorrente {
  void sacar(BigDecimal valor);
  void depositar(BigDecimal valor);
  boolean temSaldo(BigDecimal valor);
}
