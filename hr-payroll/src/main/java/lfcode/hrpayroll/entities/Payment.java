package lfcode.hrpayroll.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Payment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	public double getTotal() {
		return days * dailyIncome;


}

	public Payment(String name, Double dailyIncome, Integer days) {
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}
}