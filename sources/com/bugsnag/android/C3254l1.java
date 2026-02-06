package com.bugsnag.android;

import K4.g;
import K4.q;
import com.bugsnag.android.K0;
import com.bugsnag.android.P;
import io.intercom.android.sdk.models.Participant;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bugsnag.android.l1  reason: case insensitive filesystem */
public final class C3254l1 implements K0.a, P {

    /* renamed from: a  reason: collision with root package name */
    private final File f38759a;

    /* renamed from: b  reason: collision with root package name */
    private final C3233e1 f38760b;

    /* renamed from: c  reason: collision with root package name */
    private String f38761c;

    /* renamed from: d  reason: collision with root package name */
    private Date f38762d;

    /* renamed from: e  reason: collision with root package name */
    private L1 f38763e;

    /* renamed from: f  reason: collision with root package name */
    private final S0 f38764f;

    /* renamed from: g  reason: collision with root package name */
    private C3234f f38765g;

    /* renamed from: h  reason: collision with root package name */
    private W f38766h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f38767i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f38768j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f38769k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f38770l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f38771m;

    /* renamed from: n  reason: collision with root package name */
    private String f38772n;

    C3254l1(Map map, S0 s02, String str) {
        this((File) null, (C3233e1) null, s02, str);
        w((String) map.get("id"));
        x(g.a((String) map.get("startedAt")));
        Map map2 = (Map) map.get("events");
        this.f38769k.set(((Number) map2.get("handled")).intValue());
        this.f38768j.set(((Number) map2.get("unhandled")).intValue());
    }

    static C3254l1 b(C3254l1 l1Var) {
        C3254l1 l1Var2 = new C3254l1(l1Var.f38761c, l1Var.f38762d, l1Var.f38763e, l1Var.f38768j.get(), l1Var.f38769k.get(), l1Var.f38760b, l1Var.f38764f, l1Var.c());
        l1Var2.f38770l.set(l1Var.f38770l.get());
        l1Var2.f38767i = l1Var.k();
        return l1Var2;
    }

    private void n(String str) {
        S0 s02 = this.f38764f;
        s02.f("Invalid null value supplied to session." + str + ", ignoring");
    }

    private void r(K0 k02) {
        k02.n();
        k02.y("notifier").E0(this.f38760b);
        k02.y("app").E0(this.f38765g);
        k02.y("device").E0(this.f38766h);
        k02.y("sessions").f();
        k02.B0(this.f38759a);
        k02.q();
        k02.t();
    }

    private void s(K0 k02) {
        k02.B0(this.f38759a);
    }

    public byte[] a() {
        return q.f32402a.g(this);
    }

    public String c() {
        return this.f38772n;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f38769k.intValue();
    }

    public String e() {
        return this.f38761c;
    }

    public String f() {
        return P.a.a(this);
    }

    public Date g() {
        return this.f38762d;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f38768j.intValue();
    }

    /* access modifiers changed from: package-private */
    public C3254l1 i() {
        this.f38769k.incrementAndGet();
        return b(this);
    }

    /* access modifiers changed from: package-private */
    public C3254l1 j() {
        this.f38768j.incrementAndGet();
        return b(this);
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f38767i;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        File file = this.f38759a;
        if (file == null || (!file.getName().endsWith("_v2.json") && !this.f38759a.getName().endsWith("_v3.json"))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f38771m.get();
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f38771m.set(true);
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f38771m.compareAndSet(true, false);
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f38770l.compareAndSet(false, true);
    }

    /* access modifiers changed from: package-private */
    public void t(K0 k02) {
        k02.n();
        k02.y("id").j0(this.f38761c);
        k02.y("startedAt").E0(this.f38762d);
        k02.y(Participant.USER_TYPE).E0(this.f38763e);
        k02.t();
    }

    public void toStream(K0 k02) {
        if (this.f38759a == null) {
            k02.n();
            k02.y("notifier").E0(this.f38760b);
            k02.y("app").E0(this.f38765g);
            k02.y("device").E0(this.f38766h);
            k02.y("sessions").f();
            t(k02);
            k02.q();
            k02.t();
        } else if (!l()) {
            s(k02);
        } else {
            r(k02);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(C3234f fVar) {
        this.f38765g = fVar;
    }

    /* access modifiers changed from: package-private */
    public void v(W w10) {
        this.f38766h = w10;
    }

    public void w(String str) {
        if (str != null) {
            this.f38761c = str;
        } else {
            n("id");
        }
    }

    public void x(Date date) {
        if (date != null) {
            this.f38762d = date;
        } else {
            n("startedAt");
        }
    }

    C3254l1(String str, Date date, L1 l12, boolean z10, C3233e1 e1Var, S0 s02, String str2) {
        this((File) null, e1Var, s02, str2);
        this.f38761c = str;
        this.f38762d = new Date(date.getTime());
        this.f38763e = l12;
        this.f38767i = z10;
        this.f38772n = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C3254l1(String str, Date date, L1 l12, int i10, int i11, C3233e1 e1Var, S0 s02, String str2) {
        this(str, date, l12, false, e1Var, s02, str2);
        int i12 = i10;
        this.f38768j.set(i10);
        int i13 = i11;
        this.f38769k.set(i11);
        this.f38770l.set(true);
        this.f38772n = str2;
    }

    C3254l1(File file, C3233e1 e1Var, S0 s02, String str) {
        this.f38767i = false;
        this.f38768j = new AtomicInteger();
        this.f38769k = new AtomicInteger();
        this.f38770l = new AtomicBoolean(false);
        this.f38771m = new AtomicBoolean(false);
        this.f38759a = file;
        this.f38764f = s02;
        this.f38772n = C3257m1.b(file, str);
        if (e1Var != null) {
            C3233e1 e1Var2 = new C3233e1(e1Var.b(), e1Var.d(), e1Var.c());
            e1Var2.e(new ArrayList(e1Var.a()));
            this.f38760b = e1Var2;
            return;
        }
        this.f38760b = null;
    }
}
