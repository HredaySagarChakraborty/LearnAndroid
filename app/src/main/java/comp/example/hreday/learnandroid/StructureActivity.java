package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class StructureActivity extends AppCompatActivity {
    private RecyclerView recyclerView1;
    MyAdapter2 myAdapter2;

    int images1[] = {R.drawable.apple, R.drawable.phone2,
            R.drawable.note, R.drawable.read,
            R.drawable.sms, R.drawable.technology,

            R.drawable.taxi

    };
    String[] structure_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure);
        this.setTitle("Structure");

        recyclerView1 = findViewById(R.id.recycler2id);


        structure_names = getResources().getStringArray(R.array.structure_names);



        myAdapter2 = new MyAdapter2(this, images1, structure_names);
        recyclerView1.setAdapter(myAdapter2);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));


        myAdapter2.setOnItemClickListener(new MyAdapter2.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {


                Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {


                    Intent intent = new Intent(StructureActivity.this, Structure1Activity.class);
                    startActivity(intent);


                } else if (position == 1) {

                    Intent intent = new Intent(StructureActivity.this, Structure2Activity.class);
                    startActivity(intent);

                }

                else if (position == 2) {

                    Intent intent = new Intent(StructureActivity.this, Structure3Activity.class);
                    startActivity(intent);


                }


                else if (position == 3) {

                    Intent intent = new Intent(StructureActivity.this, Structure4Activity.class);
                    startActivity(intent);


                }


                else if (position == 4) {

                    Intent intent = new Intent(StructureActivity.this, Structure5Activity.class);
                    startActivity(intent);


                }



                else if (position == 5) {

                    Intent intent = new Intent(StructureActivity.this, Structure6Activity.class);
                    startActivity(intent);


                }


            }




        });


    }


}
