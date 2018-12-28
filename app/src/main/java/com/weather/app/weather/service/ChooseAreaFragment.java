package com.weather.app.weather.service;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.weather.app.weather.R;



import java.util.ArrayList;
import java.util.List;

public class ChooseAreaFragment extends Fragment {
    private ArrayAdapter<String>adapter;
    private List<String> dataList = new ArrayList<>();
    private TextView titleText;
    private TextView backButton;
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.choose_area,container,false);
        titleText = view.findViewById(R.id.title_text);
        backButton = (Button) view.findViewById(R.id.back_button);
        listView = view.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(adapter);
        return view;
    }

   // @Override
    public void OnActivityCreated(Bundle saveInstanceState){
     super.onActivityCreated(saveInstanceState);
    }
}
