package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images2;
    String[]layout_names;

    public MyAdapter3(Context context, int[]images2 , String[]layout_names) {

        this.context = context;
        this.images2 = images2;
        this.layout_names =layout_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample3, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title2.setText(layout_names[position]);

        holder.img2.setImageResource(images2[position]);



    }


    public int getItemCount() {
        return layout_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title2;
        ImageView img2;

        public MyViewHolder(View itemView) {
            super(itemView);



            title2 = itemView.findViewById(R.id.layoutText);

            img2 = itemView.findViewById(R.id.layoutImg);

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

        MyAdapter3.clickListener=clickListener;

    }


}
