package com.example.twilkin7.programone;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentOne extends Fragment {

    private OnFragmentInteractionListener mListener;

    String TAG = "FML";
    Button btn;
    EditText txt;
    TextView textView2;
    public FragmentOne() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_fragment_one, container,false);

        txt = myView.findViewById(R.id.txt);
        btn = myView.findViewById(R.id.btn);
        textView2 = myView.findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onButtonPressed();
            }
        });





        return myView;
    }

    public void onButtonPressed() {
        if(mListener != null){
            String name = txt.getText().toString();
            mListener.onFragmentInteraction(name);
            Log.v(TAG,name);
            textView2.setText("Hello " + name + "!");
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String data);
    }
}
