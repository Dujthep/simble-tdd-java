import org.junit.Assert;
import org.junit.Test;

public class NumberOperandTest {

    @Test
    public void operandShouldBe_1() throws Exception {
        NumberOperand operand = new NumberOperand(1);
        String actual = operand.toString();
        Assert.assertEquals("1", actual);
    }

    @Test
    public void operandShouldBe_5() throws Exception {
        NumberOperand operand = new NumberOperand(5);
        String actual = operand.toString();
        Assert.assertEquals("5", actual);
    }
}
