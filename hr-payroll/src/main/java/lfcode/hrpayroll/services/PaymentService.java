package lfcode.hrpayroll.services;

import org.springframework.stereotype.Service;

import lfcode.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public static Payment getPayment(Double workerId, Integer days) {
		return new Payment("bob", 200.00, days);
		
	}

}
