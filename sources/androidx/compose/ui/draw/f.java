package androidx.compose.ui.draw;

import G0.a;
import androidx.collection.I;
import androidx.collection.Q;
import r0.F1;
import u0.C2673c;

final class f implements F1 {

    /* renamed from: a  reason: collision with root package name */
    private I f13279a;

    /* renamed from: b  reason: collision with root package name */
    private F1 f13280b;

    public void a(C2673c cVar) {
        F1 f12 = this.f13280b;
        if (f12 != null) {
            f12.a(cVar);
        }
    }

    public C2673c b() {
        boolean z10;
        F1 f12 = this.f13280b;
        if (f12 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a.b("GraphicsContext not provided");
        }
        C2673c b10 = f12.b();
        I i10 = this.f13279a;
        if (i10 == null) {
            this.f13279a = Q.b(b10);
        } else {
            i10.g(b10);
        }
        return b10;
    }

    public final F1 c() {
        return this.f13280b;
    }

    public final void d() {
        I i10 = this.f13279a;
        if (i10 != null) {
            Object[] objArr = i10.f12112a;
            int i11 = i10.f12113b;
            for (int i12 = 0; i12 < i11; i12++) {
                a((C2673c) objArr[i12]);
            }
            i10.h();
        }
    }

    public final void e(F1 f12) {
        d();
        this.f13280b = f12;
    }
}
