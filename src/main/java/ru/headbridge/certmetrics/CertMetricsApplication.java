package ru.headbridge.certmetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CertMetricsApplication {

    // http://localhost:8080/actuator/metrics/certificate.daysLeft
    public static void main(String[] args) {
        SpringApplication.run(CertMetricsApplication.class, args);
    }
}