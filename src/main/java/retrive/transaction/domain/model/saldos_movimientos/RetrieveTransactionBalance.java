package retrive.transaction.domain.model.saldos_movimientos;

import java.io.Serializable;
import java.util.List;

public class RetrieveTransactionBalance implements Serializable {

    private int responseSize;
    private Boolean flagMoreRecords;
    private Account account;
    private List<Transaction> transaction;
    private RetriveBalance retriveBalance;
    private Customer customer;
    private Office office;
    private Status status;

    public RetrieveTransactionBalance(){}

}