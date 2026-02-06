package D0;

import androidx.compose.ui.platform.v1;
import c1.d;
import qf.C6658d;
import yf.p;

/* renamed from: D0.b  reason: case insensitive filesystem */
public interface C1111b extends d {
    static /* synthetic */ Object u0(C1111b bVar, C1126q qVar, C6658d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                qVar = C1126q.Main;
            }
            return bVar.Z0(qVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    C1124o V0();

    Object Z0(C1126q qVar, C6658d dVar);

    Object a0(long j10, p pVar, C6658d dVar);

    long b();

    v1 getViewConfiguration();

    long w0();

    Object y0(long j10, p pVar, C6658d dVar);
}
