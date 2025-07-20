package com.devtiro.quickstart.services.impl;

import com.devtiro.quickstart.services.BluePrinter;
import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.GreenPrinter;
import com.devtiro.quickstart.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl() {
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.redPrinter = new EnglishRedPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }}
