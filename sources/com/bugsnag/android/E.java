package com.bugsnag.android;

import android.content.Context;
import com.amazon.a.a.o.b.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import mf.Y;
import yf.C6798l;

public final class E {

    /* renamed from: K  reason: collision with root package name */
    public static final a f38437K = new a((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private String f38438A;

    /* renamed from: B  reason: collision with root package name */
    private Set f38439B = Y.e();

    /* renamed from: C  reason: collision with root package name */
    private Set f38440C;

    /* renamed from: D  reason: collision with root package name */
    private Set f38441D;

    /* renamed from: E  reason: collision with root package name */
    private Set f38442E = EnumSet.of(A1.INTERNAL_ERRORS, A1.USAGE);

    /* renamed from: F  reason: collision with root package name */
    private Set f38443F = Y.e();

    /* renamed from: G  reason: collision with root package name */
    private File f38444G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f38445H;

    /* renamed from: I  reason: collision with root package name */
    private final C3233e1 f38446I = new C3233e1((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    private final HashSet f38447J = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private String f38448a;

    /* renamed from: b  reason: collision with root package name */
    private L1 f38449b = new L1((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public final C3284z f38450c = new C3284z((Collection) null, (Collection) null, (Collection) null, (List) null, 15, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public final Z0 f38451d = new Z0((Y0) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public final B0 f38452e = new B0((C0) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private String f38453f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f38454g = 0;

    /* renamed from: h  reason: collision with root package name */
    private String f38455h;

    /* renamed from: i  reason: collision with root package name */
    private E1 f38456i = E1.ALWAYS;

    /* renamed from: j  reason: collision with root package name */
    private boolean f38457j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f38458k = true;

    /* renamed from: l  reason: collision with root package name */
    private long f38459l = 5000;

    /* renamed from: m  reason: collision with root package name */
    private boolean f38460m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f38461n = true;

    /* renamed from: o  reason: collision with root package name */
    private C3259n0 f38462o = new C3259n0(false, false, false, false, 15, (DefaultConstructorMarker) null);

    /* renamed from: p  reason: collision with root package name */
    private boolean f38463p = true;

    /* renamed from: q  reason: collision with root package name */
    private String f38464q = "android";

    /* renamed from: r  reason: collision with root package name */
    private S0 f38465r = N.f38552a;

    /* renamed from: s  reason: collision with root package name */
    private Q f38466s;

    /* renamed from: t  reason: collision with root package name */
    private C3247j0 f38467t = new C3247j0((String) null, (String) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    private int f38468u = 100;

    /* renamed from: v  reason: collision with root package name */
    private int f38469v = 32;

    /* renamed from: w  reason: collision with root package name */
    private int f38470w = 128;

    /* renamed from: x  reason: collision with root package name */
    private int f38471x = 200;

    /* renamed from: y  reason: collision with root package name */
    private long f38472y = 5000;

    /* renamed from: z  reason: collision with root package name */
    private int f38473z = 10000;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G a(Context context) {
            return E.K(context, (String) null);
        }

        /* access modifiers changed from: protected */
        public final G b(Context context, String str) {
            return new T0().c(context, str);
        }

        private a() {
        }
    }

    public E(String str) {
        this.f38448a = str;
    }

    public static final G J(Context context) {
        return f38437K.a(context);
    }

    protected static final G K(Context context, String str) {
        return f38437K.b(context, str);
    }

    private final String j0(Collection collection) {
        String x02;
        if (collection == null) {
            return "";
        }
        Iterable<Object> iterable = collection;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Object obj : iterable) {
            arrayList.add(obj.toString());
        }
        List T02 = C6565s.T0(arrayList);
        if (T02 == null || (x02 = C6565s.x0(T02, f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null)) == null) {
            return "";
        }
        return x02;
    }

    public final Set A() {
        return this.f38443F;
    }

    public final Set B() {
        return this.f38451d.h().j();
    }

    public final String C() {
        return this.f38455h;
    }

    public final boolean D() {
        return this.f38461n;
    }

    public final E1 E() {
        return this.f38456i;
    }

    public final Set F() {
        return this.f38442E;
    }

    public final long G() {
        return this.f38472y;
    }

    public L1 H() {
        return this.f38449b;
    }

    public final Integer I() {
        return this.f38454g;
    }

    public final void L(String str) {
        this.f38464q = str;
    }

    public final void M(String str) {
        this.f38453f = str;
    }

    public final void N(boolean z10) {
        this.f38445H = z10;
    }

    public final void O(boolean z10) {
        this.f38463p = z10;
    }

    public final void P(boolean z10) {
        this.f38460m = z10;
    }

    public final void Q(Q q10) {
        this.f38466s = q10;
    }

    public final void R(Set set) {
        this.f38439B = set;
    }

    public final void S(Set set) {
        this.f38440C = set;
    }

    public final void T(C3247j0 j0Var) {
        this.f38467t = j0Var;
    }

    public final void U(boolean z10) {
        this.f38458k = z10;
    }

    public final void V(long j10) {
        this.f38459l = j10;
    }

    public final void W(S0 s02) {
        if (s02 == null) {
            s02 = C3230d1.f38688a;
        }
        this.f38465r = s02;
    }

    public final void X(int i10) {
        this.f38468u = i10;
    }

    public final void Y(int i10) {
        this.f38469v = i10;
    }

    public final void Z(int i10) {
        this.f38470w = i10;
    }

    public final String a() {
        return this.f38448a;
    }

    public final void a0(int i10) {
        this.f38471x = i10;
    }

    public final String b() {
        return this.f38464q;
    }

    public final void b0(boolean z10) {
        this.f38457j = z10;
    }

    public final String c() {
        return this.f38453f;
    }

    public final void c0(Set set) {
        this.f38443F = set;
    }

    public final boolean d() {
        return this.f38445H;
    }

    public final void d0(Set set) {
        this.f38451d.h().m(set);
    }

    public final boolean e() {
        return this.f38463p;
    }

    public final void e0(String str) {
        this.f38455h = str;
    }

    public final boolean f() {
        return this.f38460m;
    }

    public final void f0(boolean z10) {
        this.f38461n = z10;
    }

    public final Map g() {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        Pair pair5;
        Pair pair6;
        Pair pair7;
        Pair pair8;
        Pair pair9;
        Pair pair10;
        Pair pair11;
        Pair pair12;
        Pair pair13;
        Pair pair14;
        Pair pair15;
        Pair pair16;
        Pair pair17;
        String str;
        String str2;
        String str3;
        String str4;
        E e10 = new E("");
        if (this.f38447J.size() > 0) {
            pair = C6502A.a("pluginCount", Integer.valueOf(this.f38447J.size()));
        } else {
            pair = null;
        }
        boolean z10 = this.f38463p;
        if (z10 != e10.f38463p) {
            pair2 = C6502A.a("autoDetectErrors", Boolean.valueOf(z10));
        } else {
            pair2 = null;
        }
        boolean z11 = this.f38460m;
        if (z11 != e10.f38460m) {
            pair3 = C6502A.a("autoTrackSessions", Boolean.valueOf(z11));
        } else {
            pair3 = null;
        }
        if (this.f38439B.size() > 0) {
            pair4 = C6502A.a("discardClassesCount", Integer.valueOf(this.f38439B.size()));
        } else {
            pair4 = null;
        }
        if (!C6496s.c(this.f38441D, e10.f38441D)) {
            pair5 = C6502A.a("enabledBreadcrumbTypes", j0(this.f38441D));
        } else {
            pair5 = null;
        }
        if (!C6496s.c(this.f38462o, e10.f38462o)) {
            if (this.f38462o.b()) {
                str = "anrs";
            } else {
                str = null;
            }
            if (this.f38462o.c()) {
                str2 = "ndkCrashes";
            } else {
                str2 = null;
            }
            if (this.f38462o.d()) {
                str3 = "unhandledExceptions";
            } else {
                str3 = null;
            }
            if (this.f38462o.e()) {
                str4 = "unhandledRejections";
            } else {
                str4 = null;
            }
            pair6 = C6502A.a("enabledErrorTypes", j0(C6565s.s(str, str2, str3, str4)));
        } else {
            pair6 = null;
        }
        long j10 = this.f38459l;
        if (j10 != 0) {
            pair7 = C6502A.a("launchDurationMillis", Long.valueOf(j10));
        } else {
            pair7 = null;
        }
        if (!C6496s.c(this.f38465r, C3230d1.f38688a)) {
            pair8 = C6502A.a("logger", Boolean.TRUE);
        } else {
            pair8 = null;
        }
        int i10 = this.f38468u;
        if (i10 != e10.f38468u) {
            pair9 = C6502A.a("maxBreadcrumbs", Integer.valueOf(i10));
        } else {
            pair9 = null;
        }
        int i11 = this.f38469v;
        if (i11 != e10.f38469v) {
            pair10 = C6502A.a("maxPersistedEvents", Integer.valueOf(i11));
        } else {
            pair10 = null;
        }
        int i12 = this.f38470w;
        if (i12 != e10.f38470w) {
            pair11 = C6502A.a("maxPersistedSessions", Integer.valueOf(i12));
        } else {
            pair11 = null;
        }
        int i13 = this.f38471x;
        if (i13 != e10.f38471x) {
            pair13 = C6502A.a("maxReportedThreads", Integer.valueOf(i13));
            pair12 = pair;
        } else {
            pair12 = pair;
            pair13 = null;
        }
        long j11 = this.f38472y;
        Pair pair18 = pair11;
        Pair pair19 = pair13;
        if (j11 != e10.f38472y) {
            pair14 = C6502A.a("threadCollectionTimeLimitMillis", Long.valueOf(j11));
        } else {
            pair14 = null;
        }
        if (this.f38444G != null) {
            pair15 = C6502A.a("persistenceDirectorySet", Boolean.TRUE);
        } else {
            pair15 = null;
        }
        E1 e12 = this.f38456i;
        if (e12 != e10.f38456i) {
            pair16 = C6502A.a("sendThreads", e12);
        } else {
            pair16 = null;
        }
        boolean z12 = this.f38445H;
        if (z12 != e10.f38445H) {
            pair17 = C6502A.a("attemptDeliveryOnCrash", Boolean.valueOf(z12));
        } else {
            pair17 = null;
        }
        return O.w(C6565s.s(pair12, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair18, pair19, pair14, pair15, pair16, pair17));
    }

    public final void g0(E1 e12) {
        this.f38456i = e12;
    }

    public final String h() {
        return this.f38438A;
    }

    public final void h0(long j10) {
        this.f38472y = j10;
    }

    public final Q i() {
        return this.f38466s;
    }

    public final void i0(Integer num) {
        this.f38454g = num;
    }

    public final Set j() {
        return this.f38439B;
    }

    public final Set k() {
        return this.f38441D;
    }

    public final C3259n0 l() {
        return this.f38462o;
    }

    public final Set m() {
        return this.f38440C;
    }

    public final C3247j0 n() {
        return this.f38467t;
    }

    public final boolean o() {
        return this.f38458k;
    }

    public final long p() {
        return this.f38459l;
    }

    public final S0 q() {
        return this.f38465r;
    }

    public final int r() {
        return this.f38468u;
    }

    public final int s() {
        return this.f38469v;
    }

    public final int t() {
        return this.f38470w;
    }

    public final int u() {
        return this.f38471x;
    }

    public final int v() {
        return this.f38473z;
    }

    public final C3233e1 w() {
        return this.f38446I;
    }

    public final boolean x() {
        return this.f38457j;
    }

    public final File y() {
        return this.f38444G;
    }

    /* access modifiers changed from: protected */
    public final HashSet z() {
        return this.f38447J;
    }
}
