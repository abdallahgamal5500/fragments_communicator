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
import android.widget.Toast;

public class Fragment_2 extends Fragment {

    private Ifragment_2 ifragment_2;
    private EditText editText;
    private Button button;
    private String text;

    public interface Ifragment_2 {
        void Text2 (String text);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2,container,false);

        editText = view.findViewById(R.id.fragment2_edittext);
        button = view.findViewById(R.id.fragment2_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                ifragment_2.Text2(text);
            }
        });
        return view;
    }

    public void updateEdittext (String newtext) {
        editText.setText(newtext);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Ifragment_2) {
            ifragment_2 = (Ifragment_2) context;
        } else {
            Toast.makeText(context, "Bug", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        ifragment_2 = null;
    }
}