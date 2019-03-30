package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter8 myAdapter8;

    int images7[]={R.drawable.menu,R.drawable.op,
            R.drawable.option,R.drawable.pop,


    };
    String[]menu_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.setTitle("Menu");

        recyclerView=findViewById(R.id.recycler9);


        menu_names=getResources().getStringArray(R.array.menu_names);



        myAdapter8=new MyAdapter8(this,images7,menu_names);
        recyclerView.setAdapter(myAdapter8);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter8.setOnItemClickListener(new MyAdapter8.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

                if(position==0){
                    Intent intent=new Intent(MenuActivity .this,Menu1Activity.class);
                    startActivity(intent);




                }

                else if(position==1){

                    Intent intent=new Intent(MenuActivity .this,Menu2Activity.class);
                    startActivity(intent);

                }

                else if(position==2){



                    Intent intent=new Intent(MenuActivity .this,Menu3Activity.class);
                    startActivity(intent);

                }


                else if(position==3){



                    Intent intent=new Intent(MenuActivity .this,Menu4Activity.class);
                    startActivity(intent);

                }





            }















        });



    }


}
