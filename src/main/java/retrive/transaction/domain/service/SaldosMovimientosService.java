package retrive.transaction.domain.service;

import retrive.transaction.domain.model.saldos_movimientos.RetrieveTransactionBalance;
import retrive.transaction.domain.service.dependency.SaldosMovimientosI;
import reactor.core.publisher.Mono;


public class SaldosMovimientosService {

    private SaldosMovimientosI saldosMovimientosI;

    public SaldosMovimientosService(SaldosMovimientosI saldosMovimientosI) {
        this.saldosMovimientosI = saldosMovimientosI;
    }

    public Mono<RetrieveTransactionBalance> getTransactionBalance(){
        return  saldosMovimientosI.getTransactionBalance()
                .map(retrieveTransactionBalance ->
                        retrieveTransactionBalance)
                .onErrorResume(Mono::error);
    }
}
