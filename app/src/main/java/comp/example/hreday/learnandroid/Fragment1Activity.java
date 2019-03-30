package comp.example.hreday.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);

        this.setTitle("Fragment1");
    }
}
