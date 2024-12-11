package java.br.com.projetobase.domain.model;

import br.com.projetobase.domain.model.Canal;

import java.util.List;
import java.util.UUID;

public record MensagemCanal(UUID idPedido, List<Canal.Tipo> canais, String mensagem) {
}
