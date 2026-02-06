package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import g1.C2008c;
import java.util.Arrays;
import java.util.LinkedHashMap;

class n implements Comparable {

    /* renamed from: t  reason: collision with root package name */
    static String[] f14682t = {"position", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    C2008c f14683a;

    /* renamed from: b  reason: collision with root package name */
    int f14684b = 0;

    /* renamed from: c  reason: collision with root package name */
    float f14685c;

    /* renamed from: d  reason: collision with root package name */
    float f14686d;

    /* renamed from: e  reason: collision with root package name */
    float f14687e;

    /* renamed from: f  reason: collision with root package name */
    float f14688f;

    /* renamed from: g  reason: collision with root package name */
    float f14689g;

    /* renamed from: h  reason: collision with root package name */
    float f14690h;

    /* renamed from: i  reason: collision with root package name */
    float f14691i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    float f14692j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    int f14693k;

    /* renamed from: l  reason: collision with root package name */
    int f14694l;

    /* renamed from: m  reason: collision with root package name */
    float f14695m;

    /* renamed from: n  reason: collision with root package name */
    l f14696n;

    /* renamed from: o  reason: collision with root package name */
    LinkedHashMap f14697o;

    /* renamed from: p  reason: collision with root package name */
    int f14698p;

    /* renamed from: q  reason: collision with root package name */
    int f14699q;

    /* renamed from: r  reason: collision with root package name */
    double[] f14700r;

    /* renamed from: s  reason: collision with root package name */
    double[] f14701s;

    n() {
        int i10 = c.f14511f;
        this.f14693k = i10;
        this.f14694l = i10;
        this.f14695m = Float.NaN;
        this.f14696n = null;
        this.f14697o = new LinkedHashMap();
        this.f14698p = 0;
        this.f14700r = new double[18];
        this.f14701s = new double[18];
    }

    private boolean c(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            if (Float.isNaN(f10) != Float.isNaN(f11)) {
                return true;
            }
            return false;
        } else if (Math.abs(f10 - f11) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float f12;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f13 = this.f14687e;
        float f14 = this.f14688f;
        float f15 = this.f14689g;
        float f16 = this.f14690h;
        if (iArr2.length != 0 && this.f14700r.length <= iArr2[iArr2.length - 1]) {
            int i10 = iArr2[iArr2.length - 1] + 1;
            this.f14700r = new double[i10];
            this.f14701s = new double[i10];
        }
        Arrays.fill(this.f14700r, Double.NaN);
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            double[] dArr5 = this.f14700r;
            int i12 = iArr2[i11];
            dArr5[i12] = dArr[i11];
            this.f14701s[i12] = dArr4[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr6 = this.f14700r;
            if (i13 >= dArr6.length) {
                break;
            }
            double d10 = 0.0d;
            if (!Double.isNaN(dArr6[i13]) || !(dArr3 == null || dArr3[i13] == 0.0d)) {
                if (dArr3 != null) {
                    d10 = dArr3[i13];
                }
                if (!Double.isNaN(this.f14700r[i13])) {
                    d10 = this.f14700r[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.f14701s[i13];
                if (i13 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i13 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i13 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i13 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i13 == 5) {
                    f17 = f22;
                }
                i13++;
                double[] dArr7 = dArr2;
            } else {
                f12 = f17;
            }
            f17 = f12;
            i13++;
            double[] dArr72 = dArr2;
        }
        float f24 = f17;
        l lVar = this.f14696n;
        if (lVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            lVar.i((double) f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = (double) f13;
            double d12 = (double) f14;
            double sin = ((double) f25) + (Math.sin(d12) * d11);
            f11 = f16;
            float f29 = (float) (sin - ((double) (f15 / 2.0f)));
            float cos = (float) ((((double) f26) - (Math.cos(d12) * d11)) - ((double) (f16 / 2.0f)));
            double d13 = (double) f18;
            double d14 = (double) f19;
            float sin2 = (float) (((double) f27) + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float f30 = f29;
            float cos2 = (float) ((((double) f28) - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            double[] dArr8 = dArr2;
            if (dArr8.length >= 2) {
                dArr8[0] = (double) sin2;
                dArr8[1] = (double) cos2;
            }
            if (!Float.isNaN(f24)) {
                view2.setRotation((float) (((double) f24) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f13 = f30;
            f14 = cos;
        } else {
            float f31 = f24;
            f11 = f16;
            if (!Float.isNaN(f31)) {
                view2.setRotation(f31 + ((float) Math.toDegrees(Math.atan2((double) (f19 + (f21 / 2.0f)), (double) (f18 + (f20 / 2.0f))))) + 0.0f);
            }
        }
        float f32 = f13 + 0.5f;
        int i14 = (int) f32;
        float f33 = f14 + 0.5f;
        int i15 = (int) f33;
        int i16 = (int) (f32 + f15);
        int i17 = (int) (f33 + f11);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (!(i18 == view.getMeasuredWidth() && i19 == view.getMeasuredHeight() && !z10)) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view2.layout(i14, i15, i16, i17);
    }

    public void C(l lVar, n nVar) {
        double d10 = (double) (((this.f14687e + (this.f14689g / 2.0f)) - nVar.f14687e) - (nVar.f14689g / 2.0f));
        double d11 = (double) (((this.f14688f + (this.f14690h / 2.0f)) - nVar.f14688f) - (nVar.f14690h / 2.0f));
        this.f14696n = lVar;
        this.f14687e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f14695m)) {
            this.f14688f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f14688f = (float) Math.toRadians((double) this.f14695m);
        }
    }

    public void a(d.a aVar) {
        this.f14683a = C2008c.c(aVar.f15003d.f15094d);
        d.c cVar = aVar.f15003d;
        this.f14693k = cVar.f15095e;
        this.f14694l = cVar.f15092b;
        this.f14691i = cVar.f15099i;
        this.f14684b = cVar.f15096f;
        this.f14699q = cVar.f15093c;
        this.f14692j = aVar.f15002c.f15109e;
        this.f14695m = aVar.f15004e.f15024D;
        for (String str : aVar.f15006g.keySet()) {
            a aVar2 = (a) aVar.f15006g.get(str);
            if (aVar2 != null && aVar2.g()) {
                this.f14697o.put(str, aVar2);
            }
        }
    }

    /* renamed from: b */
    public int compareTo(n nVar) {
        return Float.compare(this.f14686d, nVar.f14686d);
    }

    /* access modifiers changed from: package-private */
    public void e(n nVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean c10 = c(this.f14687e, nVar.f14687e);
        boolean c11 = c(this.f14688f, nVar.f14688f);
        zArr[0] = zArr[0] | c(this.f14686d, nVar.f14686d);
        boolean z11 = c10 | c11 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | c(this.f14689g, nVar.f14689g);
        zArr[4] = c(this.f14690h, nVar.f14690h) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f14686d, this.f14687e, this.f14688f, this.f14689g, this.f14690h, this.f14691i};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = (double) fArr[i11];
                i10++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        int[] iArr2 = iArr;
        float f10 = this.f14687e;
        float f11 = this.f14688f;
        float f12 = this.f14689g;
        float f13 = this.f14690h;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr2[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        l lVar = this.f14696n;
        if (lVar != null) {
            float[] fArr2 = new float[2];
            lVar.i(d10, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d11 = (double) f15;
            double d12 = (double) f10;
            double d13 = (double) f11;
            f10 = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f12 / 2.0f)));
            f11 = (float) ((((double) f16) - (d12 * Math.cos(d13))) - ((double) (f13 / 2.0f)));
        }
        fArr[i10] = f10 + (f12 / 2.0f) + 0.0f;
        fArr[i10 + 1] = f11 + (f13 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void j(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        int[] iArr2 = iArr;
        float f11 = this.f14687e;
        float f12 = this.f14688f;
        float f13 = this.f14689g;
        float f14 = this.f14690h;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr2[i10];
            if (i11 == 1) {
                f11 = f19;
                f15 = f20;
            } else if (i11 == 2) {
                f12 = f19;
                f17 = f20;
            } else if (i11 == 3) {
                f13 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f14 = f19;
                f18 = f20;
            }
        }
        float f21 = 2.0f;
        float f22 = (f16 / 2.0f) + f15;
        float f23 = (f18 / 2.0f) + f17;
        l lVar = this.f14696n;
        if (lVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            lVar.i(d10, fArr3, fArr4);
            float f24 = fArr3[0];
            float f25 = fArr3[1];
            float f26 = fArr4[0];
            double d11 = (double) f11;
            float f27 = fArr4[1];
            double d12 = (double) f12;
            f10 = f13;
            double d13 = (double) f15;
            double d14 = (double) f17;
            float sin = (float) (((double) f26) + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            f23 = (float) ((((double) f27) - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f22 = sin;
            f11 = (float) ((((double) f24) + (Math.sin(d12) * d11)) - ((double) (f13 / 2.0f)));
            f12 = (float) ((((double) f25) - (d11 * Math.cos(d12))) - ((double) (f14 / 2.0f)));
            f21 = 2.0f;
        } else {
            f10 = f13;
        }
        fArr[0] = f11 + (f10 / f21) + 0.0f;
        fArr[1] = f12 + (f14 / f21) + 0.0f;
        fArr2[0] = f22;
        fArr2[1] = f23;
    }

    /* access modifiers changed from: package-private */
    public int l(String str, double[] dArr, int i10) {
        a aVar = (a) this.f14697o.get(str);
        int i11 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.h() == 1) {
            dArr[i10] = (double) aVar.e();
            return 1;
        }
        int h10 = aVar.h();
        float[] fArr = new float[h10];
        aVar.f(fArr);
        while (i11 < h10) {
            dArr[i10] = (double) fArr[i11];
            i11++;
            i10++;
        }
        return h10;
    }

    /* access modifiers changed from: package-private */
    public int m(String str) {
        a aVar = (a) this.f14697o.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.h();
    }

    /* access modifiers changed from: package-private */
    public void o(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f14687e;
        float f11 = this.f14688f;
        float f12 = this.f14689g;
        float f13 = this.f14690h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        l lVar = this.f14696n;
        if (lVar != null) {
            float j10 = lVar.j();
            double d10 = (double) f10;
            double d11 = (double) f11;
            f11 = (float) ((((double) this.f14696n.k()) - (d10 * Math.cos(d11))) - ((double) (f13 / 2.0f)));
            f10 = (float) ((((double) j10) + (Math.sin(d11) * d10)) - ((double) (f12 / 2.0f)));
        }
        float f15 = f12 + f10;
        float f16 = f13 + f11;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f10 + 0.0f;
        fArr[i10 + 1] = f11 + 0.0f;
        fArr[i10 + 2] = f15 + 0.0f;
        fArr[i10 + 3] = f11 + 0.0f;
        fArr[i10 + 4] = f15 + 0.0f;
        int i13 = i10 + 6;
        fArr[i10 + 5] = f16 + 0.0f;
        fArr[i13] = f10 + 0.0f;
        fArr[i10 + 7] = f16 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean p(String str) {
        return this.f14697o.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void r(g gVar, n nVar, n nVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        g gVar2 = gVar;
        n nVar3 = nVar;
        n nVar4 = nVar2;
        float f14 = ((float) gVar2.f14512a) / 100.0f;
        this.f14685c = f14;
        this.f14684b = gVar2.f14560j;
        if (Float.isNaN(gVar2.f14561k)) {
            f10 = f14;
        } else {
            f10 = gVar2.f14561k;
        }
        if (Float.isNaN(gVar2.f14562l)) {
            f11 = f14;
        } else {
            f11 = gVar2.f14562l;
        }
        float f15 = nVar4.f14689g;
        float f16 = nVar3.f14689g;
        float f17 = f15 - f16;
        float f18 = nVar4.f14690h;
        float f19 = nVar3.f14690h;
        float f20 = f18 - f19;
        this.f14686d = this.f14685c;
        float f21 = nVar3.f14687e;
        float f22 = (f16 / 2.0f) + f21;
        float f23 = nVar3.f14688f;
        float f24 = f23 + (f19 / 2.0f);
        float f25 = nVar4.f14687e + (f15 / 2.0f);
        float f26 = nVar4.f14688f + (f18 / 2.0f);
        if (f22 > f25) {
            float f27 = f22;
            f22 = f25;
            f25 = f27;
        }
        if (f24 <= f26) {
            float f28 = f24;
            f24 = f26;
            f26 = f28;
        }
        float f29 = f25 - f22;
        float f30 = f24 - f26;
        float f31 = f17 * f10;
        float f32 = f31 / 2.0f;
        this.f14687e = (float) ((int) ((f21 + (f29 * f14)) - f32));
        float f33 = f20 * f11;
        float f34 = f33 / 2.0f;
        this.f14688f = (float) ((int) ((f23 + (f30 * f14)) - f34));
        this.f14689g = (float) ((int) (f16 + f31));
        this.f14690h = (float) ((int) (f19 + f33));
        g gVar3 = gVar;
        if (Float.isNaN(gVar3.f14563m)) {
            f12 = f14;
        } else {
            f12 = gVar3.f14563m;
        }
        float f35 = 0.0f;
        if (Float.isNaN(gVar3.f14566p)) {
            f13 = 0.0f;
        } else {
            f13 = gVar3.f14566p;
        }
        if (!Float.isNaN(gVar3.f14564n)) {
            f14 = gVar3.f14564n;
        }
        if (!Float.isNaN(gVar3.f14565o)) {
            f35 = gVar3.f14565o;
        }
        this.f14698p = 0;
        n nVar5 = nVar;
        this.f14687e = (float) ((int) (((nVar5.f14687e + (f12 * f29)) + (f35 * f30)) - f32));
        this.f14688f = (float) ((int) (((nVar5.f14688f + (f29 * f13)) + (f30 * f14)) - f34));
        this.f14683a = C2008c.c(gVar3.f14558h);
        this.f14693k = gVar3.f14559i;
    }

    /* access modifiers changed from: package-private */
    public void s(g gVar, n nVar, n nVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        g gVar2 = gVar;
        n nVar3 = nVar;
        n nVar4 = nVar2;
        float f14 = ((float) gVar2.f14512a) / 100.0f;
        this.f14685c = f14;
        this.f14684b = gVar2.f14560j;
        if (Float.isNaN(gVar2.f14561k)) {
            f10 = f14;
        } else {
            f10 = gVar2.f14561k;
        }
        if (Float.isNaN(gVar2.f14562l)) {
            f11 = f14;
        } else {
            f11 = gVar2.f14562l;
        }
        float f15 = nVar4.f14689g;
        float f16 = nVar3.f14689g;
        float f17 = nVar4.f14690h;
        float f18 = nVar3.f14690h;
        this.f14686d = this.f14685c;
        float f19 = nVar3.f14687e;
        float f20 = nVar3.f14688f;
        float f21 = (nVar4.f14687e + (f15 / 2.0f)) - ((f16 / 2.0f) + f19);
        float f22 = (nVar4.f14688f + (f17 / 2.0f)) - (f20 + (f18 / 2.0f));
        float f23 = (f15 - f16) * f10;
        float f24 = f23 / 2.0f;
        this.f14687e = (float) ((int) ((f19 + (f21 * f14)) - f24));
        float f25 = (f17 - f18) * f11;
        float f26 = f25 / 2.0f;
        this.f14688f = (float) ((int) ((f20 + (f22 * f14)) - f26));
        this.f14689g = (float) ((int) (f16 + f23));
        this.f14690h = (float) ((int) (f18 + f25));
        g gVar3 = gVar;
        if (Float.isNaN(gVar3.f14563m)) {
            f12 = f14;
        } else {
            f12 = gVar3.f14563m;
        }
        float f27 = 0.0f;
        if (Float.isNaN(gVar3.f14566p)) {
            f13 = 0.0f;
        } else {
            f13 = gVar3.f14566p;
        }
        if (!Float.isNaN(gVar3.f14564n)) {
            f14 = gVar3.f14564n;
        }
        if (!Float.isNaN(gVar3.f14565o)) {
            f27 = gVar3.f14565o;
        }
        this.f14698p = 0;
        n nVar5 = nVar;
        this.f14687e = (float) ((int) (((nVar5.f14687e + (f12 * f21)) + (f27 * f22)) - f24));
        this.f14688f = (float) ((int) (((nVar5.f14688f + (f21 * f13)) + (f22 * f14)) - f26));
        this.f14683a = C2008c.c(gVar3.f14558h);
        this.f14693k = gVar3.f14559i;
    }

    /* access modifiers changed from: package-private */
    public void t(g gVar, n nVar, n nVar2) {
        float f10;
        float f11;
        float f12;
        g gVar2 = gVar;
        n nVar3 = nVar;
        n nVar4 = nVar2;
        float f13 = ((float) gVar2.f14512a) / 100.0f;
        this.f14685c = f13;
        this.f14684b = gVar2.f14560j;
        if (Float.isNaN(gVar2.f14561k)) {
            f10 = f13;
        } else {
            f10 = gVar2.f14561k;
        }
        if (Float.isNaN(gVar2.f14562l)) {
            f11 = f13;
        } else {
            f11 = gVar2.f14562l;
        }
        float f14 = nVar4.f14689g - nVar3.f14689g;
        float f15 = nVar4.f14690h - nVar3.f14690h;
        this.f14686d = this.f14685c;
        if (!Float.isNaN(gVar2.f14563m)) {
            f13 = gVar2.f14563m;
        }
        float f16 = nVar3.f14687e;
        float f17 = nVar3.f14689g;
        float f18 = nVar3.f14688f;
        float f19 = nVar3.f14690h;
        float f20 = nVar4.f14687e + (nVar4.f14689g / 2.0f);
        float f21 = f20 - ((f17 / 2.0f) + f16);
        float f22 = (nVar4.f14688f + (nVar4.f14690h / 2.0f)) - ((f19 / 2.0f) + f18);
        float f23 = f21 * f13;
        float f24 = f14 * f10;
        float f25 = f24 / 2.0f;
        this.f14687e = (float) ((int) ((f16 + f23) - f25));
        float f26 = f13 * f22;
        float f27 = f15 * f11;
        float f28 = f27 / 2.0f;
        this.f14688f = (float) ((int) ((f18 + f26) - f28));
        this.f14689g = (float) ((int) (f17 + f24));
        this.f14690h = (float) ((int) (f19 + f27));
        g gVar3 = gVar;
        if (Float.isNaN(gVar3.f14564n)) {
            f12 = 0.0f;
        } else {
            f12 = gVar3.f14564n;
        }
        float f29 = (-f22) * f12;
        float f30 = f21 * f12;
        this.f14698p = 1;
        n nVar5 = nVar;
        this.f14687e = ((float) ((int) ((nVar5.f14687e + f23) - f25))) + f29;
        this.f14688f = ((float) ((int) ((nVar5.f14688f + f26) - f28))) + f30;
        this.f14694l = this.f14694l;
        this.f14683a = C2008c.c(gVar3.f14558h);
        this.f14693k = gVar3.f14559i;
    }

    /* access modifiers changed from: package-private */
    public void u(int i10, int i11, g gVar, n nVar, n nVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = ((float) gVar.f14512a) / 100.0f;
        this.f14685c = f15;
        this.f14684b = gVar.f14560j;
        this.f14698p = gVar.f14567q;
        if (Float.isNaN(gVar.f14561k)) {
            f10 = f15;
        } else {
            f10 = gVar.f14561k;
        }
        if (Float.isNaN(gVar.f14562l)) {
            f11 = f15;
        } else {
            f11 = gVar.f14562l;
        }
        float f16 = nVar2.f14689g;
        float f17 = nVar.f14689g;
        float f18 = nVar2.f14690h;
        float f19 = nVar.f14690h;
        this.f14686d = this.f14685c;
        this.f14689g = (float) ((int) (f17 + ((f16 - f17) * f10)));
        this.f14690h = (float) ((int) (f19 + ((f18 - f19) * f11)));
        if (gVar.f14567q != 2) {
            if (Float.isNaN(gVar.f14563m)) {
                f14 = f15;
            } else {
                f14 = gVar.f14563m;
            }
            float f20 = nVar2.f14687e;
            float f21 = nVar.f14687e;
            this.f14687e = (f14 * (f20 - f21)) + f21;
            if (!Float.isNaN(gVar.f14564n)) {
                f15 = gVar.f14564n;
            }
            float f22 = nVar2.f14688f;
            float f23 = nVar.f14688f;
            this.f14688f = (f15 * (f22 - f23)) + f23;
        } else {
            if (Float.isNaN(gVar.f14563m)) {
                float f24 = nVar2.f14687e;
                float f25 = nVar.f14687e;
                f12 = ((f24 - f25) * f15) + f25;
            } else {
                f12 = Math.min(f11, f10) * gVar.f14563m;
            }
            this.f14687e = f12;
            if (Float.isNaN(gVar.f14564n)) {
                float f26 = nVar2.f14688f;
                float f27 = nVar.f14688f;
                f13 = (f15 * (f26 - f27)) + f27;
            } else {
                f13 = gVar.f14564n;
            }
            this.f14688f = f13;
        }
        this.f14694l = nVar.f14694l;
        this.f14683a = C2008c.c(gVar.f14558h);
        this.f14693k = gVar.f14559i;
    }

    /* access modifiers changed from: package-private */
    public void x(int i10, int i11, g gVar, n nVar, n nVar2) {
        float f10;
        float f11;
        g gVar2 = gVar;
        n nVar3 = nVar;
        n nVar4 = nVar2;
        float f12 = ((float) gVar2.f14512a) / 100.0f;
        this.f14685c = f12;
        this.f14684b = gVar2.f14560j;
        if (Float.isNaN(gVar2.f14561k)) {
            f10 = f12;
        } else {
            f10 = gVar2.f14561k;
        }
        if (Float.isNaN(gVar2.f14562l)) {
            f11 = f12;
        } else {
            f11 = gVar2.f14562l;
        }
        float f13 = nVar4.f14689g;
        float f14 = nVar3.f14689g;
        float f15 = nVar4.f14690h;
        float f16 = nVar3.f14690h;
        this.f14686d = this.f14685c;
        float f17 = nVar3.f14687e;
        float f18 = nVar3.f14688f;
        float f19 = nVar4.f14687e + (f13 / 2.0f);
        float f20 = nVar4.f14688f + (f15 / 2.0f);
        float f21 = (f13 - f14) * f10;
        this.f14687e = (float) ((int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f12)) - (f21 / 2.0f)));
        float f22 = (f15 - f16) * f11;
        this.f14688f = (float) ((int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f12)) - (f22 / 2.0f)));
        this.f14689g = (float) ((int) (f14 + f21));
        this.f14690h = (float) ((int) (f16 + f22));
        this.f14698p = 2;
        g gVar3 = gVar;
        if (!Float.isNaN(gVar3.f14563m)) {
            this.f14687e = (float) ((int) (gVar3.f14563m * ((float) (i10 - ((int) this.f14689g)))));
        }
        if (!Float.isNaN(gVar3.f14564n)) {
            this.f14688f = (float) ((int) (gVar3.f14564n * ((float) (i11 - ((int) this.f14690h)))));
        }
        this.f14694l = this.f14694l;
        this.f14683a = C2008c.c(gVar3.f14558h);
        this.f14693k = gVar3.f14559i;
    }

    /* access modifiers changed from: package-private */
    public void y(float f10, float f11, float f12, float f13) {
        this.f14687e = f10;
        this.f14688f = f11;
        this.f14689g = f12;
        this.f14690h = f13;
    }

    /* access modifiers changed from: package-private */
    public void z(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr2[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    n(int i10, int i11, g gVar, n nVar, n nVar2) {
        int i12 = c.f14511f;
        this.f14693k = i12;
        this.f14694l = i12;
        this.f14695m = Float.NaN;
        this.f14696n = null;
        this.f14697o = new LinkedHashMap();
        this.f14698p = 0;
        this.f14700r = new double[18];
        this.f14701s = new double[18];
        if (nVar.f14694l != c.f14511f) {
            u(i10, i11, gVar, nVar, nVar2);
            return;
        }
        int i13 = gVar.f14567q;
        if (i13 == 1) {
            t(gVar, nVar, nVar2);
        } else if (i13 == 2) {
            x(i10, i11, gVar, nVar, nVar2);
        } else if (i13 != 3) {
            s(gVar, nVar, nVar2);
        } else {
            r(gVar, nVar, nVar2);
        }
    }
}
