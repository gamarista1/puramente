package xd;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C6496s;

/* renamed from: xd.a  reason: case insensitive filesystem */
public abstract class C5280a {
    public static final BottomSheetBehavior a(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z10) {
        C6496s.h(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.G0(true);
        bottomSheetBehavior.x0(true);
        if (z10) {
            bottomSheetBehavior.H0(3);
        }
        if (num != null) {
            bottomSheetBehavior.B0(num.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior b(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(bottomSheetBehavior, num, z10);
    }

    public static final BottomSheetBehavior c(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f10, Integer num3) {
        C6496s.h(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.G0(false);
        bottomSheetBehavior.x0(false);
        if (num != null) {
            bottomSheetBehavior.H0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.D0(num2.intValue());
        }
        if (f10 != null) {
            bottomSheetBehavior.z0(f10.floatValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.w0(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior d(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f10, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            f10 = null;
        }
        if ((i10 & 8) != 0) {
            num3 = null;
        }
        return c(bottomSheetBehavior, num, num2, f10, num3);
    }

    public static final BottomSheetBehavior e(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3) {
        C6496s.h(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.G0(false);
        bottomSheetBehavior.x0(true);
        if (num != null) {
            bottomSheetBehavior.H0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.D0(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.B0(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior f(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        return e(bottomSheetBehavior, num, num2, num3);
    }
}
