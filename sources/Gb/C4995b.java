package gb;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: gb.b  reason: case insensitive filesystem */
public abstract class C4995b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f60593a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f60594b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f60595c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f60596d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f60597e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f60598f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f60599g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f60600h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f60601i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f60602j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f60603k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f60604l = C4995b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f60603k, 0)) != 0) {
            Log.w(f60604l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
