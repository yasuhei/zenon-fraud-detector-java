package br.com.zenon.zenonfrauddetector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import enums.TransactionType;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ZenonFraudDetectorApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ZenonFraudDetectorApplication.class, args);

        TransactionIngestor ingestor = new TransactionIngestor();

        List<Transaction> transactions = ingestor.ingest("data/ps.csv");

        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).toString());
        }

//        Transaction transaction1 = new Transaction(
//            1L,
//            TransactionType.PAYMENT,
//                9839.64,
//            " C1231006815",
//                170136.0,
//                160296.36,
//            "M1979787155",
//            0.0,
//            0.0,
//            0,
//            0
//        );

//        Transaction transaction2 = new Transaction(
//                743L,
//                TransactionType.CASH_OUT,
//                850002.52,
//                "C1280323807",
//                850002.52,
//                0.0,
//                "Bob",
//                6510099.11,
//                7360101.63,
//                1,
//                0
//        );

//        System.out.println(transaction1.toString());
//        System.out.println(transaction2.toString());



    }

}
