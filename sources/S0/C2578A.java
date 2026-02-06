package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2550z0;

/* renamed from: s0.A  reason: case insensitive filesystem */
public final class C2578A extends C2581c {
    public C2578A(String str, int i10) {
        super(str, C2580b.f25785a.c(), i10, (DefaultConstructorMarker) null);
    }

    public float c(int i10) {
        return 2.0f;
    }

    public float d(int i10) {
        return -2.0f;
    }

    public long h(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f13 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 <= 2.0f) {
            f13 = f11;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
    }

    public float i(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    public long j(float f10, float f11, float f12, float f13, C2581c cVar) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f14 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 <= 2.0f) {
            f14 = f12;
        }
        return C2550z0.a(f10, f11, f14, f13, cVar);
    }
}
