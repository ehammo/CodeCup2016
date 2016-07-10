package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FornecedoresFragment extends Fragment {

    ListView list;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.fornecedores,
                container, false);
        final String[] web = (String[]) getArguments().getCharSequenceArray("web");
        final int[] imageId = (int[]) getArguments().getIntArray("imageId");
        final String[] fone = (String[]) getArguments().getCharSequenceArray("fone");
        final String[] end = (String[]) getArguments().getCharSequenceArray("end");
        final String[] tag = (String[]) getArguments().getCharSequenceArray("tag");
        getActivity().setTitle("Parceiros");
        FornecedorAdapter adapter = new FornecedorAdapter(getActivity(), web, imageId,end,fone,tag);
        list=(ListView)view.findViewById(R.id.listView1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                FornecedorFragment f =  new FornecedorFragment();
                Bundle bundle = new Bundle();
                bundle.putString("name", web[position]);
                bundle.putInt("img", imageId[position]);
                bundle.putString("end", end[position]);
                bundle.putString("fone", fone[position]);
                bundle.putString("tag", tag[position]);
                f.setArguments(bundle);
                ft.replace(R.id.fragment,f);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return view;
    }

    public FornecedoresFragment() {


    }
}
