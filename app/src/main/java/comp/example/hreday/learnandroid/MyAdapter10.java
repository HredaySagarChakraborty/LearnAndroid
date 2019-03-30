package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter10 extends RecyclerView.Adapter<MyAdapter10.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images9;
    String[]storage_names;

    public MyAdapter10(Context context, int[]images9 , String[]storage_names) {

        this.context = context;
        this.images9 = images9;
        this.storage_names=storage_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample10, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title9.setText(storage_names[position]);

        holder.img9.setImageResource(images9[position]);



    }


    public int getItemCount() {
        return storage_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title9;
        ImageView img9;

        public MyViewHolder(View itemView) {
            super(itemView);



            title9 = itemView.findViewById(R.id.storageText);

            img9 = itemView.findViewById(R.id.storageImg);

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

        MyAdapter10.clickListener=clickListener;

    }


}
