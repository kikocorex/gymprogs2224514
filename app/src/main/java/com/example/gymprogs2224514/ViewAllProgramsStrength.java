package com.example.gymprogs2224514;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ViewAllProgramsStrength extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_programs_strength);

        ImageButton backButt = findViewById(R.id.backFromStrength);

        backButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackToViewAll();
            }

        });
    }

    public void BackToViewAll() {
        Intent intent = new Intent(this, ViewAllProgramsActivity.class);
        startActivity(intent);
    }

}