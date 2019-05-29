package com.yt.youbike;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        String url = "http://data.ntpc.gov.tw/api/v1/rest/datastore/382000000A-000352-001";
        new BikeTask().execute(url);

    }


    class BikeTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            StringBuffer json = new StringBuffer();

            try {
                URL url = new URL(params[0]);
                Log.d(TAG, "AsyncTask doInBackground: " + params[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                InputStream is = connection.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = br.readLine();
                while (line != null) {
                    json.append(line);
                    line = br.readLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return json.toString();
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            /*JSONObject jonObject = null;
            List<Bike> bikes = new ArrayList<>();

            try {
                jonObject = new JSONObject(result.toString());
                JSONObject resultObj = jonObject.getJSONObject("result");
                JSONArray recordArray = resultObj.getJSONArray("records");

                for (int i = 0; i < recordArray.length(); i++) {
                    JSONObject object = recordArray.getJSONObject(i);
                    String name = object.getString("sna");
                    String address = object.getString("ar");
                    String totalNumber = object.getString("tot");
                    String lendNumber = object.getString("sbi");
                    String returnNumber = object.getString("bemp");
                    String latitude = object.getString("lat");
                    String longitude = object.getString("lng");
                    bikes.add(new Bike(name, address, totalNumber,
                            lendNumber, returnNumber, latitude, longitude));
                    Log.d(TAG, "AsyncTask onPostExecute: " +
                            name + address+ totalNumber +
                            lendNumber + returnNumber +
                            latitude + longitude);
                }

                recycler.setAdapter(new BikeAdapter(bikes));


            } catch (JSONException e) {
                e.printStackTrace();
            }*/


            Gson gson = new Gson();
            Type listType = new TypeToken<Station>(){}.getType();
            Station station = gson.fromJson(result, listType);
            Result stationResult = station.getResult();
            Records[] records = stationResult.getRecords();
            int index = 0;

            for (Records record: records) {
                String name = record.getName();
                String address = record.getAddress();
                String totalNumber = record.getTotalNumber();
                String lendNumber = record.getLendNumber();
                String returnNumber = record.getReturnNumber();
                String latitude = record.getLatitude();
                String longitude = record.getLongitude();
                records[index] = new Records(name, address,
                        totalNumber, lendNumber,
                        returnNumber, latitude, longitude);
                index++;

                Log.d(TAG, "AsyncTask onPostExecute: " +
                        index + name + address+ totalNumber +
                        lendNumber + returnNumber +
                        latitude + longitude);
            }

            recycler.setAdapter(new StationAdapter(station));


        }
    }

}
