public class OperandFactory {

    public static OperandCaptcha getLeft(int pattern, int value) {
        if(pattern == 2) return new NumberOperand(value);
        return new StringOperand(value);
    }

    public static OperandCaptcha getRight(int pattern, int value) {
        if(pattern == 2) return new StringOperand(value);
        return new NumberOperand(value);
    }
}
