package com.javahe.qqznav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.javahe.qqznav.view.MovedImageView;

public class MainActivity extends AppCompatActivity {

    private MovedImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MovedImageView.Position position = new MovedImageView.Position();
                position.x = 10;
                position.y = 10;
                iv.move(position);
            }
        });
    }
}
