package com.kumballz.brian.stop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavigationActivity extends CategoryActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_navigation);
    }


    public void onClickMapsActivity(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
