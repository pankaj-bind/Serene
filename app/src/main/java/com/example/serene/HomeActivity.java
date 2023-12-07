package com.example.serene;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Calendar;

public class HomeActivity extends AppCompatActivity {
    ImageButton profile, home, sleep, meditation, breath;
    TextView wishMeTextView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home = findViewById(R.id.home);
        sleep = findViewById(R.id.sleep);
        meditation = findViewById(R.id.meditation);
        profile = findViewById(R.id.profile);
        breath = findViewById(R.id.breath);

        wishMeTextView = findViewById(R.id.wishme);

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        updateGreeting(hour);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SleepActivity.class);
                startActivity(intent);
                finish();
            }
        });

        breath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BreathActivity.class);
                startActivity(intent);
                finish();
            }
        });

        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MeditationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void updateGreeting(int hour) {
        String greeting;

        if (hour >= 0 && hour < 12) {
            greeting = "Good Morning, Pankaj";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Good Afternoon, Pankaj";
        } else {
            greeting = "Good Night, Pankaj";
        }

        // Set the greeting in the TextView
        wishMeTextView.setText(greeting);
    }
}
