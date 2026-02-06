package com.bugsnag.android;

import K4.j;
import K4.k;
import K4.t;
import android.os.SystemClock;
import com.bugsnag.android.C3268q0;
import com.bugsnag.android.D0;
import com.bugsnag.android.K0;
import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.Y;
import yf.C6787a;
import yf.C6798l;

/* renamed from: com.bugsnag.android.y0  reason: case insensitive filesystem */
public final class C3283y0 extends D0 {

    /* renamed from: o  reason: collision with root package name */
    public static final a f38978o = new a((DefaultConstructorMarker) null);

    /* renamed from: p  reason: collision with root package name */
    private static final Comparator f38979p = new C3275u0();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final k f38980g;

    /* renamed from: h  reason: collision with root package name */
    private final C3233e1 f38981h;

    /* renamed from: i  reason: collision with root package name */
    private final K4.b f38982i;

    /* renamed from: j  reason: collision with root package name */
    private final C3284z f38983j;

    /* renamed from: k  reason: collision with root package name */
    private final S0 f38984k;

    /* renamed from: l  reason: collision with root package name */
    private C6787a f38985l = e.f38991a;

    /* renamed from: m  reason: collision with root package name */
    private C6798l f38986m = d.f38990a;

    /* renamed from: n  reason: collision with root package name */
    private boolean f38987n;

