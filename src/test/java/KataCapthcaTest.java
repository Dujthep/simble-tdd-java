import org.junit.Assert;
import org.junit.Test;

public class KataCapthcaTest {

    final int operator = 1;
    final int rightOperand = 1;

    @Test
    public void firstPatternLeftOperandShouldBeOne() throws Exception {
        KataCaptcha capthca = new KataCaptcha(rightOperand, rightOperand, operator, rightOperand);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("One", actual);
    }

    @Test
    public void firstPatternLeftOperandShouldBeFour() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 4, operator, rightOperand);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("Four", actual);
    }

    @Test
    public void firstPatterLeftOperandShouldBeNine() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 9, operator, rightOperand);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("Nine", actual);
    }

    @Test
    public void firstPatternRightOperandShouldBeOne() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 1, operator, 1);
        String actual = capthca.getRightOperand();
        Assert.assertEquals("One",actual);
    }
}
