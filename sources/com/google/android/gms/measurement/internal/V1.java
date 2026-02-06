package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzoi;
import com.revenuecat.purchases.common.Constants;

public final class V1 extends C4601e3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f54890c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f54891d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f54892e;

    /* renamed from: f  reason: collision with root package name */
    private final X1 f54893f = new X1(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final X1 f54894g = new X1(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final X1 f54895h = new X1(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final X1 f54896i = new X1(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final X1 f54897j = new X1(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    private final X1 f54898k = new X1(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    private final X1 f54899l = new X1(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    private final X1 f54900m = new X1(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    private final X1 f54901n = new X1(this, 2, false, false);

    V1(E2 e22) {
        super(e22);
    }

    private final String K() {
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.f54892e == null) {
                    if (this.f55074a.J() != null) {
                        str2 = this.f55074a.J();
                    } else {
                        str2 = "FA";
                    }
                    this.f54892e = str2;
                }
                C4536s.l(this.f54892e);
                str = this.f54892e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    protected static Object q(String str) {
        if (str == null) {
            return null;
        }
        return new W1(str);
    }

    private static String r(boolean z10, Object obj) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            return str2 + round + "..." + str2 + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z10) {
                    str = th2.getClass().getName();
                } else {
                    str = th2.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String z11 = z(E2.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && z(className).equals(z11)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb2.toString();
            } else if (obj instanceof W1) {
                return ((W1) obj).f54915a;
            } else {
                if (z10) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    static String s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String r10 = r(z10, obj);
        String r11 = r(z10, obj2);
        String r12 = r(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(r10)) {
            sb2.append(str2);
            sb2.append(r10);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(r11)) {
            sb2.append(str2);
            sb2.append(r11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(r12)) {
            sb2.append(str3);
            sb2.append(r12);
        }
        return sb2.toString();
    }

    private static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        if (!zzoi.zza() || !((Boolean) F.f54682x0.a((Object) null)).booleanValue()) {
            return str;
        }
        return "";
    }

    public final X1 A() {
        return this.f54900m;
    }

    public final X1 B() {
        return this.f54893f;
    }

    public final X1 C() {
        return this.f54895h;
    }

    public final X1 D() {
        return this.f54894g;
    }

    public final X1 E() {
        return this.f54899l;
    }

    public final X1 F() {
        return this.f54901n;
    }

    public final X1 G() {
        return this.f54896i;
    }

    public final X1 H() {
        return this.f54898k;
    }

    public final X1 I() {
        return this.f54897j;
    }

    public final String J() {
        Pair a10;
        if (e().f55092f == null || (a10 = e().f55092f.a()) == null || a10 == C4614g2.f55087B) {
            return null;
        }
        String valueOf = String.valueOf(a10.second);
        return valueOf + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + ((String) a10.first);
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void t(int i10, String str) {
        Log.println(i10, K(), str);
    }

    /* access modifiers changed from: protected */
    public final void u(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && x(i10)) {
            t(i10, s(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            C4536s.l(str);
            C4734z2 B10 = this.f55074a.B();
            if (B10 == null) {
                t(6, "Scheduler not set. Not logging error/warn");
            } else if (!B10.n()) {
                t(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                B10.y(new U1(this, i10, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean x(int i10) {
        return Log.isLoggable(K(), i10);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
