package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AddCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        Button uploadCsvButton = findViewById(R.id.uploadCsvButton);
        Button saveCourseButton = findViewById(R.id.saveCourseButton);

        uploadCsvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement CSV file picker logic here
            }
        });

        saveCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement saving course logic here
            }
        });
    }
}

