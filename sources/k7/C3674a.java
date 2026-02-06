package k7;

import Ef.m;
import O6.b;
import U5.a;
import W6.g;
import W6.h;
import c7.C3189i;
import kotlin.jvm.internal.C6496s;

/* renamed from: k7.a  reason: case insensitive filesystem */
public final class C3674a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3674a f45154a = new C3674a();

    private C3674a() {
    }

    public static final float a(h hVar, g gVar, C3189i iVar) {
        boolean z10;
        int i10;
        int i11;
        C6496s.h(hVar, "rotationOptions");
        C6496s.h(iVar, "encodedImage");
        if (!C3189i.f0(iVar)) {
            throw new IllegalStateException("Check failed.");
        } else if (gVar == null || gVar.f34904b <= 0 || gVar.f34903a <= 0 || iVar.e() == 0 || iVar.d() == 0) {
            return 1.0f;
        } else {
            int d10 = f45154a.d(hVar, iVar);
            if (d10 == 90 || d10 == 270) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = iVar.d();
            } else {
                i10 = iVar.e();
            }
            if (z10) {
                i11 = iVar.e();
            } else {
                i11 = iVar.d();
            }
            float f10 = ((float) gVar.f34903a) / ((float) i10);
            float f11 = ((float) gVar.f34904b) / ((float) i11);
            float c10 = m.c(f10, f11);
            a.D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(gVar.f34903a), Integer.valueOf(gVar.f34904b), Integer.valueOf(i10), Integer.valueOf(i11), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(c10));
            return c10;
        }
    }

    public static final int b(h hVar, g gVar, C3189i iVar, int i10) {
        int i11;
        float f10;
        int i12;
        C6496s.h(hVar, "rotationOptions");
        C6496s.h(iVar, "encodedImage");
        if (!C3189i.f0(iVar)) {
            return 1;
        }
        float a10 = a(hVar, gVar, iVar);
        if (iVar.y() == b.f33373b) {
            i11 = f(a10);
        } else {
            i11 = e(a10);
        }
        int max = Math.max(iVar.d(), iVar.e());
        if (gVar != null) {
            f10 = gVar.f34905c;
        } else {
            f10 = (float) i10;
        }
        while (((float) (max / i11)) > f10) {
            if (iVar.y() == b.f33373b) {
                i12 = i11 * 2;
            } else {
                i12 = i11 + 1;
            }
        }
        return i11;
    }

    public static final int c(C3189i iVar, int i10, int i11) {
        C6496s.h(iVar, "encodedImage");
        int I10 = iVar.I();
        while ((((iVar.e() * iVar.d()) * i10) / I10) / I10 > i11) {
            I10 *= 2;
        }
        return I10;
    }

    private final int d(h hVar, C3189i iVar) {
        if (!hVar.h()) {
            return 0;
        }
        int M02 = iVar.M0();
        if (M02 == 0 || M02 == 90 || M02 == 180 || M02 == 270) {
            return M02;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = (double) i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * ((double) 0.33333334f)) <= ((double) f10)) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / ((double) i11);
            if (d10 + (((double) 0.33333334f) * d10) <= ((double) f10)) {
                return i10;
            }
            i10 = i11;
        }
    }
}
