import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dujthep on 3/11/2018 AD.
 */
public class OperatorTest {

    @Test
    public void operatorShouldBePlus() throws Exception {
        OperatorCaptcha operator = new OperatorCaptcha(1);
        String actual = operator.toString();
        Assert.assertEquals("+",actual);

    }

    @Test
    public void operatorShouldBeMultiply() throws Exception {
        OperatorCaptcha operator = new OperatorCaptcha(2);
        String actual = operator.toString();
        Assert.assertEquals("*",actual);
    }

    @Test
    public void operatorShouldBeMinus() throws Exception {
        OperatorCaptcha operator = new OperatorCaptcha(3);
        String actual = operator.toString();
        Assert.assertEquals("-",actual);

    }
}
