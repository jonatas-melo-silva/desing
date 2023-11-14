package com.ada.desingpatterns.prototype.problem;

import com.ada.desingpatterns.prototype.Botao;
import com.ada.desingpatterns.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

  public BotaoAmarelo() {
    this.setCor("Amarelo");
    this.setAltura(10);
    this.setLargura(20);
    this.setTipoBorda(TipoBordaEnum.PONTILHADA);
  }
}
