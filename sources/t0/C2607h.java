package t0;

import r0.C2541w0;
import r0.S1;

/* renamed from: t0.h  reason: case insensitive filesystem */
public interface C2607h {
    static /* synthetic */ void g(C2607h hVar, S1 s12, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = C2541w0.f25557a.b();
            }
            hVar.b(s12, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    static /* synthetic */ void h(C2607h hVar, float f10, float f11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 2) != 0) {
                f11 = 0.0f;
            }
            hVar.d(f10, f11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    void a(float[] fArr);

    void b(S1 s12, int i10);

    void c(float f10, float f11, float f12, float f13, int i10);

    void d(float f10, float f11);

    void e(float f10, float f11, long j10);

    void f(float f10, long j10);

    void i(float f10, float f11, float f12, float f13);
}