    /* renamed from: com.bugsnag.android.y0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.bugsnag.android.y0$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38988a;

        static {
            int[] iArr = new int[V.values().length];
            iArr[V.DELIVERED.ordinal()] = 1;
            iArr[V.UNDELIVERED.ordinal()] = 2;
            iArr[V.FAILURE.ordinal()] = 3;
            f38988a = iArr;
        }
    }

    /* renamed from: com.bugsnag.android.y0$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3283y0 f38989a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C3283y0 y0Var) {
            super(1);
            this.f38989a = y0Var;
        }

        /* renamed from: a */
        public final Boolean invoke(File file) {
            return Boolean.valueOf(C3268q0.f38826f.i(file, this.f38989a.f38980g).e());
        }
    }

    /* renamed from: com.bugsnag.android.y0$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f38990a = new d();

        d() {
            super(1);
        }

        public final void a(C3271s0 s0Var) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3271s0) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: com.bugsnag.android.y0$e */
    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f38991a = new e();

        e() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C3283y0(k kVar, S0 s02, C3233e1 e1Var, K4.b bVar, D0.a aVar, C3284z zVar) {
        super(new File((File) kVar.z().getValue(), "bugsnag/errors"), kVar.t(), s02, aVar);
        this.f38980g = kVar;
        this.f38984k = s02;
        this.f38981h = e1Var;
        this.f38982i = bVar;
        this.f38983j = zVar;
    }

    /* access modifiers changed from: private */
    public static final void A(C3283y0 y0Var) {
        y0Var.y();
        y0Var.H();
    }

    private final void B(Collection collection) {
        if (!collection.isEmpty()) {
            int size = collection.size();
            S0 g10 = g();
            g10.d("Sending " + size + " saved error(s) to Bugsnag");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                x((File) it.next());
            }
        }
    }

    private final Date C(File file) {
        return new Date(C3268q0.f38826f.f(file));
    }

    private final void E(Exception exc, File file) {
        S0 g10 = g();
        String message = exc.getMessage();
        if (message == null) {
            message = "Failed to send event";
        }
        g10.c(message, exc);
        b(Y.d(file));
    }

    private final boolean F(File file) {
        if (file.length() > 1048576) {
            return true;
        }
        return false;
    }

    private final boolean G(File file) {
        Calendar instance = Calendar.getInstance();
        instance.add(5, -60);
        if (C3268q0.f38826f.f(file) < instance.getTimeInMillis()) {
            return true;
        }
        return false;
    }

    private final void H() {
        if (i() && !this.f38987n) {
            this.f38985l.invoke();
            this.f38987n = true;
        }
    }

    private final void I(File file) {
        if (F(file)) {
            S0 g10 = g();
            g10.e("Discarding over-sized event (" + file.length() + ") after failed delivery");
            t(file);
            b(Y.d(file));
        } else if (G(file)) {
            S0 g11 = g();
            g11.e("Discarding historical event (from " + C(file) + ") after failed delivery");
            t(file);
            b(Y.d(file));
        } else {
            a(Y.d(file));
            g().e("Could not send previously saved error(s) to Bugsnag, will try again later");
        }
    }

    /* access modifiers changed from: private */
    public static final String K(C3283y0 y0Var, String str) {
        y0Var.x(new File(str));
        return str;
    }

    /* access modifiers changed from: private */
    public static final int p(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        return file.compareTo(file2);
    }

    private final C3271s0 r(File file, String str) {
        C6496s.e(str);
        V0 v02 = new V0(file, str, g());
        try {
            if (!this.f38983j.j(v02, g())) {
                return null;
            }
        } catch (Exception e10) {
            g().b("could not parse event payload", e10);
            v02.a();
        }
        C3262o0 b10 = v02.b();
        if (b10 != null) {
            return new C3271s0(b10.e(), b10, (File) null, this.f38981h, this.f38980g);
        }
        return new C3271s0(str, (C3262o0) null, file, this.f38981h, this.f38980g);
    }

    private final void s(File file, C3271s0 s0Var) {
        int i10 = b.f38988a[this.f38980g.i().b(s0Var, this.f38980g.o(s0Var)).ordinal()];
        if (i10 == 1) {
            b(Y.d(file));
            S0 g10 = g();
            g10.d("Deleting sent error file " + file + ".name");
        } else if (i10 == 2) {
            I(file);
        } else if (i10 == 3) {
            E(new RuntimeException("Failed to deliver event payload"), file);
        }
    }

    private final void t(File file) {
        File file2 = file;
        this.f38986m.invoke(new C3271s0(C3268q0.f38826f.i(file, this.f38980g).c(), (C3262o0) null, file2, this.f38981h, this.f38980g));
    }

    /* access modifiers changed from: private */
    public static final void w(C3283y0 y0Var) {
        List e10 = y0Var.e();
        if (e10.isEmpty()) {
            y0Var.g().g("No regular events to flush to Bugsnag.");
        }
        y0Var.B(e10);
        y0Var.H();
    }

    private final void x(File file) {
        try {
            C3271s0 r10 = r(file, C3268q0.f38826f.i(file, this.f38980g).a());
            if (r10 == null) {
                b(Y.d(file));
            } else {
                s(file, r10);
            }
        } catch (Exception e10) {
            E(e10, file);
        }
    }

    private final void y() {
        List e10 = e();
        Collection collection = e10;
        File u10 = u(collection);
        if (u10 != null) {
            e10.remove(u10);
        }
        a(collection);
        if (u10 != null) {
            g().d("Attempting to send the most recent launch crash report");
            B(C6565s.e(u10));
            g().d("Continuing with Bugsnag initialisation");
            return;
        }
        g().g("No startupcrash events to flush to Bugsnag.");
    }

    public final String D(Object obj, String str) {
        C3268q0 h10;
        String b10;
        if (obj == null || (h10 = C3268q0.a.h(C3268q0.f38826f, obj, (String) null, str, 0, this.f38980g, (Boolean) null, 42, (Object) null)) == null || (b10 = h10.b()) == null) {
            return "";
        }
        return b10;
    }

    public final Future J(K0.a aVar) {
        String k10 = k(aVar);
        if (k10 == null) {
            return null;
        }
        try {
            return this.f38982i.e(t.ERROR_REQUEST, new C3279w0(this, k10));
        } catch (RejectedExecutionException unused) {
            g().e("Failed to flush all on-disk errors, retaining unsent errors for later.");
            return null;
        }
    }

    public String f(Object obj) {
        C3268q0 h10;
        String b10;
        if (obj == null || (h10 = C3268q0.a.h(C3268q0.f38826f, obj, (String) null, (String) null, 0, this.f38980g, (Boolean) null, 42, (Object) null)) == null || (b10 = h10.b()) == null) {
            return "";
        }
        return b10;
    }

    /* access modifiers changed from: protected */
    public S0 g() {
        return this.f38984k;
    }

    public final File u(Collection collection) {
        return (File) Rg.k.z(Rg.k.o(C6565s.b0(collection), new c(this)), f38979p);
    }

    public final void v() {
        try {
            this.f38982i.d(t.ERROR_REQUEST, new C3281x0(this));
        } catch (RejectedExecutionException unused) {
            g().e("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    public final void z() {
        if (this.f38980g.D()) {
            try {
                Future d10 = this.f38982i.d(t.ERROR_REQUEST, new C3277v0(this));
                try {
                    long j10 = 2000;
                    long elapsedRealtime = 2000 - (SystemClock.elapsedRealtime() - j.f32348a.c());
                    if (elapsedRealtime > 0) {
                        j10 = elapsedRealtime;
                    }
                    d10.get(j10, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    g().a("Failed to send launch crash reports within timeout, continuing.", e10);
                } catch (ExecutionException e11) {
                    g().a("Failed to send launch crash reports within timeout, continuing.", e11);
                } catch (TimeoutException e12) {
                    g().a("Failed to send launch crash reports within timeout, continuing.", e12);
                }
            } catch (RejectedExecutionException e13) {
                g().a("Failed to flush launch crash reports, continuing.", e13);
            }
        }
    }
}
