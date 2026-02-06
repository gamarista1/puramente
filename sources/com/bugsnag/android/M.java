package com.bugsnag.android;

import K4.k;
import K4.t;
import L4.e;
import L4.f;
import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class M extends L4.a {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f38533c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final k f38534d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final S0 f38535e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final X f38536f = X.f38629j.a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final File f38537g = Environment.getDataDirectory();

    /* renamed from: h  reason: collision with root package name */
    private final e f38538h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e f38539i;

    /* renamed from: j  reason: collision with root package name */
    private final e f38540j;

    public static final class a extends e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L4.d f38541e;

        public a(L4.d dVar) {
            this.f38541e = dVar;
        }

        public Object e() {
            return ((C3238g0) this.f38541e.get()).a();
        }
    }

    public static final class b extends e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f38542e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ J1 f38543f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f38544g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ W0 f38545h;

        public b(M m10, J1 j12, f fVar, W0 w02) {
            this.f38542e = m10;
            this.f38543f = j12;
            this.f38544g = fVar;
            this.f38545h = w02;
        }

        public Object e() {
            return new C3249k(this.f38542e.f38533c, this.f38542e.f38533c.getPackageManager(), this.f38542e.f38534d, (C3266p1) this.f38543f.c().get(), this.f38544g.a(), this.f38543f.b(), this.f38545h);
        }
    }

    public static final class c extends e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f38546e;

        public c(M m10) {
            this.f38546e = m10;
        }

        public Object e() {
            return Boolean.valueOf(new RootDetector(this.f38546e.f38536f, (List) null, (File) null, this.f38546e.f38535e, 6, (DefaultConstructorMarker) null).g());
        }
    }

    public static final class d extends e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ H f38547e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M f38548f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L4.d f38549g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ K4.b f38550h;

        public d(H h10, M m10, L4.d dVar, K4.b bVar) {
            this.f38547e = h10;
            this.f38548f = m10;
            this.f38549g = dVar;
            this.f38550h = bVar;
        }

        public Object e() {
            H h10 = this.f38547e;
            Context b10 = this.f38548f.f38533c;
            Resources resources = this.f38548f.f38533c.getResources();
            M m10 = this.f38548f;
            a aVar = new a(this.f38549g);
            m10.f32505a.b(m10.f32506b, aVar);
            return new C3223b0(h10, b10, resources, aVar, this.f38548f.f38536f, this.f38548f.f38537g, this.f38548f.f38539i, this.f38550h, this.f38548f.f38535e);
        }
    }

    public M(L4.c cVar, L4.b bVar, f fVar, J1 j12, K4.b bVar2, H h10, L4.d dVar, W0 w02) {
        super(bVar2, (t) null, 2, (DefaultConstructorMarker) null);
        this.f38533c = cVar.a();
        k a10 = bVar.a();
        this.f38534d = a10;
        this.f38535e = a10.r();
        K4.b bVar3 = this.f32505a;
        t tVar = this.f32506b;
        b bVar4 = new b(this, j12, fVar, w02);
        bVar3.b(tVar, bVar4);
        this.f38538h = bVar4;
        K4.b bVar5 = this.f32505a;
        t tVar2 = this.f32506b;
        c cVar2 = new c(this);
        bVar5.b(tVar2, cVar2);
        this.f38539i = cVar2;
        K4.b bVar6 = this.f32505a;
        t tVar3 = this.f32506b;
        d dVar2 = new d(h10, this, dVar, bVar2);
        bVar6.b(tVar3, dVar2);
        this.f38540j = dVar2;
    }

    public final e g() {
        return this.f38538h;
    }

    public final e h() {
        return this.f38540j;
    }
}
