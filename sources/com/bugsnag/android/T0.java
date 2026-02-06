package com.bugsnag.android;

import Rg.k;
import Sg.p;
import android.content.Context;
import android.os.Bundle;
import com.amazon.a.a.o.b.f;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;
import yf.C6798l;

public final class T0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38604a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38605a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Pattern invoke(String str) {
            return Pattern.compile(str);
        }
    }

    private final Set a(Bundle bundle, String str, Set set) {
        String string = bundle.getString(str);
        if (string == null) {
            return set;
        }
        return k.I(k.x(p.I0(string, new char[]{','}, false, 0, 6, (Object) null), b.f38605a));
    }

    private final Set b(Bundle bundle, String str, Set set) {
        List list;
        String string = bundle.getString(str);
        if (string == null) {
            list = null;
        } else {
            list = p.F0(string, new String[]{f.f37529a}, false, 0, 6, (Object) null);
        }
        if (list == null) {
            return set;
        }
        return C6565s.j1(list);
    }

    private final void e(G g10, Bundle bundle) {
        g10.d0(bundle.getString("com.bugsnag.android.RELEASE_STAGE", g10.A()));
        g10.L(bundle.getString("com.bugsnag.android.APP_VERSION", g10.c()));
        g10.K(bundle.getString("com.bugsnag.android.APP_TYPE", g10.b()));
        if (bundle.containsKey("com.bugsnag.android.VERSION_CODE")) {
            g10.h0(Integer.valueOf(bundle.getInt("com.bugsnag.android.VERSION_CODE")));
        }
        if (bundle.containsKey("com.bugsnag.android.ENABLED_RELEASE_STAGES")) {
            g10.R(b(bundle, "com.bugsnag.android.ENABLED_RELEASE_STAGES", g10.k()));
        }
        Set a10 = a(bundle, "com.bugsnag.android.DISCARD_CLASSES", g10.h());
        if (a10 == null) {
            a10 = Y.e();
        }
        g10.Q(a10);
        Set b10 = b(bundle, "com.bugsnag.android.PROJECT_PACKAGES", Y.e());
        if (b10 == null) {
            b10 = Y.e();
        }
        g10.b0(b10);
        Set a11 = a(bundle, "com.bugsnag.android.REDACTED_KEYS", g10.z());
        if (a11 == null) {
            a11 = Y.e();
        }
        g10.c0(a11);
    }

    private final void f(G g10, Bundle bundle) {
        g10.O(bundle.getBoolean("com.bugsnag.android.AUTO_TRACK_SESSIONS", g10.e()));
        g10.N(bundle.getBoolean("com.bugsnag.android.AUTO_DETECT_ERRORS", g10.d()));
        g10.a0(bundle.getBoolean("com.bugsnag.android.PERSIST_USER", g10.v()));
        g10.T(bundle.getBoolean("com.bugsnag.android.GENERATE_ANONYMOUS_ID", g10.m()));
        String string = bundle.getString("com.bugsnag.android.SEND_THREADS");
        if (string != null) {
            g10.f0(E1.f38474a.a(string));
        }
    }

    private final void g(G g10, Bundle bundle) {
        if (bundle.containsKey("com.bugsnag.android.ENDPOINT_NOTIFY")) {
            g10.S(new C3247j0(bundle.getString("com.bugsnag.android.ENDPOINT_NOTIFY", g10.l().a()), bundle.getString("com.bugsnag.android.ENDPOINT_SESSIONS", g10.l().b())));
        }
    }

    public final G c(Context context, String str) {
        try {
            return d(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData, str);
        } catch (Exception e10) {
            throw new IllegalStateException("Bugsnag is unable to read config from manifest.", e10);
        }
    }

    public final G d(Bundle bundle, String str) {
        if (str == null) {
            if (bundle == null) {
                str = null;
            } else {
                str = bundle.getString("com.bugsnag.android.API_KEY");
            }
        }
        if (str != null) {
            G g10 = new G(str);
            if (bundle != null) {
                f(g10, bundle);
                g(g10, bundle);
                e(g10, bundle);
                g10.W(bundle.getInt("com.bugsnag.android.MAX_BREADCRUMBS", g10.p()));
                g10.X(bundle.getInt("com.bugsnag.android.MAX_PERSISTED_EVENTS", g10.q()));
                g10.Y(bundle.getInt("com.bugsnag.android.MAX_PERSISTED_SESSIONS", g10.r()));
                g10.Z(bundle.getInt("com.bugsnag.android.MAX_REPORTED_THREADS", g10.s()));
                g10.g0(bundle.getLong("com.bugsnag.android.THREAD_COLLECTION_TIME_LIMIT_MS", g10.E()));
                g10.U((long) bundle.getInt("com.bugsnag.android.LAUNCH_DURATION_MILLIS", (int) g10.n()));
                g10.e0(bundle.getBoolean("com.bugsnag.android.SEND_LAUNCH_CRASHES_SYNCHRONOUSLY", g10.B()));
                g10.M(bundle.getBoolean("com.bugsnag.android.ATTEMPT_DELIVERY_ON_CRASH", g10.H()));
            }
            return g10;
        }
        throw new IllegalArgumentException("No Bugsnag API key set");
    }
}
