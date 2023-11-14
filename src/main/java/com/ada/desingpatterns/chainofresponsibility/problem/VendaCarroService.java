package com.ada.desingpatterns.chainofresponsibility.problem;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;

public class VendaCarroService {
  private static final BigDecimal DESCONTO_MODELO_FIAT = new BigDecimal(1000);
  private static final BigDecimal DESCONTO_MODELO_FORD = new BigDecimal(2000);
  private static final BigDecimal DESCONTO_VALOR_MAIOR_QUE_CEM_MIL = new BigDecimal(10000);

  public BigDecimal calcularValorVenda(Carro carro) {
    BigDecimal valorVenda = carro.getPreco();
    String modelo = carro.getMarca().name();

    if (modelo.equals("FIAT")) {
      return valorVenda.subtract(DESCONTO_MODELO_FIAT);
    } else if (modelo.equals("FORD")) {
      return valorVenda.subtract(DESCONTO_MODELO_FORD);
    } else if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
      return valorVenda.subtract(DESCONTO_VALOR_MAIOR_QUE_CEM_MIL);
    }
    return valorVenda;
  }
}
