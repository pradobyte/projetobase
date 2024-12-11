package br.com.projetobase.application.adapters.controllers;

import br.com.projetobase.application.datatransfers.PedidoDTO;
import br.com.projetobase.application.datatransfers.ResultadoEfetivacaoDTO;
import br.com.projetobase.domain.model.ResultadoEfetivacao;
import br.com.projetobase.domain.ports.in.EfetivarPedidoPort;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/pedidos")
@RestController
public class EfetivacaoPedidoController {

    private EfetivarPedidoPort efetivarPedidoPort;

    public EfetivacaoPedidoController(EfetivarPedidoPort efetivarPedidoPort) {
        this.efetivarPedidoPort = efetivarPedidoPort;
    }

    @PostMapping
    public ResponseEntity<ResultadoEfetivacaoDTO> efetivarPedido(@RequestBody @Valid PedidoDTO pedidoDTO) {
        final ResultadoEfetivacao resultadoEfetivacao = efetivarPedidoPort.efetivarPedido(pedidoDTO.toDomain());
        return ResponseEntity.ok(ResultadoEfetivacaoDTO.toDTO(resultadoEfetivacao));
    }
}
