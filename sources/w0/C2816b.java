package w0;

import c1.n;
import c1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C1;
import r0.H1;

/* renamed from: w0.b  reason: case insensitive filesystem */
public abstract class C2816b {
    public static final C2815a a(H1 h12, long j10, long j11, int i10) {
        C2815a aVar = new C2815a(h12, j10, j11, (DefaultConstructorMarker) null);
        aVar.n(i10);
        return aVar;
    }

    public static /* synthetic */ C2815a b(H1 h12, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = n.f19226b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = s.a(h12.e(), h12.d());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = C1.f25397a.a();
        }
        return a(h12, j12, j13, i10);
    }
}
