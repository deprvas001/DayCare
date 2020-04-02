package com.development.daycare.views.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.development.daycare.R;
import com.development.daycare.databinding.ActivityDayCareDetailBinding;

public class DayCareDetail extends AppCompatActivity implements View.OnClickListener {
ActivityDayCareDetailBinding detailBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailBinding = DataBindingUtil.setContentView(this,R.layout.activity_day_care_detail);
        detailBinding.fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab:
                String geoUri = "http://maps.google.com/maps?q=loc:" + "3.1390" + "," + "101.6869" + " (" + "Day Care" + ")";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(geoUri));
                startActivity(intent);
                break;
        }
    }
}
