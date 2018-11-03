public class KataCaptcha {

    int pattern, leftOperand, operator, rightOperand;

    String stringNumber[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public KataCaptcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public static void main(String[] args) {
    }

    public String getLeftOperand() {
        return stringNumber[leftOperand - 1];
    }

}
