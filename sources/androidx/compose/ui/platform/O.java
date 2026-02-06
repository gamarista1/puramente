package androidx.compose.ui.platform;

import W0.L;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.coreshims.d;
import androidx.compose.ui.platform.coreshims.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import r0.M1;
import yf.C6798l;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    private static C6798l f13620a = a.f13621a;

    /* access modifiers changed from: private */
    public static final boolean e(View view, View view2) {
        if (C6496s.c(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* access modifiers changed from: private */
    public static final d g(View view) {
        e.c(view, 1);
        return e.b(view);
    }

    public static final C6798l h() {
        return f13620a;
    }

    /* access modifiers changed from: private */
    public static final void i(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float f10 = f(fArr4, 0, fArr3, 0);
        float f11 = f(fArr4, 0, fArr3, 1);
        float f12 = f(fArr4, 0, fArr3, 2);
        float f13 = f(fArr4, 0, fArr3, 3);
        float f14 = f(fArr4, 1, fArr3, 0);
        float f15 = f(fArr4, 1, fArr3, 1);
        float f16 = f(fArr4, 1, fArr3, 2);
        float f17 = f(fArr4, 1, fArr3, 3);
        float f18 = f(fArr4, 2, fArr3, 0);
        float f19 = f(fArr4, 2, fArr3, 1);
        float f20 = f(fArr4, 2, fArr3, 2);
        float f21 = f(fArr4, 2, fArr3, 3);
        float f22 = f(fArr4, 3, fArr3, 0);
        float f23 = f(fArr4, 3, fArr3, 1);
        float f24 = f(fArr4, 3, fArr3, 2);
        float f25 = f(fArr4, 3, fArr3, 3);
        fArr3[0] = f10;
        fArr3[1] = f11;
        fArr3[2] = f12;
        fArr3[3] = f13;
        fArr3[4] = f14;
        fArr3[5] = f15;
        fArr3[6] = f16;
        fArr3[7] = f17;
        fArr3[8] = f18;
        fArr3[9] = f19;
        fArr3[10] = f20;
        fArr3[11] = f21;
        fArr3[12] = f22;
        fArr3[13] = f23;
        fArr3[14] = f24;
        fArr3[15] = f25;
    }

    /* access modifiers changed from: private */
    public static final void j(float[] fArr, float f10, float f11, float[] fArr2) {
        M1.h(fArr2);
        M1.q(fArr2, f10, f11, 0.0f, 4, (Object) null);
        i(fArr, fArr2);
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13621a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final L invoke(L l10) {
            return l10;
        }
    }
}
