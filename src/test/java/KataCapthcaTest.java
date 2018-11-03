import org.junit.Assert;
import org.junit.Test;

public class KataCapthcaTest {

    @Test
    public void firstPatternLeftOperandShouldBeOne() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 1, 1, 1);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("One", actual);
    }

    @Test
    public void firstPatternLeftOperandShouldBeFour() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 4, 1, 1);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("Four", actual);
    }

    @Test
    public void firstPatterLeftOperandShouldBeNine() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 9, 1, 1);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("Nine", actual);
    }
}
