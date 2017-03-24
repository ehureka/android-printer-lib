package br.com.ehureka.printers;

import br.com.ehureka.printers.interfaces.IPrinter;
import br.com.ehureka.printers.interfaces.OnPrinterListener;

abstract class AbstractPrinter implements IPrinter {

    final PrinterHelper mBTHelper;
    final OnPrinterListener mListener;

    AbstractPrinter(PrinterHelper helper, OnPrinterListener listener) {
        this.mBTHelper = helper;
        this.mListener = listener;
    }

}
