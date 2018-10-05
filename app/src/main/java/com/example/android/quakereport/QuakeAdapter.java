package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter<Q> extends ArrayAdapter<Quakedetails> {

   public QuakeAdapter (Activity context, ArrayList <Quakedetails> earthquakes){
   super(context, 0, earthquakes);
    }

    @Override
   public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if(listItemView == null){
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.quakelayout_activity, parent, false);
        }

        //get the object located at position
        Quakedetails quake_feature = getItem(position);


        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(quake_feature.getDate());


        TextView magTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magTextView.setText(quake_feature.getMagnitude());


        TextView locTextView = (TextView) listItemView.findViewById(R.id.location);
        locTextView.setText(quake_feature.getCity());

        return listItemView;
 }
}

