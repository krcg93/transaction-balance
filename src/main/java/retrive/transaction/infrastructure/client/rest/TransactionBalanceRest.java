package retrive.transaction.infrastructure.client.rest;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import reactor.adapter.rxjava.RxJava2Adapter;
import reactor.core.publisher.Mono;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.DataDto;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetrieveTransactionsDto;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetriveBalanceDto;
import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.RetriveBalanceObjDto;

import javax.inject.Singleton;

@Singleton
public class TransactionBalanceRest {

    protected RxHttpClient client = null;

    public TransactionBalanceRest(@Client("${transaction-balance.path}") RxHttpClient client) {
        this.client = client;
    }

    @Get
    public Mono<RetrieveTransactionsDto> getTransaction() {
        HttpRequest httpRequest = HttpRequest.GET("/retrievetransactions");
        Flowable<RetrieveTransactionsDto> response = client.retrieve(httpRequest, RetrieveTransactionsDto.class);
        DataDto dao = response.blockingFirst().getData();
        Maybe<RetrieveTransactionsDto> estadoAsistenciaDtoMaybe = response.firstElement();
        Mono<RetrieveTransactionsDto> data = RxJava2Adapter.maybeToMono(estadoAsistenciaDtoMaybe);
        return data;
    }

    @Get
    public Mono<RetriveBalanceDto> getBalance() {
        HttpRequest httpRequest = HttpRequest.GET("/retrivebalance");
        Flowable<RetriveBalanceDto> response = client.retrieve(httpRequest, RetriveBalanceDto.class);
        RetriveBalanceObjDto dao = response.blockingFirst().getBalances();
        Maybe<RetriveBalanceDto> estadoAsistenciaDtoMaybe = response.firstElement();
        return RxJava2Adapter.maybeToMono(estadoAsistenciaDtoMaybe);
    }
}
