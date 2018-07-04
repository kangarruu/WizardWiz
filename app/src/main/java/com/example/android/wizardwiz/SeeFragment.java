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
        hotspots.add( new Hotspot(mContext.getString(R.string.florean_fortescue),
                mContext.getString(R.string.florean_fortescue_desciption),
                R.drawable.florean_fortescues));
        hotspots.add( new Hotspot(mContext.getString(R.string.three_broomsticks),
                mContext.getString(R.string.three_broomsticks_description),
                R.drawable.florean_fortescues));
        hotspots.add( new Hotspot(mContext.getString(R.string.honeydukes),
                mContext.getString(R.string.honeydukes_description),
                R.drawable.florean_fortescues));
        hotspots.add( new Hotspot(mContext.getString(R.string.madam_puddifoot),
                mContext.getString(R.string.madam_puddifoot_description),
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
