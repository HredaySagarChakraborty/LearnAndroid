package comp.example.hreday.learnandroid;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Example extends Fragment {

    private RecyclerView recyclerView;
    List<Contract> istList;
    View v;
    private MyAdapter5 myAdapter5;
    private Context context;


    public Example() {
        // Required empty public constructor
    }







    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   v=inflater.inflate(R.layout.fragment_example, container, false);

   recyclerView=v.findViewById(R.id.recycler5Id);
   MyAdapter5 myAdapter5=new MyAdapter5(getContext(),istList);

   recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
   recyclerView.setAdapter(myAdapter5);



        return  v;



    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        istList=new ArrayList<>();
        istList.add( new Contract("TextView",R.drawable.tt));
        istList.add( new Contract("EdiTtext",R.drawable.et));
        istList.add( new Contract("Button",R.drawable.button5));
        istList.add( new Contract("RadioButton",R.drawable.radio));
        istList.add( new Contract("CheckBox",R.drawable.checkmark));
        istList.add( new Contract("RatingBar",R.drawable.rat));
        istList.add( new Contract("Progressbar",R.drawable.pg));
        istList.add( new Contract("Seekbar",R.drawable.seekbar));
        istList.add( new Contract("Switcher",R.drawable.toggle));
        istList.add( new Contract("Toggle",R.drawable.tg));
        istList.add( new Contract("Spinner",R.drawable.spy));
        istList.add( new Contract("AutocompleteTextView",R.drawable.filledlike));
        istList.add( new Contract(" MultiAutocompleteTextView",R.drawable.filledchat));
        istList.add( new Contract(" CheckTextView",R.drawable.checkmark));
        istList.add( new Contract(" TextSwitcher",R.drawable.images));
        istList.add( new Contract(" AdapterViewFliper",R.drawable.ad2));
        istList.add( new Contract(" ImageButton",R.drawable.ii));
        istList.add( new Contract(" ImageView",R.drawable.i9));
        istList.add( new Contract(" VideoView",R.drawable.videoview));
        istList.add( new Contract(" TextClock",R.drawable.tk));
        istList.add( new Contract("  DatePicker",R.drawable.datepicker));
        istList.add( new Contract("  TimePicker",R.drawable.timepicker));
        istList.add( new Contract("  Chronometer",R.drawable.cn));
        istList.add( new Contract("  Email",R.drawable.email));
        istList.add( new Contract("  Maps",R.drawable.googlemaps));
        istList.add( new Contract(" PhoneCall",R.drawable.phone));
        istList.add( new Contract(" PhoneDial",R.drawable.phone));
        istList.add( new Contract("Camera",R.drawable.ic_menu_camera));
        istList.add( new Contract("Activity Transition",R.drawable.av));
        istList.add( new Contract("Passing value from one activity to another activity",R.drawable.actv));
        istList.add( new Contract("start activity for result example",R.drawable.oo));
        istList.add( new Contract(" facebook",R.drawable.facebook));
        istList.add( new Contract(" twitter",R.drawable.twitter));
        istList.add( new Contract(" whatsapp",R.drawable.whatsapp));
        istList.add( new Contract("googleplus",R.drawable.googleplus));
        istList.add( new Contract("simpletoast",R.drawable.toast));
        istList.add( new Contract(" positioningToastMessage",R.drawable.yy));
        istList.add( new Contract("customToast",R.drawable.vi));
        istList.add( new Contract(" ListView",R.drawable.list));
        istList.add( new Contract(" CustomListview",R.drawable.cus));
        istList.add( new Contract(" Expandable ListView",R.drawable.ex));
        istList.add( new Contract(" GridView",R.drawable.grid));
        istList.add( new Contract("WebView",R.drawable.web));
        istList.add( new Contract("SearchView ",R.drawable.ic_launcher_search));
        istList.add( new Contract("Contextmenu  ",R.drawable.content));
        istList.add( new Contract("optionMenu  ",R.drawable.op));
        istList.add( new Contract("Popup menu  ",R.drawable.pop));
        istList.add( new Contract("Activity lifecycle ",R.drawable.cyc));
        istList.add( new Contract("Fragment lifecycle  ",R.drawable.ooooo));
        istList.add( new Contract("Fragment and activity lifecycle combined   ",R.drawable.poi));
        istList.add( new Contract("Fragment and activity lifecycle combined   ",R.drawable.poi));
        istList.add( new Contract("Interfragment communication",R.drawable.services));
        istList.add( new Contract("ListFragment",R.drawable.menufilled));
        istList.add( new Contract("DialogFragment",R.drawable.map));
        istList.add( new Contract("Service lifecycle",R.drawable.ppn));
        istList.add( new Contract("ServiceExample",R.drawable.volume));
        istList.add( new Contract("PhoneDetails",R.drawable.phone2));
        istList.add( new Contract("RedContarcts",R.drawable.red));
        istList.add( new Contract("ReadSms",R.drawable.dd));
        istList.add( new Contract("Senssms",R.drawable.mms));
        istList.add( new Contract("changewifisatte",R.drawable.sms));
        istList.add( new Contract("getwifiinfo",R.drawable.fourfive));
        istList.add( new Contract("getwifilist",R.drawable.homepage));
        istList.add( new Contract("fade",R.drawable.fade));
        istList.add( new Contract("zoom",R.drawable.zoom));
        istList.add( new Contract("rotate ",R.drawable.rotate));
        istList.add( new Contract("sharedpreferrance ",R.drawable.play));
        istList.add( new Contract("sqlite insert ",R.drawable.ic_action_android_mysql));
        istList.add( new Contract("sqlite read",R.drawable.read));
        istList.add( new Contract(" sqlite updat ",R.drawable.ic_action_android_sqlite));
        istList.add( new Contract("sqlite delete ",R.drawable.deletesign));
        istList.add( new Contract("FloatingActionButton ",R.drawable.front));
        istList.add( new Contract("BottopnNavigation ",R.drawable.drawer));
        istList.add( new Contract("NavigationDrawer  ",R.drawable.drawer));










    }










}






