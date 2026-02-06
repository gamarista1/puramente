package w;

import androidx.collection.C1599m;
import androidx.collection.C1601o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class D0 implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1599m f27160a;

    /* renamed from: b  reason: collision with root package name */
    private final C1601o f27161b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27162c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27163d;

    /* renamed from: e  reason: collision with root package name */
    private final C2760D f27164e;

    /* renamed from: f  reason: collision with root package name */
    private final int f27165f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f27166g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f27167h;

    /* renamed from: i  reason: collision with root package name */
    private C2805q f27168i;

    /* renamed from: j  reason: collision with root package name */
    private C2805q f27169j;

    /* renamed from: k  reason: collision with root package name */
    private C2805q f27170k;

    /* renamed from: l  reason: collision with root package name */
    private C2805q f27171l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f27172m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f27173n;

    /* renamed from: o  reason: collision with root package name */
    private C2809u f27174o;

    public /* synthetic */ D0(C1599m mVar, C1601o oVar, int i10, int i11, C2760D d10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, oVar, i10, i11, d10, i12);
    }

    private final int h(int i10) {
        int b10 = C2772P.b(this.f27160a, i10, 0, 0, 6, (Object) null);
        if (b10 < -1) {
            return -(b10 + 2);
        }
        return b10;
    }

    private final float i(int i10) {
        return j(h(i10), i10, false);
    }

    private final float j(int i10, int i11, boolean z10) {
        C2760D d10;
        float f10;
        C1599m mVar = this.f27160a;
        if (i10 >= mVar.f12186b - 1) {
            f10 = (float) i11;
        } else {
            int a10 = mVar.a(i10);
            int a11 = this.f27160a.a(i10 + 1);
            if (i11 == a10) {
                f10 = (float) a10;
            } else {
                int i12 = a11 - a10;
                C0 c02 = (C0) this.f27161b.c(a10);
                if (c02 == null || (d10 = c02.b()) == null) {
                    d10 = this.f27164e;
                }
                float f11 = (float) i12;
                float a12 = d10.a(((float) (i11 - a10)) / f11);
                if (z10) {
                    return a12;
                }
                f10 = (f11 * a12) + ((float) a10);
            }
        }
        return f10 / ((float) 1000);
    }

    private final void k(C2805q qVar, C2805q qVar2, C2805q qVar3) {
        boolean z10;
        float[] fArr;
        float[] fArr2;
        int i10;
        if (this.f27174o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27168i == null) {
            this.f27168i = C2806r.g(qVar);
            this.f27169j = C2806r.g(qVar3);
            int b10 = this.f27160a.b();
            float[] fArr3 = new float[b10];
            for (int i11 = 0; i11 < b10; i11++) {
                fArr3[i11] = ((float) this.f27160a.a(i11)) / ((float) 1000);
            }
            this.f27167h = fArr3;
            int b11 = this.f27160a.b();
            int[] iArr = new int[b11];
            for (int i12 = 0; i12 < b11; i12++) {
                C0 c02 = (C0) this.f27161b.c(this.f27160a.a(i12));
                if (c02 != null) {
                    i10 = c02.a();
                } else {
                    i10 = this.f27165f;
                }
                if (!C2808t.c(i10, C2808t.f27575a.a())) {
                    z10 = true;
                }
                iArr[i12] = i10;
            }
            this.f27166g = iArr;
        }
        if (z10) {
            float[] fArr4 = null;
            if (this.f27174o != null) {
                C2805q qVar4 = this.f27170k;
                if (qVar4 == null) {
                    C6496s.v("lastInitialValue");
                    qVar4 = null;
                }
                if (C6496s.c(qVar4, qVar)) {
                    C2805q qVar5 = this.f27171l;
                    if (qVar5 == null) {
                        C6496s.v("lastTargetValue");
                        qVar5 = null;
                    }
                    if (C6496s.c(qVar5, qVar2)) {
                        return;
                    }
                }
            }
            this.f27170k = qVar;
            this.f27171l = qVar2;
            int b12 = (qVar.b() % 2) + qVar.b();
            this.f27172m = new float[b12];
            this.f27173n = new float[b12];
            int b13 = this.f27160a.b();
            float[][] fArr5 = new float[b13][];
            for (int i13 = 0; i13 < b13; i13++) {
                int a10 = this.f27160a.a(i13);
                if (a10 == 0) {
                    if (!this.f27161b.a(a10)) {
                        fArr = new float[b12];
                        for (int i14 = 0; i14 < b12; i14++) {
                            fArr[i14] = qVar.a(i14);
                        }
                        fArr5[i13] = fArr;
                    } else {
                        fArr2 = new float[b12];
                        Object c10 = this.f27161b.c(a10);
                        C6496s.e(c10);
                        C2805q c11 = ((C0) c10).c();
                        for (int i15 = 0; i15 < b12; i15++) {
                            fArr2[i15] = c11.a(i15);
                        }
                    }
                } else if (a10 != f()) {
                    fArr2 = new float[b12];
                    Object c12 = this.f27161b.c(a10);
                    C6496s.e(c12);
                    C2805q c13 = ((C0) c12).c();
                    for (int i16 = 0; i16 < b12; i16++) {
                        fArr2[i16] = c13.a(i16);
                    }
                } else if (!this.f27161b.a(a10)) {
                    fArr = new float[b12];
                    for (int i17 = 0; i17 < b12; i17++) {
                        fArr[i17] = qVar2.a(i17);
                    }
                    fArr5[i13] = fArr;
                } else {
                    fArr2 = new float[b12];
                    Object c14 = this.f27161b.c(a10);
                    C6496s.e(c14);
                    C2805q c15 = ((C0) c14).c();
                    for (int i18 = 0; i18 < b12; i18++) {
                        fArr2[i18] = c15.a(i18);
                    }
                }
                fArr = fArr2;
                fArr5[i13] = fArr;
            }
            int[] iArr2 = this.f27166g;
            if (iArr2 == null) {
                C6496s.v("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.f27167h;
            if (fArr6 == null) {
                C6496s.v("times");
            } else {
                fArr4 = fArr6;
            }
            this.f27174o = new C2809u(iArr2, fArr4, fArr5);
        }
    }

    public C2805q c(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        int b10 = (int) v0.b(this, j10 / 1000000);
        if (this.f27161b.a(b10)) {
            Object c10 = this.f27161b.c(b10);
            C6496s.e(c10);
            return ((C0) c10).c();
        } else if (b10 >= f()) {
            return qVar2;
        } else {
            if (b10 <= 0) {
                return qVar;
            }
            k(qVar, qVar2, qVar3);
            int i10 = 0;
            if (this.f27174o != null) {
                float i11 = i(b10);
                C2809u uVar = this.f27174o;
                if (uVar == null) {
                    C6496s.v("arcSpline");
                    uVar = null;
                }
                float[] fArr = this.f27172m;
                if (fArr == null) {
                    C6496s.v("posArray");
                    fArr = null;
                }
                uVar.a(i11, fArr);
                float[] fArr2 = this.f27172m;
                if (fArr2 == null) {
                    C6496s.v("posArray");
                    fArr2 = null;
                }
                int length = fArr2.length;
                while (i10 < length) {
                    C2805q qVar4 = this.f27168i;
                    if (qVar4 == null) {
                        C6496s.v("valueVector");
                        qVar4 = null;
                    }
                    float[] fArr3 = this.f27172m;
                    if (fArr3 == null) {
                        C6496s.v("posArray");
                        fArr3 = null;
                    }
                    qVar4.e(i10, fArr3[i10]);
                    i10++;
                }
                C2805q qVar5 = this.f27168i;
                if (qVar5 != null) {
                    return qVar5;
                }
                C6496s.v("valueVector");
                return null;
            }
            int h10 = h(b10);
            float j11 = j(h10, b10, true);
            int a10 = this.f27160a.a(h10);
            if (this.f27161b.a(a10)) {
                Object c11 = this.f27161b.c(a10);
                C6496s.e(c11);
                qVar = ((C0) c11).c();
            }
            int a11 = this.f27160a.a(h10 + 1);
            if (this.f27161b.a(a11)) {
                Object c12 = this.f27161b.c(a11);
                C6496s.e(c12);
                qVar2 = ((C0) c12).c();
            }
            C2805q qVar6 = this.f27168i;
            if (qVar6 == null) {
                C6496s.v("valueVector");
                qVar6 = null;
            }
            int b11 = qVar6.b();
            while (i10 < b11) {
                C2805q qVar7 = this.f27168i;
                if (qVar7 == null) {
                    C6496s.v("valueVector");
                    qVar7 = null;
                }
                qVar7.e(i10, t0.k(qVar.a(i10), qVar2.a(i10), j11));
                i10++;
            }
            C2805q qVar8 = this.f27168i;
            if (qVar8 != null) {
                return qVar8;
            }
            C6496s.v("valueVector");
            return null;
        }
    }

    public C2805q d(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        C2805q qVar4 = qVar3;
        long b10 = v0.b(this, j10 / 1000000);
        if (b10 < 0) {
            return qVar4;
        }
        k(qVar, qVar2, qVar4);
        int i10 = 0;
        if (this.f27174o != null) {
            float i11 = i((int) b10);
            C2809u uVar = this.f27174o;
            if (uVar == null) {
                C6496s.v("arcSpline");
                uVar = null;
            }
            float[] fArr = this.f27173n;
            if (fArr == null) {
                C6496s.v("slopeArray");
                fArr = null;
            }
            uVar.b(i11, fArr);
            float[] fArr2 = this.f27173n;
            if (fArr2 == null) {
                C6496s.v("slopeArray");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i10 < length) {
                C2805q qVar5 = this.f27169j;
                if (qVar5 == null) {
                    C6496s.v("velocityVector");
                    qVar5 = null;
                }
                float[] fArr3 = this.f27173n;
                if (fArr3 == null) {
                    C6496s.v("slopeArray");
                    fArr3 = null;
                }
                qVar5.e(i10, fArr3[i10]);
                i10++;
            }
            C2805q qVar6 = this.f27169j;
            if (qVar6 != null) {
                return qVar6;
            }
            C6496s.v("velocityVector");
            return null;
        }
        C2805q qVar7 = qVar;
        C2805q qVar8 = qVar2;
        C2805q qVar9 = qVar3;
        C2805q d10 = v0.d(this, b10 - 1, qVar7, qVar8, qVar9);
        C2805q d11 = v0.d(this, b10, qVar7, qVar8, qVar9);
        int b11 = d10.b();
        while (i10 < b11) {
            C2805q qVar10 = this.f27169j;
            if (qVar10 == null) {
                C6496s.v("velocityVector");
                qVar10 = null;
            }
            qVar10.e(i10, (d10.a(i10) - d11.a(i10)) * 1000.0f);
            i10++;
        }
        C2805q qVar11 = this.f27169j;
        if (qVar11 != null) {
            return qVar11;
        }
        C6496s.v("velocityVector");
        return null;
    }

    public int e() {
        return this.f27163d;
    }

    public int f() {
        return this.f27162c;
    }

    private D0(C1599m mVar, C1601o oVar, int i10, int i11, C2760D d10, int i12) {
        this.f27160a = mVar;
        this.f27161b = oVar;
        this.f27162c = i10;
        this.f27163d = i11;
        this.f27164e = d10;
        this.f27165f = i12;
    }
}
