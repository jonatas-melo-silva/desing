package com.ada.desingpatterns.templatemethod.problem;

import com.ada.desingpatterns.templatemethod.VeiculoParaReparo;

public class RepararVeiculoComumService {

  private static final int PORCENTAGEM_DANOS_PARA_PERDA_TOTAL = 70;
  private VeiculoParaReparo veiculoParaReparo;

  public RepararVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
    this.veiculoParaReparo = veiculoParaReparo;
  }

  public void reparaVeiculo() {
    entradaOficina();
    analisarDanos();

    if (veiculoParaReparo()) {
      repararVeiculo();
      notificarReparoParaSeguradora();
    } else {
      notificarPerdaTotalParaSeguradora();
    }
  }

  private boolean veiculoParaReparo() {
    return veiculoParaReparo.getPorcentageDeDanos() <= PORCENTAGEM_DANOS_PARA_PERDA_TOTAL;
  }

  private void repararVeiculo() {
    System.out.println("Reparando veiculo");
  }

  private void notificarPerdaTotalParaSeguradora() {
    System.out.println("Notificando seguradora sobre perda total");
  }

  private void notificarReparoParaSeguradora() {
    System.out.println("Notificando seguradora sobre reparo");
  }

  private void analisarDanos() {
    System.out.println("Analisando danos");
  }

  private void entradaOficina() {
    System.out.println("Entrada na oficina");
  }
}
