package com.ada.desingpatterns.templatemethod.soluction;

import com.ada.desingpatterns.templatemethod.VeiculoParaReparo;

public class RepararVeiculoLuxoServiceTemplateMethod extends ReparoVeiculoService {

  private static final int PORCENTAGEM_DANOS_PARA_PERDA_TOTAL = 50;
  private VeiculoParaReparo veiculoParaReparo;

  public RepararVeiculoLuxoServiceTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
    this.veiculoParaReparo = veiculoParaReparo;
  }

  @Override
  protected boolean veiculoParaReparo() {
    return veiculoParaReparo.getPorcentageDeDanos() <= PORCENTAGEM_DANOS_PARA_PERDA_TOTAL;
  }
}
