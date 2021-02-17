package retrive.transaction.infrastructure.shared.converter;

import retrive.transaction.infrastructure.shared.dto.saldos_movimientos.*;


public class ConvertTransactionBalance {
    public static RetrieveTransactionBalanceDto getMapper(RetrieveTransactionsDto retrieveTransactionsDto, RetriveBalanceDto retriveBalanceObjDto)
    {
        RetrieveTransactionBalanceDto retrieveTransactionBalanceDto = new RetrieveTransactionBalanceDto();
        retrieveTransactionBalanceDto.setResponseSize(retrieveTransactionsDto.getData().getResponseSize());
        retrieveTransactionBalanceDto.setFlagMoreRecords(retrieveTransactionsDto.getData().getFlagMoreRecords());
        retrieveTransactionBalanceDto.setAccount(retrieveTransactionsDto.getData().getAccount());
        retrieveTransactionBalanceDto.setTransaction(retrieveTransactionsDto.getData().getTransaction());
        retrieveTransactionBalanceDto.setRetriveBalance(retriveBalanceObjDto.getBalances());
        retrieveTransactionBalanceDto.setCustomer(retrieveTransactionsDto.getData().getCustomer());
        retrieveTransactionBalanceDto.setOffice(retrieveTransactionsDto.getData().getOffice());
        retrieveTransactionBalanceDto.setStatus(retrieveTransactionsDto.getStatus());

        return retrieveTransactionBalanceDto;
    }
}
