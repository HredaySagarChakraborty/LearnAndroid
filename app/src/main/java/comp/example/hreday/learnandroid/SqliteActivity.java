package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class SqliteActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter11 myAdapter11;

    int images10[]={R.drawable.ic_action_android_sqlite,R.drawable.read,
            R.drawable.read,R.drawable.setup,
            R.drawable.cancel


    };
    String[]sqlite_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        this.setTitle("Sqlite");

        recyclerView=findViewById(R.id.recycler12);


        sqlite_names=getResources().getStringArray(R.array.sqlite_names);



        myAdapter11=new MyAdapter11(this,images10,sqlite_names);
        recyclerView.setAdapter(myAdapter11);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter11.setOnItemClickListener(new MyAdapter11.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

                if(position==0){
                    Intent intent=new Intent(SqliteActivity .this,Sqlite1Activity.class);
                    startActivity(intent);




                }

                else if(position==1){

                    Intent intent=new Intent(SqliteActivity .this,Sqlite2Activity.class);
                    startActivity(intent);

                }

                else if(position==2){



                    Intent intent=new Intent(SqliteActivity .this,Sqlite3Activity.class);
                    startActivity(intent);

                }


                else if(position==3){



                    Intent intent=new Intent(SqliteActivity .this,Sqlite4Activity.class);
                    startActivity(intent);

                }


                else if(position==4){




                    Intent intent=new Intent(SqliteActivity .this,Sqlite5Activity.class);
                    startActivity(intent);




                }







            }















        });



    }


}
