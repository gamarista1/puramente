package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2550z0;

public final class l extends C2581c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f25840e = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(String str, int i10) {
        super(str, C2580b.f25785a.a(), i10, (DefaultConstructorMarker) null);
    }

    public float c(int i10) {
        if (i10 == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    public float d(int i10) {
        if (i10 == 0) {
            return 0.0f;
        }
        return -128.0f;
    }

    public long h(float f10, float f11, float f12) {
        float f13;
        float f14;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        if (f16 > 0.20689656f) {
            f13 = f16 * f16 * f16;
        } else {
            f13 = (f16 - 0.13793103f) * 0.12841855f;
        }
        if (f15 > 0.20689656f) {
            f14 = f15 * f15 * f15;
        } else {
            f14 = (f15 - 0.13793103f) * 0.12841855f;
        }
        k kVar = k.f25829a;
        return (((long) Float.floatToRawIntBits(f14 * kVar.c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f13 * kVar.c()[0])) << 32);
    }

    public float i(float f10, float f11, float f12) {
        float f13;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f14 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        if (f14 > 0.20689656f) {
            f13 = f14 * f14 * f14;
        } else {
            f13 = 0.12841855f * (f14 - 0.13793103f);
        }
        return f13 * k.f25829a.c()[2];
    }

    public long j(float f10, float f11, float f12, float f13, C2581c cVar) {
        float f14;
        float f15;
        float f16;
        k kVar = k.f25829a;
        float f17 = f10 / kVar.c()[0];
        float f18 = f11 / kVar.c()[1];
        float f19 = f12 / kVar.c()[2];
        if (f17 > 0.008856452f) {
            f14 = (float) Math.cbrt((double) f17);
        } else {
            f14 = (f17 * 7.787037f) + 0.13793103f;
        }
        if (f18 > 0.008856452f) {
            f15 = (float) Math.cbrt((double) f18);
        } else {
            f15 = (f18 * 7.787037f) + 0.13793103f;
        }
        if (f19 > 0.008856452f) {
            f16 = (float) Math.cbrt((double) f19);
        } else {
            f16 = (f19 * 7.787037f) + 0.13793103f;
        }
        float f20 = (116.0f * f15) - 16.0f;
        float f21 = (f14 - f15) * 500.0f;
        float f22 = (f15 - f16) * 200.0f;
        if (f20 < 0.0f) {
            f20 = 0.0f;
        }
        if (f20 > 100.0f) {
            f20 = 100.0f;
        }
        if (f21 < -128.0f) {
            f21 = -128.0f;
        }
        float f23 = 128.0f;
        if (f21 > 128.0f) {
            f21 = 128.0f;
        }
        if (f22 < -128.0f) {
            f22 = -128.0f;
        }
        if (f22 <= 128.0f) {
            f23 = f22;
        }
        return C2550z0.a(f20, f21, f23, f13, cVar);
    }
}
