package com.devtiro.quickstart;

import com.devtiro.quickstart.config.PizzaConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication implements CommandLineRunner {
	private PizzaConfig pizzaConfig;

	public QuickstartApplication(PizzaConfig pizzaConfig) {
		this.pizzaConfig = pizzaConfig;
	}
	// entry point of the application
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		System.out.printf("I want a %s crust pizza, with %s and %s sauce%n",
        pizzaConfig.getCrust(),
        pizzaConfig.getTopping(),
        pizzaConfig.getSauce()
        );
	}
}
