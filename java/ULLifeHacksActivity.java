package com.kumballz.brian.stop;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ULLifeHacksActivity extends CategoryActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_ullife_hacks);
    }

    public void onClickStudyActivity(View view) {
        Intent intent = new Intent(this, StudyActivity.class);
        startActivity(intent);
    }
    public void onClickToiletActivity(View view) {
        Intent intent = new Intent(this, ToiletActivity.class);
        startActivity(intent);
    }
    public void onClickParkingActivity(View view) {
        Intent intent = new Intent(this, ParkingActivity.class);
        startActivity(intent);
    }
    public void onClickBusActivity(View view) {
        Intent intent = new Intent(this, BusActivity.class);
        startActivity(intent);
    }
    public void onClickShortcutActivity(View view) {
        Intent intent = new Intent(this, ShortcutActivity.class);
        startActivity(intent);
    }
    public void onClickSceneryActivity(View view) {
        Intent intent = new Intent(this, SceneryActivity.class);
        startActivity(intent);
    }
}
