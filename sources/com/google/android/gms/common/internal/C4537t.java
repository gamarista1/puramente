package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.t  reason: case insensitive filesystem */
public final class C4537t {

    /* renamed from: b  reason: collision with root package name */
    private static C4537t f54227b;

    /* renamed from: c  reason: collision with root package name */
    private static final C4538u f54228c = new C4538u(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private C4538u f54229a;

    private C4537t() {
    }

    public static synchronized C4537t b() {
        C4537t tVar;
        synchronized (C4537t.class) {
            try {
                if (f54227b == null) {
                    f54227b = new C4537t();
                }
                tVar = f54227b;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return tVar;
    }

    public C4538u a() {
        return this.f54229a;
    }

    public final synchronized void c(C4538u uVar) {
        if (uVar == null) {
            this.f54229a = f54228c;
            return;
        }
        C4538u uVar2 = this.f54229a;
        if (uVar2 == null || uVar2.s0() < uVar.s0()) {
            this.f54229a = uVar;
        }
    }
}
