package br.com.ehureka.printers;

import br.com.ehureka.printers.interfaces.OnPrinterListener;

class TMT20Printer extends AbstractPrinter {

    TMT20Printer(PrinterHelper helper, OnPrinterListener listener) {
        super(helper, listener);
    }

    @Override
    public void print(byte[] data) {

    }

    @Override
    public void print(int data) {

    }

    @Override
    public void print(String text) {

    }

    @Override
    public void println(byte[] data) {

    }

    @Override
    public void println(int data) {

    }

    @Override
    public void println(String text) {

    }

    @Override
    public void println() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void reset() {

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public void setFont(int font) {

    }

    @Override
    public void emphasized(boolean activate) {

    }

    @Override
    public void doubleHeight(boolean activate) {

    }

    @Override
    public void setAlign(int align) {

    }

    @Override
    public void barcode(char[] data, int width, int height) {

    }

    @Override
    public void setPrinting(boolean value) {

    }

    @Override
    public boolean isPrinting() {
        return false;
    }

}
