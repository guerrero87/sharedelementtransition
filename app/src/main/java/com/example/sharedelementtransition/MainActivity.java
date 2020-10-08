package com.example.sharedelementtransition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView titleImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        titleImage = findViewById(R.id.imgTitle);
    }

    public void loadNext(final View view) {
        ActivityOptionsCompat activityOptionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this, titleImage, "appTitle");

        Intent intent = new Intent(this, LoginActivity.class);

        startActivity(intent, activityOptionsCompat.toBundle());
    }
}