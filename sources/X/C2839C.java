package x;

import H0.C1197s;
import J0.B0;
import J0.C0;
import J0.C1253t;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x.C  reason: case insensitive filesystem */
public final class C2839C extends i.c implements B0, C1253t {

    /* renamed from: q  reason: collision with root package name */
    public static final a f27821q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f27822r = 8;

    /* renamed from: n  reason: collision with root package name */
    private boolean f27823n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f27824o;

    /* renamed from: p  reason: collision with root package name */
    private C1197s f27825p;

    /* renamed from: x.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final C2840D l2() {
        if (!S1()) {
            return null;
        }
        B0 a10 = C0.a(this, C2840D.f27826p);
        if (a10 instanceof C2840D) {
            return (C2840D) a10;
        }
        return null;
    }

    private final void m2() {
        C2840D l22;
        C1197s sVar = this.f27825p;
        if (sVar != null) {
            C6496s.e(sVar);
            if (sVar.G() && (l22 = l2()) != null) {
                l22.l2(this.f27825p);
            }
        }
    }

    public Object L() {
        return f27821q;
    }

    public boolean Q1() {
        return this.f27824o;
    }

    public final void n2(boolean z10) {
        if (z10 != this.f27823n) {
            if (!z10) {
                C2840D l22 = l2();
                if (l22 != null) {
                    l22.l2((C1197s) null);
                }
            } else {
                m2();
            }
            this.f27823n = z10;
        }
    }

    public void p(C1197s sVar) {
        this.f27825p = sVar;
        if (this.f27823n) {
            if (sVar.G()) {
                m2();
                return;
            }
            C2840D l22 = l2();
            if (l22 != null) {
                l22.l2((C1197s) null);
            }
        }
    }
}
