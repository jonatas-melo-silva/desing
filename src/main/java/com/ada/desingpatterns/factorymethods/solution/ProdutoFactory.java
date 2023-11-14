package com.ada.desingpatterns.factorymethods.solution;

import com.ada.desingpatterns.factorymethods.Produto;
import com.ada.desingpatterns.factorymethods.ProdutoDigital;
import com.ada.desingpatterns.factorymethods.ProdutoFisico;
import com.ada.desingpatterns.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {
  public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
    switch (tipoProdutoEnum) {
      case PRODUTO_FISICO:
        return ProdutoFisico.builder().possuiDimensoesFisicas(true).build();
      case PRODUTO_DIGITAL:
        return ProdutoDigital.builder().possuiDimensoesFisicas(false).build();
      default:
        throw new IllegalArgumentException("Tipo de produto não suportado");
    }
  }
}
