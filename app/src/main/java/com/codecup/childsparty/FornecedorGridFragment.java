package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by eduardo on 10/07/2016.
 */
public class FornecedorGridFragment extends Fragment {
    String[] webComida = {
            "Tamarindu",
            "Comercial Estrela",
            "Delikata",
            "Deli Doces"
    } ;
    String[] endComida = {
            "R. Dr. José Maria, 848",
            "Estr. Velha de Água Fria, 1798",
            "Av. Dezessete de Agosto, 656",
            "Av. Caxangá, 255"

    };
    String[] foneComida = {
            "(81) 3242-3042",
            "(81) 3444-5916",
            "(81) 3038-0606",
            "(81) 3087-0707"

    };

    String[] tagComida = {
            "Doces e Salgados",
            "Buffet",
            "Doces",
            "Doces"
    };

    int[] imageIdComida = {
            R.drawable.tamarindo,
            R.drawable.estrela,
            R.drawable.delikata,
            R.drawable.deli
    };

    String[] web;
    int[] imageId;
    ListView list;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.fornecedor_grid,
                container, false);

        getActivity().setTitle("Parceiros");
        ImageView iv1 = (ImageView)view.findViewById(R.id.imageView);
        ImageView iv2 = (ImageView)view.findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView)view.findViewById(R.id.imageView3);
        ImageView iv4 = (ImageView)view.findViewById(R.id.imageView4);
        iv1.setImageResource(R.drawable.ic_menu_camera);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FornecedoresFragment ff = new FornecedoresFragment();
                Bundle bundle = new Bundle();
                bundle.putCharSequenceArray("web", webComida);
                bundle.putIntArray("imageId", imageIdComida);
                bundle.putCharSequenceArray("end", endComida);
                bundle.putCharSequenceArray("fone", foneComida);
                bundle.putCharSequenceArray("tag", tagComida);
                ff.setArguments(bundle);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment,ff);
                ft.addToBackStack(null);
                ft.commit();

            }
        });
        return view;
    }

    public FornecedorGridFragment() {


    }





}
