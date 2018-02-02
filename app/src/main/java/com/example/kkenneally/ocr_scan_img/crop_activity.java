package com.example.kkenneally.ocr_scan_img;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.soundcloud.android.crop.Crop;

import java.io.File;

public class crop_activity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.chose_image){
            imageView.setImageDrawable(null);
            Crop.pickImage(this);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       /* super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){

            if(requestCode == Crop.REQUEST_PICK){
                Uri sourceUri = data.getData();
                Uri destinaitionUri = Uri.fromFile(new File(getCacheDir(), "cropped"));

                Crop.of(sourceUri, destinaitionUri).asSquare().start(this);
                imageView.setImageURI(Crop.getOutput(data));
            }
            else if(requestCode == Crop.REQUEST_CROP){
                handle(resultCode, data);
            }
        }*/
        if(requestCode == Crop.REQUEST_PICK && resultCode == RESULT_OK){
            beginCrop(data.getData());
        }else if(requestCode == Crop.REQUEST_CROP){
            handle(resultCode, data);
        }

    }
    private void beginCrop(Uri sourceUri){
        Uri destinaitionUri = Uri.fromFile(new File(getCacheDir(), "cropped"));
        Crop.of(sourceUri, destinaitionUri).asSquare().start(this);

    }

    private void handle(int resultCode, Intent data) {

        if (resultCode == RESULT_OK){
            imageView.setImageURI(Crop.getOutput(data));
        }else if(resultCode == Crop.RESULT_ERROR){
            Toast.makeText(this, Crop.getError(data).getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


}
