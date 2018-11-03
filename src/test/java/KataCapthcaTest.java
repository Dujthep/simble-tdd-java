import org.junit.Assert;
import org.junit.Test;

public class KataCapthcaTest {

    @Test
    public void firstPatternShouldBeOneplus1() throws Exception {
        KataCaptcha captcha = new KataCaptcha(1, 1, 1, 1);
        String actual = captcha.concatStringFirstPattern();
        Assert.assertEquals("One + 1", actual);
    }

    @Test
    public void firstPatternShouldBeNineMinus9() throws Exception {
        KataCaptcha captcha = new KataCaptcha(1, 9, 3, 9);
        String actual = captcha.concatStringFirstPattern();
        Assert.assertEquals("Nine - 9", actual);
    }

    @Test
    public void secondPatternShould1MultipleOne() throws Exception {
        KataCaptcha captcha = new KataCaptcha(2, 1, 2, 1);
        String actual = captcha.concatStringSecondPattern();
        Assert.assertEquals("1 * One", actual);
    }

    @Test
    public void secondPaaternShouldBe5PlusFive() throws Exception {
        KataCaptcha captcha = new KataCaptcha(2, 5, 1, 5);
        String actual = captcha.concatStringSecondPattern();
        Assert.assertEquals("5 + Five", actual);
    }

    @Test
    public void leftOperandPlusRightOperandShouldBe2() throws Exception {
        KataCaptcha captcha = new KataCaptcha(1,1,1,1);
        int actual = captcha.calculateResult();
        Assert.assertEquals(2,actual);
    }

    @Test
    public void QuestionOne() throws Exception {
        KataCaptcha captcha = new KataCaptcha(1,1,1,1);
        String actual = captcha.concatResult();
        Assert.assertEquals("One + 1 = 2", actual);
    }
}
