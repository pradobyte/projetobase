package java.br.com.projetobase.domain.model.pedido;

import br.com.projetobase.domain.model.pedido.Pedido;

public record ResultadoPedido(br.com.projetobase.domain.model.pedido.Pedido pedido, String mensagem) {

    public static ResultadoPedido sucesso(br.com.projetobase.domain.model.pedido.Pedido pedido) {
        return new ResultadoPedido(pedido, "Pedido efetivado com sucesso");
    }

    public static ResultadoPedido canceladoComSucesso(br.com.projetobase.domain.model.pedido.Pedido pedido) {
        return new ResultadoPedido(pedido, "Pedido cancelado");
    }

    public static ResultadoPedido erro(Pedido pedido, String mensagem) {
        return new ResultadoPedido(pedido, mensagem);
    }

    public boolean isSucesso() {
        return mensagem.equals("Pedido efetivado com sucesso");
    }

    public boolean isErro() {
        return !isSucesso();
    }
}
