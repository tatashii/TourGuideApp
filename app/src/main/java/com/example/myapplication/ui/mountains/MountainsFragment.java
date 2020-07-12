package com.example.myapplication.ui.mountains;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.CustomAdapter;
import com.example.myapplication.ModelClass;
import com.example.myapplication.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MountainsFragment extends Fragment {



    CustomAdapter customAdapter;
    ListView listView;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_mountains, container, false);

        final ArrayList<ModelClass> arrayList = new ArrayList<>();
        arrayList.add(new ModelClass(R.drawable.gorbea,getString(R.string.item_19) , getString(R.string.item_19_19)));
        arrayList.add(new ModelClass(R.drawable.torresanta, getString(R.string.item_20),getString(R.string.item_20_20)));
        arrayList.add(new ModelClass(R.drawable.picoyordas, getString(R.string.item_21), getString(R.string.item_21_21)));
        arrayList.add(new ModelClass(R.drawable.ted,getString(R.string.item_22) , getString(R.string.item_22_22)));
        arrayList.add(new ModelClass(R.drawable.cumbre_a_mansour,getString(R.string.item_23), getString(R.string.item_23_23)));
        arrayList.add(new ModelClass(R.drawable.kozz,getString(R.string.item_24),getString(R.string.item_24_24)));


        customAdapter = new CustomAdapter(getContext(), arrayList);
        listView =  view.findViewById(R.id.list_view);
        listView.setAdapter(customAdapter);
        return view;
    }
}