package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScanExamActivity extends AppCompatActivity {

    private static final int BARCODE_READER_REQUEST_CODE = 1;
    private EditText gradeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_exam);

        Button scanButton = findViewById(R.id.scanButton);
        gradeEditText = findViewById(R.id.gradeEditText);
        Button saveGradeButton = findViewById(R.id.saveGradeButton);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to start the barcode scanner {change barcodemapactivity to actual barcode reading classs. made this change just to avoid error}
                Intent intent = new Intent(ScanExamActivity.this, BarcodeMapActivity.class); // BarcodeScannerActivity should be replaced with the actual scanner activity class from the library
                startActivityForResult(intent, BARCODE_READER_REQUEST_CODE);
            }
        });

        saveGradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here, you would save the grade associated with the scanned barcode
                // This example does not implement actual data saving
                String grade = gradeEditText.getText().toString();
                // Validate and save the grade
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == BARCODE_READER_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                String barcode = data.getStringExtra("barcode"); // "barcode" should match the key used in your scanner activity to return the result
                // Process the scanned barcode. For example, display it or lookup related data
                // For this example, we're just handling the grade input next
            }
        }
    }
}

