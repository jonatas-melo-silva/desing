package com.ada.desingpatterns.factorymethods.solution;

import com.ada.desingpatterns.factorymethods.Produto;
import com.ada.desingpatterns.factorymethods.TipoProdutoEnum;

public class TesteProdutoFactoryMethod {

  public static void main(String[] args) {

    Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.PRODUTO_FISICO);
    System.err.println(produtoFisico);

    Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.PRODUTO_DIGITAL);
    System.err.println(produtoDigital);
  }
}