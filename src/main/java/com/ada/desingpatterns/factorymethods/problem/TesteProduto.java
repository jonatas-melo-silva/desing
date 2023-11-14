package com.ada.desingpatterns.factorymethods.problem;

import com.ada.desingpatterns.factorymethods.ProdutoDigital;
import com.ada.desingpatterns.factorymethods.ProdutoFisico;

public class TesteProduto {
  public static void main(String[] args) {

    ProdutoFisico produtoFisico = new ProdutoFisico();
    produtoFisico.setPossuiDimensoesFisicas(true);

    ProdutoDigital produtoDigital = new ProdutoDigital();
    produtoDigital.setPossuiDimensoesFisicas(false);
  }
}
