package com.facebook.react;

import P7.d;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import n7.C3863a;

/* renamed from: com.facebook.react.g  reason: case insensitive filesystem */
public abstract class C3361g extends Service implements d {

    /* renamed from: b  reason: collision with root package name */
    private static PowerManager.WakeLock f40895b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Set f40896a = new CopyOnWriteArraySet();

    /* renamed from: com.facebook.react.g$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P7.c f40897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ P7.a f40898b;

        a(P7.c cVar, P7.a aVar) {
            this.f40897a = cVar;
            this.f40898b = aVar;
        }

        public void run() {
            C3361g.this.f40896a.add(Integer.valueOf(this.f40897a.n(this.f40898b)));
        }
    }

    /* renamed from: com.facebook.react.g$b */
    class b implements B {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P7.a f40900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f40901b;

        b(P7.a aVar, A a10) {
            this.f40900a = aVar;
            this.f40901b = a10;
        }

        public void a(ReactContext reactContext) {
            C3361g.this.k(reactContext, this.f40900a);
            this.f40901b.m(this);
        }
    }

    /* renamed from: com.facebook.react.g$c */
    class c implements B {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P7.a f40903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J f40904b;

        c(P7.a aVar, J j10) {
            this.f40903a = aVar;
            this.f40904b = j10;
        }

        public void a(ReactContext reactContext) {
            C3361g.this.k(reactContext, this.f40903a);
            this.f40904b.s0(this);
        }
    }

    public static void e(Context context) {
        PowerManager.WakeLock wakeLock = f40895b;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) C3863a.c((PowerManager) context.getSystemService("power"))).newWakeLock(1, C3361g.class.getCanonicalName());
            f40895b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            f40895b.acquire();
        }
    }

    private void f(P7.a aVar) {
        if (M7.b.e()) {
            A h10 = h();
            h10.j(new b(aVar, h10));
            h10.start();
            return;
        }
        J c10 = i().c();
        c10.s(new c(aVar, c10));
        c10.z();
    }

    /* access modifiers changed from: private */
    public void k(ReactContext reactContext, P7.a aVar) {
        P7.c f10 = P7.c.f(reactContext);
        f10.d(this);
        UiThreadUtil.runOnUiThread(new a(f10, aVar));
    }

    public void a(int i10) {
    }

    public void b(int i10) {
        this.f40896a.remove(Integer.valueOf(i10));
        if (this.f40896a.size() == 0) {
            stopSelf();
        }
    }

    /* access modifiers changed from: protected */
    public ReactContext g() {
        if (!M7.b.e()) {
            return i().c().D();
        }
        A h10 = h();
        C3863a.d(h10, "getReactHost() is null in New Architecture");
        return h10.i();
    }

    /* access modifiers changed from: protected */
    public A h() {
        return ((C3446x) getApplication()).b();
    }

    /* access modifiers changed from: protected */
    public O i() {
        return ((C3446x) getApplication()).a();
    }

    /* access modifiers changed from: protected */
    public abstract P7.a j(Intent intent);

    /* access modifiers changed from: protected */
    public void l(P7.a aVar) {
        UiThreadUtil.assertOnUiThread();
        e(this);
        ReactContext g10 = g();
        if (g10 == null) {
            f(aVar);
        } else {
            k(g10, aVar);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        ReactContext g10 = g();
        if (g10 != null) {
            P7.c.f(g10).j(this);
        }
        PowerManager.WakeLock wakeLock = f40895b;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        P7.a j10 = j(intent);
        if (j10 == null) {
            return 2;
        }
        l(j10);
        return 3;
    }
}
