package k7;

import T5.f;
import W6.g;
import W6.h;
import android.graphics.Matrix;
import c7.C3189i;
import kotlin.jvm.internal.C6496s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f45156a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final f f45157b;

    static {
        f d10 = f.d(2, 7, 4, 5);
        C6496s.g(d10, "of(...)");
        f45157b = d10;
    }

    private e() {
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(g gVar, int i10, int i11) {
        if (gVar == null) {
            return 1.0f;
        }
        float f10 = (float) i10;
        float f11 = (float) i11;
        float max = Math.max(((float) gVar.f34903a) / f10, ((float) gVar.f34904b) / f11);
        float f12 = gVar.f34905c;
        if (f10 * max > f12) {
            max = f12 / f10;
        }
        if (f11 * max > f12) {
            return f12 / f11;
        }
        return max;
    }

    private final int c(C3189i iVar) {
        int M02 = iVar.M0();
        if (M02 == 90 || M02 == 180 || M02 == 270) {
            return iVar.M0();
        }
        return 0;
    }

    public static final int d(h hVar, C3189i iVar) {
        int i10;
        C6496s.h(hVar, "rotationOptions");
        C6496s.h(iVar, "encodedImage");
        int y02 = iVar.y0();
        f fVar = f45157b;
        int indexOf = fVar.indexOf(Integer.valueOf(y02));
        if (indexOf >= 0) {
            if (!hVar.h()) {
                i10 = hVar.f();
            } else {
                i10 = 0;
            }
            Object obj = fVar.get((indexOf + (i10 / 90)) % fVar.size());
            C6496s.g(obj, "get(...)");
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static final int e(h hVar, C3189i iVar) {
        C6496s.h(hVar, "rotationOptions");
        C6496s.h(iVar, "encodedImage");
        if (!hVar.g()) {
            return 0;
        }
        int c10 = f45156a.c(iVar);
        if (hVar.h()) {
            return c10;
        }
        return (c10 + hVar.f()) % 360;
    }

    public static final int f(h hVar, g gVar, C3189i iVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        C6496s.h(hVar, "rotationOptions");
        C6496s.h(iVar, "encodedImage");
        if (!z10 || gVar == null) {
            return 8;
        }
        int e10 = e(hVar, iVar);
        boolean z11 = false;
        if (f45157b.contains(Integer.valueOf(iVar.y0()))) {
            i10 = d(hVar, iVar);
        } else {
            i10 = 0;
        }
        if (e10 == 90 || e10 == 270 || i10 == 5 || i10 == 7) {
            z11 = true;
        }
        if (z11) {
            i11 = iVar.d();
        } else {
            i11 = iVar.e();
        }
        if (z11) {
            i12 = iVar.e();
        } else {
            i12 = iVar.d();
        }
        int k10 = k(b(gVar, i11, i12), gVar.f34906d);
        if (k10 > 8) {
            return 8;
        }
        if (k10 < 1) {
            return 1;
        }
        return k10;
    }

    public static final Matrix g(C3189i iVar, h hVar) {
        C6496s.h(iVar, "encodedImage");
        C6496s.h(hVar, "rotationOptions");
        if (f45157b.contains(Integer.valueOf(iVar.y0()))) {
            return f45156a.h(d(hVar, iVar));
        }
        int e10 = e(hVar, iVar);
        if (e10 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) e10);
        return matrix;
    }

    private final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i10 != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        if (i10 < 0 || i10 > 270 || i10 % 90 != 0) {
            return false;
        }
        return true;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * ((float) 8)));
    }
}
