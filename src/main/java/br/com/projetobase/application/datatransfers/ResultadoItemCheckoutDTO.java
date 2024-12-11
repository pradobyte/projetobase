package br.com.projetobase.application.datatransfers;

import br.com.projetobase.domain.model.ItemCheckout;
import br.com.projetobase.domain.model.checkout.ResultadoItemCheckout;

import java.math.BigDecimal;
import java.util.List;

public record ResultadoItemCheckoutDTO(BigDecimal valorResultado,
                                       BigDecimal percentualAplicaco,
                                       ItemCheckout.TipoItemCheckout tipoItemCheckout) {

    public static List<ResultadoItemCheckoutDTO> toDTO(List<ResultadoItemCheckout> resultadoItemCheckouts) {
        return resultadoItemCheckouts.stream()
                .map(resultadoItemCheckout -> new ResultadoItemCheckoutDTO(resultadoItemCheckout.valorResultado(),
                        resultadoItemCheckout.percentualAplicaco(),
                        resultadoItemCheckout.tipoItemCheckout()))
                .toList();
    }
}
