package retrive.transaction.infrastructure.shared.dto.saldos_movimientos;

import java.io.Serializable;

public class RetriveBalanceObjDto implements Serializable {

    private int available;
    private int availableOverdraftBalance;
    private int overdraftValue;
    private int availableOverdraftQuota;
    private int cash;
    private int unavailableClearing;
    private int receivable;
    private int blocked;
    private int unavailableStartDayclearingStartDay;
    private int cashStartDay;
    private int pockets;
    private int remittanceQuota;
    private int agreedRemittanceQuota;
    private int remittanceQuotaUsage;
    private int normalInterest;
    private int suspensionInterest;

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getAvailableOverdraftBalance() {
        return availableOverdraftBalance;
    }

    public void setAvailableOverdraftBalance(int availableOverdraftBalance) {
        this.availableOverdraftBalance = availableOverdraftBalance;
    }

    public int getOverdraftValue() {
        return overdraftValue;
    }

    public void setOverdraftValue(int overdraftValue) {
        this.overdraftValue = overdraftValue;
    }

    public int getAvailableOverdraftQuota() {
        return availableOverdraftQuota;
    }

    public void setAvailableOverdraftQuota(int availableOverdraftQuota) {
        this.availableOverdraftQuota = availableOverdraftQuota;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getUnavailableClearing() {
        return unavailableClearing;
    }

    public void setUnavailableClearing(int unavailableClearing) {
        this.unavailableClearing = unavailableClearing;
    }

    public int getReceivable() {
        return receivable;
    }

    public void setReceivable(int receivable) {
        this.receivable = receivable;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public int getUnavailableStartDayclearingStartDay() {
        return unavailableStartDayclearingStartDay;
    }

    public void setUnavailableStartDayclearingStartDay(int unavailableStartDayclearingStartDay) {
        this.unavailableStartDayclearingStartDay = unavailableStartDayclearingStartDay;
    }

    public int getCashStartDay() {
        return cashStartDay;
    }

    public void setCashStartDay(int cashStartDay) {
        this.cashStartDay = cashStartDay;
    }

    public int getPockets() {
        return pockets;
    }

    public void setPockets(int pockets) {
        this.pockets = pockets;
    }

    public int getRemittanceQuota() {
        return remittanceQuota;
    }

    public void setRemittanceQuota(int remittanceQuota) {
        this.remittanceQuota = remittanceQuota;
    }

    public int getAgreedRemittanceQuota() {
        return agreedRemittanceQuota;
    }

    public void setAgreedRemittanceQuota(int agreedRemittanceQuota) {
        this.agreedRemittanceQuota = agreedRemittanceQuota;
    }

    public int getRemittanceQuotaUsage() {
        return remittanceQuotaUsage;
    }

    public void setRemittanceQuotaUsage(int remittanceQuotaUsage) {
        this.remittanceQuotaUsage = remittanceQuotaUsage;
    }

    public int getNormalInterest() {
        return normalInterest;
    }

    public void setNormalInterest(int normalInterest) {
        this.normalInterest = normalInterest;
    }

    public int getSuspensionInterest() {
        return suspensionInterest;
    }

    public void setSuspensionInterest(int suspensionInterest) {
        this.suspensionInterest = suspensionInterest;
    }
}
