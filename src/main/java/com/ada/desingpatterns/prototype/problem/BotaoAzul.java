package com.ada.desingpatterns.prototype.problem;

import com.ada.desingpatterns.prototype.Botao;
import com.ada.desingpatterns.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
  
  public BotaoAzul() {
    this.setCor("Azul");
    this.setAltura(20);
    this.setLargura(40);
    this.setTipoBorda(TipoBordaEnum.TRACEJADA);
  }
}
