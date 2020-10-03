package com.example.myapplication ;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.net.Uri;

import com.example.myapplication.Main2Activity;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST=0;
    private static final int RESULT_LOAD_IMAGE=1;

    Button generateButton;
    EditText fromText;
    EditText toText;
    EditText wishText;
    Button browseButton;
    ImageView imagePreview;
    Uri selectedImage;
    String mImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateButton=findViewById(R.id.generateButton);
        fromText=findViewById(R.id.fromText);
        toText=findViewById(R.id.toText);
        wishText=findViewById(R.id.wishText);
        browseButton=(Button)findViewById(R.id.browseButton);
        imagePreview=(ImageView)findViewById(R.id.previewButton);

        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},PERMISSION_REQUEST);
        }

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("value",fromText.getText().toString());
                i.putExtra("value2",toText.getText().toString());
                i.putExtra("value3",wishText.getText().toString());
                i.putExtra("URI_VALUE",mImageUri);
                startActivity(i);

            }
        });

        browseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(in,RESULT_LOAD_IMAGE);

            }
        });
    }
    public void OnRequestsPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        switch(requestCode){
            case PERMISSION_REQUEST:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Permission granted!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,"Permission not granted!",Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
    }
    protected void onActivityResult(int requestCode,int ResultCode,Intent data){
        if(ResultCode==RESULT_OK){
            switch(requestCode){
                case RESULT_LOAD_IMAGE:
                    selectedImage= data.getData();
                    mImageUri = selectedImage.toString();
                    Log.d("Log_test", "imzge uri " + selectedImage);
                    imagePreview.setImageURI(selectedImage);
            }
        }
    }
}