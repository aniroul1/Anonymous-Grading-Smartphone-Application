package com.example.helloworld;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class AddExamActivity extends AppCompatActivity {

    private EditText examDateEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exam);

        EditText examNameEditText = findViewById(R.id.examNameEditText);
        examDateEditText = findViewById(R.id.examDateEditText);
        EditText totalMarksEditText = findViewById(R.id.totalMarksEditText);
        Button saveExamButton = findViewById(R.id.saveExamButton);

        examDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        saveExamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement exam saving logic here
            }
        });
    }

    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                examDateEditText.setText(String.format("%d-%d-%d", year, month + 1, day));
            }
        }, year, month, dayOfMonth).show();
    }
}

