package com.devtiro.quickstart;

import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.impl.ColourPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication implements CommandLineRunner {
	// entry point of the application
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final ColourPrinter colourPrinter = new ColourPrinterImpl();
		System.out.println(colourPrinter.print());
	}
}
