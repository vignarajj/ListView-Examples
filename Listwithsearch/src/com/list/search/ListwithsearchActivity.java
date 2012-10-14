package com.list.search;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class ListwithsearchActivity extends Activity
{
	// List view
	private ListView lv;
	// Listview Adapter
	ArrayAdapter<String> adapter;
	// Search EditText
	EditText inputSearch;
	// ArrayList for Listview
	ArrayList<HashMap<String, String>> cityList;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Listview Data
        String city[] = {"New Delhi", "Kolkata", "Mumbai", "Udaipur", "Jaipur", "Shimla", "Hydrabad", "Allahabad", "Kanpur", "Kota", "Jodhpur", "Manali", "Bharatpur", "Indore","Pune"};
        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.city_name, city);
        lv.setAdapter(adapter);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() 
        {

			public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) 
			{
				// When user changed the Text
				ListwithsearchActivity.this.adapter.getFilter().filter(cs);	
			}

			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) 
			{
				// TODO Auto-generated method stub

			}

			public void afterTextChanged(Editable arg0) 
			{
				// TODO Auto-generated method stub							
			}
		});
    }

}