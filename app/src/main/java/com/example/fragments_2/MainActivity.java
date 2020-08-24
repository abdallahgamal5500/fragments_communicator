package com.example.fragments_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Communicator {

    private Fragment_1 fragment_1;
    private Fragment_2 fragment_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_1 = new Fragment_1();
        fragment_2 = new Fragment_2();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout_1,fragment_1)
                .replace(R.id.framelayout_2,fragment_2)
                .commit();
    }

    @Override
    public void Text1(String text) {
        fragment_2.updateEdittext(text);
    }

    @Override
    public void Text2(String text) {
        fragment_1.updateEdittext(text);
    }

//    @Override
//    public void Text1(String text) {
//        fragment_2.updateEdittext(text);
//    }
//
//    @Override
//    public void Text2(String text) {
//        fragment_1.updateEdittext(text);
//    }
}