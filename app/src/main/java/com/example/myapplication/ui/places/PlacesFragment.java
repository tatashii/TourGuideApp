package com.example.myapplication.ui.places;

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
import java.util.List;

public class PlacesFragment extends Fragment {

    CustomAdapter customAdapter;
    ListView listView;

    @Override
    public String toString() {
        return "PlacesFragment{" +
                "customAdapter=" + customAdapter +
                ", listView=" + listView +
                '}';
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_places, container, false);

        final ArrayList<ModelClass> arrayList = new ArrayList<>();
        arrayList.add(new ModelClass(R.drawable.eshbilia,getString(R.string.item_1) , getString(R.string.item_1_1)));
        arrayList.add(new ModelClass(R.drawable.elhamra, getString(R.string.item_2),getString(R.string.item_2_2)));
        arrayList.add(new ModelClass(R.drawable.joual, getString(R.string.item_3), getString(R.string.item_3_3)));
        arrayList.add(new ModelClass(R.drawable.madredpalace,getString(R.string.item_4) , getString(R.string.item_4_4)));
        arrayList.add(new ModelClass(R.drawable.janaelaref,getString(R.string.item_5), getString(R.string.item_5_5)));
        arrayList.add(new ModelClass(R.drawable.kortoba,getString(R.string.item_6),getString(R.string.item_6_6)));


        customAdapter = new CustomAdapter (getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}
