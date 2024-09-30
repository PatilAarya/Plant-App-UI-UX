package com.example.plantappui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.example.plantappui.fragment.DiseasesFragment;
import com.example.plantappui.fragment.FavouriteFragment;
import com.example.plantappui.fragment.HelpFragment;
import com.example.plantappui.fragment.HomeFragment;
import com.example.plantappui.fragment.InsectsFragment;
import com.example.plantappui.fragment.ProductsFragment;
import com.example.plantappui.fragment.ProfileFragment;
import com.example.plantappui.fragment.WeedsFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.plantappui.databinding.ActivityMainBinding;

import java.util.Objects;

import nl.joery.animatedbottombar.AnimatedBottomBar;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private Toolbar toolbar;
    private AnimatedBottomBar animatedBottomBar;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
        initViews(savedInstanceState);
        initNavComponent();
        
    }

    private void initNavComponent() {
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.nav_weed:
                        fragment = new WeedsFragment();
                        break;
                    case R.id.nav_insects:
                        fragment = new InsectsFragment();
                        break;
                    case R.id.nav_disease:
                        fragment = new DiseasesFragment();
                        break;
                    case R.id.nav_products:
                        fragment = new ProductsFragment();
                        break;
                    case R.id.nav_help:
                        fragment = new HelpFragment();
                        break;
                    default:
                        return false;
                }

                // Perform fragment transaction here
                if(fragment != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragmentContainer, fragment);
                    transaction.commit();
                }

                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    @SuppressLint("NonConstantResourceID")
    private void initViews(Bundle savedInstanceState) {
        animatedBottomBar=findViewById(R.id.animatedBottomBar);

        if(savedInstanceState == null){
            // Select the tab programmatically by position
            animatedBottomBar.selectTabAt(0,true); // Assuming the home tab is at position 0

            Fragment fragment = new HomeFragment(); // Initialize the fragment
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentContainer, fragment);
            transaction.commit();
        }


        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastTab,
                                      int newIndex, @NonNull AnimatedBottomBar.Tab newtab) {


                Fragment newfragment = null;
                switch (newtab.getId()){


                    case R.id.home:
                        newfragment = new HomeFragment();
                        break;
                    case R.id.favourite:
                        newfragment = new FavouriteFragment();
                        break;
                    case R.id.profile:
                        newfragment = new ProfileFragment();
                        break;
                }

                if(newfragment!=null){
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();;
                    fragmentTransaction.replace(R.id.fragmentContainer,newfragment);
                    fragmentTransaction.commit();
                }
            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

            }
        });


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(false);
        toggle.setToolbarNavigationClickListener(view->drawer.openDrawer(GravityCompat.START));
        toggle.setHomeAsUpIndicator(R.drawable.ic_drawer);
        toggle.syncState();

    }

    private void setToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(0);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.END);
        }else
            super.onBackPressed();
    }
}