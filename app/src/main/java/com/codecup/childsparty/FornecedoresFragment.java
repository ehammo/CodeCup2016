package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FornecedoresFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.fornecedores,
                container, false);
        return view;
    }
}
