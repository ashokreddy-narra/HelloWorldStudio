package androidstudio.learning.com.helloworldstudio;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by anarra on 19/08/17.
 */

public class HelloworldActivity extends Activity {


    TextView helloworld;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld);
        helloworld = (TextView) findViewById(R.id.helloworld);
    }

    public void onClick(View view){
        helloworld.setText("Clicked");
    }
}
