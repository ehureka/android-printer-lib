package br.com.ehureka.printers;

public enum PrinterEnum {
    CMP_10BT("CITIZEN")
    , TM_T20("TM-T20")
    ;

    private String label;

    PrinterEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
