package comp.example.hreday.learnandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter5 extends RecyclerView.Adapter<MyAdapter5.MyViewHolder>  {




    private static ClickListener clickListener;

    Context context;
   List<Contract> mdata;


    public MyAdapter5(Context context, List<Contract> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample5, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title4.setText(mdata.get(position).getName());


        holder.img4.setImageResource(mdata.get(position).getPhoto());



    }





    public int getItemCount() {
        return mdata.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title4;
        ImageView img4;

        public MyViewHolder(View itemView) {
            super(itemView);



            title4 = itemView.findViewById(R.id.exampleText);

            img4 = itemView.findViewById(R.id.exampleImg);

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

        MyAdapter5.clickListener=clickListener;

    }




}
