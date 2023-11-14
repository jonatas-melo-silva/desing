package com.ada.desingpatterns.strategy.soluction;

import java.math.BigDecimal;

import com.ada.desingpatterns.strategy.Funcionario;
import com.ada.desingpatterns.strategy.TipoContratacaoEnum;

import lombok.var;

public class TesteReajusteAnualSalarioStrategy {
  public static void main(String[] args) {
    var reajusteSalarioAnualSalarioStrategy = new ReajusteAnualSalarioStrategy();

    var funcionarioCLT = Funcionario.builder()
        .nome("João")
        .salario(new BigDecimal(5000))
        .tipoContratacao(TipoContratacaoEnum.CLT).build();

    var funcionarioPJ = Funcionario.builder()
        .nome("Maria")
        .salario(new BigDecimal(10000))
        .tipoContratacao(TipoContratacaoEnum.PJ).build();

    var funcionarioESTAGIARIO = Funcionario.builder()
        .nome("José")
        .salario(new BigDecimal(15000))
        .tipoContratacao(TipoContratacaoEnum.ESTAGIARIO).build();

    System.out.println(funcionarioCLT);
    System.out.println(funcionarioPJ);
    System.out.println(funcionarioESTAGIARIO);

    reajusteSalarioAnualSalarioStrategy
        .reajustarSalario(
            funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
    reajusteSalarioAnualSalarioStrategy
        .reajustarSalario(
            funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
    reajusteSalarioAnualSalarioStrategy
        .reajustarSalario(
            funcionarioESTAGIARIO, new CalculadorReajusteAnualSalarioESTAGIARIO());

    System.out.println(funcionarioCLT);
    System.out.println(funcionarioPJ);
    System.out.println(funcionarioESTAGIARIO);
  }
}
