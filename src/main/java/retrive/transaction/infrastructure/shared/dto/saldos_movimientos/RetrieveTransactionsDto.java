package retrive.transaction.infrastructure.shared.dto.saldos_movimientos;

public class RetrieveTransactionsDto {
    private DataDto data;
    private StatusDto status;

    public DataDto getData() {
        return data;
    }

    public void setData(DataDto data) {
        this.data = data;
    }

    public StatusDto getStatus() {
        return status;
    }

    public void setStatus(StatusDto status) {
        this.status = status;
    }
}
