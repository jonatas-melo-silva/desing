package com.ada.desingpatterns.templatemethod.problem;

import com.ada.desingpatterns.templatemethod.VeiculoParaReparo;

import lombok.var;

public class TesteRepararVeiculos {
  public static void main(String[] args) {
    System.out.println("---------------------VEICULO-LUXO-------------------------------");
    var veiculoLuxo = VeiculoParaReparo.builder().porcentageDeDanos(51).build();
    var repararVeiculoLuxoService = new RepararVeiculoLuxoService(veiculoLuxo);
    repararVeiculoLuxoService.reparaVeiculo();

    System.out.println("---------------------VEICULO-COMUM-------------------------------");

    var veiculoComum = VeiculoParaReparo.builder().porcentageDeDanos(70).build();
    var repararVeiculoComumService = new RepararVeiculoComumService(veiculoComum);
    repararVeiculoComumService.reparaVeiculo();
  }
}
