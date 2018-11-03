import org.junit.Assert;
import org.junit.Test;

public class KataCapthcaTest {

    @Test
    public void leftOperandPlusRightOperandShouldBe2() throws Exception {
        KataCaptcha captcha = new KataCaptcha(1,1,1,1);
        int actual = captcha.calculateResult();
        Assert.assertEquals(2,actual);
    }

    @Test
    public void resultShouldBeOnePlus1() throws Exception {
        KataCaptcha captcha = new KataCaptcha(1 ,1,1,1);
        Assert.assertEquals("One + 1 = 2", captcha.concatString());
    }
}
