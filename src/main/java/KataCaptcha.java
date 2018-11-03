public class KataCaptcha {

    private int pattern, leftOperand, operator, rightOperand;

    public KataCaptcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public static void main(String[] args) {
    }

    public OperandCaptcha getLeft() {
        return OperandFactory.getLeft(this.pattern, this.leftOperand);
    }

    public OperandCaptcha getRight() {
        return OperandFactory.getRight(this.pattern, this.rightOperand);
    }

    public OperatorCaptcha getOperator() {
        return new OperatorCaptcha(this.operator);
    }

    public int calculateResult() {
        if (operator == 1) return this.leftOperand + this.rightOperand;
        else if (operator == 2) return this.leftOperand * this.rightOperand;
        else return this.leftOperand - this.rightOperand;
    }

    public String concatString() {
        return String.join(" ", this.getLeft().toString(), this.getOperator().toString(), this.getRight().toString());
    }
}
