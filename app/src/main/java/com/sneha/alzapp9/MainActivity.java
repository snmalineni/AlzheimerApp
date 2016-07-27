package com.sneha.alzapp9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.net.Uri;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.provider.MediaStore;

public class MainActivity extends AppCompatActivity {

    private int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked( View arg0)
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null){

        Uri uri = data.getData();
        try {
            Bitmap thumbnail = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
            //Log.d(TAG, String.valueOf(bitmap));

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageBitmap(thumbnail);
        }   catch (Exception e) {
            e.printStackTrace();
        }

        }
    }
}
