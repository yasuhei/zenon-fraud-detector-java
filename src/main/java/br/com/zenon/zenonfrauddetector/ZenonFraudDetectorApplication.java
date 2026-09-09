package br.com.zenon.zenonfrauddetector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ZenonFraudDetectorApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ZenonFraudDetectorApplication.class, args);

        TransactionIngestor ingestor = new TransactionIngestor();

        List<Transaction> transactions = ingestor.ingest("data/paysim.csv");

        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).toString());
        }

    }

}
