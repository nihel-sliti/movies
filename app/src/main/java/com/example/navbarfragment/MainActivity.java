package com.example.navbarfragment;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Récupération du TabLayout et du ViewPager définis dans le fichier de layout
        tabLayout= findViewById(R.id.tabLayout);
        viewPager= findViewById(R.id.viewpager);
        // Configuration du ViewPager pour qu'il travaille en conjonction avec le TabLayout
        tabLayout.setupWithViewPager(viewPager);
        // Ajout d'un listener pour les événements de sélection des onglets dans le TabLayout
        tabLayout.addOnTabSelectedListener(new TabLayout
                        .OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
               }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        }
                );
        // Ajout d'un listener pour les changements d'état du ViewPager
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Cette méthode est appelée lorsque la page est en cours de défilement
            }

            @Override
            public void onPageSelected(int position) {
                // Cette méthode est appelée lorsque une nouvelle page devient sélectionnée


            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // Cette méthode est appelée lorsque l'état de défilement de la page change
            }
        });
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

// Add Fragments to the adapter. Each fragment is a new instance of a Fragment subclass.
// 'new fragment1()', 'new fragment2()', and 'new fragment3()' should be replaced with actual Fragment subclass instances
        pagerAdapter.addFragment(new Fragment1(), "ALL Movies"); // Add a Fragment with title "CHATS"
        pagerAdapter.addFragment(new Fragment2(), "KIDS"); // Add a Fragment with title "STATUS"
        pagerAdapter.addFragment(new Fragment3(), "Tickets"); // Add a Fragment with title "CALLS"

// Get the ViewPager and set its adapter to the instance of VPAdapter
        viewPager.setAdapter(pagerAdapter);
    }
}