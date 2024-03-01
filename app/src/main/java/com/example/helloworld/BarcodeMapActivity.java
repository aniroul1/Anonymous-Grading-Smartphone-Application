package com.example.helloworld;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class BarcodeMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_map);

        ListView barcodeNameListView = findViewById(R.id.barcodeNameListView);

        // Assume you have a method to get data
        String[] data = getBarcodeNameData();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        barcodeNameListView.setAdapter(adapter);
    }

    private String[] getBarcodeNameData() {
        // This should be replaced with actual data retrieval logic
        return new String[]{"Barcode1 - Name1", "Barcode2 - Name2"};
    }
}
