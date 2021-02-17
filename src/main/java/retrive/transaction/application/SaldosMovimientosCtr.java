package retrive.transaction.application;

import retrive.transaction.domain.service.SaldosMovimientosService;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetrieveTransactionBalanceDto;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.modelmapper.ModelMapper;
import reactor.core.publisher.Mono;

import javax.inject.Inject;

@Controller("/balance-transaction")
public class SaldosMovimientosCtr {

    @Inject
    private ModelMapper mapper;

    @Inject
    private SaldosMovimientosService saldosMovimientosService;

    @Get(value = "balance-transaction", produces = MediaType.APPLICATION_JSON)
    public Mono<RetrieveTransactionBalanceDto> getTransactionBalance() {
        return saldosMovimientosService.getTransactionBalance()
                .map(contrato -> mapper.map(contrato, RetrieveTransactionBalanceDto.class));
    }
}
