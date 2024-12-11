package br.com.projetobase.domain.ports.in;

import br.com.projetobase.domain.model.ResultadoEfetivacao;
import br.com.projetobase.domain.model.pedido.Pedido;

public interface EfetivarPedidoPort {

    ResultadoEfetivacao efetivarPedido(Pedido pedido);

}
