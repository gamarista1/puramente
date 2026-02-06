package com.bugsnag.android;

import K4.k;
import K4.q;
import K4.v;
import com.bugsnag.android.B1;
import com.bugsnag.android.K0;
import com.bugsnag.android.P;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;

/* renamed from: com.bugsnag.android.s0  reason: case insensitive filesystem */
public final class C3271s0 implements K0.a, P {

    /* renamed from: g  reason: collision with root package name */
    public static final a f38863g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f38864a;

    /* renamed from: b  reason: collision with root package name */
    private final k f38865b;

    /* renamed from: c  reason: collision with root package name */
    private C3262o0 f38866c;

    /* renamed from: d  reason: collision with root package name */
    private File f38867d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f38868e;

    /* renamed from: f  reason: collision with root package name */
    private final C3233e1 f38869f;

    /* renamed from: com.bugsnag.android.s0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3271s0(String str, C3262o0 o0Var, C3233e1 e1Var, k kVar) {
        this(str, o0Var, (File) null, e1Var, kVar, 4, (DefaultConstructorMarker) null);
    }

    private final C3262o0 b() {
        C3262o0 o0Var = this.f38866c;
        if (o0Var != null) {
            return o0Var;
        }
        File file = this.f38867d;
        C6496s.e(file);
        String str = this.f38864a;
        if (str == null) {
            str = this.f38865b.a();
        }
        C3262o0 c10 = new V0(file, str, f()).invoke();
        this.f38866c = c10;
        return c10;
    }

    private final S0 f() {
        return this.f38865b.r();
    }

    public static /* synthetic */ C3271s0 i(C3271s0 s0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 999700;
        }
        return s0Var.h(i10);
    }

    public byte[] a() {
        byte[] bArr = this.f38868e;
        if (bArr != null) {
            return bArr;
        }
        byte[] g10 = q.f32402a.g(this);
        this.f38868e = g10;
        return g10;
    }

    public final String c() {
        return this.f38864a;
    }

    public final Set d() {
        Set set;
        C3269r0 i10;
        C3262o0 o0Var = this.f38866c;
        Set set2 = null;
        if (o0Var == null || (i10 = o0Var.i()) == null) {
            set = null;
        } else {
            set = i10.i();
        }
        if (set != null) {
            return set;
        }
        File file = this.f38867d;
        if (file != null) {
            set2 = C3268q0.f38826f.i(file, this.f38865b).d();
        }
        if (set2 == null) {
            return Y.e();
        }
        return set2;
    }

    public String e() {
        return P.a.a(this);
    }

    public final byte[] g() {
        this.f38868e = null;
        return a();
    }

    public final C3271s0 h(int i10) {
        if (a().length <= i10) {
            return this;
        }
        C3262o0 b10 = b();
        v F10 = b10.i().F(this.f38865b.w());
        b10.i().k().b(F10.a(), F10.b());
        int size = b10.l().size();
        int v10 = this.f38865b.v();
        if (size > v10) {
            b10.l().subList(v10, size).clear();
            List l10 = b10.l();
            l10.add(new B1("", '[' + (size - v10) + " threads omitted as the maxReportedThreads limit (" + v10 + ") was exceeded]", ErrorType.UNKNOWN, false, B1.b.UNKNOWN, new u1(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, this.f38865b.A(), f()), f()));
        }
        byte[] g10 = g();
        if (g10.length <= i10) {
            return this;
        }
        v E10 = b10.i().E(g10.length - i10);
        b10.i().k().e(E10.d(), E10.c());
        g();
        return this;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("apiKey").j0(this.f38864a);
        k02.y("payloadVersion").j0("4.0");
        k02.y("notifier").E0(this.f38869f);
        k02.y("events").f();
        C3262o0 o0Var = this.f38866c;
        if (o0Var != null) {
            k02.E0(o0Var);
        } else {
            File file = this.f38867d;
            if (file != null) {
                k02.E0(file);
            }
        }
        k02.q();
        k02.t();
    }

    public C3271s0(String str, C3262o0 o0Var, File file, C3233e1 e1Var, k kVar) {
        this.f38864a = str;
        this.f38865b = kVar;
        this.f38866c = o0Var;
        this.f38867d = file;
        C3233e1 e1Var2 = new C3233e1(e1Var.b(), e1Var.d(), e1Var.c());
        e1Var2.e(C6565s.h1(e1Var.a()));
        this.f38869f = e1Var2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3271s0(String str, C3262o0 o0Var, File file, C3233e1 e1Var, k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : o0Var, (i10 & 4) != 0 ? null : file, e1Var, kVar);
    }
}
