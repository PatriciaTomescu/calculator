package Calculator;

public enum Operator {
    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARANTHESIS("(", ")");

    private String sign;
    private String startSign;
    private String endSign;

    //constructorii in enum sunt by default private

    Operator(String sign) {
        this.sign = sign;
    }

    Operator(String startSign, String endSign) {
        this.startSign = startSign;
        this.endSign = endSign;
    }

    public String getSign() {
        return sign;
    }

    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }

    public static Operator[] getValues() {
        return new Operator[] {
                PARANTHESIS, ADD, SUBTRACT, MULTIPLY, DIVIDE
        };
    }
}
