package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter9 extends RecyclerView.Adapter<MyAdapter9.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images8;
    String[]container_names;

    public MyAdapter9(Context context, int[]images8 , String[]container_names) {

        this.context = context;
        this.images8 = images8;
        this.container_names=container_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample9, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title8.setText(container_names[position]);

        holder.img8.setImageResource(images8[position]);



    }


    public int getItemCount() {
        return container_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title8;
        ImageView img8;

        public MyViewHolder(View itemView) {
            super(itemView);



            title8 = itemView.findViewById(R.id.containerText);

            img8 = itemView.findViewById(R.id.containerImg);

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

        MyAdapter9.clickListener=clickListener;

    }


}
