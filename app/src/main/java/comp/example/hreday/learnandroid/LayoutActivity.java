package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter3 myAdapter3;

    int images2[]={R.drawable.videoview,R.drawable.phone,
            R.drawable.battery,R.drawable.linear,
            R.drawable.mms,R.drawable.tablet,
            R.drawable.relative,R.drawable.table,
            R.drawable.frame1

    };
    String[]layout_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        this.setTitle("Layout");

        recyclerView=findViewById(R.id.recyclerview3Id);


        layout_names=getResources().getStringArray(R.array.layout_names);



        myAdapter3=new MyAdapter3(this,images2,layout_names);
        recyclerView.setAdapter(myAdapter3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter3.setOnItemClickListener(new MyAdapter3.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

                if(position==0){
                    Intent intent=new Intent(LayoutActivity .this,Layout1Activity.class);
                    startActivity(intent);




                }

                else if(position==1){

                    Intent intent=new Intent(LayoutActivity .this,Layout2Activity.class);
                    startActivity(intent);

                }

                else if(position==2){



                    Intent intent=new Intent(LayoutActivity .this,Layout3Activity.class);
                    startActivity(intent);

                }


                else if(position==3){



                    Intent intent=new Intent(LayoutActivity .this,Layout4Activity.class);
                    startActivity(intent);

                }


                else if(position==4){




                    Intent intent=new Intent(LayoutActivity .this,Layout5Activity.class);
                    startActivity(intent);




                }



                else if(position==5){

                    Intent intent=new Intent(LayoutActivity.this,Layout6Activity.class);
                    startActivity(intent);



                }




                }















        });



    }


}
