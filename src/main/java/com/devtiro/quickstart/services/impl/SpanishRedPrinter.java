package com.devtiro.quickstart.services.impl;

import com.devtiro.quickstart.services.RedPrinter;

// This class is not annotated with @Service, so Spring's component scanning will ignore it.
// In contrast, EnglishRedPrinter is annotated with @Service,
// so Spring will detect it, register it as a bean, and inject it wherever it's needed —
// in this case, into the ColourPrinterImpl constructor.
public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "rojo";
    }
}
