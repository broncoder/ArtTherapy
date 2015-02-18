package com.example.matthewjin.arttherapy;

/**
 * Created by MatthewJin on 2/17/15.
 */
public interface ShakeListener {
    public void onAccelerationChanged(float x, float y, float z);

    public void onShake(float force);
}
