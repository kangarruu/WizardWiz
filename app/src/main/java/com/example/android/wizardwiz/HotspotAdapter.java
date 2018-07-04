package com.example.android.wizardwiz;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.wizardwiz.Hotspot;
import com.example.android.wizardwiz.R;

import java.util.ArrayList;
import java.util.List;

public class HotspotAdapter extends ArrayAdapter<Hotspot>{

    public HotspotAdapter(Activity context, ArrayList<Hotspot> hotspots){
        super(context, 0, hotspots);

    }

    /**
     *
     * @param position The position in the hotspots ArrayList that should be displayed in the list item view
     * @param convertView the recycled View to populate
     * @param parent The parent ViewGroup that is used in the inflation
     * @return The View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the Hotspot object located at this position in the list
        final Hotspot currentHotspot = getItem(position);

        //Locate the ImageView in the list_item XML associated with the ID list_item_imageView
        ImageView list_item_imageView = (ImageView) listItemView.findViewById(R.id.list_item_imageView);
        //Get the image from the current Hotspot and set it on the ImageView
        list_item_imageView.setImageResource(currentHotspot.getImageResourceID());

        //Locate the TextView in the list_item XML associated with the ID list_item_name_textView
        TextView list_item_name_textView = (TextView) listItemView.findViewById(R.id.list_item_name_textView);
        //Get the text from the current Hotspot and set it on the TextView
        list_item_name_textView.setText(currentHotspot.getHotspotName());

        //Locate the TextView in the list_item XML associated with the ID list_item_dscrp_textView
        TextView list_item_dscrp_textView = (TextView) listItemView.findViewById(R.id.list_item_dscrp_textView);
        //Get the description from the current Hotspot and set it on the TextView
        list_item_dscrp_textView.setText(currentHotspot.getHotspotDescription());

        return listItemView;
    }
}
