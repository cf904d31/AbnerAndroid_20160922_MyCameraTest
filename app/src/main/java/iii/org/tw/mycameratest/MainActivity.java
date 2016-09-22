package iii.org.tw.mycameratest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private ImageView imgView;
    private File sdroot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.imgView);
    }

    public void takePicture1(View v) {
        Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(it,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            //afterPic1(data);
            afterPic2();
        } else if (requestCode == RESULT_CANCELED) {

        }
    }


    private void afterPic1(Intent data) {
        Bitmap bmp = (Bitmap) data.getExtras().get("data");
        imgView.setImageBitmap(bmp);
    }

    private void afterPic2() {

    }

    public void takePicture2(View v) {

    }
}
