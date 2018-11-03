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
    public void firstPatternLeftOperandShouldBeTwo() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 2, 1, 1);
        String actual = capthca.getLeftOperand();
        Assert.assertEquals("Two", actual);
    }
}
