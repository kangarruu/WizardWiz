package com.example.android.wizardwiz;

//Hotspot object

public class Hotspot {
    //Name of a featured location
    private String mHotspotName;
    //Additional information about a given location
    private String mHotspotDescription;
    //An image associated with a given location
    private int mImageResourceID;

    /** Create a Hotspot constructor:
     * @param HotspotName is the name of the location provided in the ArrayList
     * @param HotspotDescription is a snippet of information about the location
     * @param ImageResourceID is a drawable reference ID that is associated with the location
     */
    public Hotspot(String HotspotName, String HotspotDescription, int ImageResourceID){
        mHotspotName = HotspotName;
        mHotspotDescription = HotspotDescription;
        mImageResourceID = ImageResourceID;
    }

    //Create public getter methods to access the HotSpot variables
    public String getHotspotName(){
        return mHotspotName;
    }

    public String getHotspotDescription(){
        return mHotspotDescription;
    }

    public int getImageResourceID(){
        return mImageResourceID;
    }
}
