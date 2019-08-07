package uas.rifdah.bottomnavigationview;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import uas.rifdah.bottomnavigationview.fragment.HomeFragment;
import uas.rifdah.bottomnavigationview.fragment.ProfileFragment;
import uas.rifdah.bottomnavigationview.fragment.WebFragment;

public class MainActivity extends AppCompatActivity {
    FrameLayout container;
    HomeFragment homeFragment = new HomeFragment();
    Fragment fragment;
    BottomNavigationView navView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                  fragment = new HomeFragment();
                  break;
                case R.id.navigation_dashboard:
                    fragment = new WebFragment();
                    break;
                case R.id.navigation_notifications:
                    fragment = new ProfileFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        container = findViewById(R.id.container);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragment = new Fragment();
        navView.setSelectedItemId(R.id.navigation_home);

    }

}
