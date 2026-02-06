package com.bugsnag.android;

import K4.b;
import K4.t;
import L4.d;
import Sg.p;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.bugsnag.android.C3238g0;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import lf.v;
import lf.w;
import mf.O;

/* renamed from: com.bugsnag.android.b0  reason: case insensitive filesystem */
public final class C3223b0 {

    /* renamed from: a  reason: collision with root package name */
    private final H f38651a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f38652b;

    /* renamed from: c  reason: collision with root package name */
    private final d f38653c;

    /* renamed from: d  reason: collision with root package name */
    private final X f38654d;

    /* renamed from: e  reason: collision with root package name */
    private final File f38655e;

    /* renamed from: f  reason: collision with root package name */
    private final d f38656f;

    /* renamed from: g  reason: collision with root package name */
    private final b f38657g;

    /* renamed from: h  reason: collision with root package name */
    private final S0 f38658h;

    /* renamed from: i  reason: collision with root package name */
    private final DisplayMetrics f38659i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f38660j = s();

    /* renamed from: k  reason: collision with root package name */
    private final Float f38661k = p();

    /* renamed from: l  reason: collision with root package name */
    private final Integer f38662l = q();

    /* renamed from: m  reason: collision with root package name */
    private final String f38663m = r();

    /* renamed from: n  reason: collision with root package name */
    private final String f38664n = Locale.getDefault().toString();

    /* renamed from: o  reason: collision with root package name */
    private final String[] f38665o = k();

    /* renamed from: p  reason: collision with root package name */
    private Map f38666p;

    /* renamed from: q  reason: collision with root package name */
    private final Future f38667q = v();

    /* renamed from: r  reason: collision with root package name */
    private AtomicInteger f38668r;

