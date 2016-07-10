package com.codecup.childsparty;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gio on 7/10/2016.
 */
public class CarrinhoAdapter extends BaseAdapter{
    private Activity context;
    static ArrayList<String> names;
    static ArrayList<String> prices;
    static ArrayList<String> qtdA;

    public CarrinhoAdapter(Activity context) {
        this.context = context;
        this.names = Carrinho.names;
        this.prices = Carrinho.prices;
        this.qtdA = Carrinho.qtdA;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.item_carrinho, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.carrinho_item_name);
        TextView preco = (TextView) rowView.findViewById(R.id.carrinho_item_preco);
        TextView qtd = (TextView) rowView.findViewById(R.id.carrinho_item_qtd);


        ImageView deleteBtn = (ImageView)rowView.findViewById(R.id.delete_btn);
        deleteBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //do something
                names.remove(position); //or some other task
                prices.remove(position);
                qtdA.remove(position);
                notifyDataSetChanged();
            }
        });

        txtTitle.setText(names.get(position));
        preco.setText(prices.get(position));
        qtd.setText(qtdA.get(position));
        return rowView;
    }

    void removeProduct(int position){
        names.remove(position); //or some other task
        prices.remove(position);
        qtdA.remove(position);
        Carrinho.removeProduct(position);
    }


}
