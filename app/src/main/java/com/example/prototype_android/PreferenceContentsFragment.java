package com.example.prototype_android;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PreferenceContentsFragment extends Fragment {
    private TextView checkbox = null;
    private TextView ringtone = null;
    private TextView text = null;
    private TextView list = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.content, parent, false);

        checkbox = (TextView) result.findViewById(R.id.checkbox);
        ringtone = (TextView) result.findViewById(R.id.ringtone);
        text = (TextView) result.findViewById(R.id.text);
        list = (TextView) result.findViewById(R.id.list);

        return (result);
    }

    @Override
    public void onResume() {
        super.onResume();

        SharedPreferences prefs =
                PreferenceManager.getDefaultSharedPreferences(getActivity());

        checkbox.setText(Boolean.valueOf(prefs.getBoolean("checkbox", false)).toString());
        ringtone.setText(prefs.getString("ringtone", "<unset>"));
        text.setText(prefs.getString("text", "<unset>"));
        list.setText(prefs.getString("list", "<unset>"));
    }
}