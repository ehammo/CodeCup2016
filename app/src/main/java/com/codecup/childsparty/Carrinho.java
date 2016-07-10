package com.codecup.childsparty;

import java.util.ArrayList;

/**
 * Created by eduardo on 10/07/2016.
 */
public class Carrinho {
    static ArrayList<String> names;
    static ArrayList<String> prices;
    static ArrayList<String> qtdA;

    public static void addNew(String nome, String preco, String qtd){
        names.add(nome);
        prices.add(preco);
        qtdA.add(qtd);
    }

    public static void removeProduct(int position) {
        names.remove(position); //or some other task
        prices.remove(position);
        qtdA.remove(position);
    }
}
