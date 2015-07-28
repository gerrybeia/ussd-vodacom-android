package com.schieben.ussd.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.schieben.ussd.R;
import com.schieben.ussd.AppController;
import com.schieben.ussd.model.Forfait;
 
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Forfait> forfaitLists;
 
    public CustomListAdapter(Activity activity, List<Forfait> forfaitLists) {
        this.activity = activity;
        this.forfaitLists = forfaitLists;
    }
    
    public CustomListAdapter(LayoutInflater inflater, List<Forfait> forfaitLists) {
        this.inflater = inflater;
        this.forfaitLists = forfaitLists;
    }
 
    @Override
    public int getCount() {
        return forfaitLists.size();
    }
 
    @Override
    public Object getItem(int location) {
        return forfaitLists.get(location);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
 
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
        Forfait m = forfaitLists.get(position);
        convertView = null;
       
    	if(m.getPrix()=="0")
    		convertView = inflater.inflate(R.layout.list_row_titre, null);
    	else
    		convertView = inflater.inflate(R.layout.list_row, null);
      
        if(m.getPrix()=="0"){
        
        	TextView price = (TextView) convertView.findViewById(R.id.titre);
            price.setText(m.getThumbnailUrl());
        
        }else{
        	
        	ImageView thumbNail = (ImageView) convertView.findViewById(R.id.megaImage);
            TextView price = (TextView) convertView.findViewById(R.id.price);
            thumbNail.setImageResource(R.drawable.ic_launcher);
            price.setText(m.getPrix());
            
        }
        return convertView;
    }
 
}