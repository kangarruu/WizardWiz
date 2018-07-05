package com.example.android.wizardwiz;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatFragment extends Fragment {

    public EatFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hotspot_list, container, false);


        //Create a list of Hotspots @param a hotspot title, hotspot description and image
        final ArrayList<Hotspot> hotspots = new ArrayList<>();
        hotspots.add( new Hotspot(getString(R.string.honeydukes),
                getString(R.string.honeydukes_description),
                R.drawable.honeydukes));
        hotspots.add( new Hotspot(getString(R.string.madam_puddifoot),
                getString(R.string.madam_puddifoot_description),
                R.drawable.madam_puddifoot));
        hotspots.add( new Hotspot(getString(R.string.florean_fortescue),
                getString(R.string.florean_fortescue_desciption),
                R.drawable.florean_fortescues));


        //Create a HotspotAdapter, whose data source is the ArrayList<Hotspot> hotspots
        HotspotAdapter adapter = new HotspotAdapter(getActivity(), hotspots);
        //Locate the listView object with the ID R.id.hotspot_listview
        final ListView listView = (ListView) rootView.findViewById(R.id.hotspot_listview);
        //Set the adapter on the listView
        listView.setAdapter(adapter);



        return rootView;
    }

}
