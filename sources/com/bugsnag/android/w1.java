package com.bugsnag.android;

import K4.k;
import K4.t;
import android.content.Context;
import com.bugsnag.android.D0;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

public final class w1 extends L4.a {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k f38951c;

    /* renamed from: d  reason: collision with root package name */
    private final L4.e f38952d;

    /* renamed from: e  reason: collision with root package name */
    private final L4.e f38953e;

    /* renamed from: f  reason: collision with root package name */
    private final L4.e f38954f;

    /* renamed from: g  reason: collision with root package name */
    private final L4.e f38955g;

    /* renamed from: h  reason: collision with root package name */
    private final L4.e f38956h;

    /* renamed from: i  reason: collision with root package name */
    private final L4.e f38957i;

    /* renamed from: j  reason: collision with root package name */
    private final L4.e f38958j;

    public static final class a extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w1 f38959e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L1 f38960f;

        public a(w1 w1Var, L1 l12) {
            this.f38959e = w1Var;
            this.f38960f = l12;
        }

        public Object e() {
            N1 b10 = ((P1) this.f38959e.h().get()).b(this.f38960f);
            r1 r1Var = (r1) this.f38959e.g().a();
            if (r1Var != null) {
                r1Var.b();
            }
            return b10;
        }
    }

    public static final class b extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L4.d f38961e;

        public b(L4.d dVar) {
            this.f38961e = dVar;
        }

        public Object e() {
            O0 o02 = (O0) this.f38961e.get();
            N0 d10 = o02.d();
            o02.f(new N0(0, false, false));
            return d10;
        }
    }

    public static final class c extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w1 f38962e;

        public c(w1 w1Var) {
            this.f38962e = w1Var;
        }

        public Object e() {
            return K4.e.a(this.f38962e.f38951c.z());
        }
    }

    public static final class d extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f38963e;

        public d(Context context) {
            this.f38963e = context;
        }

        public Object e() {
            return new r1(this.f38963e);
        }
    }

    public static final class e extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w1 f38964e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f38965f;

        public e(w1 w1Var, Context context) {
            this.f38964e = w1Var;
            this.f38965f = context;
        }

        public Object e() {
            L4.e g10 = this.f38964e.g();
            S0 r10 = this.f38964e.f38951c.r();
            return new C3238g0(this.f38965f, (File) null, (C6787a) null, (File) null, (C6787a) null, g10, this.f38964e.f38951c, r10, 30, (DefaultConstructorMarker) null);
        }
    }

    public static final class f extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w1 f38966e;

        public f(w1 w1Var) {
            this.f38966e = w1Var;
        }

        public Object e() {
            boolean y10 = this.f38966e.f38951c.y();
            L4.e b10 = this.f38966e.b();
            w1 w1Var = this.f38966e;
            i iVar = new i(w1Var.c());
            w1Var.f32505a.b(w1Var.f32506b, iVar);
            return new P1(y10, b10, iVar, (File) null, this.f38966e.g(), this.f38966e.f38951c.r(), 8, (DefaultConstructorMarker) null);
        }
    }

    public static final class g extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w1 f38967e;

        public g(w1 w1Var) {
            this.f38967e = w1Var;
        }

        public Object e() {
            return new O0(this.f38967e.f38951c);
        }
    }

    public static final class h extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w1 f38968e;

        public h(w1 w1Var) {
            this.f38968e = w1Var;
        }

        public Object e() {
            return new C3263o1((File) this.f38968e.b().get(), this.f38968e.f38951c.u(), this.f38968e.f38951c.a(), this.f38968e.f38951c.r(), (D0.a) null);
        }
    }

    public static final class i extends L4.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L4.d f38969e;

        public i(L4.d dVar) {
            this.f38969e = dVar;
        }

        public Object e() {
            return ((C3238g0) this.f38969e.get()).a();
        }
    }

    public w1(Context context, k kVar, K4.b bVar) {
        super(bVar, t.IO);
        this.f38951c = kVar;
        K4.b bVar2 = this.f32505a;
        t tVar = this.f32506b;
        c cVar = new c(this);
        bVar2.b(tVar, cVar);
        this.f38952d = cVar;
        K4.b bVar3 = this.f32505a;
        t tVar2 = this.f32506b;
        d dVar = new d(context);
        bVar3.b(tVar2, dVar);
        this.f38953e = dVar;
        K4.b bVar4 = this.f32505a;
        t tVar3 = this.f32506b;
        e eVar = new e(this, context);
        bVar4.b(tVar3, eVar);
        this.f38954f = eVar;
        K4.b bVar5 = this.f32505a;
        t tVar4 = this.f32506b;
        f fVar = new f(this);
        bVar5.b(tVar4, fVar);
        this.f38955g = fVar;
        K4.b bVar6 = this.f32505a;
        t tVar5 = this.f32506b;
        g gVar = new g(this);
        bVar6.b(tVar5, gVar);
        this.f38956h = gVar;
        K4.b bVar7 = this.f32505a;
        t tVar6 = this.f32506b;
        h hVar = new h(this);
        bVar7.b(tVar6, hVar);
        this.f38957i = hVar;
        b bVar8 = new b(gVar);
        this.f32505a.b(this.f32506b, bVar8);
        this.f38958j = bVar8;
    }

    public final L4.e b() {
        return this.f38952d;
    }

    public final L4.e c() {
        return this.f38954f;
    }

    public final L4.e d() {
        return this.f38958j;
    }

    public final L4.e e() {
        return this.f38956h;
    }

    public final L4.e f() {
        return this.f38957i;
    }

    public final L4.e g() {
        return this.f38953e;
    }

    public final L4.e h() {
        return this.f38955g;
    }

    public final L4.d i(L1 l12) {
        K4.b bVar = this.f32505a;
        t tVar = this.f32506b;
        a aVar = new a(this, l12);
        bVar.b(tVar, aVar);
        return aVar;
    }
}
