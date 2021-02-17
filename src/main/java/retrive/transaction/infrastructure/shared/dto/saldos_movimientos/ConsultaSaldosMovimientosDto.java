package retrive.transaction.infrastructure.shared.dto.saldos_movimientos;

import java.io.Serializable;

public class ConsultaSaldosMovimientosDto implements Serializable {
    private String idExpendiente;

    public String getIdExpendiente() {
        return idExpendiente;
    }

    public void setIdExpendiente(String idExpendiente) {
        this.idExpendiente = idExpendiente;
    }
}
