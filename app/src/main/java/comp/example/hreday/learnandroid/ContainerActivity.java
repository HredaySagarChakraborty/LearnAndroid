package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class ContainerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter9 myAdapter9;

    int images8[]={R.drawable.videoview,R.drawable.phone,
            R.drawable.battery,R.drawable.linear,
            R.drawable.mms,R.drawable.tablet,


    };
    String[]container_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        this.setTitle("Container");

        recyclerView=findViewById(R.id.recycler10);


        container_names=getResources().getStringArray(R.array.container_names);



        myAdapter9=new MyAdapter9(this,images8,container_names);
        recyclerView.setAdapter(myAdapter9);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter9.setOnItemClickListener(new MyAdapter9.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

                if(position==0){
                    Intent intent=new Intent(ContainerActivity .this,Container1Activity.class);
                    startActivity(intent);




                }

                else if(position==1){

                    Intent intent=new Intent(ContainerActivity .this,Container2Activity.class);
                    startActivity(intent);

                }

                else if(position==2){



                    Intent intent=new Intent(ContainerActivity .this,Container3Activity.class);
                    startActivity(intent);

                }


                else if(position==3){



                    Intent intent=new Intent(ContainerActivity .this,Container4Activity.class);
                    startActivity(intent);

                }


                else if(position==4){




                    Intent intent=new Intent(ContainerActivity .this,Container5Activity.class);
                    startActivity(intent);




                }



                else if(position==5){

                    Intent intent=new Intent(ContainerActivity.this,Container6Activity.class);
                    startActivity(intent);



                }




            }















        });



    }


}
