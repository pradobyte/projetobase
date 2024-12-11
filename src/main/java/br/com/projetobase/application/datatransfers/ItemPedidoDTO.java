package br.com.projetobase.application.datatransfers;

import br.com.projetobase.domain.model.pedido.ItemPedido;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record ItemPedidoDTO(UUID id, String nome, Integer quantidade, BigDecimal valor) {

    public static ItemPedidoDTO toDTO(final ItemPedido itemPedido) {
        return new ItemPedidoDTO(itemPedido.id(), itemPedido.nome(), itemPedido.quantidade(), itemPedido.valor());
    }

    public static List<ItemPedidoDTO> toDTO(List<ItemPedido> itemPedidos) {
        return itemPedidos.stream().map(ItemPedidoDTO::toDTO).toList();
    }

    public static List<ItemPedido> toDomain(List<ItemPedidoDTO> itemPedidosDTO) {
        return itemPedidosDTO.stream().map(ItemPedidoDTO::toDomain).toList();
    }
}
