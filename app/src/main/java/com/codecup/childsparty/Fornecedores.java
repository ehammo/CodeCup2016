package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fornecedores extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this Fornecedores
        View view =  inflater.inflate(R.layout.content_main,
                container, false);
        return view;
    }
}
