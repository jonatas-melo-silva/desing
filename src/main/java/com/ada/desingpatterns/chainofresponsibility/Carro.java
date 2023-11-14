package com.ada.desingpatterns.chainofresponsibility;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Carro {
  private MarcaCarroEnum marca;
  private String modelo;
  private BigDecimal preco;
}
