package com.ada.desingpatterns.templatemethod.soluction;

import com.ada.desingpatterns.templatemethod.VeiculoParaReparo;

import lombok.var;

public class TesteRepararVeiculosTemplateMethod {
  public static void main(String[] args) {
    System.out.println("---------------------VEICULO-LUXO-------------------------------");
    var veiculoLuxo = VeiculoParaReparo.builder().porcentageDeDanos(50).build();
    var rvltm = new RepararVeiculoLuxoServiceTemplateMethod(veiculoLuxo);
    rvltm.reparaVeiculo();

    System.out.println("---------------------VEICULO-COMUM-------------------------------");

    var veiculoComum = VeiculoParaReparo.builder().porcentageDeDanos(71).build();
    var rvctm = new RepararVeiculoComumServiceTemplateMethod(veiculoComum);
    rvctm.reparaVeiculo();
  }
}
