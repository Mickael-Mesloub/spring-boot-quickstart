package com.devtiro.quickstart.services.impl;

import com.devtiro.quickstart.services.GreenPrinter;
import org.springframework.stereotype.Service;

// This class is annotated with @Service, so Spring's component scanning will detect it,
// register it as a bean, and inject it wherever it's needed — in this case, into the ColourPrinterImpl constructor.
@Service
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "verde";
    }
}
