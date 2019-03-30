package comp.example.hreday.learnandroid;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    private static ClickListener clickListener;


    Context context;
    int[] images;
    String[]android_names;

    public MyAdapter(Context context, int[] images, String[] android_names) {
        this.context = context;
        this.images = images;
        this.android_names = android_names;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.title.setText(android_names[position]);
















        holder.img.setImageResource(images[position]);







    }


    public int getItemCount() {
        return android_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        TextView title;
        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);


            title = itemView.findViewById(R.id.androidText);



            img = itemView.findViewById(R.id.androidImg);

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


        MyAdapter.clickListener=clickListener;
}


}
