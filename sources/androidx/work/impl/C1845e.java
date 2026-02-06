package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.work.A;
import u1.h;

/* renamed from: androidx.work.impl.e  reason: case insensitive filesystem */
public class C1845e implements A {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f18903a = h.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f18903a.removeCallbacks(runnable);
    }

    public void b(long j10, Runnable runnable) {
        this.f18903a.postDelayed(runnable, j10);
    }
}
