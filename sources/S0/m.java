package s0;

import e1.C1943b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2550z0;

public final class m extends C2581c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f25841e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final float[] f25842f;

    /* renamed from: g  reason: collision with root package name */
    private static final float[] f25843g;

    /* renamed from: h  reason: collision with root package name */
    private static final float[] f25844h;

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f25845i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        float[] b10 = C2579a.f25780b.a().b();
        k kVar = k.f25829a;
        float[] l10 = C2582d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C2582d.e(b10, kVar.b().c(), kVar.e().c()));
        f25842f = l10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f25843g = fArr;
        f25844h = C2582d.k(l10);
        f25845i = C2582d.k(fArr);
    }

    public m(String str, int i10) {
        super(str, C2580b.f25785a.a(), i10, (DefaultConstructorMarker) null);
    }

    public float c(int i10) {
        if (i10 == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    public float d(int i10) {
        if (i10 == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    public long h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f25845i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f25844h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19))) & 4294967295L);
    }

    public float i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f25845i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f25844h;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    public long j(float f10, float f11, float f12, float f13, C2581c cVar) {
        float[] fArr = f25842f;
        float f14 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float a10 = C1943b.a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12));
        float a11 = C1943b.a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12));
        float a12 = C1943b.a(f14);
        float[] fArr2 = f25843g;
        return C2550z0.a((fArr2[0] * a10) + (fArr2[3] * a11) + (fArr2[6] * a12), (fArr2[1] * a10) + (fArr2[4] * a11) + (fArr2[7] * a12), (fArr2[2] * a10) + (fArr2[5] * a11) + (fArr2[8] * a12), f13, cVar);
    }
}
