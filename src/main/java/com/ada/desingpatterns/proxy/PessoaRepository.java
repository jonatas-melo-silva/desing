package com.ada.desingpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository implements RepositoryPessoa {
  private Map<Long, Pessoa> banco = new HashMap<>();
  private static Long countId = 1L;

  @Override
  public void save(Pessoa pessoa) {
    banco.put(countId++, pessoa);
  }

  @Override
  public Pessoa findById(Long id) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return banco.get(id);
  }
}
