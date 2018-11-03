import org.junit.Assert;
import org.junit.Test;

public class OperandFactoryTest {

    @Test
    public void pattern1LeftShouldBeInstanOfStringOperand() throws Exception {
        Assert.assertTrue(OperandFactory.getLeft(1, 1) instanceof StringOperand);
    }

    @Test
    public void pattern1RightShouldBeInstanOfStringOperand() throws Exception {
        Assert.assertTrue(OperandFactory.getRight(1, 1) instanceof NumberOperand);
    }

    @Test
    public void pattern2LeftShouldBeInstanOfStringOperand() throws Exception {
        Assert.assertTrue(OperandFactory.getLeft(2, 1) instanceof NumberOperand);
    }

    @Test
    public void pattern2RightShouldBeInstanOfStringOperand() throws Exception {
        Assert.assertTrue(OperandFactory.getRight(2, 1) instanceof StringOperand);
    }
}
