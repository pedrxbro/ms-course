package br.com.univali.hrpayroll.services;

import br.com.univali.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Pedro", 200.0, days);
    }
}
