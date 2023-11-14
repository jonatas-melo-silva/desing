package com.ada.desingpatterns.prototype.soluction;

import com.ada.desingpatterns.prototype.Botao;
import com.ada.desingpatterns.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
  public static void main(String[] args) {
    Botao botaoPadrao = BotaoRegistry
        .getInstance()
        .getBotao("padrao");
    System.out.println(botaoPadrao);

    Botao botaoAzul = BotaoRegistry
        .getInstance()
        .getBotao("azul");
    botaoAzul.setAltura(20);
    botaoAzul.setLargura(40);
    System.out.println(botaoAzul);

    Botao botaoVermelho = BotaoRegistry
        .getInstance()
        .getBotao("vermelho");
    botaoVermelho.setAltura(30);
    botaoVermelho.setLargura(60);
    System.out.println(botaoVermelho);

    Botao botaoAmarelo = BotaoRegistry
        .getInstance()
        .getBotao("amarelo");
    botaoAmarelo.setAltura(40);
    botaoAmarelo.setLargura(80);
    System.out.println(botaoAmarelo);

    BotaoRegistry
        .getInstance()
        .setRegistry("verde",
            Botao.builder()
                .cor("verde")
                .altura(50)
                .largura(100)
                .tipoBorda(TipoBordaEnum.SOLIDA)
                .build());
    System.out.println(BotaoRegistry.getInstance().getBotao("verde"));
  }
}
