package com.codecup.childsparty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OrganizarFragment extends Fragment{
    Float orcamento;
    View view2;
    String[] produtos = {
            "Bolo comum",
            "Bolas de encher",
            "Recreador",
            "Salgados e doces"
    };
    String[] precos = {
            "R$100,00",
            "R$10,00",
            "R$300,00",
            "R$100,00"
    };
    String[] qtd = {
            "1",
            "100",
            "1",
            "300"
    };
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this FornecedoresFragment
        View view =  inflater.inflate(R.layout.organize,
                container, false);
        view2=view;
        getActivity().setTitle("Organize sua festa");

        Button b = (Button)view.findViewById(R.id.bt_prox);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                CarrinhoFragment f =  new CarrinhoFragment();
                Bundle bundle = new Bundle();
                bundle.putCharSequenceArray("produtos",produtos);
                bundle.putCharSequenceArray("precos",precos);
                bundle.putCharSequenceArray("qtd",qtd);
                EditText editText = (EditText)view2.findViewById(R.id.orc);

                if( editText.getText().toString().equals("") ) {
                    Toast.makeText(getActivity(),"erro",Toast.LENGTH_SHORT).show();
                }else{
                    Log.e("orc",((EditText) view2.findViewById(R.id.orc)).getText().toString());
                    orcamento = Float.valueOf(((EditText) view2.findViewById(R.id.orc)).getText().toString());
                    bundle.putFloat("orcamento",orcamento);
                    f.setArguments(bundle);
                    ft.replace(R.id.fragment,f);
                    ft.addToBackStack(null);
                    ft.commit();
                }

            }
        });

        return view;
    }

    public OrganizarFragment(){}

}