    public C3223b0(H h10, Context context, Resources resources, d dVar, X x10, File file, d dVar2, b bVar, S0 s02) {
        this.f38651a = h10;
        this.f38652b = context;
        this.f38653c = dVar;
        this.f38654d = x10;
        this.f38655e = file;
        this.f38656f = dVar2;
        this.f38657g = bVar;
        this.f38658h = s02;
        this.f38659i = resources.getDisplayMetrics();
        this.f38668r = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer a10 = x10.a();
        if (a10 != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(a10.intValue()));
        }
        String g10 = x10.g();
        if (g10 != null) {
            linkedHashMap.put("osBuild", g10);
        }
        this.f38666p = linkedHashMap;
    }

    /* access modifiers changed from: private */
    public static final Long e(C3223b0 b0Var) {
        return Long.valueOf(b0Var.f38655e.getUsableSpace());
    }

    private final Long g() {
        Long l10;
        Object obj;
        ActivityManager a10 = K.a(this.f38652b);
        Long l11 = null;
        if (a10 == null) {
            l10 = null;
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            a10.getMemoryInfo(memoryInfo);
            l10 = Long.valueOf(memoryInfo.totalMem);
        }
        if (l10 != null) {
            return l10;
        }
        try {
            v.a aVar = v.f71841b;
            obj = v.b((Long) Process.class.getDeclaredMethod("getTotalMemory", (Class[]) null).invoke((Object) null, (Object[]) null));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            l11 = obj;
        }
        return l11;
    }

    private final boolean h() {
        try {
            d dVar = this.f38656f;
            if (dVar == null || !((Boolean) dVar.get()).booleanValue()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final String m() {
        try {
            if (t()) {
                return "allowed";
            }
            return "disallowed";
        } catch (Exception unused) {
            this.f38658h.e("Could not get locationStatus");
            return null;
        }
    }

    private final String n() {
        return this.f38651a.c();
    }

    private final Float p() {
        DisplayMetrics displayMetrics = this.f38659i;
        if (displayMetrics == null) {
            return null;
        }
        return Float.valueOf(displayMetrics.density);
    }

    private final Integer q() {
        DisplayMetrics displayMetrics = this.f38659i;
        if (displayMetrics == null) {
            return null;
        }
        return Integer.valueOf(displayMetrics.densityDpi);
    }

    private final String r() {
        DisplayMetrics displayMetrics = this.f38659i;
        if (displayMetrics == null) {
            return null;
        }
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        DisplayMetrics displayMetrics2 = this.f38659i;
        int min = Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(max);
        sb2.append('x');
        sb2.append(min);
        return sb2.toString();
    }

    private final boolean s() {
        String d10 = this.f38654d.d();
        if (d10 == null) {
            return false;
        }
        if (p.J(d10, "unknown", false, 2, (Object) null) || p.O(d10, "generic", false, 2, (Object) null) || p.O(d10, "vbox", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    private final boolean t() {
        if (Build.VERSION.SDK_INT >= 31) {
            LocationManager c10 = K.c(this.f38652b);
            if (c10 != null && c10.isLocationEnabled()) {
                return true;
            }
        } else {
            String string = Settings.Secure.getString(this.f38652b.getContentResolver(), "location_providers_allowed");
            if (string != null && string.length() > 0) {
                return true;
            }
        }
        return false;
    }

    private final void u(Map map) {
        boolean z10;
        try {
            Intent e10 = K.e(this.f38652b, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.f38658h);
            if (e10 != null) {
                int intExtra = e10.getIntExtra("level", -1);
                int intExtra2 = e10.getIntExtra("scale", -1);
                if (!(intExtra == -1 && intExtra2 == -1)) {
                    map.put("batteryLevel", Float.valueOf(((float) intExtra) / ((float) intExtra2)));
                }
                int intExtra3 = e10.getIntExtra("status", -1);
                if (intExtra3 != 2) {
                    if (intExtra3 != 5) {
                        z10 = false;
                        map.put("charging", Boolean.valueOf(z10));
                    }
                }
                z10 = true;
                map.put("charging", Boolean.valueOf(z10));
            }
        } catch (Exception unused) {
            this.f38658h.e("Could not get battery status");
        }
    }

    private final Future v() {
        try {
            return this.f38657g.e(t.DEFAULT, new Z(this));
        } catch (RejectedExecutionException e10) {
            this.f38658h.b("Failed to lookup available device memory", e10);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final Long w(C3223b0 b0Var) {
        return b0Var.g();
    }

    public final void c(String str, String str2) {
        Map B10 = O.B(this.f38666p);
        B10.put(str, str2);
        this.f38666p = B10;
    }

    public final long d() {
        Long l10;
        try {
            v.a aVar = v.f71841b;
            l10 = v.b((Long) this.f38657g.e(t.IO, new C3220a0(this)).get());
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            l10 = v.b(w.a(th2));
        }
        if (v.g(l10)) {
            l10 = 0L;
        }
        return ((Number) l10).longValue();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long f() {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f38652b     // Catch:{ all -> 0x002b }
            android.app.ActivityManager r1 = com.bugsnag.android.K.a(r1)     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x000b
            r1 = r0
            goto L_0x0019
        L_0x000b:
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            r1.getMemoryInfo(r2)     // Catch:{ all -> 0x002b }
            long r1 = r2.availMem     // Catch:{ all -> 0x002b }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x002b }
        L_0x0019:
            if (r1 == 0) goto L_0x001c
            return r1
        L_0x001c:
            java.lang.Class<android.os.Process> r1 = android.os.Process.class
            java.lang.String r2 = "getFreeMemory"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch:{  }
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch:{  }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{  }
            r0 = r1
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3223b0.f():java.lang.Long");
    }

    public final W i() {
        String str;
        Object obj;
        Long l10;
        X x10 = this.f38654d;
        String[] strArr = this.f38665o;
        Boolean valueOf = Boolean.valueOf(h());
        C3238g0.c cVar = (C3238g0.c) this.f38653c.get();
        Long l11 = null;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.a();
        }
        String str2 = this.f38664n;
        Future future = this.f38667q;
        try {
            v.a aVar = v.f71841b;
            if (future == null) {
                l10 = null;
            } else {
                l10 = (Long) future.get();
            }
            obj = v.b(l10);
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            l11 = obj;
        }
        return new W(x10, strArr, valueOf, str, str2, l11, O.B(this.f38666p));
    }

    public final C3244i0 j(long j10) {
        String str;
        Object obj;
        Long l10;
        X x10 = this.f38654d;
        Boolean valueOf = Boolean.valueOf(h());
        C3238g0.c cVar = (C3238g0.c) this.f38653c.get();
        Long l11 = null;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.a();
        }
        String str2 = this.f38664n;
        Future future = this.f38667q;
        try {
            v.a aVar = v.f71841b;
            if (future == null) {
                l10 = null;
            } else {
                l10 = (Long) future.get();
            }
            obj = v.b(l10);
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            l11 = obj;
        }
        return new C3244i0(x10, valueOf, str, str2, l11, O.B(this.f38666p), Long.valueOf(d()), f(), o(), new Date(j10));
    }

    public final String[] k() {
        String[] c10 = this.f38654d.c();
        if (c10 == null) {
            return new String[0];
        }
        return c10;
    }

    public final Map l() {
        HashMap hashMap = new HashMap();
        u(hashMap);
        hashMap.put("locationStatus", m());
        hashMap.put("networkAccess", n());
        hashMap.put("brand", this.f38654d.b());
        hashMap.put("screenDensity", this.f38661k);
        hashMap.put("dpi", this.f38662l);
        hashMap.put("emulator", Boolean.valueOf(this.f38660j));
        hashMap.put("screenResolution", this.f38663m);
        return hashMap;
    }

    public final String o() {
        int i10 = this.f38668r.get();
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 != 2) {
            return null;
        }
        return "landscape";
    }

    public final boolean x(int i10) {
        if (this.f38668r.getAndSet(i10) != i10) {
            return true;
        }
        return false;
    }
}
