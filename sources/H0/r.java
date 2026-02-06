package H0;

import Ef.m;
import c1.t;
import java.util.Map;
import yf.C6798l;

public final class r implements H, C1194o {

    /* renamed from: a  reason: collision with root package name */
    private final t f2628a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1194o f2629b;

    public r(C1194o oVar, t tVar) {
        this.f2628a = tVar;
        this.f2629b = oVar;
    }

    public long B1(long j10) {
        return this.f2629b.B1(j10);
    }

    public float E(int i10) {
        return this.f2629b.E(i10);
    }

    public int E0(float f10) {
        return this.f2629b.E0(f10);
    }

    public float N0(long j10) {
        return this.f2629b.N0(j10);
    }

    public long P(float f10) {
        return this.f2629b.P(f10);
    }

    public long Q(long j10) {
        return this.f2629b.Q(j10);
    }

    public float V(long j10) {
        return this.f2629b.V(j10);
    }

    public long f0(int i10) {
        return this.f2629b.f0(i10);
    }

    public long g0(float f10) {
        return this.f2629b.g0(f10);
    }

    public float getDensity() {
        return this.f2629b.getDensity();
    }

    public t getLayoutDirection() {
        return this.f2628a;
    }

    public G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2) {
        boolean z10 = false;
        int d10 = m.d(i10, 0);
        int d11 = m.d(i11, 0);
        if ((d10 & -16777216) == 0 && (-16777216 & d11) == 0) {
            z10 = true;
        }
        if (!z10) {
            G0.a.b("Size(" + d10 + " x " + d11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(d10, d11, map, lVar);
    }

    public float m1(float f10) {
        return this.f2629b.m1(f10);
    }

    public boolean r0() {
        return this.f2629b.r0();
    }

    public float r1() {
        return this.f2629b.r1();
    }

    public float t1(float f10) {
        return this.f2629b.t1(f10);
    }

    public static final class a implements G {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f2632c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f2633d;

        a(int i10, int i11, Map map, C6798l lVar) {
            this.f2630a = i10;
            this.f2631b = i11;
            this.f2632c = map;
            this.f2633d = lVar;
        }

        public int d() {
            return this.f2631b;
        }

        public int e() {
            return this.f2630a;
        }

        public Map p() {
            return this.f2632c;
        }

        public C6798l r() {
            return this.f2633d;
        }

        public void q() {
        }
    }
}
