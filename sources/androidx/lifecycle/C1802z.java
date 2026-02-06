package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.lifecycle.z  reason: case insensitive filesystem */
public abstract class C1802z extends Service implements C1798v {

    /* renamed from: a  reason: collision with root package name */
    private final Y f17275a = new Y(this);

    public C1790m getLifecycle() {
        return this.f17275a.a();
    }

    public IBinder onBind(Intent intent) {
        C6496s.h(intent, "intent");
        this.f17275a.b();
        return null;
    }

    public void onCreate() {
        this.f17275a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f17275a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i10) {
        this.f17275a.e();
        super.onStart(intent, i10);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
