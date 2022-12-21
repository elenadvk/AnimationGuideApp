package com.example.animationguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimLessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lessons);

        final ImageView backArrow = findViewById(R.id.backArrow);
        final TextView selectedTopicName = findViewById(R.id.selectedTopicName);

        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic"); //получаем значение выбранной кнопки

        selectedTopicName.setText(getSelectedTopic); //




        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnimLessActivity.this, MainActivity.class));
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){
        startActivity(new Intent(AnimLessActivity.this, MainActivity.class));
        finish();
    }
}
