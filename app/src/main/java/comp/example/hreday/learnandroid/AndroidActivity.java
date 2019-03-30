package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class AndroidActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter myAdapter;


    int images[]={R.drawable.android,R.drawable.phone,
            R.drawable.battery,R.drawable.call,
            R.drawable.mms,R.drawable.tablet,
            R.drawable.devices,R.drawable.email,
            R.drawable.pad,R.drawable.portrait,
            R.drawable.setup

    };
    String[]android_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        this.setTitle("Android");

        recyclerView=findViewById(R.id.recyclerViewiD);


        android_names=getResources().getStringArray(R.array.android_name);



        myAdapter=new MyAdapter(this,images,android_names);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

                if(position==0){
                    Intent intent=new Intent(AndroidActivity .this,Android1Activity.class);
                    startActivity(intent);




                }

                else if(position==1){

                    Intent intent=new Intent(AndroidActivity .this,Android2Activity.class);
                    startActivity(intent);

                }

               else if(position==2){



                    Intent intent=new Intent(AndroidActivity .this,Android3Activity.class);
                    startActivity(intent);

                }


                  else if(position==3){



                    Intent intent=new Intent(AndroidActivity .this,Android4Activity.class);
                    startActivity(intent);

                }


                  else if(position==4){




                    Intent intent=new Intent(AndroidActivity .this,Android5Activity.class);
                    startActivity(intent);




                }



                 else if(position==5){

                    Intent intent=new Intent(AndroidActivity .this,Android6Activity.class);
                    startActivity(intent);



                }


                  else if(position==6){

                    Intent intent=new Intent(AndroidActivity .this,Android7Activity.class);
                    startActivity(intent);



                }

                  else if(position==7){

                    Intent intent=new Intent(AndroidActivity .this,Android8Activity.class);
                    startActivity(intent);



                }
                  else if(position==8){

                    Intent intent=new Intent(AndroidActivity .this,Android9Activity.class);
                    startActivity(intent);



                }

                  else if(position==9){

                    Intent intent=new Intent(AndroidActivity .this,Android10Activity.class);
                    startActivity(intent);



                }


                  else if(position==10){

                    Intent intent=new Intent(AndroidActivity .this,Android11Activity.class);
                    startActivity(intent);



                }













            }
        });



    }


}
