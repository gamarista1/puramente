package x;

import O0.u;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import c1.h;
import c1.k;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import yf.p;

/* renamed from: x.K  reason: case insensitive filesystem */
public abstract class C2847K {

    /* renamed from: a  reason: collision with root package name */
    private static final u f27868a = new u("MagnifierPositionInRoot", (p) null, 2, (DefaultConstructorMarker) null);

    public static final boolean a(float f10, float f11) {
        if ((!Float.isNaN(f10) || !Float.isNaN(f11)) && f10 != f11) {
            return false;
        }
        return true;
    }

    public static final u b() {
        return f27868a;
    }

    public static final boolean c(int i10) {
        if (i10 >= 28) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return c(i10);
    }

    public static final i e(i iVar, C6798l lVar, C6798l lVar2, C6798l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C2858W w10) {
        C2858W w11;
        if (!d(0, 1, (Object) null)) {
            return iVar;
        }
        if (w10 == null) {
            w11 = C2858W.f27893a.a();
        } else {
            w11 = w10;
        }
        i iVar2 = iVar;
        return iVar.h(new MagnifierElement(lVar, lVar2, lVar3, f10, z10, j10, f11, f12, z11, w11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i f(i iVar, C6798l lVar, C6798l lVar2, C6798l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C2858W w10, int i10, Object obj) {
        C6798l lVar4;
        C6798l lVar5;
        float f13;
        boolean z12;
        long j11;
        float f14;
        float f15;
        boolean z13;
        int i11 = i10;
        C2858W w11 = null;
        if ((i11 & 2) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        if ((i11 & 4) != 0) {
            lVar5 = null;
        } else {
            lVar5 = lVar3;
        }
        if ((i11 & 8) != 0) {
            f13 = Float.NaN;
        } else {
            f13 = f10;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i11 & 32) != 0) {
            j11 = k.f19222b.a();
        } else {
            j11 = j10;
        }
        if ((i11 & 64) != 0) {
            f14 = h.f19213b.c();
        } else {
            f14 = f11;
        }
        if ((i11 & 128) != 0) {
            f15 = h.f19213b.c();
        } else {
            f15 = f12;
        }
        if ((i11 & 256) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 512) == 0) {
            w11 = w10;
        }
        return e(iVar, lVar, lVar4, lVar5, f13, z12, j11, f14, f15, z13, w11);
    }
}
