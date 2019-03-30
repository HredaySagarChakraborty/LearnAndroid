package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter11 extends RecyclerView.Adapter<MyAdapter11.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images10;
    String[]sqlite_names;

    public MyAdapter11(Context context, int[]images10 , String[]sqlite_names) {

        this.context = context;
        this.images10 = images10;
        this.sqlite_names=sqlite_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample11, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title10.setText(sqlite_names[position]);

        holder.img10.setImageResource(images10[position]);



    }


    public int getItemCount() {
        return sqlite_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title10;
        ImageView img10;

        public MyViewHolder(View itemView) {
            super(itemView);



            title10 = itemView.findViewById(R.id.sqliteText);

            img10 = itemView.findViewById(R.id.sqliteImg);

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

        MyAdapter11.clickListener=clickListener;

    }


}
