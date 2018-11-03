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

    public OperandCaptcha getLeftOperandSecondPattern() {
        return new NumberOperand(this.leftOperand);
    }

    public OperandCaptcha getLeftOperandFirstPattern() {
        return new StringOperand(this.leftOperand);
    }

    public OperandCaptcha getRightOperandFirstPattern() {
        return new NumberOperand(this.rightOperand);
    }

    public OperandCaptcha getRightOperandSecondPattern() {
        return new StringOperand(this.rightOperand);
    }

    public OperatorCaptcha getOperator() {
        return new OperatorCaptcha(this.operator);
    }

    public String concatStringFirstPattern() {
        return String.join(" ", this.getLeftOperandFirstPattern().toString(), this.getOperator().toString(), this.getRightOperandFirstPattern().toString());
    }

    public String concatStringSecondPattern() {
        return String.join(" ", this.getLeftOperandSecondPattern().toString(), this.getOperator().toString(), this.getRightOperandSecondPattern().toString());
    }

    public int calculateResult() {
        if (operator == 1) return this.leftOperand + this.rightOperand;
        else if(operator == 2) return this.leftOperand * this.rightOperand;
        else return this.leftOperand - this.rightOperand;
    }

    public String concatResult() {
        if(this.pattern == 1) {
            return this.concatStringFirstPattern() + " = "+ this.calculateResult();
        } else {
            return this.concatStringSecondPattern() + " = "+ this.calculateResult();
        }
    }
}
