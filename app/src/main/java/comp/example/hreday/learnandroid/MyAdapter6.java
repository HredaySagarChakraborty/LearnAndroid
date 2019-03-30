package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter6 extends RecyclerView.Adapter<MyAdapter6.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images5;
    String[]fragment_names;

    public MyAdapter6(Context context, int[]images5 , String[]fragment_names) {

        this.context = context;
        this.images5 = images5;
        this.fragment_names =fragment_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample6, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title5.setText(fragment_names[position]);

        holder.img5.setImageResource(images5[position]);



    }


    public int getItemCount() {
        return fragment_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title5;
        ImageView img5;

        public MyViewHolder(View itemView) {
            super(itemView);



            title5 = itemView.findViewById(R.id.fragmentText);

            img5 = itemView.findViewById(R.id.fragmentImg);

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

        MyAdapter6.clickListener=clickListener;

    }


}
