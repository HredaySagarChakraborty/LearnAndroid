package comp.example.hreday.learnandroid;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class Quiz extends Fragment {


    private WebView webView;

    View v;


   /* private RecyclerView recyclerView;

   Vector<YoutubeVideo>youtubeVideos=new Vector<>();

    private MyAdapter6 myAdapter6;
    private Context context;


    */


    public Quiz() {
        // Required empty public constructor
    }


    @Override


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {









        // Inflate the layout for this fragment
     v =inflater.inflate(R.layout.fragment_quiz, container, false);


     webView=v.findViewById(R.id.webViewId);
     webView.loadUrl("  https://www.youtube.com/watch?v=ZYvbmVEwX14&list=PLgH5QX0i9K3p9xzYLFGdfYliIRBLVDRV5");



     return v;



    }
}

/*
        recyclerView = v.findViewById(R.id.webViedoView);
      MyAdapter6 myAdapter6=new MyAdapter6(getContext(),youtubeVideos);

          recyclerView.setHasFixedSize(true);

      recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
   // recyclerView.setAdapter(myAdapter6);

*/




/*


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);



     // youtubeVideos=new ArrayList<>();

        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZYvbmVEwX14?list=PLgH5QX0i9K3p9xzYLFGdfYliIRBLVDRV5\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZYvbmVEwX14?list=PLgH5QX0i9K3p9xzYLFGdfYliIRBLVDRV5\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZYvbmVEwX14?list=PLgH5QX0i9K3p9xzYLFGdfYliIRBLVDRV5\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));


        MyAdapter6 myAdapter6 = new MyAdapter6(youtubeVideos);
        recyclerView.setAdapter(myAdapter6);

    }

}


*/












