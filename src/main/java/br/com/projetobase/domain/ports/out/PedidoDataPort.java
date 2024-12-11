package br.com.projetobase.domain.ports.out;

import br.com.projetobase.domain.model.ResultadoEfetivacao;

public interface PedidoDataPort {

  void salvarEfetivacao(ResultadoEfetivacao resultadoEfetivacao);

}
