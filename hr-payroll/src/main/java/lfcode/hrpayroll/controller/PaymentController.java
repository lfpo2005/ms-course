package lfcode.hrpayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lfcode.hrpayroll.entities.Payment;
import lfcode.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Double workerId, @PathVariable Integer days){
		
		Payment payment = PaymentService.getPayment(workerId, days);
		
		return ResponseEntity.ok(payment);
	}

	

	}


