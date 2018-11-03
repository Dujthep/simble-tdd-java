
public class StringOperand extends OperandCaptcha {

    int operand;

    String stringNumber[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public StringOperand(int operand) {
        this.operand = operand;
    }

    public String toString() {
        return stringNumber[operand - 1];
    }
}
