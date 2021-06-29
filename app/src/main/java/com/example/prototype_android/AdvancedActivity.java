package com.example.prototype_android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class AdvancedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    SharedPreferences sharedPref = AdvancedActivity.this.getPreferences(Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPref.edit();

    EditText activityName = (EditText) findViewById(R.id.editTextTextPersonName);
    EditText activityEmail = (EditText) findViewById(R.id.editEmail);

    public void register(View view) {
        String name = activityName.getText().toString();
        String email = activityEmail.getText().toString();

        editor.putString("name", name);
        editor.putString("email", email);

        editor.apply();
    }

    public void charge(View view) {
        String savedName = sharedPref.getString("name", null);
        String savedEmail = sharedPref.getString("email", null);

        activityName.setText(savedName);
        activityEmail.setText(savedEmail);
    }

    public void remove(View view) {
        editor.remove("name");
        editor.remove("email");

        activityName.setText("");
        activityEmail.setText("");

        editor.apply();
    }
}