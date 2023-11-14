package com.ada.desingpatterns.prototype.soluction;

import java.util.HashMap;
import java.util.Map;

import com.ada.desingpatterns.prototype.Botao;
import com.ada.desingpatterns.prototype.TipoBordaEnum;

public enum BotaoRegistry {
  // private static BotaoRegistry INSTANCE;
  INSTANCE;

  private static Map<String, Botao> REGISTRY = new HashMap<>();

  static {
    REGISTRY.put("padrao",
        Botao.builder()
            .cor("branco")
            .altura(10)
            .largura(10)
            .tipoBorda(TipoBordaEnum.SOLIDA)
            .build());
    REGISTRY.put("azul",
        Botao.builder()
            .cor("azul")
            .altura(10)
            .largura(10)
            .tipoBorda(TipoBordaEnum.SOLIDA)
            .build());
    REGISTRY.put("vermelho",
        Botao.builder()
            .cor("vermelho")
            .altura(10)
            .largura(10)
            .tipoBorda(TipoBordaEnum.SOLIDA)
            .build());
    REGISTRY.put("amarelo",
        Botao.builder()
            .cor("amarelo")
            .altura(10)
            .largura(10)
            .tipoBorda(TipoBordaEnum.SOLIDA)
            .build());
  }

  private BotaoRegistry() {
  }

  public static BotaoRegistry getInstance() {
    // if (Objects.isNull(INSTANCE)) {
    // INSTANCE = new BotaoRegistry();
    // }
    return INSTANCE;
  }

  public Botao getBotao(String tipo) {
    return BotaoFactory.getInstance(REGISTRY.get(tipo));
  }

  public void setRegistry(String string, Botao build) {
    REGISTRY.put(string, build);
  }
}
