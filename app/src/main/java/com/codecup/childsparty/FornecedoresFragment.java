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
    String[] web = {
            "Tamarindu",
            "Comercial Estrela",
            "Delikata",
            "Deli Doces",
            "Itunes",
            "Wordpress",
            "Drupal",
            "Google Plus",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "Drupal",
            "Google Plus",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "Drupal"
    } ;
    Integer[] imageId = {
            R.drawable.tamarindu,
            R.drawable.estrela,
            R.drawable.delikata,
            R.drawable.delidoce,
            R.drawable.ic_menu_share,
            R.drawable.ic_menu_slideshow,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_manage,
            R.drawable.ic_menu_send,
            R.drawable.ic_menu_share,
            R.drawable.ic_menu_slideshow,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_manage,
            R.drawable.ic_menu_send,
            R.drawable.ic_menu_share,
            R.drawable.ic_menu_slideshow,
            R.drawable.ic_menu_camera
    };
    ListView list;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.fornecedores,
                container, false);

        getActivity().setTitle("Fornecedores");
        FornecedorAdapter adapter = new FornecedorAdapter(getActivity(), web, imageId);
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
