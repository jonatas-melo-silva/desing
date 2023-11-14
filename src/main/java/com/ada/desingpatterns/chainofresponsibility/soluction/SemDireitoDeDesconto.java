package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;

public class SemDireitoDeDesconto extends DescontoCarro {

  public SemDireitoDeDesconto(DescontoCarro proximoDesconto) {
    super(proximoDesconto);
  }

  @Override
  public BigDecimal aplicarDesconto(Carro carro) {
    return BigDecimal.ZERO;
  }

}
