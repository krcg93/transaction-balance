package retrive.transaction.infrastructure.shared;

import retrive.transaction.domain.service.SaldosMovimientosService;
import io.micronaut.context.annotation.Factory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Factory
public class AppContext {

    @Inject
    retrive.transaction.infrastructure.service.SaldosMovimientosService saldosMovimientosRepository;

    @Singleton
    SaldosMovimientosService saldosMovimientosService(){
        return new SaldosMovimientosService(this.saldosMovimientosRepository);
    }
}