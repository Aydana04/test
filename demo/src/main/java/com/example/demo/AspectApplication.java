package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AspectApplication.class, args);

		// Получение бина MainClass через Spring контейнер
		MainClass mainClass = context.getBean(MainClass.class);

		// Вызов методов
		mainClass.login("JohnDoe");
		int sum = mainClass.calculateSum(10, 5);
		System.out.println("Result: " + sum);
		mainClass.printMessage("Hello, world!");
	}
}
