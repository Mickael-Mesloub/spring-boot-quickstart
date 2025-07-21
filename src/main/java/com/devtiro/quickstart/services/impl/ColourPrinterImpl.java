package com.devtiro.quickstart.services.impl;

import com.devtiro.quickstart.services.BluePrinter;
import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.GreenPrinter;
import com.devtiro.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    // This constructor requires three beans (RedPrinter, GreenPrinter, BluePrinter).
    // When Spring instantiates this class, it will inject them —
    // as long as these dependencies have been detected and registered as beans during component scanning.
    public ColourPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
