
public class NumberOperand extends OperandCaptcha {

    int operand;

    public NumberOperand(int operand) {
        this.operand = operand;
    }

    public String toString() {
        return String.valueOf(operand);
    }
}
