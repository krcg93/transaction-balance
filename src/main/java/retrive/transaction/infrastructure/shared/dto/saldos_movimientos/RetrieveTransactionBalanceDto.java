package retrive.transaction.infrastructure.shared.dto.saldos_movimientos;

import java.util.List;

public class RetrieveTransactionBalanceDto {
    private int responseSize;
    private Boolean flagMoreRecords;
    private AccountDto accountDto;
    private List<TransactionDto> transactionDto;
    private RetriveBalanceObjDto retriveBalanceObjDto;
    private CustomerDto customerDto;
    private OfficeDto officeDto;
    private StatusDto statusDto;

    public RetrieveTransactionBalanceDto(){

    }
    public RetrieveTransactionBalanceDto(RetrieveTransactionBalanceDto retrieveTransactionBalanceDto){
        this.responseSize = retrieveTransactionBalanceDto.getResponseSize();
        this.flagMoreRecords = retrieveTransactionBalanceDto.getFlagMoreRecords();
        this.accountDto = retrieveTransactionBalanceDto.getAccount();
        this.transactionDto = retrieveTransactionBalanceDto.getTransaction();
        this.retriveBalanceObjDto = retrieveTransactionBalanceDto.getRetriveBalance();
        this.customerDto = retrieveTransactionBalanceDto.getCustomer();
        this.officeDto = retrieveTransactionBalanceDto.getOffice();
        this.statusDto = retrieveTransactionBalanceDto.getStatus();
    }

    public int getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(int responseSize) {
        this.responseSize = responseSize;
    }

    public Boolean getFlagMoreRecords() {
        return flagMoreRecords;
    }

    public void setFlagMoreRecords(Boolean flagMoreRecords) {
        this.flagMoreRecords = flagMoreRecords;
    }

    public AccountDto getAccount() {
        return accountDto;
    }

    public void setAccount(AccountDto accountDto) {
        this.accountDto = accountDto;
    }

    public List<TransactionDto> getTransaction() {
        return transactionDto;
    }

    public void setTransaction(List<TransactionDto> transactionDto) {
        this.transactionDto = transactionDto;
    }

    public RetriveBalanceObjDto getRetriveBalance() {
        return retriveBalanceObjDto;
    }

    public void setRetriveBalance(RetriveBalanceObjDto retriveBalanceObjDto) {
        this.retriveBalanceObjDto = retriveBalanceObjDto;
    }

    public CustomerDto getCustomer() {
        return customerDto;
    }

    public void setCustomer(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    public OfficeDto getOffice() {
        return officeDto;
    }

    public void setOffice(OfficeDto officeDto) {
        this.officeDto = officeDto;
    }

    public StatusDto getStatus() {
        return statusDto;
    }

    public void setStatus(StatusDto statusDto) {
        this.statusDto = statusDto;
    }
}
