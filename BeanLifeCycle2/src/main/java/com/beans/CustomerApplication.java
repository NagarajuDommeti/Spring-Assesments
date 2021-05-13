package com.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(MyConfig.class);
		context.refresh();
		
		Customer cb1=context.getBean(Customer.class);
		System.out.println(cb1.hashCode());
		cb1.setCustId(100);
		cb1.setCusName("Nagaraj");
		System.out.println(cb1.toString());
		
		context.close();

	}

}
