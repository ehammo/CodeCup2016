package com.codecup.childsparty;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by eduardo on 09/07/2016.
 */
public class ProdutoAdapter extends ArrayAdapter<String>{

private final Activity context;
private final String[] web;
private final Integer[] imageId;
public ProdutoAdapter(Activity context, String[] web, Integer[] imageId) {
        super(context, R.layout.produto_single, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

        }
@Override
public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        view= inflater.inflate(R.layout.produto_single, null, true);
        TextView txtTitle = (TextView) view.findViewById(R.id.txt);

        ImageView imageView = (ImageView) view.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);

        Log.e("txt da view", web[position]);

        return view;
        }
}
