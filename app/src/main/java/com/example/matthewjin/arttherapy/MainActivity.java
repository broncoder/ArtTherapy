package com.example.matthewjin.arttherapy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity implements ShakeListener {

    private CanvasView customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCanvas = (CanvasView) findViewById(R.id.signature_canvas);
    }
    @Override
    public void onAccelerationChanged(float x, float y, float z) {
    }
    @Override
    public void onShake(float force) {
        Intent playEffectIntent = new Intent(this, PlayEffect.class);
        startService(playEffectIntent);
        customCanvas.clearCanvas();
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (ShakeManager.isSupported(this)) {
            ShakeManager.startListening(this);
        }
    }
    @Override
    public void onStop() {
        super.onStop();
        if (ShakeManager.isListening()) {
            ShakeManager.stopListening();
        }
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (ShakeManager.isListening()) {
            ShakeManager.stopListening();
        }
    }
}