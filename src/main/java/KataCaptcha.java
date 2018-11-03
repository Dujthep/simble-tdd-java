public class KataCaptcha {

    int pattern, leftOperand, operator, rightOperand;

    String stringNumber[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String operators[] = {"+", "*", "-"};

    public KataCaptcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public static void main(String[] args) {
    }

    public String getLeftOperandSecondPattern() {
        return String.valueOf(this.leftOperand);
    }

    public String getLeftOperandFirstPattern() {
        return stringNumber[leftOperand - 1];
    }

    public String getRightOperandFirstPattern() {
        return String.valueOf(this.rightOperand);
    }

    public String getOperator() {
        return operators[operator - 1];
    }

    public String getRightOperandSecondPattern() {
        return stringNumber[rightOperand - 1];
    }
}
