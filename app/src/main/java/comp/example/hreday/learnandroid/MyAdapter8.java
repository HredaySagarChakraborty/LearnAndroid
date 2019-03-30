package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter8 extends RecyclerView.Adapter<MyAdapter8.MyViewHolder>  {

    private static ClickListener clickListener;

    Context context;
    int[] images7;
    String[]menu_names;

    public MyAdapter8(Context context, int[]images7 , String[]menu_names) {

        this.context = context;
        this.images7 = images7;
        this. menu_names=menu_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample8, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title7.setText(menu_names[position]);

        holder.img7.setImageResource(images7[position]);



    }


    public int getItemCount() {
        return menu_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title7;
        ImageView img7;

        public MyViewHolder(View itemView) {
            super(itemView);



            title7 = itemView.findViewById(R.id.menuText);

            img7 = itemView.findViewById(R.id.menuImg);

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

        MyAdapter8.clickListener=clickListener;

    }


}
