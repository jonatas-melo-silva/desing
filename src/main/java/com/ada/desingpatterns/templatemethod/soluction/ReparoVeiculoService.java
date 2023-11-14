package com.ada.desingpatterns.templatemethod.soluction;

public abstract class ReparoVeiculoService {

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

  protected abstract boolean veiculoParaReparo();

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
