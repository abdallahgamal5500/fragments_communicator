package com.example.fragments_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_1 extends Fragment {

    private View view;
    private EditText editText;
    private Button button;
    private String text;
    private Communicator communicator;
    private Fragment_2 fragment_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_1,container,false);
        editText = view.findViewById(R.id.fragment1_edittext);
        button = view.findViewById(R.id.fragment1_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                fragment_2 = new Fragment_2();
                communicator.HandelFragments(55, fragment_2);
            }
        });
        return view;
    }

//    public void showText(int text2) {
//        //editText.setText(""+text2);
//    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        communicator = (Communicator) getActivity();
    }
}