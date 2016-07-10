package com.codecup.childsparty;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FornecedorAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final int[] imageId;
    private final String[] end;
    private final String[] foneArray;
    private final String[] tagArray;
    public FornecedorAdapter(Activity context, String[] web, int[] imageId, String[] end, String[] fone,String[] tag) {
        super(context, R.layout.fornecedor_single, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.end=end;
        this.tagArray=tag;
        this.foneArray=fone;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.fornecedor_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        TextView endereco = (TextView) rowView.findViewById(R.id.end);
        TextView fone = (TextView) rowView.findViewById(R.id.fone);
        TextView tag = (TextView) rowView.findViewById(R.id.tag);


        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        endereco.setText(end[position]);
        fone.setText(foneArray[position]);
        tag.setText(tagArray[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;
    }
}


