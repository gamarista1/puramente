package x;

import H0.S;
import H0.T;
import J0.C1242h;
import J0.C1243i;
import J0.h0;
import J0.i0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import yf.C6787a;

/* renamed from: x.A  reason: case insensitive filesystem */
final class C2837A extends i.c implements C1242h, h0 {

    /* renamed from: n  reason: collision with root package name */
    private S.a f27816n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f27817o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f27818p;

    /* renamed from: x.A$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f27819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2837A f27820b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10, C2837A a10) {
            super(0);
            this.f27819a = n10;
            this.f27820b = a10;
        }

        public final void invoke() {
            this.f27819a.f71759a = C1243i.a(this.f27820b, T.a());
        }
    }

    private final S l2() {
        N n10 = new N();
        i0.a(this, new a(n10, this));
        return (S) n10.f71759a;
    }

    public void A0() {
        S.a aVar;
        S l22 = l2();
        if (this.f27817o) {
            S.a aVar2 = this.f27816n;
            if (aVar2 != null) {
                aVar2.release();
            }
            if (l22 != null) {
                aVar = l22.a();
            } else {
                aVar = null;
            }
            this.f27816n = aVar;
        }
    }

    public boolean Q1() {
        return this.f27818p;
    }

    public void X1() {
        S.a aVar = this.f27816n;
        if (aVar != null) {
            aVar.release();
        }
        this.f27816n = null;
    }

    public final void m2(boolean z10) {
        S.a aVar = null;
        if (z10) {
            S l22 = l2();
            if (l22 != null) {
                aVar = l22.a();
            }
            this.f27816n = aVar;
        } else {
            S.a aVar2 = this.f27816n;
            if (aVar2 != null) {
                aVar2.release();
            }
            this.f27816n = null;
        }
        this.f27817o = z10;
    }
}
