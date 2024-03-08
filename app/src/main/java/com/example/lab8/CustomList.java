package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    public void addCity(City city){
        cities.add(city);
    }

    public boolean hasCity(City city) {
        // Iterate through the list of cities and check if the given city is present
        for (City c : cities) {
            if (c.equals(city)) {
                return true; // Return true if the city is found
            }
        }
        return false; // Return false if the city is not found
    }

    public void deleteCity(City city) {
        // Iterate through the list of cities and remove the matching city
        Iterator<City> iterator = cities.iterator();
        while (iterator.hasNext()) {
            City c = iterator.next();
            if (c.equals(city)) {
                iterator.remove(); // Remove the city if it matches
                break; // Exit the loop after removing the city
            }
        }
    }

    public int countCities() {
        // Return the size of the cities list
        return cities.size();
    }
}
