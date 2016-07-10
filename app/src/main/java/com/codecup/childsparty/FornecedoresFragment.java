package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FornecedoresFragment extends Fragment {
    String[] web = {
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

        FornecedorAdapter adapter = new FornecedorAdapter(getActivity(), web, imageId);
        list=(ListView)view.findViewById(R.id.listView1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

    public FornecedoresFragment() {


    }
}
