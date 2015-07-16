package com.pluusystem.toolsapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);

		ListView listView = (ListView) findViewById(R.id.listView);

		List<String> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add("Item " + i);
		}
		ArrayAdapter<String> adapter
			= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(adapter);
	}

}
