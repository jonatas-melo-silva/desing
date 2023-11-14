package com.ada.desingpatterns.prototype.soluction;

import com.ada.desingpatterns.prototype.Botao;

public class BotaoFactory {

  public static Botao getInstance(Botao prototipo) {
    return Botao.builder()
        .cor(prototipo.getCor())
        .altura(prototipo.getAltura())
        .largura(prototipo.getLargura())
        .tipoBorda(prototipo.getTipoBorda()).build();
  }
}
