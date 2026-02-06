package t5;

import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.C3286a;
import com.facebook.C3462y;
import com.facebook.I;
import com.facebook.M;
import com.facebook.S;
import com.facebook.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.C3884A;
import o7.C3906w;
import o7.J;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4039p;
import t7.C4049a;
import v5.d;
import v5.g;

/* renamed from: t5.n  reason: case insensitive filesystem */
public final class C4037n {

    /* renamed from: a  reason: collision with root package name */
    public static final C4037n f48246a = new C4037n();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48247b = C4037n.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final int f48248c = 100;

    /* renamed from: d  reason: collision with root package name */
    private static volatile C4029f f48249d = new C4029f();

    /* renamed from: e  reason: collision with root package name */
    private static final ScheduledExecutorService f48250e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: f  reason: collision with root package name */
    private static ScheduledFuture f48251f;

    /* renamed from: g  reason: collision with root package name */
    private static final Runnable f48252g = new C4032i();

    private C4037n() {
    }

    public static final void g(C4024a aVar, C4028e eVar) {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "accessTokenAppId");
                C6496s.h(eVar, "appEvent");
                f48250e.execute(new C4033j(aVar, eVar));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(C4024a aVar, C4028e eVar) {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "$accessTokenAppId");
                C6496s.h(eVar, "$appEvent");
                f48249d.a(aVar, eVar);
                if (C4039p.f48255b.d() != C4039p.b.EXPLICIT_ONLY && f48249d.d() > f48248c) {
                    n(C4018K.EVENT_THRESHOLD);
                } else if (f48251f == null) {
                    f48251f = f48250e.schedule(f48252g, 15, TimeUnit.SECONDS);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final M i(C4024a aVar, T t10, boolean z10, C4020M m10) {
        Class<C4037n> cls = C4037n.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "accessTokenAppId");
            C6496s.h(t10, "appEvents");
            C6496s.h(m10, "flushState");
            String b10 = aVar.b();
            boolean z11 = false;
            C3906w u10 = C3884A.u(b10, false);
            M.c cVar = M.f39311n;
            U u11 = U.f71764a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b10}, 1));
            C6496s.g(format, "format(format, *args)");
            M A10 = cVar.A((C3286a) null, format, (JSONObject) null, (M.b) null);
            A10.F(true);
            Bundle u12 = A10.u();
            if (u12 == null) {
                u12 = new Bundle();
            }
            u12.putString("access_token", aVar.a());
            String e10 = C4021N.f48172b.e();
            if (e10 != null) {
                u12.putString("device_token", e10);
            }
            String l10 = C4041s.f48273c.l();
            if (l10 != null) {
                u12.putString(Constants.INSTALL_REFERRER, l10);
            }
            A10.J(u12);
            if (u10 != null) {
                z11 = u10.A();
            }
            int e11 = t10.e(A10, I.l(), z11, z10);
            if (e11 == 0) {
                return null;
            }
            m10.c(m10.a() + e11);
            A10.E(new C4035l(aVar, A10, t10, m10));
            return A10;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final void j(C4024a aVar, M m10, T t10, C4020M m11, S s10) {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "$accessTokenAppId");
                C6496s.h(m10, "$postRequest");
                C6496s.h(t10, "$appEvents");
                C6496s.h(m11, "$flushState");
                C6496s.h(s10, "response");
                q(aVar, m10, s10, t10, m11);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final List k(C4029f fVar, C4020M m10) {
        Class<C4037n> cls = C4037n.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(fVar, "appEventCollection");
            C6496s.h(m10, "flushResults");
            boolean z10 = I.z(I.l());
            ArrayList arrayList = new ArrayList();
            for (C4024a aVar : fVar.f()) {
                T c10 = fVar.c(aVar);
                if (c10 != null) {
                    M i10 = i(aVar, c10, z10, m10);
                    if (i10 != null) {
                        arrayList.add(i10);
                        if (d.f48724a.f()) {
                            g.l(i10);
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void l(C4018K k10) {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(k10, "reason");
                f48250e.execute(new C4031h(k10));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void m(C4018K k10) {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(k10, "$reason");
                n(k10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(t5.C4018K r4) {
        /*
            java.lang.Class<t5.n> r0 = t5.C4037n.class
            boolean r1 = t7.C4049a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.C6496s.h(r4, r1)     // Catch:{ all -> 0x0044 }
            t5.S r1 = t5.C4030g.a()     // Catch:{ all -> 0x0044 }
            t5.f r2 = f48249d     // Catch:{ all -> 0x0044 }
            r2.b(r1)     // Catch:{ all -> 0x0044 }
            t5.f r1 = f48249d     // Catch:{ Exception -> 0x0047 }
            t5.M r4 = u(r4, r1)     // Catch:{ Exception -> 0x0047 }
            if (r4 == 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.a()     // Catch:{ all -> 0x0044 }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            t5.L r4 = r4.b()     // Catch:{ all -> 0x0044 }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x0044 }
            android.content.Context r4 = com.facebook.I.l()     // Catch:{ all -> 0x0044 }
            d2.a r4 = d2.C1926a.b(r4)     // Catch:{ all -> 0x0044 }
            r4.d(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r4 = move-exception
            goto L_0x0050
        L_0x0046:
            return
        L_0x0047:
            r4 = move-exception
            java.lang.String r1 = f48247b     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x0044 }
            return
        L_0x0050:
            t7.C4049a.b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4037n.n(t5.K):void");
    }

    /* access modifiers changed from: private */
    public static final void o() {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                f48251f = null;
                if (C4039p.f48255b.d() != C4039p.b.EXPLICIT_ONLY) {
                    n(C4018K.TIMER);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final Set p() {
        Class<C4037n> cls = C4037n.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48249d.f();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void q(C4024a aVar, M m10, S s10, T t10, C4020M m11) {
        boolean z10;
        String str;
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "accessTokenAppId");
                C6496s.h(m10, "request");
                C6496s.h(s10, "response");
                C6496s.h(t10, "appEvents");
                C6496s.h(m11, "flushState");
                C3462y b10 = s10.b();
                String str2 = "Success";
                C4019L l10 = C4019L.SUCCESS;
                if (b10 != null) {
                    if (b10.c() == -1) {
                        str2 = "Failed: No Connectivity";
                        l10 = C4019L.NO_CONNECTIVITY;
                    } else {
                        U u10 = U.f71764a;
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{s10.toString(), b10.toString()}, 2));
                        C6496s.g(str2, "format(format, *args)");
                        l10 = C4019L.SERVER_ERROR;
                    }
                }
                if (I.I(V.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) m10.w()).toString(2);
                        C6496s.g(str, "{\n            val jsonAr…y.toString(2)\n          }");
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    J.a aVar2 = J.f47112e;
                    V v10 = V.APP_EVENTS;
                    String str3 = f48247b;
                    C6496s.g(str3, "TAG");
                    aVar2.c(v10, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(m10.q()), str2, str);
                }
                if (b10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t10.b(z10);
                C4019L l11 = C4019L.NO_CONNECTIVITY;
                if (l10 == l11) {
                    I.t().execute(new C4036m(aVar, t10));
                }
                if (l10 != C4019L.SUCCESS && m11.b() != l11) {
                    m11.d(l10);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void r(C4024a aVar, T t10) {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "$accessTokenAppId");
                C6496s.h(t10, "$appEvents");
                C4038o.a(aVar, t10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void s() {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                f48250e.execute(new C4034k());
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void t() {
        Class<C4037n> cls = C4037n.class;
        if (!C4049a.d(cls)) {
            try {
                C4038o.b(f48249d);
                f48249d = new C4029f();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final C4020M u(C4018K k10, C4029f fVar) {
        Class<C4037n> cls = C4037n.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(k10, "reason");
            C6496s.h(fVar, "appEventCollection");
            C4020M m10 = new C4020M();
            List<M> k11 = k(fVar, m10);
            if (k11.isEmpty()) {
                return null;
            }
            J.a aVar = J.f47112e;
            V v10 = V.APP_EVENTS;
            String str = f48247b;
            C6496s.g(str, "TAG");
            aVar.c(v10, str, "Flushing %d events due to %s.", Integer.valueOf(m10.a()), k10.toString());
            for (M k12 : k11) {
                k12.k();
            }
            return m10;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }
}
