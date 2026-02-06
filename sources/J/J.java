package J;

import Q0.C1321d;
import Q0.T;
import V0.h;
import b1.t;
import c1.d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class J {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil((double) f10));
    }

    public static final I b(I i10, C1321d dVar, T t10, d dVar2, h.b bVar, boolean z10, int i11, int i12, int i13, List list) {
        C1321d dVar3 = dVar;
        if (C6496s.c(i10.k(), dVar)) {
            T t11 = t10;
            if (C6496s.c(i10.j(), t10)) {
                if (i10.i() != z10) {
                    d dVar4 = dVar2;
                    h.b bVar2 = bVar;
                    int i14 = i11;
                    int i15 = i12;
                    int i16 = i13;
                } else if (!t.e(i10.g(), i11)) {
                    d dVar5 = dVar2;
                    h.b bVar3 = bVar;
                    int i152 = i12;
                    int i162 = i13;
                } else if (i10.d() == i12) {
                    if (i10.e() == i13) {
                        d dVar6 = dVar2;
                        if (C6496s.c(i10.a(), dVar2)) {
                            if (!C6496s.c(i10.h(), list)) {
                                h.b bVar4 = bVar;
                            } else if (i10.b() == bVar) {
                                return i10;
                            }
                            return new I(dVar, t10, i12, i13, z10, i11, dVar2, bVar, list, (DefaultConstructorMarker) null);
                        }
                    } else {
                        d dVar7 = dVar2;
                    }
                    h.b bVar5 = bVar;
                } else {
                    d dVar8 = dVar2;
                    h.b bVar6 = bVar;
                    int i1622 = i13;
                }
            }
            d dVar9 = dVar2;
            h.b bVar7 = bVar;
            boolean z11 = z10;
            int i142 = i11;
            int i1522 = i12;
            int i16222 = i13;
        } else {
            T t12 = t10;
            d dVar92 = dVar2;
            h.b bVar72 = bVar;
            boolean z112 = z10;
            int i1422 = i11;
            int i15222 = i12;
            int i162222 = i13;
        }
        List list2 = list;
        return new I(dVar, t10, i12, i13, z10, i11, dVar2, bVar, list, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ I c(I i10, C1321d dVar, T t10, d dVar2, h.b bVar, boolean z10, int i11, int i12, int i13, List list, int i14, Object obj) {
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18 = i14;
        if ((i18 & 32) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i18 & 64) != 0) {
            i15 = t.f19154a.a();
        } else {
            i15 = i11;
        }
        if ((i18 & 128) != 0) {
            i16 = Integer.MAX_VALUE;
        } else {
            i16 = i12;
        }
        if ((i18 & 256) != 0) {
            i17 = 1;
        } else {
            i17 = i13;
        }
        return b(i10, dVar, t10, dVar2, bVar, z11, i15, i16, i17, list);
    }
}
