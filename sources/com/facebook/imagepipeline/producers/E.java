package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.C6496s;

public abstract class E implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f39809a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f39810b;

    public E(h0 h0Var, g0 g0Var) {
        this.f39809a = h0Var;
        this.f39810b = g0Var;
    }

    public void b(e0 e0Var, String str, boolean z10) {
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        if (h0Var != null) {
            h0Var.h(e0Var.getId(), str, z10);
        }
        g0 g0Var = this.f39810b;
        if (g0Var != null) {
            g0Var.b(e0Var, str, z10);
        }
    }

    public void c(e0 e0Var, String str, Map map) {
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        if (h0Var != null) {
            h0Var.g(e0Var.getId(), str, map);
        }
        g0 g0Var = this.f39810b;
        if (g0Var != null) {
            g0Var.c(e0Var, str, map);
        }
    }

    public void d(e0 e0Var, String str) {
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        if (h0Var != null) {
            h0Var.a(e0Var.getId(), str);
        }
        g0 g0Var = this.f39810b;
        if (g0Var != null) {
            g0Var.d(e0Var, str);
        }
    }

    public boolean f(e0 e0Var, String str) {
        Boolean bool;
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        Boolean bool2 = null;
        if (h0Var != null) {
            bool = Boolean.valueOf(h0Var.d(e0Var.getId()));
        } else {
            bool = null;
        }
        if (!C6496s.c(bool, Boolean.TRUE)) {
            g0 g0Var = this.f39810b;
            if (g0Var != null) {
                bool2 = Boolean.valueOf(g0Var.f(e0Var, str));
            }
            bool = bool2;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void h(e0 e0Var, String str, String str2) {
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        if (h0Var != null) {
            h0Var.i(e0Var.getId(), str, str2);
        }
        g0 g0Var = this.f39810b;
        if (g0Var != null) {
            g0Var.h(e0Var, str, str2);
        }
    }

    public void j(e0 e0Var, String str, Map map) {
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        if (h0Var != null) {
            h0Var.e(e0Var.getId(), str, map);
        }
        g0 g0Var = this.f39810b;
        if (g0Var != null) {
            g0Var.j(e0Var, str, map);
        }
    }

    public void k(e0 e0Var, String str, Throwable th2, Map map) {
        C6496s.h(e0Var, "context");
        h0 h0Var = this.f39809a;
        if (h0Var != null) {
            h0Var.f(e0Var.getId(), str, th2, map);
        }
        g0 g0Var = this.f39810b;
        if (g0Var != null) {
            g0Var.k(e0Var, str, th2, map);
        }
    }
}
