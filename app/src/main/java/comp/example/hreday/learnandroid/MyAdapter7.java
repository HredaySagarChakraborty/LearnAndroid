package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter7 extends RecyclerView.Adapter<MyAdapter7.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images6;
    String[]service_names;

    public MyAdapter7(Context context, int[]images6 , String[]service_names) {

        this.context = context;
        this.images6 = images6;
        this. service_names=service_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample7, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title6.setText(service_names[position]);

        holder.img6.setImageResource(images6[position]);



    }


    public int getItemCount() {
        return service_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title6;
        ImageView img6;

        public MyViewHolder(View itemView) {
            super(itemView);



            title6 = itemView.findViewById(R.id.serviceText);

            img6 = itemView.findViewById(R.id.serviceImg);

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

        MyAdapter7.clickListener=clickListener;

    }


}
