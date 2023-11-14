package com.ada.desingpatterns.prototype.problem;

import com.ada.desingpatterns.prototype.Botao;
import com.ada.desingpatterns.prototype.TipoBordaEnum;

public class botaoVermelho extends Botao {
  
  public botaoVermelho() {
    this.setCor("Vermelho");
    this.setAltura(30);
    this.setLargura(60);
    this.setTipoBorda(TipoBordaEnum.SOLIDA);
  }
}
