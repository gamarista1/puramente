package r0;

import android.graphics.ColorFilter;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r0.B0  reason: case insensitive filesystem */
public final class C2437B0 extends C2547y0 {

    /* renamed from: c  reason: collision with root package name */
    private float[] f25395c;

    public /* synthetic */ C2437B0(float[] fArr, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr, colorFilter);
    }

    private final float[] b() {
        float[] fArr = this.f25395c;
        if (fArr != null) {
            return fArr;
        }
        float[] b10 = C2450I.b(a());
        this.f25395c = b10;
        return b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2437B0) && Arrays.equals(b(), ((C2437B0) obj).b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float[] fArr = this.f25395c;
        if (fArr != null) {
            return C2435A0.c(fArr);
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f25395c;
        if (fArr == null) {
            str = "null";
        } else {
            str = C2435A0.f(fArr);
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ C2437B0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private C2437B0(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.f25395c = fArr;
    }

    private C2437B0(float[] fArr) {
        this(fArr, C2450I.a(fArr), (DefaultConstructorMarker) null);
    }
}
