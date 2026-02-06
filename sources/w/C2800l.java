package w;

import kotlin.jvm.internal.C6490l;

/* renamed from: w.l  reason: case insensitive filesystem */
public abstract class C2800l {
    public static final C2799k a(float f10, float f11, long j10, long j11, boolean z10) {
        return new C2799k(t0.f(C6490l.f71789a), Float.valueOf(f10), C2806r.a(f11), j10, j11, z10);
    }

    public static final C2799k b(r0 r0Var, Object obj, Object obj2, long j10, long j11, boolean z10) {
        Object obj3 = obj2;
        return new C2799k(r0Var, obj, (C2805q) r0Var.a().invoke(obj2), j10, j11, z10);
    }

    public static /* synthetic */ C2799k c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        long j12;
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j13 = Long.MIN_VALUE;
        if ((i10 & 4) != 0) {
            j12 = Long.MIN_VALUE;
        } else {
            j12 = j10;
        }
        if ((i10 & 8) == 0) {
            j13 = j11;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j12, j13, z10);
    }

    public static /* synthetic */ C2799k d(r0 r0Var, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        long j12;
        long j13;
        boolean z11;
        if ((i10 & 8) != 0) {
            j12 = Long.MIN_VALUE;
        } else {
            j12 = j10;
        }
        if ((i10 & 16) != 0) {
            j13 = Long.MIN_VALUE;
        } else {
            j13 = j11;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return b(r0Var, obj, obj2, j12, j13, z11);
    }

    public static final C2799k e(C2799k kVar, float f10, float f11, long j10, long j11, boolean z10) {
        return new C2799k(kVar.m(), Float.valueOf(f10), C2806r.a(f11), j10, j11, z10);
    }

    public static final C2799k f(C2799k kVar, Object obj, C2805q qVar, long j10, long j11, boolean z10) {
        return new C2799k(kVar.m(), obj, qVar, j10, j11, z10);
    }

    public static /* synthetic */ C2799k g(C2799k kVar, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) kVar.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C2801m) kVar.q()).f();
        }
        float f12 = f11;
        if ((i10 & 4) != 0) {
            j10 = kVar.k();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = kVar.g();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = kVar.r();
        }
        return e(kVar, f10, f12, j12, j13, z10);
    }

    public static /* synthetic */ C2799k h(C2799k kVar, Object obj, C2805q qVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = kVar.getValue();
        }
        if ((i10 & 2) != 0) {
            qVar = C2806r.e(kVar.q());
        }
        C2805q qVar2 = qVar;
        if ((i10 & 4) != 0) {
            j10 = kVar.k();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = kVar.g();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = kVar.r();
        }
        return f(kVar, obj, qVar2, j12, j13, z10);
    }

    public static final C2805q i(r0 r0Var, Object obj) {
        C2805q qVar = (C2805q) r0Var.a().invoke(obj);
        qVar.d();
        return qVar;
    }
}
