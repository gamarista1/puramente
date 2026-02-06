package t0;

import q0.C2421g;
import q0.C2427m;
import q0.C2428n;
import r0.C2520p0;
import r0.K1;
import r0.S1;

/* renamed from: t0.b  reason: case insensitive filesystem */
public abstract class C2601b {

    /* renamed from: t0.b$a */
    public static final class a implements C2607h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2603d f25938a;

        a(C2603d dVar) {
            this.f25938a = dVar;
        }

        public void a(float[] fArr) {
            this.f25938a.f().s(fArr);
        }

        public void b(S1 s12, int i10) {
            this.f25938a.f().b(s12, i10);
        }

        public void c(float f10, float f11, float f12, float f13, int i10) {
            this.f25938a.f().c(f10, f11, f12, f13, i10);
        }

        public void d(float f10, float f11) {
            this.f25938a.f().d(f10, f11);
        }

        public void e(float f10, float f11, long j10) {
            C2520p0 f12 = this.f25938a.f();
            f12.d(C2421g.m(j10), C2421g.n(j10));
            f12.e(f10, f11);
            f12.d(-C2421g.m(j10), -C2421g.n(j10));
        }

        public void f(float f10, long j10) {
            C2520p0 f11 = this.f25938a.f();
            f11.d(C2421g.m(j10), C2421g.n(j10));
            f11.o(f10);
            f11.d(-C2421g.m(j10), -C2421g.n(j10));
        }

        public void i(float f10, float f11, float f12, float f13) {
            boolean z10;
            C2520p0 f14 = this.f25938a.f();
            C2603d dVar = this.f25938a;
            long a10 = C2428n.a(C2427m.k(j()) - (f12 + f10), C2427m.i(j()) - (f13 + f11));
            if (C2427m.k(a10) < 0.0f || C2427m.i(a10) < 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                K1.a("Width and height must be greater than or equal to zero");
            }
            dVar.h(a10);
            f14.d(f10, f11);
        }

        public long j() {
            return this.f25938a.d();
        }
    }

    /* access modifiers changed from: private */
    public static final C2607h b(C2603d dVar) {
        return new a(dVar);
    }
}
