package retrive.transaction.infrastructure.shared.dto.saldos_movimientos;

import java.util.List;

public class DataDto {
     private int responseSize;
     private Boolean flagMoreRecords;
     private AccountDto account;
     private List<TransactionDto> transaction;
     private CustomerDto customer;
     private OfficeDto office;

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
          return account;
     }

     public void setAccount(AccountDto accountDto) {
          this.account = accountDto;
     }

     public List<TransactionDto> getTransaction() {
          return transaction;
     }

     public void setTransaction(List<TransactionDto> transactionDto) {
          this.transaction = transactionDto;
     }

     public CustomerDto getCustomer() {
          return customer;
     }

     public void setCustomer(CustomerDto customerDto) {
          this.customer = customerDto;
     }

     public OfficeDto getOffice() {
          return office;
     }

     public void setOffice(OfficeDto officeDto) {
          this.office = officeDto;
     }
}
