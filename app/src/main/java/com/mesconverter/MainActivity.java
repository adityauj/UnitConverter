package com.mesconverter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mesconverter.Fragments.Area;
import com.mesconverter.Fragments.Digital_Storage;
import com.mesconverter.Fragments.Energy;
import com.mesconverter.Fragments.Length;
import com.mesconverter.Fragments.Mass;
import com.mesconverter.Fragments.Power;
import com.mesconverter.Fragments.Speed;
import com.mesconverter.Fragments.Tempreture;
import com.mesconverter.Fragments.Volume;
import com.mesconverter.Fragments.Help;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager manager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager.beginTransaction().replace(R.id.container, new Area()).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatemen

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        Fragment fragment = null;

        if (id == R.id.tempreture) {
            fragment = new Tempreture();
        } else if (id == R.id.area) {
            fragment = new Area();
        } else if (id == R.id.digital_storage) {
            fragment = new Digital_Storage();
        } else if (id == R.id.energy) {
            fragment = new Energy();
        } else if (id == R.id.length) {
            fragment = new Length();
        } else if (id == R.id.mass) {
            fragment = new Mass();
        } else if (id == R.id.power) {
            fragment = new Power();
        } else if (id == R.id.speed) {
            fragment = new Speed();
        } else if (id == R.id.volume) {
            fragment = new Volume();
        }else if (id == R.id.help) {
            fragment = new Help();
        }

        manager.beginTransaction().replace(R.id.container, fragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
