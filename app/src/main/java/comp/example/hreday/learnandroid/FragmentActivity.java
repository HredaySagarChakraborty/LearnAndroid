package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class FragmentActivity extends AppCompatActivity {
    private RecyclerView recyclerView6;
    MyAdapter6 myAdapter6;

    int images5[] = {R.drawable.activity_lifecycle, R.drawable.intent,

    R.drawable.note,R.drawable.intent_resaolution,
    R.drawable.ppp,R.drawable.red



};
    String[]fragment_names;


@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        this.setTitle("Fragment");

        recyclerView6=findViewById(R.id.recyclerView5);


        fragment_names=getResources().getStringArray(R.array.fragment_names);


        myAdapter6=new MyAdapter6(this,images5,fragment_names);
        recyclerView6.setAdapter(myAdapter6);
        recyclerView6.setLayoutManager(new LinearLayoutManager(this));


        myAdapter6.setOnItemClickListener(new MyAdapter6.ClickListener(){
@Override
public void onItemClick(int position,View v){


        Toast.makeText(getApplicationContext(),"onclick:"+position,Toast.LENGTH_LONG).show();

        if(position==0){


        Intent intent=new Intent(FragmentActivity.this,Fragment1Activity.class);
        startActivity(intent);


        }else if(position==1){

        Intent intent=new Intent(FragmentActivity.this,Fragment2Activity.class);
        startActivity(intent);

        }

        else if(position==2){

        Intent intent=new Intent(FragmentActivity.this,Fragment3Activity.class);
        startActivity(intent);


        }


        else if(position==3){

        Intent intent=new Intent(FragmentActivity.this,Fragment4Activity.class);
        startActivity(intent);


        }


        else if(position==4){

        Intent intent=new Intent(FragmentActivity.this,Fragment5Activity.class);
        startActivity(intent);


        }


        else if(position==5){

        Intent intent=new Intent(FragmentActivity.this,Fragment6Activity.class);
        startActivity(intent);


        }


        }


        });


        }


        }
