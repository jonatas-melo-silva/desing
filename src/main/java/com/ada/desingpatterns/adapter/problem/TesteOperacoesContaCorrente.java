package com.ada.desingpatterns.adapter.problem;

import java.math.BigDecimal;

import com.ada.desingpatterns.adapter.LibOperacoesContaCorrente;

import lombok.var;

public class TesteOperacoesContaCorrente {
  public static void main(String[] args) {
    var cliente = new ClienteLibOperacoesContaCorrente(new LibOperacoesContaCorrente());
    
    if (cliente.temSaldo(new BigDecimal(1000))) {
      cliente.sacar(new BigDecimal(500));
    }

    cliente.depositar(new BigDecimal(500));
  }
}
