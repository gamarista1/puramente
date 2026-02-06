package com.mkuczera;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    int f59169a;

    e(int i10) {
        this.f59169a = i10;
    }

    public void a(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(VibrationEffect.createPredefined(this.f59169a));
                }
            } catch (Exception unused) {
            }
        }
    }
}
