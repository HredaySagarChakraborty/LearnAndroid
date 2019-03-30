package comp.example.hreday.learnandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    String[]tabArray=new String[]{"Tutorial","Example","Videos"};
    Integer array=3;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabArray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){


            case 0:
                Tutorial tutorial=new Tutorial();
                return  tutorial;

            case 1:
              Example example=new Example();
              return  example;

            case 2:
                Quiz quiz=new Quiz();
                return  quiz;

        }


        return null;
    }

    @Override
    public int getCount() {
        return array;
    }
}
