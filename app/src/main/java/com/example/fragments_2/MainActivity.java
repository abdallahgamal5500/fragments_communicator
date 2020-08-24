package com.example.fragments_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Communicator{

    private Fragment_1 fragment_1 = new Fragment_1();
    private Fragment_2 fragment_2 = new Fragment_2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout,fragment_1)
                .commit();
    }

    @Override
    public void HandelFragments(int text, Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout,fragment)
                .commit();
        //Toast.makeText(this, ""+text, Toast.LENGTH_SHORT).show();
        fragment_2.showText(text);
    }
}