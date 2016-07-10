package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

public class LocalFragment extends Fragment{
    String[] web1000 = {
            "Bolo comum",
            "Bolas de encher",
            "Tema para decoração, lembrancinhas e convites",
            "Salgados e doces"
    };
    String[] web3000 = {
            "Bolo decorativo",
            "Tema para decoração, lembrancinhas e convites personalizadas",
            "Salgados e doces",
            "Recreador(Magico, palhaço)"
    };
    String[] web5000 = {
            "Bolo decorativo",
            "Buffet com garçom",
            "Tema para decoração, lembrancinhas e convites personalizada",
            "Salgados e doces",
            "Recreador",
            "Serviços alimenticeos",
            "Banda"


    };
    String[] web10000 = {
            "Bolo decorativo",
            "Espaço lazer",
            "Buffet com garçom",
            "Tema para decoração, lembrancinhas e convites personalizada",
            "Salgados e doces",
            "Recreador",
            "Serviços alimenticeos",
            "Banda",
            "Brinquedos diversos"
    };

    int[] fotos1000 = {
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_manage,
            R.drawable.ic_menu_send
    };
    int[] fotos3000 = {
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_manage,
            R.drawable.ic_menu_send
    };
    int[] fotos5000 = {
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_manage,
            R.drawable.ic_menu_send,
            R.drawable.ic_menu_share,
            R.drawable.ic_menu_slideshow,
            R.drawable.ic_menu_camera
    };
    int[] fotos10000 = {
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_manage,
            R.drawable.ic_menu_send,
            R.drawable.ic_menu_share,
            R.drawable.ic_menu_slideshow,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery
    };





    ListView list;
    FornecedorAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.local,
                container, false);
        getActivity().setTitle("Organize sua festa: Local");
        Float orcamento = (Float)getArguments().get("orcamento");
        list = (ListView) view.findViewById(R.id.listView);

        //data para o Adapter diferente para cada um dos orçamentos
        if (orcamento<1000){
  //          adapter = new FornecedorAdapter(getActivity(), web1000, fotos1000);
        }else if(orcamento>=1000&&orcamento<3000){
    //        adapter = new FornecedorAdapter(getActivity(), web3000, fotos3000);
        }else if(orcamento>=3000&&orcamento<5000){
      //      adapter = new FornecedorAdapter(getActivity(), web5000, fotos5000);
        }else{
        //    adapter = new FornecedorAdapter(getActivity(), web10000, fotos10000);
        }
        list.setAdapter(adapter);
        Button b = (Button)view.findViewById(R.id.bt_prox);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                //errado
                FornecedorFragment f =  new FornecedorFragment();
                ft.replace(R.id.fragment,f);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return view;
    }

    public LocalFragment(){}

}