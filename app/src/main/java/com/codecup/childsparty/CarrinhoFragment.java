package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class CarrinhoFragment extends Fragment {

    ListView list;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.carrinho,
                container, false);
        final String[] web = (String[]) getArguments().getCharSequenceArray("produtos");
        final String[] precosArg = (String[]) getArguments().getCharSequenceArray("precos");
        ArrayList<String> nomes = new ArrayList<String>(Arrays.asList(web));
        ArrayList<String> precos = new ArrayList<String>(Arrays.asList(precosArg));

        getActivity().setTitle("Carrinho");

        CarrinhoAdapter adapter = new CarrinhoAdapter(getActivity(), nomes, precos);
        list=(ListView) view.findViewById(R.id.carrinho_listView);
        list.setAdapter(adapter);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//                FragmentTransaction ft = getFragmentManager().beginTransaction();
//                FornecedorFragment f =  new FornecedorFragment();
//                Bundle bundle = new Bundle();
//                bundle.putString("name", web[position]);
//                bundle.putInt("img", imageId[position]);
//                bundle.putString("end", end[position]);
//                bundle.putString("fone", fone[position]);
//                bundle.putString("tag", tag[position]);
//                f.setArguments(bundle);
//                ft.replace(R.id.fragment,f);
//                ft.addToBackStack(null);
//                ft.commit();
//            }
//        });

        return view;
    }

    public CarrinhoFragment() {


    }
}
