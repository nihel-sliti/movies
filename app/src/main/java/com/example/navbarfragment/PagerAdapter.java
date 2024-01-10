package com.example.navbarfragment;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;



// Extend from FragmentPagerAdapter which is an implementation of PagerAdapter
// that represents each page as a Fragment that is persistently kept in the fragment manager.
public class PagerAdapter extends FragmentStatePagerAdapter{
    // Two ArrayLists to hold the Fragments and their titles
    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitle = new ArrayList<>();
    // Constructor for the adapter, takes a FragmentManager and a behavior pattern
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    // Returns the Fragment associated with a specified position.
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return  fragmentArrayList.get(position);
    }
    // Return the number of views available.
    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
    // Method to add a Fragment and its title to the ArrayLists
    public void addFragment(Fragment fragment, String title) {
        fragmentArrayList.add(fragment); // Add the Fragment to the list
        fragmentTitle.add(title); // Add the title to the list
    }
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }





}
