package com.codecup.childsparty;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by eduardo on 09/07/2016.
 */
public class FornecedorFragment extends Fragment {

    String[] web = {
            "Produto 1",
            "Produto 2",
            "Produto 3",
            "Produto 4",
            "Produto 5",
            "Produto 6",
            "Produto 7",
            "Produto 8",
            "Produto 9",
            "Produto 10",
            "Produto 11",
            "Produto 12",
            "Produto 13",
            "Produto 14",
            "Produto 15",
            "Produto 16",
            "Produto 17",
            "Produto 18",
            "Produto 19",
            "Produto 20",
            "Produto 21"

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
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

      View view =  inflater.inflate(R.layout.fornecedor_description,
                container, false);

        int img = (int)getArguments().get("img");
        String name = (String)getArguments().get("name");
        ((ImageView)view.findViewById(R.id.fornecedorImg)).setImageResource(img);
        ((TextView)view.findViewById(R.id.name)).setText(name);
        ProdutoAdapter adapter = new ProdutoAdapter(getActivity(), web, imageId);
        list=(ListView)view.findViewById(R.id.listViewProdutos);
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

    public FornecedorFragment(){   }


}
