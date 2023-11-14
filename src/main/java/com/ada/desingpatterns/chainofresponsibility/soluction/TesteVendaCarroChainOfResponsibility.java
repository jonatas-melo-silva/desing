package com.ada.desingpatterns.chainofresponsibility.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.chainofresponsibility.Carro;
import com.ada.desingpatterns.chainofresponsibility.MarcaCarroEnum;

import lombok.var;

public class TesteVendaCarroChainOfResponsibility {
  public static void main(String[] args) {
    var vendaCarroService = new VendaCarroServiceChainOfResponsibility();

    var ford = Carro.builder()
        .marca(MarcaCarroEnum.FORD)
        .modelo("FORD")
        .preco(new BigDecimal(90000.00)).build();
    var valorVendaFord = vendaCarroService.calcularValorVenda(ford);

    System.out.println("Valor de venda do carro FORD: " + ford.getPreco());
    System.out.println("Valor de venda do carro FORD com desconto: " + valorVendaFord);

    var fiat = Carro.builder()
        .marca(MarcaCarroEnum.FIAT)
        .modelo("FIAT")
        .preco(new BigDecimal(40000.00)).build();
    var valorVendaFiat = vendaCarroService.calcularValorVenda(fiat);

    System.out.println("Valor de venda do carro FIAT: " + fiat.getPreco());
    System.out.println("Valor de venda do carro FIAT com desconto: " + valorVendaFiat);

    var chevrolet = Carro.builder()
        .marca(MarcaCarroEnum.CHEVROLET)
        .modelo("CHEVROLET")
        .preco(new BigDecimal(200000.00))
        .build();
    var valorVendaChevrolet = vendaCarroService.calcularValorVenda(chevrolet);

    System.out.println("Valor de venda do carro CHEVROLET: " + chevrolet.getPreco());
    System.out.println("Valor de venda do carro CHEVROLET com desconto: " + valorVendaChevrolet);
  }
}
