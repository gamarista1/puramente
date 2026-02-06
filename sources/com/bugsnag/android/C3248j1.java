package com.bugsnag.android;

import K4.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: com.bugsnag.android.j1  reason: case insensitive filesystem */
public final class C3248j1 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f38731g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final k f38732a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38733b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f38734c;

    /* renamed from: d  reason: collision with root package name */
    private final C3245i1 f38735d;

    /* renamed from: e  reason: collision with root package name */
    private final C3245i1 f38736e;

    /* renamed from: f  reason: collision with root package name */
    private final C3245i1 f38737f;

    /* renamed from: com.bugsnag.android.j1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3248j1(Set set, k kVar, S0 s02) {
        this.f38732a = kVar;
        this.f38733b = s02;
        C3245i1 c10 = c("com.bugsnag.android.NdkPlugin", kVar.l().c());
        this.f38735d = c10;
        C3245i1 c11 = c("com.bugsnag.android.AnrPlugin", kVar.l().b());
        this.f38736e = c11;
        C3245i1 c12 = c("com.bugsnag.android.BugsnagReactNativePlugin", kVar.l().e());
        this.f38737f = c12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        if (c10 != null) {
            linkedHashSet.add(c10);
        }
        if (c11 != null) {
            linkedHashSet.add(c11);
        }
        if (c12 != null) {
            linkedHashSet.add(c12);
        }
        this.f38734c = C6565s.j1(linkedHashSet);
    }

    private final C3245i1 c(String str, boolean z10) {
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            if (newInstance != null) {
                return (C3245i1) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.Plugin");
        } catch (ClassNotFoundException unused) {
            if (!z10) {
                return null;
            }
            S0 s02 = this.f38733b;
            s02.g("Plugin '" + str + "' is not on the classpath - functionality will not be enabled.");
            return null;
        } catch (Throwable th2) {
            S0 s03 = this.f38733b;
            s03.c("Failed to load plugin '" + str + '\'', th2);
            return null;
        }
    }

    private final void d(C3245i1 i1Var, A a10) {
        String name = i1Var.getClass().getName();
        C3259n0 l10 = this.f38732a.l();
        if (C6496s.c(name, "com.bugsnag.android.NdkPlugin")) {
            if (l10.c()) {
                i1Var.load(a10);
            }
        } else if (!C6496s.c(name, "com.bugsnag.android.AnrPlugin")) {
            i1Var.load(a10);
        } else if (l10.b()) {
            i1Var.load(a10);
        }
    }

    public final C3245i1 a(Class cls) {
        Object obj;
        Iterator it = this.f38734c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6496s.c(((C3245i1) obj).getClass(), cls)) {
                break;
            }
        }
        return (C3245i1) obj;
    }

    public final C3245i1 b() {
        return this.f38735d;
    }

    public final void e(A a10) {
        for (C3245i1 i1Var : this.f38734c) {
            try {
                d(i1Var, a10);
            } catch (Throwable th2) {
                S0 s02 = this.f38733b;
                s02.c("Failed to load plugin " + i1Var + ", continuing with initialisation.", th2);
            }
        }
    }

    public final void f(A a10, boolean z10) {
        if (z10) {
            C3245i1 i1Var = this.f38736e;
            if (i1Var != null) {
                i1Var.load(a10);
                return;
            }
            return;
        }
        C3245i1 i1Var2 = this.f38736e;
        if (i1Var2 != null) {
            i1Var2.unload();
        }
    }

    public final void g(A a10, boolean z10) {
        f(a10, z10);
        if (z10) {
            C3245i1 i1Var = this.f38735d;
            if (i1Var != null) {
                i1Var.load(a10);
                return;
            }
            return;
        }
        C3245i1 i1Var2 = this.f38735d;
        if (i1Var2 != null) {
            i1Var2.unload();
        }
    }
}
