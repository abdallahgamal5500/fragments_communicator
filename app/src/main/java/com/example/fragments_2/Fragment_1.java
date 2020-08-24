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

public class Fragment_1 extends Fragment {

    private Ifragment_1 ifragment_1;
    private EditText editText;
    private Button button;
    private String text;

    public interface Ifragment_1 {
        void Text1 (String text);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,container,false);

        editText = view.findViewById(R.id.fragment1_edittext);
        button = view.findViewById(R.id.fragment1_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                ifragment_1.Text1(text);
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
        if (context instanceof Ifragment_1) {
            ifragment_1 = (Ifragment_1) context;
        } else {
            Toast.makeText(context, "Bug", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        ifragment_1 = null;
    }
}