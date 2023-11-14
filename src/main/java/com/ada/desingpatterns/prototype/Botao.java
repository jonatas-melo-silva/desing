package com.ada.desingpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Botao {
  private String cor;
  private int altura;
  private int largura;
  private TipoBordaEnum tipoBorda;
}
