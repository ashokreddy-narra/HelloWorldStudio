package androidstudio.learning.com.helloworldstudio;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by anarra on 19/08/17.
 */

public class UtilityTest {

    @Test
    public void test_Sum(){
        assertTrue(Utility.getSum(2,2)==4);
    }
}
