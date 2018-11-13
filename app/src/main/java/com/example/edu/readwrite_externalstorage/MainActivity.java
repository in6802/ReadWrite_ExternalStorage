package com.example.edu.readwrite_externalstorage;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextInput;
    Button buttonReadPublic, buttonWritePublic;

    Integer REQUEST_CODE = 100;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // design과 연결
        editTextInput = findViewById(R.id.editTextInput);
        buttonReadPublic = findViewById(R.id.buttonReadPublic);
        buttonWritePublic = findViewById(R.id.buttonWritePublic);
        buttonReadPublic.setOnClickListener(this);
        buttonWritePublic.setOnClickListener(this);

        // Dangerous Permission
        /*int permission = ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO);
        if(permission != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions
            (this, new String[]{Manifest.permission.RECORD_AUDIO}, REQUEST_CODE);
        }*/
    }



    /*@Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            Integer request_code = REQUEST_CODE;
            case request_code:
                if(grantResults.length > 0 || grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Log.i("","Permission has been granted by user");
                }
        }
    }*/

    @Override
    public void onClick(View view) {
        /*File file = null;

        switch(view.getId()){
            case R.id.buttonReadPublic:
                file
                break;
            case R.id.buttonWritePublic:
                break;
        }*/

    }



}
