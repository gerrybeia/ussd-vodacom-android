package com.schieben.ussd.fragment;

import java.util.ArrayList;
import java.util.List;
import com.schieben.ussd.R;
import com.schieben.ussd.adapter.CustomListAdapter;
import com.schieben.ussd.model.Forfait;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class InternetFragment  extends Fragment {
	
	private CustomListAdapter adapter;
	private List<Forfait> forfaitListe;
	private Forfait f;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_internet, container, false);
        
        forfaitListe = new ArrayList<Forfait>();
        ListView listview = (ListView) rootView.findViewById(R.id.listActivation);
        adapter = new CustomListAdapter(this.getActivity(), forfaitListe);
        
        //FORCE A TITRE
        forfaitListe.add(new Forfait("0", " Daily - valable jusqu\'à 23h59 "));
        //FORFAITS
        forfaitListe.add(new Forfait("0,50 $", "none"));
        forfaitListe.add(new Forfait("1 $", "none"));
        forfaitListe.add(new Forfait("2 $", "none"));
        
        //FORCE A TITRE
        forfaitListe.add(new Forfait("0", " Weekly - valable pendant 7 jours "));
        //FORFAITS
        forfaitListe.add(new Forfait("2 $", "none"));
        forfaitListe.add(new Forfait("5 $", "none"));
        forfaitListe.add(new Forfait("10 $", "none"));
        
        listview.setAdapter(adapter);        
        
        
        //adapter.notifyDataSetChanged();
        
        return rootView;
    }


}
