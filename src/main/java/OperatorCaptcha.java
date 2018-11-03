public class OperatorCaptcha {

    int operator;
    String operators[] = {"+", "*", "-"};

    public OperatorCaptcha(int operator) {
        this.operator = operator;
    }

    public String toString() {
        return operators[operator - 1];
    }
}
