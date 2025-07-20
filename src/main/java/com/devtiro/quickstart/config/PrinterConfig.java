package com.devtiro.quickstart.config;

import com.devtiro.quickstart.services.BluePrinter;
import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.GreenPrinter;
import com.devtiro.quickstart.services.RedPrinter;
import com.devtiro.quickstart.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }
}
