package u8;

import io.intercom.android.sdk.metrics.MetricTracker;
import o7.X;
import v8.C4113c;

/* renamed from: u8.c  reason: case insensitive filesystem */
public abstract class C4101c {
    public static void a(C4113c cVar) {
        boolean z10;
        boolean z11;
        X.m(cVar.e(), MetricTracker.Object.MESSAGE);
        int i10 = 0;
        if (cVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cVar.a() == C4113c.a.ASKFOR || cVar.a() == C4113c.a.SEND) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z10 ^ z11)) {
            if (cVar.g() != null) {
                i10 = 1;
            }
            if (cVar.h() != null) {
                i10++;
            }
            if (cVar.d() != null) {
                i10++;
            }
            if (i10 > 1) {
                throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
            }
            return;
        }
        throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
    }
}
