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
}
