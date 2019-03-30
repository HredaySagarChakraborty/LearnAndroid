package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class StorageActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter10 myAdapter10;

    int images9[]={R.drawable.ic_action_android_sqlite,R.drawable.share,
            R.drawable.ic_action_android_storage,R.drawable.ic_action_android_storage,
            R.drawable.ic_action_android_storage,R.drawable.ic_action_android_sqlite,


    };
    String[]storage_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
        this.setTitle("Storage");

        recyclerView=findViewById(R.id.recycler10);


        storage_names=getResources().getStringArray(R.array.storage_names);



        myAdapter10=new MyAdapter10(this,images9,storage_names);
        recyclerView.setAdapter(myAdapter10);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter10.setOnItemClickListener(new MyAdapter10.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

                if(position==0){
                    Intent intent=new Intent(StorageActivity .this,Storage1Activity.class);
                    startActivity(intent);




                }

                else if(position==1){

                    Intent intent=new Intent(StorageActivity .this,Storage2Activity.class);
                    startActivity(intent);

                }

                else if(position==2){



                    Intent intent=new Intent(StorageActivity .this,Storage3Activity.class);
                    startActivity(intent);

                }


                else if(position==3){



                    Intent intent=new Intent(StorageActivity .this,Storage4Activity.class);
                    startActivity(intent);

                }


                else if(position==4){




                    Intent intent=new Intent(StorageActivity .this,Storage5Activity.class);
                    startActivity(intent);




                }



                else if(position==5){

                    Intent intent=new Intent(StorageActivity.this,Storage6Activity.class);
                    startActivity(intent);



                }




            }















        });



    }


}
