package com.example.prototype_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PreferenceMainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actions, menu);

        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            startActivity(new Intent(this, EditPreferences.class));
//            Intent intent = new Intent(this, EditPreferences.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            this.startActivity(intent);

            return (true);
        }

        return (super.onOptionsItemSelected(item));
    }
}