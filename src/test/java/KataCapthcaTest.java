import org.junit.Assert;
import org.junit.Test;

public class KataCapthcaTest {

    final int operatorDummy = 1;
    final int rightOperandDummy = 1;
    final int leftOperandDummy = 1;

    @Test
    public void firstPatternLeftOperandShouldBeOne() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 1, operatorDummy, rightOperandDummy);
        String actual = capthca.getLeftOperandFirstPattern();
        Assert.assertEquals("One", actual);
    }

    @Test
    public void firstPatternLeftOperandShouldBeFour() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 4, operatorDummy, rightOperandDummy);
        String actual = capthca.getLeftOperandFirstPattern();
        Assert.assertEquals("Four", actual);
    }

    @Test
    public void firstPatterLeftOperandShouldBeNine() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, 9, operatorDummy, rightOperandDummy);
        String actual = capthca.getLeftOperandFirstPattern();
        Assert.assertEquals("Nine", actual);
    }

    @Test
    public void firstPatternRightOperandShouldBe1() throws Exception {
        KataCaptcha capthca = new KataCaptcha(1, leftOperandDummy, operatorDummy, 1);
        String actual = capthca.getRightOperandFirstPattern();
        Assert.assertEquals("1", actual);
    }

    @Test
    public void firstPatternRigthOperandShouldBe5() {
        KataCaptcha capthca = new KataCaptcha(1, leftOperandDummy, operatorDummy, 5);
        String actual = capthca.getRightOperandFirstPattern();
        Assert.assertEquals("5", actual);
    }

    @Test
    public void firstPatternRightOperandShouldBe9() {
        KataCaptcha captcha = new KataCaptcha(1, leftOperandDummy, operatorDummy, 9);
        String actual = captcha.getRightOperandFirstPattern();
        Assert.assertEquals("9", actual);
    }

    @Test
    public void operator1ShouldBePlus() {
        KataCaptcha captcha = new KataCaptcha(1, leftOperandDummy, 1, rightOperandDummy);
        String actual = captcha.getOperator();
        Assert.assertEquals("+", actual);
    }

    @Test
    public void operator2ShouldBeMultiply() {
        KataCaptcha captcha = new KataCaptcha(1, leftOperandDummy, 2, rightOperandDummy);
        String actual = captcha.getOperator();
        Assert.assertEquals("*", actual);
    }

    @Test
    public void operator3ShouldBeMinus() {
        KataCaptcha captcha = new KataCaptcha(1, leftOperandDummy, 3, rightOperandDummy);
        String actual = captcha.getOperator();
        Assert.assertEquals("-", actual);
    }

    @Test
    public void secondPatternLeftShouldBe1() throws Exception {
        KataCaptcha captcha = new KataCaptcha(2, 1, operatorDummy, rightOperandDummy);
        String actual = captcha.getLeftOperandSecondPattern();
        Assert.assertEquals("1", actual);
    }

    @Test
    public void secondPatternLeftShouldBe9() throws Exception {
        KataCaptcha captcha = new KataCaptcha(2, 9, operatorDummy, rightOperandDummy);
        String actual = captcha.getLeftOperandSecondPattern();
        Assert.assertEquals("9", actual);
    }

    @Test
    public void secondPatternRightShouldBeOne() throws Exception {
        KataCaptcha captcha = new KataCaptcha(2, leftOperandDummy, operatorDummy, 1);
        String actual = captcha.getRightOperandSecondPattern();
        Assert.assertEquals("One", actual);
    }

    @Test
    public void secondPatternRightShouldBeNine() throws Exception {
        KataCaptcha captcha = new KataCaptcha(2, leftOperandDummy, operatorDummy, 9);
        String actual = captcha.getRightOperandSecondPattern();
        Assert.assertEquals("Nine", actual);
    }

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
