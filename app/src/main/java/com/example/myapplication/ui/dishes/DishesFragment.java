package com.example.myapplication.ui.dishes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.CustomAdapter;
import com.example.myapplication.ModelClass;
import com.example.myapplication.R;

import java.util.ArrayList;

public class DishesFragment extends Fragment {


    CustomAdapter customAdapter;
    ListView listView;

    @Override
    public String toString() {
        return "DishesFragment{" +
                "customAdapter=" + customAdapter +
                ", listView=" + listView +
                '}';
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_dishes, container, false);

        final ArrayList<ModelClass> arrayList = new ArrayList<>();
        arrayList.add(new ModelClass(R.drawable.paella,getString( R.string.item_7), getString(R.string.item_7_7)));
        arrayList.add(new ModelClass(R.drawable.pollo_al_ajillo, getString(R.string.item_8), getString(R.string.item_8_8)));
        arrayList.add(new ModelClass(R.drawable.gazpacho, getString(R.string.item_9), getString(R.string.item_9_9)));
        arrayList.add(new ModelClass(R.drawable.jam_n_ib_rico, getString(R.string.item_10), getString(R.string.item_10_10)));
        arrayList.add(new ModelClass(R.drawable.patatas_bravas,getString(R.string.item_11), getString(R.string.item_11_11)));
        arrayList.add(new ModelClass(R.drawable.chorizo,getString(R.string.item_12), getString(R.string.item_12_12)));


        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}
