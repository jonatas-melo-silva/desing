package com.ada.desingpatterns.proxy.soluction;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.ada.desingpatterns.proxy.Pessoa;
import com.ada.desingpatterns.proxy.PessoaRepository;

public class PessoaRepositoryProxy extends PessoaRepository {

  private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
  private Map<Long, Pessoa> cache = new HashMap<>();

  @Override
  public void save(Pessoa pessoa) {
    log.info("Salvando pessoa: " + pessoa);
    super.save(pessoa);
    log.info("Pessoa salva com sucesso!");
  }

  @Override
  public Pessoa findById(Long id) {
    log.info("Buscando pessoa por id: " + id);
    Long inicio = System.currentTimeMillis();
    Pessoa pessoa = null;

    if (cache.containsKey(id)) {
      log.info("Pessoa encontrada no cache!");
      pessoa = cache.get(id);
    } else {
      pessoa = super.findById(id);
      log.info("Pessoa encontrada no banco de dados!");
      cache.put(id, pessoa);
    }
    Long fim = System.currentTimeMillis();
    log.info("Tempo de execução: " + (fim - inicio) + "ms");
    return pessoa;
  }
}
