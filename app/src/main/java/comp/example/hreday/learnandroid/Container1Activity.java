package comp.example.hreday.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Container1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container1);
        this.setTitle("Container1");
    }
}
