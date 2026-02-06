package com.bugsnag.android;

import K4.k;
import K4.m;
import K4.o;
import K4.q;
import K4.v;
import com.bugsnag.android.K0;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;

/* renamed from: com.bugsnag.android.r0  reason: case insensitive filesystem */
public final class C3269r0 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f38839a;

    /* renamed from: b  reason: collision with root package name */
    private q1 f38840b;

    /* renamed from: c  reason: collision with root package name */
    private final S0 f38841c;

    /* renamed from: d  reason: collision with root package name */
    private final Y0 f38842d;

    /* renamed from: e  reason: collision with root package name */
    private final C0 f38843e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f38844f;

    /* renamed from: g  reason: collision with root package name */
    private Collection f38845g;

    /* renamed from: h  reason: collision with root package name */
    private final C3239g1 f38846h;

    /* renamed from: i  reason: collision with root package name */
    public C3254l1 f38847i;

    /* renamed from: j  reason: collision with root package name */
    private String f38848j;

    /* renamed from: k  reason: collision with root package name */
    public C3258n f38849k;

    /* renamed from: l  reason: collision with root package name */
    public C3244i0 f38850l;

    /* renamed from: m  reason: collision with root package name */
    private List f38851m;

    /* renamed from: n  reason: collision with root package name */
    private List f38852n;

    /* renamed from: o  reason: collision with root package name */
    private List f38853o;

    /* renamed from: p  reason: collision with root package name */
    private String f38854p;

    /* renamed from: q  reason: collision with root package name */
    private String f38855q;

    /* renamed from: r  reason: collision with root package name */
    private m f38856r;

    /* renamed from: s  reason: collision with root package name */
    private L1 f38857s;

    /* renamed from: t  reason: collision with root package name */
    private I1 f38858t;

    public C3269r0(Throwable th2, k kVar, q1 q1Var, Y0 y02) {
        this(th2, kVar, q1Var, y02, (C0) null, 16, (DefaultConstructorMarker) null);
    }

    public final void A(Collection collection) {
        Iterable iterable = collection;
        this.f38846h.h(C6565s.j1(iterable));
        this.f38842d.m(C6565s.j1(iterable));
    }

    public final void B(I1 i12) {
        this.f38858t = i12;
    }

    public void C(String str, String str2, String str3) {
        this.f38857s = new L1(str, str2, str3);
    }

    public final void D(L1 l12) {
        this.f38857s = l12;
    }

    public final v E(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && !this.f38851m.isEmpty()) {
            i11 += q.f32402a.g((Breadcrumb) this.f38851m.remove(0)).length;
            i12++;
        }
        if (i12 == 1) {
            this.f38851m.add(new Breadcrumb("Removed to reduce payload size", this.f38841c));
        } else {
            List list = this.f38851m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Removed, along with ");
            sb2.append(i12 - 1);
            sb2.append(" older breadcrumbs, to reduce payload size");
            list.add(new Breadcrumb(sb2.toString(), this.f38841c));
        }
        return new v(i12, i11);
    }

    public final v F(int i10) {
        v o10 = this.f38842d.o(i10);
        int d10 = o10.d();
        int c10 = o10.c();
        for (Breadcrumb breadcrumb : this.f38851m) {
            v a10 = breadcrumb.impl.a(i10);
            d10 += a10.d();
            c10 += a10.c();
        }
        return new v(d10, c10);
    }

    /* access modifiers changed from: protected */
    public final void G(Severity severity) {
        this.f38840b = new q1(this.f38840b.e(), severity, this.f38840b.f(), this.f38840b.g(), this.f38840b.c(), this.f38840b.b());
    }

    public final void H(q1 q1Var) {
        this.f38840b = q1Var;
    }

    public void a(String str, String str2) {
        this.f38843e.a(str, str2);
    }

    public void b(String str, String str2, Object obj) {
        this.f38842d.a(str, str2, obj);
    }

    public void c(String str, Map map) {
        this.f38842d.b(str, map);
    }

    public void d() {
        this.f38843e.c();
    }

    public final String e() {
        return this.f38848j;
    }

    public final C3258n f() {
        C3258n nVar = this.f38849k;
        if (nVar != null) {
            return nVar;
        }
        C6496s.v("app");
        return null;
    }

    public final List g() {
        return this.f38851m;
    }

    public final C3244i0 h() {
        C3244i0 i0Var = this.f38850l;
        if (i0Var != null) {
            return i0Var;
        }
        C6496s.v("device");
        return null;
    }

    public final Set i() {
        ArrayList arrayList = new ArrayList();
        for (C3250k0 e10 : this.f38852n) {
            ErrorType e11 = e10.e();
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        Set j12 = C6565s.j1(arrayList);
        Iterable<C3250k0> iterable = this.f38852n;
        ArrayList<List> arrayList2 = new ArrayList<>(C6565s.y(iterable, 10));
        for (C3250k0 d10 : iterable) {
            arrayList2.add(d10.d());
        }
        ArrayList arrayList3 = new ArrayList();
        for (List<s1> it : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            for (s1 h10 : it) {
                ErrorType h11 = h10.h();
                if (h11 != null) {
                    arrayList4.add(h11);
                }
            }
            C6565s.D(arrayList3, arrayList4);
        }
        return Y.n(j12, arrayList3);
    }

    public final List j() {
        return this.f38852n;
    }

    public final m k() {
        return this.f38856r;
    }

    public final boolean l() {
        return this.f38840b.f38838g;
    }

    public final Severity m() {
        return this.f38840b.d();
    }

    public final String n() {
        return this.f38840b.e();
    }

    public final List o() {
        return this.f38853o;
    }

    public final boolean p() {
        return this.f38840b.f();
    }

    /* access modifiers changed from: protected */
    public final boolean q(C3262o0 o0Var) {
        String str;
        List h10 = o0Var.h();
        if (!h10.isEmpty()) {
            str = ((C3250k0) h10.get(0)).b();
        } else {
            str = null;
        }
        return C6496s.c("ANR", str);
    }

    public final void r() {
        if (i().size() == 1) {
            ArrayList<s1> arrayList = new ArrayList<>();
            for (C3250k0 d10 : this.f38852n) {
                C6565s.D(arrayList, d10.d());
            }
            for (s1 i10 : arrayList) {
                i10.i((ErrorType) null);
            }
        }
    }

    public final void s(String str) {
        this.f38848j = str;
    }

    public final void t(C3258n nVar) {
        this.f38849k = nVar;
    }

    public void toStream(K0 k02) {
        K0 k03 = new K0(k02, this.f38846h);
        k03.n();
        k03.y("context").j0(this.f38855q);
        k03.y("metaData").E0(this.f38842d);
        k03.y("severity").E0(m());
        k03.y("severityReason").E0(this.f38840b);
        k03.y("unhandled").o0(this.f38840b.f());
        k03.y("exceptions");
        k03.f();
        for (C3250k0 E02 : this.f38852n) {
            k03.E0(E02);
        }
        k03.q();
        k03.y("projectPackages");
        k03.f();
        for (String j02 : this.f38845g) {
            k03.j0(j02);
        }
        k03.q();
        k03.y(Participant.USER_TYPE).E0(this.f38857s);
        k03.y("app").E0(f());
        k03.y("device").E0(h());
        k03.y("breadcrumbs").E0(this.f38851m);
        k03.y("groupingHash").j0(this.f38854p);
        Map f10 = this.f38856r.f();
        if (!f10.isEmpty()) {
            k03.y("usage");
            k03.n();
            for (Map.Entry entry : f10.entrySet()) {
                k03.y((String) entry.getKey()).E0(entry.getValue());
            }
            k03.t();
        }
        k03.y("threads");
        k03.f();
        for (B1 E03 : this.f38853o) {
            k03.E0(E03);
        }
        k03.q();
        k03.y("featureFlags").E0(this.f38843e);
        I1 i12 = this.f38858t;
        if (i12 != null) {
            k03.y("correlation").E0(i12);
        }
        C3254l1 l1Var = this.f38847i;
        if (l1Var != null) {
            C3254l1 b10 = C3254l1.b(l1Var);
            k03.y("session").n();
            k03.y("id").j0(b10.e());
            k03.y("startedAt").E0(b10.g());
            k03.y("events").n();
            k03.y("handled").f0((long) b10.d());
            k03.y("unhandled").f0((long) b10.h());
            k03.t();
            k03.t();
        }
        k03.t();
    }

    public final void u(List list) {
        this.f38851m = list;
    }

    public final void v(String str) {
        this.f38855q = str;
    }

    public final void w(C3244i0 i0Var) {
        this.f38850l = i0Var;
    }

    public final void x(String str) {
        this.f38854p = str;
    }

    public final void y(m mVar) {
        this.f38856r = mVar;
    }

    public final void z(Collection collection) {
        this.f38845g = collection;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3269r0(Throwable th2, k kVar, q1 q1Var, Y0 y02, C0 c02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2, kVar, q1Var, (i10 & 8) != 0 ? new Y0((Map) null, 1, (DefaultConstructorMarker) null) : y02, (i10 & 16) != 0 ? new C0() : c02);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3269r0(java.lang.Throwable r21, K4.k r22, com.bugsnag.android.q1 r23, com.bugsnag.android.Y0 r24, com.bugsnag.android.C0 r25) {
        /*
            r20 = this;
            r8 = r21
            java.lang.String r1 = r22.a()
            com.bugsnag.android.S0 r2 = r22.r()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r0 = r22.j()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r4 = mf.C6565s.j1(r0)
            if (r8 != 0) goto L_0x0022
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0020:
            r5 = r0
            goto L_0x002f
        L_0x0022:
            java.util.Collection r0 = r22.A()
            com.bugsnag.android.S0 r5 = r22.r()
            java.util.List r0 = com.bugsnag.android.C3250k0.a(r8, r0, r5)
            goto L_0x0020
        L_0x002f:
            com.bugsnag.android.Y0 r6 = r24.e()
            com.bugsnag.android.C0 r7 = r25.d()
            java.util.Collection r9 = r22.A()
            com.bugsnag.android.G1 r0 = new com.bugsnag.android.G1
            boolean r10 = r23.f()
            r11 = r22
            r0.<init>(r8, r10, r11)
            java.util.List r12 = r0.c()
            com.bugsnag.android.L1 r19 = new com.bugsnag.android.L1
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r19
            r13.<init>(r14, r15, r16, r17, r18)
            java.util.Collection r0 = r22.B()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r13 = mf.C6565s.j1(r0)
            r0 = r20
            r8 = r21
            r10 = r23
            r11 = r12
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3269r0.<init>(java.lang.Throwable, K4.k, com.bugsnag.android.q1, com.bugsnag.android.Y0, com.bugsnag.android.C0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3269r0(java.lang.String r18, com.bugsnag.android.S0 r19, java.util.List r20, java.util.Set r21, java.util.List r22, com.bugsnag.android.Y0 r23, com.bugsnag.android.C0 r24, java.lang.Throwable r25, java.util.Collection r26, com.bugsnag.android.q1 r27, java.util.List r28, com.bugsnag.android.L1 r29, java.util.Set r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = r1
            goto L_0x000f
        L_0x000d:
            r5 = r20
        L_0x000f:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            java.util.Set r1 = mf.Y.e()
            r6 = r1
            goto L_0x001b
        L_0x0019:
            r6 = r21
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
            goto L_0x0028
        L_0x0026:
            r7 = r22
        L_0x0028:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0035
            com.bugsnag.android.Y0 r1 = new com.bugsnag.android.Y0
            r3 = 1
            r1.<init>(r2, r3, r2)
            r8 = r1
            goto L_0x0037
        L_0x0035:
            r8 = r23
        L_0x0037:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0042
            com.bugsnag.android.C0 r1 = new com.bugsnag.android.C0
            r1.<init>()
            r9 = r1
            goto L_0x0044
        L_0x0042:
            r9 = r24
        L_0x0044:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r25
        L_0x004c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0058
            java.util.Set r1 = mf.Y.e()
            java.util.Collection r1 = (java.util.Collection) r1
            r11 = r1
            goto L_0x005a
        L_0x0058:
            r11 = r26
        L_0x005a:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0066
            java.lang.String r1 = "handledException"
            com.bugsnag.android.q1 r1 = com.bugsnag.android.q1.h(r1)
            r12 = r1
            goto L_0x0068
        L_0x0066:
            r12 = r27
        L_0x0068:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0073
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13 = r1
            goto L_0x0075
        L_0x0073:
            r13 = r28
        L_0x0075:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0092
            com.bugsnag.android.L1 r1 = new com.bugsnag.android.L1
            r3 = 7
            r4 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r20 = r1
            r21 = r14
            r22 = r15
            r23 = r16
            r24 = r3
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25)
            r14 = r1
            goto L_0x0094
        L_0x0092:
            r14 = r29
        L_0x0094:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x009a
            r15 = r2
            goto L_0x009c
        L_0x009a:
            r15 = r30
        L_0x009c:
            r2 = r17
            r3 = r18
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3269r0.<init>(java.lang.String, com.bugsnag.android.S0, java.util.List, java.util.Set, java.util.List, com.bugsnag.android.Y0, com.bugsnag.android.C0, java.lang.Throwable, java.util.Collection, com.bugsnag.android.q1, java.util.List, com.bugsnag.android.L1, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C3269r0(String str, S0 s02, List list, Set set, List list2, Y0 y02, C0 c02, Throwable th2, Collection collection, q1 q1Var, List list3, L1 l12, Set set2) {
        C3239g1 g1Var = new C3239g1();
        g1Var.h(C6565s.j1(g1Var.c()));
        this.f38846h = g1Var;
        this.f38856r = new o();
        this.f38841c = s02;
        this.f38848j = str;
        this.f38851m = list;
        this.f38844f = set;
        this.f38852n = list2;
        this.f38842d = y02;
        this.f38843e = c02;
        this.f38839a = th2;
        this.f38845g = collection;
        this.f38840b = q1Var;
        this.f38853o = list3;
        this.f38857s = l12;
        if (set2 != null) {
            A(set2);
        }
    }
}
