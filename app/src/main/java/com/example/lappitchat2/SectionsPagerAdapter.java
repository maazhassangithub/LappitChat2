package com.example.lappitchat2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

     switch (position) {
         //case 0:
           //  ScanFragment scanFragment = new ScanFragment();
             //return scanFragment;

         case 0:
             RequestFragment requestFragment = new RequestFragment();
             return requestFragment;

         case 1:
             ChatFragment chatFragment = new ChatFragment();
             return chatFragment;

         case 2:
             FriendsFragment friendsFragment = new FriendsFragment();
             return friendsFragment;

         default:
             return null;
     }


    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {

        switch (position) {
            //case 0:
              //  return " ";
            case 0:
                return "PICKLISTS";

            case 1:
                return "DISPATCHES";

            case 2:
                return "DELIVERED";


            default:
                return null;


        }
    }
}
