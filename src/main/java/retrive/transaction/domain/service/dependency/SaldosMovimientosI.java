package retrive.transaction.domain.service.dependency;

import retrive.transaction.domain.model.saldos_movimientos.RetrieveTransactionBalance;
import reactor.core.publisher.Mono;


public interface SaldosMovimientosI {

    Mono<RetrieveTransactionBalance> getTransactionBalance();

}
