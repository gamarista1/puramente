package W0;

import Ef.m;
import Q0.L;
import Q0.Q;
import Q0.S;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import b1.i;
import c1.r;
import q0.C2423i;

/* renamed from: W0.d  reason: case insensitive filesystem */
public abstract class C1436d {
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i10, int i11, I i12, L l10, C2423i iVar) {
        boolean z10;
        int i13 = i11;
        I i14 = i12;
        int i15 = i10;
        C2423i iVar2 = iVar;
        int b10 = i14.b(i15);
        int b11 = i14.b(i13);
        float[] fArr = new float[((b11 - b10) * 4)];
        l10.w().a(S.b(b10, b11), fArr, 0);
        while (i15 < i13) {
            int b12 = i14.b(i15);
            int i16 = (b12 - b10) * 4;
            C2423i iVar3 = new C2423i(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3]);
            boolean r10 = iVar2.r(iVar3);
            if (!c(iVar2, iVar3.i(), iVar3.l()) || !c(iVar2, iVar3.j(), iVar3.e())) {
                r10 |= true;
            }
            if (l10.c(b12) == i.Rtl) {
                z10 = r10 | true;
            } else {
                z10 = r10;
            }
            builder.addCharacterBounds(i15, iVar3.i(), iVar3.l(), iVar3.j(), iVar3.e(), z10 ? 1 : 0);
            i15++;
        }
        return builder;
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, Q q10, I i10, L l10, Matrix matrix, C2423i iVar, C2423i iVar2, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        CursorAnchorInfo.Builder builder2 = builder;
        L l11 = l10;
        C2423i iVar3 = iVar;
        builder.reset();
        Matrix matrix2 = matrix;
        builder.setMatrix(matrix);
        int l12 = Q.l(q10.g());
        builder.setSelectionRange(l12, Q.k(q10.g()));
        I i13 = i10;
        if (z10) {
            d(builder, l12, i10, l10, iVar);
        }
        if (z11) {
            Q f10 = q10.f();
            if (f10 != null) {
                i11 = Q.l(f10.r());
            } else {
                i11 = -1;
            }
            Q f11 = q10.f();
            if (f11 != null) {
                i12 = Q.k(f11.r());
            } else {
                i12 = -1;
            }
            if (i11 >= 0 && i11 < i12) {
                builder.setComposingText(i11, q10.h().subSequence(i11, i12));
                a(builder, i11, i12, i10, l10, iVar);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33 && z12) {
            C2423i iVar4 = iVar2;
            C1434b.a(builder, iVar2);
        }
        if (i14 >= 34 && z13) {
            C1435c.a(builder, l10, iVar);
        }
        return builder.build();
    }

    private static final boolean c(C2423i iVar, float f10, float f11) {
        float i10 = iVar.i();
        if (f10 <= iVar.j() && i10 <= f10) {
            float l10 = iVar.l();
            if (f11 > iVar.e() || l10 > f11) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, I i11, L l10, C2423i iVar) {
        boolean z10;
        int i12;
        if (i10 < 0) {
            return builder;
        }
        int b10 = i11.b(i10);
        C2423i e10 = l10.e(b10);
        float k10 = m.k(e10.i(), 0.0f, (float) r.g(l10.B()));
        boolean c10 = c(iVar, k10, e10.l());
        boolean c11 = c(iVar, k10, e10.e());
        int i13 = 0;
        if (l10.c(b10) == i.Rtl) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c10 || c11) {
            i13 = 1;
        }
        if (!c10 || !c11) {
            i13 |= 2;
        }
        if (z10) {
            i12 = i13 | 4;
        } else {
            i12 = i13;
        }
        builder.setInsertionMarkerLocation(k10, e10.l(), e10.e(), e10.e(), i12);
        return builder;
    }
}
