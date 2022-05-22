package com.foth.petinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.loader.content.Loader;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.foth.petinder.Fragments.MainPage.MainHomePageFragment;
import com.foth.petinder.Fragments.MainPage.MainMessagesPageFragment;
import com.foth.petinder.Fragments.MainPage.MainProfilePageFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;
    public static FragmentContainerView fragmentCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        identifyViews();

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.mainAdoptionPageFragment:
                        fragment = new MainHomePageFragment();
                        break;
                    case R.id.mainMessagesPageFragment:
                        fragment = new MainMessagesPageFragment();
                        break;
                    case R.id.mainProfilePageFragment:
                        fragment = new MainProfilePageFragment();
                        break;
                }
                return loadFragment(fragment);
            }
        });

    }

    private void identifyViews(){
        bottomNav = findViewById(R.id.bottomNavigationView2);
        fragmentCV = findViewById(R.id.fragmentCV);
    }

    public boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentCV, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}