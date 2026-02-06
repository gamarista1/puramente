package com.facebook.imagepipeline.producers;

import R5.h;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public abstract class m0 extends h {

    /* renamed from: b  reason: collision with root package name */
    private final C3308n f40008b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f40009c;

    /* renamed from: d  reason: collision with root package name */
    private final e0 f40010d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40011e;

    public m0(C3308n nVar, g0 g0Var, e0 e0Var, String str) {
        C6496s.h(nVar, "consumer");
        C6496s.h(g0Var, "producerListener");
        C6496s.h(e0Var, "producerContext");
        C6496s.h(str, "producerName");
        this.f40008b = nVar;
        this.f40009c = g0Var;
        this.f40010d = e0Var;
        this.f40011e = str;
        g0Var.d(e0Var, str);
    }

    /* access modifiers changed from: protected */
    public void d() {
        Map map;
        g0 g0Var = this.f40009c;
        e0 e0Var = this.f40010d;
        String str = this.f40011e;
        if (g0Var.f(e0Var, str)) {
            map = g();
        } else {
            map = null;
        }
        g0Var.c(e0Var, str, map);
        this.f40008b.b();
    }

    /* access modifiers changed from: protected */
    public void e(Exception exc) {
        Map map;
        C6496s.h(exc, "e");
        g0 g0Var = this.f40009c;
        e0 e0Var = this.f40010d;
        String str = this.f40011e;
        if (g0Var.f(e0Var, str)) {
            map = h(exc);
        } else {
            map = null;
        }
        g0Var.k(e0Var, str, exc, map);
        this.f40008b.a(exc);
    }

    /* access modifiers changed from: protected */
    public void f(Object obj) {
        Map map;
        g0 g0Var = this.f40009c;
        e0 e0Var = this.f40010d;
        String str = this.f40011e;
        if (g0Var.f(e0Var, str)) {
            map = i(obj);
        } else {
            map = null;
        }
        g0Var.j(e0Var, str, map);
        this.f40008b.c(obj, 1);
    }

    /* access modifiers changed from: protected */
    public Map g() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Map h(Exception exc) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Map i(Object obj) {
        return null;
    }
}
