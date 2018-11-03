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

    public OperatorCaptcha getOperator() {
        return new OperatorCaptcha(this.operator);
    }

    public String getRightOperandSecondPattern() {
        return stringNumber[rightOperand - 1];
    }

    public String concatStringFirstPattern() {
        return String.join(" ", this.getLeftOperandFirstPattern(), this.getOperator().toString(), this.getRightOperandFirstPattern());
    }

    public String concatStringSecondPattern() {
        return String.join(" ", this.getLeftOperandSecondPattern(), this.getOperator().toString(), this.getRightOperandSecondPattern());
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
