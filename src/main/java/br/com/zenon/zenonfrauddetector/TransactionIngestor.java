package br.com.zenon.zenonfrauddetector;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionIngestor {

    public List<Transaction> ingest(String fileName) throws IOException {

        List<Transaction> transactions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            // Ignora o cabeçalho
            reader.readLine();

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null && count < 1000) {

                try {

                    String[] columns = line.split(",");

                    Transaction transaction = new Transaction(
                            Long.parseLong(columns[0]),
                            columns[1],
                            Double.parseDouble(columns[2]),
                            columns[3],
                            Double.parseDouble(columns[4]),
                            Double.parseDouble(columns[5]),
                            columns[6],
                            Double.parseDouble(columns[7]),
                            Double.parseDouble(columns[8]),
                            Double.parseDouble(columns[9]),
                            Double.parseDouble(columns[10]));

                    transactions.add(transaction);
                    count++;

                } catch (Exception e) {

                    System.err.println(
                            "Erro " + line + " " + e.getMessage()
                    );
                }
            }
        }

        return transactions;
    }
}
