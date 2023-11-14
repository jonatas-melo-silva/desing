package com.ada.desingpatterns.factorymethods;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
  private String descricao;
  private double preco;
  private Boolean possuiDimensoesFisicas;
}
