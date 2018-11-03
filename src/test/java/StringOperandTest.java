import org.junit.Assert;
import org.junit.Test;

public class StringOperandTest {

    @Test
    public void operandShouldBe_One() throws Exception {
        StringOperand stringOperand = new StringOperand(1);
        String actual = stringOperand.toString();
        Assert.assertEquals("One", actual);
    }

    @Test
    public void operandShouldBe_Five() throws Exception {
        StringOperand stringOperand = new StringOperand(5);
        String actual = stringOperand.toString();
        Assert.assertEquals("Five", actual);
    }
}
