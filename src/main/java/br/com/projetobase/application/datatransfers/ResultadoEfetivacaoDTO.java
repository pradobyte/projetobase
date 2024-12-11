package br.com.projetobase.application.datatransfers;


import br.com.projetobase.domain.model.ResultadoEfetivacao;

import java.util.List;

public record ResultadoEfetivacaoDTO(PedidoDTO pedidoDTO, List<ResultadoItemCheckoutDTO> itensCheckoutDTO) {

    public static ResultadoEfetivacaoDTO toDTO(ResultadoEfetivacao resultadoEfetivacao) {

        return new ResultadoEfetivacaoDTO(PedidoDTO.toDTO(resultadoEfetivacao.pedido()),
                ResultadoItemCheckoutDTO.toDTO(resultadoEfetivacao.itemCheckouts()));
    }
}
