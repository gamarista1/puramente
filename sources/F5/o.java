package F5;

import android.os.Bundle;
import com.facebook.C3286a;
import com.facebook.V;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.J;
import t5.C4021N;
import t7.C4049a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f30791a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static final String f30792b = o.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final long[] f30793c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private o() {
    }

    public static final int a(long j10) {
        Class<o> cls = o.class;
        if (C4049a.d(cls)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f30793c;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    return i10;
                }
                i10++;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
                return 0;
            }
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ all -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r2, F5.p r3, java.lang.String r4, android.content.Context r5) {
        /*
            java.lang.Class<F5.o> r0 = F5.o.class
            boolean r1 = t7.C4049a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "activityName"
            kotlin.jvm.internal.C6496s.h(r2, r1)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C6496s.h(r5, r1)     // Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x001c }
            if (r3 != 0) goto L_0x0020
            goto L_0x001e
        L_0x001c:
            r2 = move-exception
            goto L_0x0042
        L_0x001e:
            java.lang.String r3 = "Unclassified"
        L_0x0020:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x001c }
            r5.<init>()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "fb_mobile_launch_source"
            r5.putString(r1, r3)     // Catch:{ all -> 0x001c }
            t5.N$a r3 = t5.C4021N.f48172b     // Catch:{ all -> 0x001c }
            r1 = 0
            t5.N r2 = r3.b(r2, r4, r1)     // Catch:{ all -> 0x001c }
            java.lang.String r4 = "fb_mobile_activate_app"
            r2.d(r4, r5)     // Catch:{ all -> 0x001c }
            t5.p$b r3 = r3.d()     // Catch:{ all -> 0x001c }
            t5.p$b r4 = t5.C4039p.b.EXPLICIT_ONLY     // Catch:{ all -> 0x001c }
            if (r3 == r4) goto L_0x0041
            r2.a()     // Catch:{ all -> 0x001c }
        L_0x0041:
            return
        L_0x0042:
            t7.C4049a.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.o.b(java.lang.String, F5.p, java.lang.String, android.content.Context):void");
    }

    private final void c() {
        if (!C4049a.d(this)) {
            try {
                J.a aVar = J.f47112e;
                V v10 = V.APP_EVENTS;
                String str = f30792b;
                C6496s.e(str);
                aVar.b(v10, str, "Clock skew detected");
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void d(String str, n nVar, String str2) {
        long j10;
        String str3;
        long j11;
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "activityName");
                if (nVar != null) {
                    Long b10 = nVar.b();
                    long j12 = 0;
                    if (b10 != null) {
                        j10 = b10.longValue();
                    } else {
                        Long e10 = nVar.e();
                        if (e10 != null) {
                            j11 = e10.longValue();
                        } else {
                            j11 = 0;
                        }
                        j10 = 0 - j11;
                    }
                    if (j10 < 0) {
                        f30791a.c();
                        j10 = 0;
                    }
                    long f10 = nVar.f();
                    if (f10 < 0) {
                        f30791a.c();
                        f10 = 0;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("fb_mobile_app_interruptions", nVar.c());
                    U u10 = U.f71764a;
                    String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(a(j10))}, 1));
                    C6496s.g(format, "format(locale, format, *args)");
                    bundle.putString("fb_mobile_time_between_sessions", format);
                    p g10 = nVar.g();
                    if (g10 == null || (str3 = g10.toString()) == null) {
                        str3 = "Unclassified";
                    }
                    bundle.putString("fb_mobile_launch_source", str3);
                    Long e11 = nVar.e();
                    if (e11 != null) {
                        j12 = e11.longValue();
                    }
                    bundle.putLong("_logTime", j12 / ((long) 1000));
                    C4021N.f48172b.b(str, str2, (C3286a) null).c("fb_mobile_deactivate_app", ((double) f10) / ((double) 1000), bundle);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
