package com.example.csb47jk.emotionbatatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Toast;

import com.affectiva.android.affdex.sdk.Frame;
import com.affectiva.android.affdex.sdk.detector.CameraDetector;
import com.affectiva.android.affdex.sdk.detector.Detector;
import com.affectiva.android.affdex.sdk.detector.Face;

import java.util.List;

//Activity   //AppCompatActivity
public class MainActivity extends AppCompatActivity  implements Detector.ImageListener, CameraDetector.CameraEventListener  {

    SurfaceView cameraPreview;
    CameraDetector detector;

    int previewWidth = 0;
    int previewHeight = 0;




    // 切換手機前後鏡頭
    void switchCamera(CameraDetector.CameraType type) {
        detector.setCameraType(type);
    }

    //@SuppressWarnings("SuspiciousNameCombination")
    @Override
    public void onCameraSizeSelected(int width, int height, Frame.ROTATE rotate){
                 //  CameraDetector.CameraEventListener  必須實作 (abstract)  onCameraSizeSelected
        if (rotate == Frame.ROTATE.BY_90_CCW || rotate == Frame.ROTATE.BY_90_CW) {
            previewWidth = height;
            previewHeight = width;
        } else {
            previewHeight = height;
            previewWidth = width;
        }
        cameraPreview.requestLayout();

    }


    @Override
    public void onImageResults(List<Face> list, Frame frame, float v){
                // Detector.ImageListener 必須實作 (abstract)   onImageResults

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show();

    }
}
