package com.example.android.wizardwiz;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeeFragment extends Fragment {
    Context mContext;

    public SeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hotspot_list, container, false);

        //Create a list of Hotspots @param a hotspot title, hotspot description and image
        final ArrayList<Hotspot> hotspots = new ArrayList<>();
        hotspots.add( new Hotspot(getString(R.string.owl_post),
                getString(R.string.owl_post_description),
                R.drawable.owl_post));
        hotspots.add( new Hotspot(getString(R.string.hogsmeade),
                getString(R.string.hogsmeade_description),
                R.drawable.hogsmeade));
        hotspots.add( new Hotspot(getString(R.string.gringotts),
                getString(R.string.gringotts_description),
                R.drawable.gringotts));
        hotspots.add( new Hotspot(getString(R.string.diagon_alley),
                getString(R.string.diagon_alley_description),
                R.drawable.diagon_alley));

        //Create a HotspotAdapter, whose data source is the ArrayList<Hotspot> hotspots
        HotspotAdapter adapter = new HotspotAdapter(getActivity(), hotspots);
        //Locate the listView object with the ID R.id.hotspot_listview
        final ListView listView = (ListView) rootView.findViewById(R.id.hotspot_listview);
        //Set the adapter on the listView
        listView.setAdapter(adapter);

        return rootView;
    }

}
