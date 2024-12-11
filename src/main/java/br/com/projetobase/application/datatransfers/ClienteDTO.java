package br.com.projetobase.application.datatransfers;

import br.com.projetobase.domain.model.cliente.Endereco;
import br.com.projetobase.domain.model.pedido.Cliente;

public record ClienteDTO(Long id, String nome, Endereco endereco, String telefone) {

    public static ClienteDTO toDTO(final Cliente cliente) {
        return new ClienteDTO(cliente.id(), cliente.nome(), cliente.endereco(), cliente.telefone());
    }

    public Cliente toDomain() {
        return new Cliente(id, nome, endereco, telefone);
    }
}
