package pe.chema.fitnowchema.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import pe.chema.fitnowchema.R;
import pe.chema.fitnowchema.fragments.FindFragment;
import pe.chema.fitnowchema.fragments.PlansFragment;
import pe.chema.fitnowchema.fragments.WorkoutFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //siempre iniciara en ese fragment
        navigationAccordingTo(R.id.navigation_workout);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return navigationAccordingTo(item.getItemId());
        }
    };


    private boolean navigationAccordingTo(int id){
        try{
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content,getFragmentFor(id))
                    .commit();
            return true;
        }catch (NullPointerException e){
            e.printStackTrace();
            return false;
        }
    }


    private Fragment getFragmentFor(int id){
        switch (id){
            case R.id.navigation_workout:
                return new WorkoutFragment();
            case R.id.navigation_plans:
                return new PlansFragment();
            case R.id.navigation_find:
                return new FindFragment();
            case R.id.navigation_profile:
                return new PlansFragment();
        }
        return null;
    }
}

