package com.bugsnag.android;

import K4.b;
import K4.k;
import K4.t;
import L4.e;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class J1 extends L4.a {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k f38504c;

    /* renamed from: d  reason: collision with root package name */
    private final Q0 f38505d;

    /* renamed from: e  reason: collision with root package name */
    private final e f38506e;

    public static final class a extends e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A f38507e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ J1 f38508f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C3284z f38509g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w1 f38510h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f38511i;

        public a(A a10, J1 j12, C3284z zVar, w1 w1Var, b bVar) {
            this.f38507e = a10;
            this.f38508f = j12;
            this.f38509g = zVar;
            this.f38510h = w1Var;
            this.f38511i = bVar;
        }

        public Object e() {
            this.f38507e.m();
            return new C3266p1(this.f38508f.f38504c, this.f38509g, this.f38507e, (C3263o1) this.f38510h.f().get(), this.f38508f.f38504c.r(), this.f38511i);
        }
    }

    public J1(L4.b bVar, w1 w1Var, A a10, b bVar2, C3284z zVar) {
        super(bVar2, (t) null, 2, (DefaultConstructorMarker) null);
        k a11 = bVar.a();
        this.f38504c = a11;
        this.f38505d = new Q0(a11, (ScheduledThreadPoolExecutor) null, 2, (DefaultConstructorMarker) null);
        b bVar3 = this.f32505a;
        t tVar = this.f32506b;
        a aVar = new a(a10, this, zVar, w1Var, bVar2);
        bVar3.b(tVar, aVar);
        this.f38506e = aVar;
    }

    public final Q0 b() {
        return this.f38505d;
    }

    public final e c() {
        return this.f38506e;
    }
}
