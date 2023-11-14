package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;

public abstract class DescontoCarro {

  protected DescontoCarro proximoDesconto;

  public DescontoCarro(DescontoCarro proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }

  public abstract BigDecimal aplicarDesconto(Carro carro);
}
