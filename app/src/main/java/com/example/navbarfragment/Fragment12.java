package com.example.navbarfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Fragment12 extends Fragment {


    private ViewPager2 viewPager;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_12, container, false);

        viewPager = view.findViewById(R.id.viewpager2);
        int[] images = {R.drawable.agile,R.drawable.meangirls,R.drawable.poorthings,R.drawable.theironclaw,R.drawable.imaginary};
        String[] heading = {"AGILE","MEAN GIRLS","POOR THINGS","THE IRON CLAW","IMAGINARY"};
        String[] desc = {getString(R.string.agile_desc),
                getString(R.string.mean_girls_desc),
                getString(R.string.poor_things_desc),
                getString(R.string.the_iron_claw_desc),
                getString(R.string.imaginary_desc)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){
            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i],heading[i],desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);
        }

        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList, getContext());
        viewPager.setAdapter(vpAdapter);

        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(2);
        viewPager.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        return view; // Move the return statement to the end
    }
}