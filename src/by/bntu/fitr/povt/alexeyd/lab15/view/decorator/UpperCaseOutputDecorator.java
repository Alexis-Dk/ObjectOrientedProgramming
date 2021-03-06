package by.bntu.fitr.povt.alexeyd.lab15.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab15.view.Printer;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class UpperCaseOutputDecorator extends OutputDecorator {

    Printer printer;

    public UpperCaseOutputDecorator(Printer printer) {
        this.printer = printer;
    }

    public void write(String msg) {
        String decoratedMsg;
        decoratedMsg = msg.replaceAll(NEW_LINE_SYMBOL, EMPTY_STRING);
        decoratedMsg = decoratedMsg.replaceAll(CARRITAGR_RETURN_SYMBOL, EMPTY_STRING) + NEW_LINE_SYMBOL;
        printer.write(decoratedMsg.toUpperCase());
    }
}
