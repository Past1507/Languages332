package com.example.languages332;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Spinner switch_language;
    Button btn_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int select = switch_language.getSelectedItemPosition();
                Locale locale = null;
                if (select==0) {
                    locale = new Locale("ru");}
                        else {
                        locale = new Locale("en");
                }
                Configuration config = new Configuration();
                config.setLocale(locale);
                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                recreate();
            }
        });
    }

    private void initView() {
        switch_language = findViewById(R.id.switching);
        btn_switch = findViewById(R.id.btn_switch);
    }
}
