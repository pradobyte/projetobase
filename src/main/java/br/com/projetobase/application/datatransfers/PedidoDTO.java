package br.com.projetobase.application.datatransfers;

import br.com.projetobase.domain.model.pedido.Pedido;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record PedidoDTO(UUID idPedido,
                        ClienteDTO cliente,
                        List<ItemPedidoDTO> itemPedidos,
                        BigDecimal valorTotal) {

    public static PedidoDTO toDTO(final Pedido pedido) {
        return new PedidoDTO(pedido.idPedido(),
                ClienteDTO.toDTO(pedido.cliente()),
                ItemPedidoDTO.toDTO(pedido.itemPedidos()),
                pedido.valorTotal());
    }

    public Pedido toDomain() {
        return new Pedido(idPedido, cliente.toDomain(),
                ItemPedidoDTO.toDomain(itemPedidos), valorTotal);
    }
}
