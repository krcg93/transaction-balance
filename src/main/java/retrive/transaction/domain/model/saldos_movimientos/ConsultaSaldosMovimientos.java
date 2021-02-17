package retrive.transaction.domain.model.saldos_movimientos;

import retrive.transaction.domain.exception.Validate;
import reactor.core.publisher.Mono;

import java.io.Serializable;

public class ConsultaSaldosMovimientos implements Serializable {
    private String numeroSaldo;
    private String numeroMovimiento;

    public ConsultaSaldosMovimientos(){}

    private ConsultaSaldosMovimientos(String numeroSaldo, String numeroMovimiento) {
        this.numeroSaldo = numeroSaldo;
        this.numeroMovimiento = numeroMovimiento;

    }

    public static Mono<ConsultaSaldosMovimientos> create(String numeroExpediente, String descripcionMotivoActualizacion){
        ConsultaSaldosMovimientos cancelarAsistencia =new ConsultaSaldosMovimientos(numeroExpediente, descripcionMotivoActualizacion);
        return cancelarAsistencia.validate().then(Mono.just(cancelarAsistencia));
    }

    public Mono<Void> validate(){
        return Validate
                .nullOrEmptyValidate(numeroSaldo,"numeroSaldo")
                .switchIfEmpty(Validate.nullOrEmptyValidate(numeroMovimiento,"numeroMovimiento"));
    }
    
}