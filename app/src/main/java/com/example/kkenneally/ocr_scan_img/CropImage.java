
package com.example.kkenneally.ocr_scan_img;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.ImageView;
        import android.widget.Toast;

        import java.io.File;

/**
 * Created by k.kenneally on 02/02/2018.
 */

public class CropImage {

    private static final String TAG = MainActivity.class.getSimpleName();
    ImageView imageView;
    MainActivity mainActivity = new MainActivity();

    public void begin(Uri outputFileDir){
        Log.e(TAG, "CROP HAS STARTED");

        imageView.setImageDrawable(null);
        //  com.soundcloud.android.crop.Crop.pickImage();
    }



    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }*/

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.chose_image){
            imageView.setImageDrawable(null);
            com.soundcloud.android.crop.Crop.pickImage(this);
        }
        return super.onOptionsItemSelected(item);
    }*/


   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

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
       /* if(requestCode == com.soundcloud.android.crop.Crop.REQUEST_PICK && resultCode == RESULT_OK){
            beginCrop(data.getData());
        }else if(requestCode == com.soundcloud.android.crop.Crop.REQUEST_CROP){
            handle(resultCode, data);
        }

    }
    private void beginCrop(Uri sourceUri){
        Uri destinaitionUri = Uri.fromFile(new File(getCacheDir(), "cropped"));
        com.soundcloud.android.crop.Crop.of(sourceUri, destinaitionUri).asSquare().start(this);

    }

    private void handle(int resultCode, Intent data) {

        if (resultCode == RESULT_OK){
            imageView.setImageURI(com.soundcloud.android.crop.Crop.getOutput(data));
        }else if(resultCode == com.soundcloud.android.crop.Crop.RESULT_ERROR){
            Toast.makeText(this, com.soundcloud.android.crop.Crop.getError(data).getMessage(), Toast.LENGTH_SHORT).show();
        }
    }*/


}
