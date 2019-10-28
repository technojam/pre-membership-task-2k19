package com.technojamtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Intent intent = getIntent();

        String fromVal = intent.getStringExtra(MainActivity.EXTRA_WISHNAME2);
        String toVal = intent.getStringExtra(MainActivity.EXTRA_WISHNAME1);
        String wish = intent.getStringExtra(MainActivity.EXTRA_WISH);
        Uri myUri = Uri.parse(intent.getStringExtra(MainActivity.EXTRA_URI));

        TextView fromN = findViewById(R.id.fromWish);
        TextView toN = findViewById(R.id.toWish);
        TextView wi = findViewById(R.id.wish);
        ConstraintLayout cs = findViewById(R.id.cardview);

        if(!isNullOrEmpty(fromVal)) {
            fromN.setText("-" + fromVal);
        }
        if(!isNullOrEmpty(toVal)){
            toN.setText(toVal);
        }
        if(!isNullOrEmpty(wish)) {
            wi.setText(wish);
        }

            Bitmap bitmap;

            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), myUri);
            } catch (Exception e) {
                return;
            }

        DisplayMetrics display=this.getResources().getDisplayMetrics();

        Bitmap bitmap2 =Bitmap.createScaledBitmap(bitmap, display.widthPixels,display.heightPixels, true);

        Drawable d = new BitmapDrawable(getResources(), bitmap2);
        cs.setBackground(d);

    }
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }

}
