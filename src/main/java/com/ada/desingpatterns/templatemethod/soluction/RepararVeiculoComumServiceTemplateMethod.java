package com.ada.desingpatterns.templatemethod.soluction;

import com.ada.desingpatterns.templatemethod.VeiculoParaReparo;

public class RepararVeiculoComumServiceTemplateMethod extends ReparoVeiculoService {

  private static final int PORCENTAGEM_DANOS_PARA_PERDA_TOTAL = 70;
  private VeiculoParaReparo veiculoParaReparo;

  public RepararVeiculoComumServiceTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
    this.veiculoParaReparo = veiculoParaReparo;
  }

  @Override
  protected boolean veiculoParaReparo() {
    return veiculoParaReparo.getPorcentageDeDanos() <= PORCENTAGEM_DANOS_PARA_PERDA_TOTAL;
  }

}
