package q6;

import G6.m;
import T5.k;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: q6.f  reason: case insensitive filesystem */
public class C3957f extends C3952a {

    /* renamed from: i  reason: collision with root package name */
    private final Drawable[] f47629i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f47630j;

    /* renamed from: k  reason: collision with root package name */
    private final int f47631k;

    /* renamed from: l  reason: collision with root package name */
    private final int f47632l;

    /* renamed from: m  reason: collision with root package name */
    int f47633m;

    /* renamed from: n  reason: collision with root package name */
    int f47634n;

    /* renamed from: o  reason: collision with root package name */
    long f47635o;

    /* renamed from: p  reason: collision with root package name */
    int[] f47636p;

    /* renamed from: q  reason: collision with root package name */
    int[] f47637q;

    /* renamed from: r  reason: collision with root package name */
    int f47638r;

    /* renamed from: s  reason: collision with root package name */
    boolean[] f47639s;

    /* renamed from: t  reason: collision with root package name */
    int f47640t;

    /* renamed from: u  reason: collision with root package name */
    private m f47641u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f47642v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f47643w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f47644x = true;

    public C3957f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        boolean z11 = true;
        int i11 = 0;
        k.j(drawableArr.length < 1 ? false : z11, "At least one layer required!");
        this.f47629i = drawableArr;
        this.f47636p = new int[drawableArr.length];
        this.f47637q = new int[drawableArr.length];
        this.f47638r = 255;
        this.f47639s = new boolean[drawableArr.length];
        this.f47640t = 0;
        this.f47630j = z10;
        this.f47631k = z10 ? 255 : i11;
        this.f47632l = i10;
        t();
    }

    private void h(Canvas canvas, Drawable drawable, int i10) {
        if (drawable != null && i10 > 0) {
            this.f47640t++;
            if (this.f47644x) {
                drawable.mutate();
            }
            drawable.setAlpha(i10);
            this.f47640t--;
            drawable.draw(canvas);
        }
    }

    private void p() {
        if (this.f47642v) {
            this.f47642v = false;
            m mVar = this.f47641u;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    private void r() {
        int i10;
        if (!this.f47642v && (i10 = this.f47632l) >= 0) {
            boolean[] zArr = this.f47639s;
            if (i10 < zArr.length && zArr[i10]) {
                this.f47642v = true;
                m mVar = this.f47641u;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f47643w && this.f47633m == 2 && this.f47639s[this.f47632l]) {
            m mVar = this.f47641u;
            if (mVar != null) {
                mVar.b();
            }
            this.f47643w = false;
        }
    }

    private void t() {
        this.f47633m = 2;
        Arrays.fill(this.f47636p, this.f47631k);
        this.f47636p[0] = 255;
        Arrays.fill(this.f47637q, this.f47631k);
        this.f47637q[0] = 255;
        Arrays.fill(this.f47639s, this.f47630j);
        this.f47639s[0] = true;
    }

    private boolean v(float f10) {
        int i10;
        boolean z10 = true;
        for (int i11 = 0; i11 < this.f47629i.length; i11++) {
            boolean z11 = this.f47639s[i11];
            if (z11) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int[] iArr = this.f47637q;
            int i12 = (int) (((float) this.f47636p[i11]) + (((float) (i10 * 255)) * f10));
            iArr[i11] = i12;
            if (i12 < 0) {
                iArr[i11] = 0;
            }
            if (iArr[i11] > 255) {
                iArr[i11] = 255;
            }
            if (z11 && iArr[i11] < 255) {
                z10 = false;
            }
            if (!z11 && iArr[i11] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[LOOP:0: B:20:0x0052->B:22:0x0057, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[EDGE_INSN: B:26:0x0072->B:23:0x0072 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f47633m
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r3) goto L_0x000a
            goto L_0x0052
        L_0x000a:
            int r0 = r8.f47634n
            if (r0 <= 0) goto L_0x0010
            r0 = r3
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            T5.k.i(r0)
            long r4 = r8.o()
            long r6 = r8.f47635o
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f47634n
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.v(r0)
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            r8.f47633m = r1
        L_0x002a:
            r3 = r0
            goto L_0x0052
        L_0x002c:
            int[] r0 = r8.f47637q
            int[] r4 = r8.f47636p
            android.graphics.drawable.Drawable[] r5 = r8.f47629i
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.o()
            r8.f47635o = r4
            int r0 = r8.f47634n
            if (r0 != 0) goto L_0x0043
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            boolean r0 = r8.v(r0)
            r8.r()
            if (r0 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = r3
        L_0x004f:
            r8.f47633m = r1
            goto L_0x002a
        L_0x0052:
            android.graphics.drawable.Drawable[] r0 = r8.f47629i
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0072
            r0 = r0[r2]
            int[] r1 = r8.f47637q
            r1 = r1[r2]
            int r4 = r8.f47638r
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.h(r9, r0, r1)
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0072:
            if (r3 == 0) goto L_0x007b
            r8.p()
            r8.s()
            goto L_0x007e
        L_0x007b:
            r8.invalidateSelf()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C3957f.draw(android.graphics.Canvas):void");
    }

    public void g() {
        this.f47640t++;
    }

    public int getAlpha() {
        return this.f47638r;
    }

    public void i() {
        this.f47640t--;
        invalidateSelf();
    }

    public void invalidateSelf() {
        if (this.f47640t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f47633m = 0;
        Arrays.fill(this.f47639s, true);
        invalidateSelf();
    }

    public void l(int i10) {
        this.f47633m = 0;
        this.f47639s[i10] = true;
        invalidateSelf();
    }

    public void m(int i10) {
        this.f47633m = 0;
        this.f47639s[i10] = false;
        invalidateSelf();
    }

    public void n() {
        int i10;
        this.f47633m = 2;
        for (int i11 = 0; i11 < this.f47629i.length; i11++) {
            int[] iArr = this.f47637q;
            if (this.f47639s[i11]) {
                i10 = 255;
            } else {
                i10 = 0;
            }
            iArr[i11] = i10;
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public long o() {
        return SystemClock.uptimeMillis();
    }

    public void setAlpha(int i10) {
        if (this.f47638r != i10) {
            this.f47638r = i10;
            invalidateSelf();
        }
    }

    public void u(int i10) {
        this.f47634n = i10;
        if (this.f47633m == 1) {
            this.f47633m = 0;
        }
    }
}
