package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;

public class VendaCarroServiceChainOfResponsibility {

  public BigDecimal calcularValorVenda(Carro carro) {
    DescontoCarro desconto = new DescontoCarroFIAT(
        new DescontoCarroFORD(
            new DescontoCarroValorMaiorQueCemMil(
                new SemDireitoDeDesconto(null))));
    return desconto.aplicarDesconto(carro);
  }
}
