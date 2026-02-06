package androidx.work.impl.background.systemalarm;

import Q3.w;
import android.content.Intent;
import androidx.lifecycle.C1802z;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.s;

public class SystemAlarmService extends C1802z implements g.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f18836d = s.i("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private g f18837b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18838c;

    private void e() {
        g gVar = new g(this);
        this.f18837b = gVar;
        gVar.m(this);
    }

    public void b() {
        this.f18838c = true;
        s.e().a(f18836d, "All commands completed in dispatcher");
        w.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f18838c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18838c = true;
        this.f18837b.k();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f18838c) {
            s.e().f(f18836d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f18837b.k();
            e();
            this.f18838c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f18837b.a(intent, i11);
        return 3;
    }
}
