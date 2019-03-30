package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter7 myAdapter7;

    int images6[]={R.drawable.sagar,R.drawable.hreday,

    };
    String[]service_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        this.setTitle("Service");

        recyclerView=findViewById(R.id.recyclerView7);


        service_names=getResources().getStringArray(R.array.service_names);



        myAdapter7=new MyAdapter7(this,images6,service_names);
        recyclerView.setAdapter(myAdapter7);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter7.setOnItemClickListener(new MyAdapter7.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(ServiceActivity.this, Service1Activity.class);
                    startActivity(intent);


                } else if (position == 1) {

                    Intent intent = new Intent(ServiceActivity.this, Service2Activity.class);
                    startActivity(intent);

                }


            }

        });



    }


}
