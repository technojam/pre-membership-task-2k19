package com.technojamtask;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.io.InputStream;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_WISHNAME1 = "com.technojamtask.EXTRA1";
    public static final String EXTRA_WISHNAME2 = "com.technojamtask.EXTRA2";
    public static final String EXTRA_WISH = "com.technojamtask.WISH";
    public static final String EXTRA_URI = "com.technojamtask.URI";
    public static final int PICK_IMAGE = 100;

    Uri imageUri = Uri.EMPTY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CoordinatorLayout coordinatorLayout = findViewById(R.id.mainactivity);

        Button submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Uri.EMPTY.equals(imageUri))
                openCard();
                else

                    showSnackBar();

            }

            private void showSnackBar(){
                Snackbar snackbar = Snackbar.make(coordinatorLayout, "Please select an image first!", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        Button gal = findViewById(R.id.gallery);
        gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openAbout();
            }
        });



    }

    public void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        ImageView img = findViewById(R.id.card);
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data.getData();
            img.setImageURI(imageUri);
        }
    }


    public void openCard() {
        EditText from = findViewById(R.id.fromName);
        String fromVal = from.getText().toString();
        EditText to = findViewById(R.id.toName);
        String toVal = to.getText().toString();
        EditText wish = findViewById(R.id.getWish);
        String wishVal = wish.getText().toString();

        Intent intent = new Intent(this, CardActivity.class);

        intent.putExtra(EXTRA_WISHNAME1, toVal);
        intent.putExtra(EXTRA_WISHNAME2, fromVal);
        intent.putExtra(EXTRA_WISH, wishVal);
        intent.putExtra(EXTRA_URI, imageUri.toString());
        startActivity(intent);

    }

    public void openAbout(){

        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }




}
