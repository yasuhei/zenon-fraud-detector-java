package br.com.zenon.zenonfrauddetector;

public record Transaction(
        long step,
        String type,
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


}
