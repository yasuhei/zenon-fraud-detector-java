package br.com.zenon.zenonfrauddetector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionIngestor {

    public List<Transaction> ingest(String filename) throws IOException {
        List<Transaction> transactions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine();
            String line;
            int count = 0;

            while((line = br.readLine()) != null && count < 10) {
                String[] columns = line.split(",");
                Transaction transaction = new Transaction(
                        Integer.parseInt(columns[0]),
                        columns[1],
                        Double.parseDouble(columns[2]),
                        columns[3],
                        Double.parseDouble(columns[4]),
                        Double.parseDouble(columns[5]),
                        columns[6],
                        Double.parseDouble(columns[7]),
                        Double.parseDouble(columns[8]),
                        Integer.parseInt(columns[9]),
                        Integer.parseInt(columns[10])
                        );

                transactions.add(transaction);
                count++;
            }
        }
        return transactions;
    }

}
