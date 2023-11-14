package com.ada.desingpatterns.adapter.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.adapter.LibOperacoesContaCorrente;

import lombok.var;

public class TesteOperacoesContaCorrenteAdpter {
  public static void main(String[] args) {
    var cliente = new ClienteLibOperacoesContaCorrenteAdapter(
        new LibOperacoesContaCorrenteAdapter(new LibOperacoesContaCorrente()));

    cliente.sacar(new BigDecimal(500));

    cliente.depositar(new BigDecimal(500));
  }
}
