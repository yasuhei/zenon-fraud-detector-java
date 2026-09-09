package br.com.zenon.zenonfrauddetector;

public record Transaction(
    long step,
    TransactionType type,
    double amount,
    String nameOrig,
    double oldbalanceOrg,
    double newbalanceOrig,
    String nameDest,
    double oldbalanceDest,
    double newbalanceDest,
    double isFraud,
    double isFlaggedFraud
) {

    public enum TransactionType {
        PAYMENT,
        TRANSFER,
        CASH_OUT,
        DEBIT,
        CASH_IN
    }

}
