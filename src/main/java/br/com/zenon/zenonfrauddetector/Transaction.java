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
    public Transaction {
        if(step <= 0) {
            throw new IllegalArgumentException("O step deve ser maior ou igual a 1.");
        }
        if(type ==  null) {
            throw new IllegalArgumentException("type não pode ser nulo.");
        }
        if(amount < 0) {
            throw new IllegalArgumentException("o valor não pode ser negativo.");
        }

        if(nameOrig == null) {
            throw new IllegalArgumentException("O nome nao pode ser nulo.");
        }

        if(oldbalanceOrg < 0) {
            throw new IllegalArgumentException("O balanco nao pode ser negativo.");
        }
        if(newbalanceOrig < 0) {
            throw new IllegalArgumentException("O balanco nao pode ser negativo.");
        }

        if(nameDest == null) {
            throw new IllegalArgumentException("O nome do destinatario nao pode ser nulo.");
        }
        if(oldbalanceDest < 0) {
            throw new IllegalArgumentException("O oldBalance nao pode ser negativo.");
        }
        if(newbalanceDest < 0) {
            throw new IllegalArgumentException("O newBalance nao pode ser negativo.");
        }

        if(isFraud < 0) {
            throw new IllegalArgumentException("O valor nao pode ser negativo.");
        }
        if (isFlaggedFraud < 0) { throw new IllegalArgumentException("isFlaggedFraud não pode ser negativo");
        }

        if (!type.equals("PAYMENT") && !type.equals("TRANSFER") && !type.equals("CASH_OUT") && !type.equals("DEBIT") && !type.equals("CASH_IN")) {
            throw new IllegalArgumentException("Tipo de transação inválido: " + type); }
    }


}
