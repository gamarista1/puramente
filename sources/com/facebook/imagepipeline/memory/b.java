package com.facebook.imagepipeline.memory;

import T5.k;
import U5.a;
import java.util.LinkedList;
import java.util.Queue;

class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f39749a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39750b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f39751c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f39752d;

    /* renamed from: e  reason: collision with root package name */
    private int f39753e;

    public b(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        k.i(z11);
        if (i11 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        k.i(z12);
        k.i(i12 >= 0 ? true : z13);
        this.f39749a = i10;
        this.f39750b = i11;
        this.f39751c = new LinkedList();
        this.f39753e = i12;
        this.f39752d = z10;
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        this.f39751c.add(obj);
    }

    public void b() {
        boolean z10;
        if (this.f39753e > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.i(z10);
        this.f39753e--;
    }

    public Object c() {
        Object g10 = g();
        if (g10 != null) {
            this.f39753e++;
        }
        return g10;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f39751c.size();
    }

    public void e() {
        this.f39753e++;
    }

    public boolean f() {
        if (this.f39753e + d() > this.f39750b) {
            return true;
        }
        return false;
    }

    public Object g() {
        return this.f39751c.poll();
    }

    public void h(Object obj) {
        boolean z10;
        k.g(obj);
        if (this.f39752d) {
            if (this.f39753e > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.i(z10);
            this.f39753e--;
            a(obj);
            return;
        }
        int i10 = this.f39753e;
        if (i10 > 0) {
            this.f39753e = i10 - 1;
            a(obj);
            return;
        }
        a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
    }
}
