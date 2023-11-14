package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {
  private static final BigDecimal DESCONTO_VALOR_MAIOR_QUE_CEM_MIL = new BigDecimal(10000);

  public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
    super(proximoDesconto);
  }

  @Override
  public BigDecimal aplicarDesconto(Carro carro) {
    BigDecimal valorVenda = carro.getPreco();
    if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
      return valorVenda.subtract(DESCONTO_VALOR_MAIOR_QUE_CEM_MIL);
    }
    return proximoDesconto.aplicarDesconto(carro);
  }
}
