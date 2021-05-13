package com.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.Customer;
import com.main.Loan;
import com.main.PersonalLoan;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer customer = (Customer) context.getBean("cust");

		System.out.println("Customer Id :" + customer.getId() + "\n" + "Name :" + customer.getName() + "\n"
				+ "Account no :" + customer.getAccount().getAccNo() + "\n" + "Account Balance :Rs. "
				+ customer.getAccount().getBalance() + "\n" + "Loan Details :" + customer.toString());

		System.out.println("Which loan you want to pay??\n1.Educational\n2.Personal");
		int selection = scanner.nextInt();
		if (selection == 1) {
			System.out.println("Enter amount to pay Education loan");
			int payMoney = scanner.nextInt();
			if (customer.getAccount().getBalance() > payMoney) {
				double remaining_eloan = customer.getAccount().getLoan().geteLoan().getLoanAmount() - payMoney;
				System.out.println("Remaining Educational loan :" + remaining_eloan);
			} else {
				System.out.println("Insufficient amount you entered\nPlease try again later");
			}
		} else if (selection == 2) {
			System.out.println("Enter amount to pay Personal loan");
			int payMoney = scanner.nextInt();
			if (customer.getAccount().getBalance() > payMoney) {
				double remaining_ploan = customer.getAccount().getLoan().getpLoan().getLoanAmount() - payMoney;
				System.out.println("Remaining Personal loan :" + remaining_ploan);
			} else {
				System.out.println("Insufficient amount you entered\nPlease try again later");
			}
		} else {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
	

}
