package com.main;

public class Loan {

	PersonalLoan pLoan;
	EducationalLoan eLoan;

	public PersonalLoan getpLoan() {
		return pLoan;
	}

	public void setpLoan(PersonalLoan pLoan) {
		this.pLoan = pLoan;
	}

	public EducationalLoan geteLoan() {
		return eLoan;
	}

	public void seteLoan(EducationalLoan eLoan) {
		this.eLoan = eLoan;
	}

	@Override
	public String toString() {
		return  pLoan.toString() + ",\n" + eLoan.toString();
	}
	

}
