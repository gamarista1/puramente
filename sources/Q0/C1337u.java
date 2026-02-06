package Q0;

import V0.h;
import Y0.f;
import c1.d;
import java.util.List;
import mf.C6565s;

/* renamed from: Q0.u  reason: case insensitive filesystem */
public abstract class C1337u {
    public static final C1333p a(String str, T t10, long j10, d dVar, h.b bVar, List list, List list2, int i10, boolean z10) {
        return f.b(str, t10, list, list2, i10, z10, j10, dVar, bVar);
    }

    public static /* synthetic */ C1333p b(String str, T t10, long j10, d dVar, h.b bVar, List list, List list2, int i10, boolean z10, int i11, Object obj) {
        List list3;
        List list4;
        int i12;
        boolean z11;
        int i13 = i11;
        if ((i13 & 32) != 0) {
            list3 = C6565s.n();
        } else {
            list3 = list;
        }
        if ((i13 & 64) != 0) {
            list4 = C6565s.n();
        } else {
            list4 = list2;
        }
        if ((i13 & 128) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = i10;
        }
        if ((i13 & 256) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return a(str, t10, j10, dVar, bVar, list3, list4, i12, z11);
    }

    public static final C1333p c(C1335s sVar, long j10, int i10, boolean z10) {
        return f.a(sVar, i10, z10, j10);
    }

    public static final int d(float f10) {
        return (int) ((float) Math.ceil((double) f10));
    }
}
