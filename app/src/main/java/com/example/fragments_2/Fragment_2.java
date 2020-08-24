package com.example.fragments_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragment_2 extends Fragment {

    private View view;
    private EditText editText;
    private Button button;
    private String text;
    private Communicator communicator;
    private Fragment_1 fragment_1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_2,container,false);
        editText = view.findViewById(R.id.fragment2_edittext);
        button = view.findViewById(R.id.fragment2_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                text = editText.getText().toString();
//                communicator.HandelFragments(text);
            }
        });
//        showText("Body");
        return view;
    }

    public void showText(int text2) {
        Toast.makeText(getContext(), ""+text2, Toast.LENGTH_SHORT).show();
        //editText.setText("");
    }

//    @Override
//    public void onAttach(@NonNull Context context) {
//        super.onAttach(context);
//        communicator = (Communicator) getActivity();
//    }
}