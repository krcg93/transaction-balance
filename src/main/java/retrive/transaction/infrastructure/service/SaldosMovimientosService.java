package retrive.transaction.infrastructure.service;

import retrive.transaction.domain.model.saldos_movimientos.RetrieveTransactionBalance;
import retrive.transaction.domain.service.dependency.SaldosMovimientosI;
import retrive.transaction.infrastructure.client.rest.TransactionBalanceRest;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetrieveTransactionBalanceDto;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetrieveTransactionsDto;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetriveBalanceDto;
import org.modelmapper.ModelMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SaldosMovimientosService implements SaldosMovimientosI {

    @Inject
    TransactionBalanceRest transactionBalanceRest;

    @Inject
    private ModelMapper mapper;

    @Override
    public Mono<RetrieveTransactionBalance> getTransactionBalance() {
        return getTransaction()
                .zipWhen(transactions ->
                        Flux.just(transactions.getData())
                                .flatMap(data ->
                                        getBalance()
                                                .map(retriveBalance -> retrive.transaction.infrastructure.shared.converter.ConvertTransactionBalance.getMapper(transactions, retriveBalance)))
                                .collectList()
                )
                .map(tuple -> {
                    RetrieveTransactionBalanceDto retrieveTransactionBalanceDto = new RetrieveTransactionBalanceDto(tuple.getT2().get(0));
                    return mapper.map(retrieveTransactionBalanceDto, RetrieveTransactionBalance.class);
                }).onErrorResume(Mono::error);
    }

    private Mono<RetrieveTransactionsDto> getTransaction() {
        return transactionBalanceRest.getTransaction()
                .onErrorResume(Mono::error);
    }

    private Mono<RetriveBalanceDto> getBalance() {
        return transactionBalanceRest.getBalance()
                .onErrorResume(Mono::error);
    }
}
