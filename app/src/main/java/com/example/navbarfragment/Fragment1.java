package com.example.navbarfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class Fragment1 extends Fragment {

    private TabLayout tabLayout;
    private  ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        tabLayout= view.findViewById(R.id.tabLayout);
        viewPager= view.findViewById(R.id.viewpager);
        // Configuration du ViewPager pour qu'il travaille en conjonction avec le TabLayout
        tabLayout.setupWithViewPager(viewPager);
        PagerAdapterForDays pagerAdapter = new PagerAdapterForDays(getChildFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

// Add Fragments to the adapter. Each fragment is a new instance of a Fragment subclass.
// 'new fragment1()', 'new fragment2()', and 'new fragment3()' should be replaced with actual Fragment subclass instances
        pagerAdapter.addFragment(new Fragment11(), "To Day"); // Add a Fragment with title "CHATS"
        pagerAdapter.addFragment(new Fragment12(), "Tomorrow"); // Add a Fragment with title "STATUS"
        pagerAdapter.addFragment(new Fragment13(), "All of week"); // Add a Fragment with title "CALLS"

// Get the ViewPager and set its adapter to the instance of VPAdapter
        viewPager.setAdapter(pagerAdapter);
        // Assurez-vous que le TabLayout est configuré avec le ViewPager après que l'adaptateur est défini
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    // Récupération du TabLayout et du ViewPager définis dans le fichier de layout


}
