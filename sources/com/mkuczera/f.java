package com.mkuczera;

import android.os.Vibrator;

public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    long[] f59170a;

    public f(long[] jArr) {
        this.f59170a = jArr;
    }

    public void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f59170a, -1);
            }
        } catch (Exception unused) {
        }
    }
}
