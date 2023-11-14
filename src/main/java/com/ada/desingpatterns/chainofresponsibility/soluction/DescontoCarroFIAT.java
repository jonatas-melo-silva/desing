package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;
import com.ada.desingpatterns.chainofresponsibility.MarcaCarroEnum;

public class DescontoCarroFIAT extends DescontoCarro {

  private static final BigDecimal DESCONTO_MODELO_FIAT = new BigDecimal(1000);

  public DescontoCarroFIAT(DescontoCarro proximoDesconto) {
    super(proximoDesconto);
  }

  @Override
  public BigDecimal aplicarDesconto(Carro carro) {
    BigDecimal valorVenda = carro.getPreco();
    if (MarcaCarroEnum.FIAT.equals(carro.getMarca())) {
      return valorVenda.subtract(DESCONTO_MODELO_FIAT);
    }
    return proximoDesconto.aplicarDesconto(carro);
  }

}
