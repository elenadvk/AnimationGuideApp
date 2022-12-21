package com.example.animationguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LinearLayout introduction = findViewById(R.id.Layout);
        final LinearLayout characterdesign = findViewById(R.id.CDLayout);
        final LinearLayout storytelling = findViewById(R.id.SLayout);
        final LinearLayout animationlessons = findViewById(R.id.ALLayout);
        final LinearLayout programminginanimation= findViewById(R.id.PinALayout);
        final LinearLayout literature= findViewById(R.id.LLayout);
        final LinearLayout author = findViewById(R.id.Author);
        final LinearLayout sketch = findViewById(R.id.Sketches);

        sketch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Скетчи";
                Intent intent = new Intent(MainActivity.this, SketchActivity.class);
                intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                startActivity(intent);
                finish();
            }
        });

        author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic ="Об авторе";
                Intent intent = new Intent(MainActivity.this, AuthorActivity.class);
                intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                startActivity(intent);
                finish();
            }
        });

        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Введение в анимацию";

             //   if (selectedTopic.isEmpty()){
               //     Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
               // } else {
                    Intent intent = new Intent(MainActivity.this, IntrodActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
               // }
            }
        });
        characterdesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Дизайн персонажа и окружения";

            //    if (selectedTopic.isEmpty()){
              //      Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
              //  } else {
                    Intent intent = new Intent(MainActivity.this, GuideActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
              //  }

            }
        });
        storytelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Сторителлинг";

               // if (selectedTopic.isEmpty()){
                 //   Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
               // } else {
                    Intent intent = new Intent(MainActivity.this, com.example.animationguide.StoryActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
             //   }

            }

        });
        animationlessons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Уроки анимации";

             //   if (selectedTopic.isEmpty()){
               //     Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
               // } else {
                    Intent intent = new Intent(MainActivity.this, AnimLessActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
               // }
            }
        });
        programminginanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Программирование в анимации";


              //  if (selectedTopic.isEmpty()){
                //    Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
               // } else {
                    Intent intent = new Intent(MainActivity.this, ProgramActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
           //     }

            }
        });
        literature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Литература";

             //   if (selectedTopic.isEmpty()){
               //     Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
                //} else {
                    Intent intent = new Intent(MainActivity.this, LiterActivity.class);
                    intent.putExtra("" +
                            "selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
                //}
            }
        });
       /* reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Анимация - это искусство!";

         //       if (selectedTopic.isEmpty()){
           //         Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();
             //   } else {
                    Intent intent = new Intent(MainActivity.this, GuideActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic); //передаём выбранное значение кнопки в GuideActivity
                    startActivity(intent);
                    finish();
              //  }
            }
        }); */

    }

}