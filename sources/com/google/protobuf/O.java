package com.google.protobuf;

import android.support.v4.media.session.c;
import java.util.Iterator;
import java.util.Map;

final class O implements Z {

    /* renamed from: a  reason: collision with root package name */
    private final K f58408a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f58409b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f58410c;

    /* renamed from: d  reason: collision with root package name */
    private final C4874l f58411d;

    private O(g0 g0Var, C4874l lVar, K k10) {
        this.f58409b = g0Var;
        this.f58410c = lVar.d(k10);
        this.f58411d = lVar;
        this.f58408a = k10;
    }

    private int i(g0 g0Var, Object obj) {
        return g0Var.c(g0Var.a(obj));
    }

    static O j(g0 g0Var, C4874l lVar, K k10) {
        return new O(g0Var, lVar, k10);
    }

    private void k(g0 g0Var, Object obj, n0 n0Var) {
        g0Var.g(g0Var.a(obj), n0Var);
    }

    public void a(Object obj, Object obj2) {
        b0.E(this.f58409b, obj, obj2);
        if (this.f58410c) {
            b0.C(this.f58411d, obj, obj2);
        }
    }

    public Object b() {
        K k10 = this.f58408a;
        if (k10 instanceof r) {
            return ((r) k10).P();
        }
        return k10.c().n();
    }

    public int c(Object obj) {
        int hashCode = this.f58409b.a(obj).hashCode();
        if (this.f58410c) {
            return (hashCode * 53) + this.f58411d.b(obj).hashCode();
        }
        return hashCode;
    }

    public boolean d(Object obj, Object obj2) {
        if (!this.f58409b.a(obj).equals(this.f58409b.a(obj2))) {
            return false;
        }
        if (this.f58410c) {
            return this.f58411d.b(obj).equals(this.f58411d.b(obj2));
        }
        return true;
    }

    public void e(Object obj) {
        this.f58409b.d(obj);
        this.f58411d.e(obj);
    }

    public final boolean f(Object obj) {
        return this.f58411d.b(obj).k();
    }

    public int g(Object obj) {
        int i10 = i(this.f58409b, obj);
        if (this.f58410c) {
            return i10 + this.f58411d.b(obj).f();
        }
        return i10;
    }

    public void h(Object obj, n0 n0Var) {
        Iterator n10 = this.f58411d.b(obj).n();
        if (!n10.hasNext()) {
            k(this.f58409b, obj, n0Var);
        } else {
            c.a(((Map.Entry) n10.next()).getKey());
            throw null;
        }
    }
}
