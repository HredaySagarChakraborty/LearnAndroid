package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter4 extends RecyclerView.Adapter<MyAdapter4.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images3;
    String[]widget_names;

    public MyAdapter4(Context context, int[]images3 , String[]widget_names) {

        this.context = context;
        this.images3 =images3;
        this.widget_names=widget_names;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample4, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title3.setText(widget_names[position]);

        holder.img3.setImageResource(images3[position]);



    }


    public int getItemCount() {
        return widget_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title3;
        ImageView img3;

        public MyViewHolder(View itemView) {
            super(itemView);



            title3 = itemView.findViewById(R.id.widgetText);

            img3 = itemView.findViewById(R.id.widgetImg);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(),v);

        }
    }
    public interface ClickListener {
        void onItemClick(int position, View v);
    }

    public  void setOnItemClickListener(ClickListener clickListener){

        MyAdapter4.clickListener=clickListener;

    }


}
