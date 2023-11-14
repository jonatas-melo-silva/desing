package com.ada.desingpatterns.proxy;

public interface RepositoryPessoa {
  void save(Pessoa pessoa);

  Pessoa findById(Long id);
}
