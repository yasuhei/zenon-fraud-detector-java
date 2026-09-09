package br.com.zenon.zenonfrauddetector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ZenonFraudDetectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZenonFraudDetectorApplication.class, args);

        Transaction transaction1 = new Transaction(
            1L,
            Transaction.TransactionType.PAYMENT,
                9839.64,
            " C1231006815",
                170136.0,
                160296.36,
            "M1979787155",
            0.0,
            0.0,
            0,
            0
        );

        Transaction transaction2 = new Transaction(
                743L,
                Transaction.TransactionType.CASH_OUT,
                850002.52,
                "C1280323807",
                850002.52,
                0.0,
                "Bob",
                6510099.11,
                7360101.63,
                1,
                0
        );

        System.out.println(transaction1.toString());
        System.out.println(transaction2.toString());



    }

}
