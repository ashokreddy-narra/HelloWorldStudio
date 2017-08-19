package androidstudio.learning.com.helloworldstudio;

import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by anarra on 19/08/17.
 */

public class HelloWorldActivityTest {

    @Rule
    public ActivityTestRule<HelloworldActivity> rule = new ActivityTestRule<>(HelloworldActivity.class);

    @Test
    public void testHelloworldView(){
        HelloworldActivity activity = rule.getActivity();
        TextView helloworldViewc=(TextView) activity.findViewById(R.id.helloworld);
        assertThat(helloworldViewc.getText().toString(),is("hello"));

    }

}
