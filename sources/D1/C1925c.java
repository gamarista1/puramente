package d1;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d1.c  reason: case insensitive filesystem */
public final class C1925c implements C1923a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19443c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19444d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float[] f19445a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f19446b;

    /* renamed from: d1.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float a10;
            float abs = Math.abs(f10);
            float signum = Math.signum(f10);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                a10 = fArr2[binarySearch];
            } else {
                int i10 = -(binarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    float f17 = fArr[0];
                    f12 = fArr2[0];
                    f11 = f17;
                    f13 = 0.0f;
                } else {
                    float f18 = fArr[i11];
                    float f19 = fArr[i10];
                    f13 = fArr2[i11];
                    f14 = f18;
                    f11 = f19;
                    f12 = fArr2[i10];
                }
                a10 = d.f19447a.a(f13, f12, f14, f11, abs);
            }
            return signum * a10;
        }

        private a() {
        }
    }

    public C1925c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f19445a = fArr;
        this.f19446b = fArr2;
    }

    public float a(float f10) {
        return f19443c.b(f10, this.f19446b, this.f19445a);
    }

    public float b(float f10) {
        return f19443c.b(f10, this.f19445a, this.f19446b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1925c)) {
            return false;
        }
        C1925c cVar = (C1925c) obj;
        if (!Arrays.equals(this.f19445a, cVar.f19445a) || !Arrays.equals(this.f19446b, cVar.f19446b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f19445a) * 31) + Arrays.hashCode(this.f19446b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f19445a);
        C6496s.g(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f19446b);
        C6496s.g(arrays2, "toString(this)");
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
