package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;
import com.ada.desingpatterns.chainofresponsibility.MarcaCarroEnum;

public class DescontoCarroFORD extends DescontoCarro {
  private static final BigDecimal DESCONTO_MODELO_FORD = new BigDecimal(2000);

  public DescontoCarroFORD(DescontoCarro proximoDesconto) {
    super(proximoDesconto);
  }

  @Override
  public BigDecimal aplicarDesconto(Carro carro) {
    BigDecimal valorVenda = carro.getPreco();
    if (MarcaCarroEnum.FORD.equals(carro.getMarca())) {
      return valorVenda.subtract(DESCONTO_MODELO_FORD);
    }
    return proximoDesconto.aplicarDesconto(carro);
  }
}
