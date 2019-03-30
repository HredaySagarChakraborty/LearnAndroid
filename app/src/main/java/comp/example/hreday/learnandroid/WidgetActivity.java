package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class WidgetActivity extends AppCompatActivity {
    private RecyclerView recyclerView4;
    MyAdapter4 myAdapter4;

    int []images3={R.drawable.phone,R.drawable.save,
            R.drawable.shakephone,R.drawable.tablet,
            R.drawable.taxi,R.drawable.technology,

            R.drawable.iphone,R.drawable.note,
            R.drawable.taxi,R.drawable.portrait,
            R.drawable.technology,R.drawable.sms,

            R.drawable.pad,R.drawable.save,
            R.drawable.email,R.drawable.tablet,
            R.drawable.mms,R.drawable.phone2,
            R.drawable.tablet


    };
    String[]widget_names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        this.setTitle("Widget");

        recyclerView4=findViewById(R.id.recyclerView4);


        widget_names=getResources().getStringArray(R.array.widget_names);



        myAdapter4= new MyAdapter4(this,images3,widget_names);
        recyclerView4.setAdapter(myAdapter4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this));


        myAdapter4.setOnItemClickListener(new MyAdapter4.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(WidgetActivity.this, Widget1Activity.class);
                    startActivity(intent);


                }


                if (position == 1) {
                    Intent intent = new Intent(WidgetActivity.this, Widget2Activity.class);

                    startActivity(intent);


                }

                if (position == 2) {
                    Intent intent = new Intent(WidgetActivity.this, Widget3Activity.class);

                    startActivity(intent);


                }

                if (position == 3) {
                    Intent intent = new Intent(WidgetActivity.this, Widget4Activity.class);

                    startActivity(intent);


                }


                if (position == 4) {
                    Intent intent = new Intent(WidgetActivity.this, Widget5Activity.class);

                    startActivity(intent);


                }

                if (position == 5) {
                    Intent intent = new Intent(WidgetActivity.this, Widget6Activity.class);

                    startActivity(intent);


                }

                if (position == 6) {
                    Intent intent = new Intent(WidgetActivity.this, Widget7Activity.class);

                    startActivity(intent);


                }

                if (position == 7) {
                    Intent intent = new Intent(WidgetActivity.this, Widget8Activity.class);

                    startActivity(intent);


                }
                if (position == 8) {
                    Intent intent = new Intent(WidgetActivity.this, Widget9Activity.class);

                    startActivity(intent);


                }
                if (position == 9) {
                    Intent intent = new Intent(WidgetActivity.this, Widget10Activity.class);

                    startActivity(intent);


                }


                if (position == 10) {
                    Intent intent = new Intent(WidgetActivity.this, Widget11Activity.class);

                    startActivity(intent);


                }


                if (position == 11) {
                    Intent intent = new Intent(WidgetActivity.this, Widget12Activity.class);

                    startActivity(intent);


                }


                if (position == 12) {
                    Intent intent = new Intent(WidgetActivity.this, Widget13Activity.class);

                    startActivity(intent);


                }


                if (position == 13) {
                    Intent intent = new Intent(WidgetActivity.this, Widget14Activity.class);

                    startActivity(intent);


                }

                if (position == 14) {
                    Intent intent = new Intent(WidgetActivity.this, Widget15Activity.class);

                    startActivity(intent);


                }

                if (position == 15) {
                    Intent intent = new Intent(WidgetActivity.this, Widget16Activity.class);

                    startActivity(intent);


                }

                if (position == 16) {
                    Intent intent = new Intent(WidgetActivity.this, Widget17Activity.class);

                    startActivity(intent);


                }

                if (position == 17) {
                    Intent intent = new Intent(WidgetActivity.this, Widget18Activity.class);

                    startActivity(intent);


                }

                if (position == 18) {
                    Intent intent = new Intent(WidgetActivity.this, Widget19Activity.class);

                    startActivity(intent);


                }




            }




        });



    }


}
