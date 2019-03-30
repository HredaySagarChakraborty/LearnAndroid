package comp.example.hreday.learnandroid;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder>  {

    private static ClickListener clickListener;


    Context context;
    int[] images1;
    String[]structure_names;

    public MyAdapter2(Context context, int[]images1 , String[]structure_names) {
        this.context = context;
        this.images1 = images1;
        this.structure_names =structure_names;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample2, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title1.setText(structure_names[position]);

        holder.img1.setImageResource(images1[position]);



    }


    public int getItemCount() {
        return structure_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title1;
        ImageView img1;

        public MyViewHolder(View itemView) {
            super(itemView);



            title1 = itemView.findViewById(R.id.structureText);





            img1 = itemView.findViewById(R.id.structureImg);

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


        MyAdapter2.clickListener=clickListener;






    }


}
