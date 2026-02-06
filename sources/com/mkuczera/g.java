package com.mkuczera;

import android.os.Vibrator;

public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    int f59171a;

    public g(int i10) {
        this.f59171a = i10;
    }

    public void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate((long) this.f59171a);
            }
        } catch (Exception unused) {
        }
    }
}
