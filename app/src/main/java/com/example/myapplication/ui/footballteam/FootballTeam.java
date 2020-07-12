package com.example.myapplication.ui.footballteam;

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

public class FootballTeam extends Fragment {

    CustomAdapter customAdapter;
    ListView listView;

    @Override
    public String toString() {
        return "FootballTeamFragment{" +
                "customAdapter=" + customAdapter +
                ", listView=" + listView +
                '}';
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_footballteam, container, false);

        final ArrayList<ModelClass> arrayList = new ArrayList<>();
        arrayList.add(new ModelClass(R.drawable.realmadrid,getString(R.string.item_13) , getString(R.string.item_13_13)));
        arrayList.add(new ModelClass(R.drawable.barcelona, getString(R.string.item_14),getString(R.string.item_14_14)));
        arrayList.add(new ModelClass(R.drawable.atleticomadrid, getString(R.string.item_15), getString(R.string.item_15_15)));
        arrayList.add(new ModelClass(R.drawable.sevilla,getString(R.string.item_16) , getString(R.string.item_16_16)));
        arrayList.add(new ModelClass(R.drawable.laspalmas,getString(R.string.item_17), getString(R.string.item_17_17)));
        arrayList.add(new ModelClass(R.drawable.valencia,getString(R.string.item_18),getString(R.string.item_18_18)));


        customAdapter = new CustomAdapter (getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}

