package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2466S;
import r0.M1;
import yf.p;

public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private final p f13516a;

    /* renamed from: b  reason: collision with root package name */
    private Matrix f13517b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f13518c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f13519d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f13520e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13521f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13522g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13523h = true;

    public F0(p pVar) {
        this.f13516a = pVar;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f13520e;
        if (fArr == null) {
            fArr = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f13520e = fArr;
        }
        if (this.f13522g) {
            this.f13523h = D0.a(b(obj), fArr);
            this.f13522g = false;
        }
        if (this.f13523h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f13519d;
        if (fArr == null) {
            fArr = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f13519d = fArr;
        }
        if (!this.f13521f) {
            return fArr;
        }
        Matrix matrix = this.f13517b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13517b = matrix;
        }
        this.f13516a.invoke(obj, matrix);
        Matrix matrix2 = this.f13518c;
        if (matrix2 == null || !C6496s.c(matrix, matrix2)) {
            C2466S.b(fArr, matrix);
            this.f13517b = matrix2;
            this.f13518c = matrix;
        }
        this.f13521f = false;
        return fArr;
    }

    public final void c() {
        this.f13521f = true;
        this.f13522g = true;
    }
}
