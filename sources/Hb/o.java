package Hb;

import Lb.k;
import android.os.Handler;
import android.os.Looper;

public class o implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f50882a = new Handler(Looper.getMainLooper());

    public void b(Runnable runnable) {
        this.f50882a.post(runnable);
    }

    public void a() {
    }
}
