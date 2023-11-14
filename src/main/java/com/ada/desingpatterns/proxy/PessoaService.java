package com.ada.desingpatterns.proxy;

public class PessoaService {
  private RepositoryPessoa repositoryPessoa;

  public PessoaService(RepositoryPessoa repositoryPessoa) {
    this.repositoryPessoa = repositoryPessoa;
  }

  public void save(Pessoa pessoa) {
    repositoryPessoa.save(pessoa);
  }

  public Pessoa findById(Long id) {
    return repositoryPessoa.findById(id);
  }
}
