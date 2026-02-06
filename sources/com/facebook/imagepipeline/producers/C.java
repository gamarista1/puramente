package com.facebook.imagepipeline.producers;

import W6.b;
import android.net.Uri;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    private final C3308n f39790a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f39791b;

    /* renamed from: c  reason: collision with root package name */
    private long f39792c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f39793d;

    /* renamed from: e  reason: collision with root package name */
    private b f39794e;

    public C(C3308n nVar, e0 e0Var) {
        this.f39790a = nVar;
        this.f39791b = e0Var;
    }

    public C3308n a() {
        return this.f39790a;
    }

    public e0 b() {
        return this.f39791b;
    }

    public long c() {
        return this.f39792c;
    }

    public g0 d() {
        return this.f39791b.y();
    }

    public int e() {
        return this.f39793d;
    }

    public b f() {
        return this.f39794e;
    }

    public Uri g() {
        return this.f39791b.F().v();
    }

    public void h(long j10) {
        this.f39792c = j10;
    }

    public void i(int i10) {
        this.f39793d = i10;
    }

    public void j(b bVar) {
        this.f39794e = bVar;
    }
}
