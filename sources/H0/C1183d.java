package H0;

import J0.C;
import J0.Q;
import c1.s;
import c1.t;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: H0.d  reason: case insensitive filesystem */
public final class C1183d implements C1194o, H {

    /* renamed from: a  reason: collision with root package name */
    private final C f2569a;

    /* renamed from: H0.d$a */
    public static final class a implements G {

        /* renamed from: a  reason: collision with root package name */
        private final int f2570a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2571b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f2572c;

        /* renamed from: d  reason: collision with root package name */
        private final C6798l f2573d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f2574e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1183d f2575f;

        a(int i10, int i11, Map map, C6798l lVar, C6798l lVar2, C1183d dVar) {
            this.f2574e = lVar2;
            this.f2575f = dVar;
            this.f2570a = i10;
            this.f2571b = i11;
            this.f2572c = map;
            this.f2573d = lVar;
        }

        public int d() {
            return this.f2571b;
        }

        public int e() {
            return this.f2570a;
        }

        public Map p() {
            return this.f2572c;
        }

        public void q() {
            this.f2574e.invoke(this.f2575f.e().I1());
        }

        public C6798l r() {
            return this.f2573d;
        }
    }

    public C1183d(C c10, C1182c cVar) {
        this.f2569a = c10;
    }

    public long B1(long j10) {
        return this.f2569a.B1(j10);
    }

    public float E(int i10) {
        return this.f2569a.E(i10);
    }

    public int E0(float f10) {
        return this.f2569a.E0(f10);
    }

    public float N0(long j10) {
        return this.f2569a.N0(j10);
    }

    public long P(float f10) {
        return this.f2569a.P(f10);
    }

    public long Q(long j10) {
        return this.f2569a.Q(j10);
    }

    public float V(long j10) {
        return this.f2569a.V(j10);
    }

    public final C1182c a() {
        return null;
    }

    public G d1(int i10, int i11, Map map, C6798l lVar) {
        return this.f2569a.d1(i10, i11, map, lVar);
    }

    public final C e() {
        return this.f2569a;
    }

    public long f0(int i10) {
        return this.f2569a.f0(i10);
    }

    public long g0(float f10) {
        return this.f2569a.g0(f10);
    }

    public float getDensity() {
        return this.f2569a.getDensity();
    }

    public t getLayoutDirection() {
        return this.f2569a.getLayoutDirection();
    }

    public G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2) {
        boolean z10;
        if ((i10 & -16777216) == 0 && (-16777216 & i11) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, lVar, lVar2, this);
    }

    public float m1(float f10) {
        return this.f2569a.m1(f10);
    }

    public long o() {
        Q z22 = this.f2569a.z2();
        C6496s.e(z22);
        G E12 = z22.E1();
        return s.a(E12.e(), E12.d());
    }

    public boolean r0() {
        return false;
    }

    public float r1() {
        return this.f2569a.r1();
    }

    public float t1(float f10) {
        return this.f2569a.t1(f10);
    }

    public final void p(C1182c cVar) {
    }
}
