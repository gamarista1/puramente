package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.amazon.a.a.o.b.f;
import g1.C2007b;
import g1.C2008c;
import g1.j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k1.C2142c;
import k1.C2143d;
import k1.C2144e;
import k1.C2145f;

public class l {

    /* renamed from: A  reason: collision with root package name */
    private ArrayList f14643A = new ArrayList();

    /* renamed from: B  reason: collision with root package name */
    private HashMap f14644B;

    /* renamed from: C  reason: collision with root package name */
    private HashMap f14645C;

    /* renamed from: D  reason: collision with root package name */
    private HashMap f14646D;

    /* renamed from: E  reason: collision with root package name */
    private j[] f14647E;

    /* renamed from: F  reason: collision with root package name */
    private int f14648F;

    /* renamed from: G  reason: collision with root package name */
    private int f14649G;

    /* renamed from: H  reason: collision with root package name */
    private View f14650H;

    /* renamed from: I  reason: collision with root package name */
    private int f14651I;

    /* renamed from: J  reason: collision with root package name */
    private float f14652J;

    /* renamed from: K  reason: collision with root package name */
    private Interpolator f14653K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f14654L;

    /* renamed from: a  reason: collision with root package name */
    Rect f14655a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    View f14656b;

    /* renamed from: c  reason: collision with root package name */
    int f14657c;

    /* renamed from: d  reason: collision with root package name */
    boolean f14658d = false;

    /* renamed from: e  reason: collision with root package name */
    String f14659e;

    /* renamed from: f  reason: collision with root package name */
    private int f14660f = -1;

    /* renamed from: g  reason: collision with root package name */
    private n f14661g = new n();

    /* renamed from: h  reason: collision with root package name */
    private n f14662h = new n();

    /* renamed from: i  reason: collision with root package name */
    private k f14663i = new k();

    /* renamed from: j  reason: collision with root package name */
    private k f14664j = new k();

    /* renamed from: k  reason: collision with root package name */
    private C2007b[] f14665k;

    /* renamed from: l  reason: collision with root package name */
    private C2007b f14666l;

    /* renamed from: m  reason: collision with root package name */
    float f14667m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    float f14668n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    float f14669o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    float f14670p;

    /* renamed from: q  reason: collision with root package name */
    float f14671q;

    /* renamed from: r  reason: collision with root package name */
    private int[] f14672r;

    /* renamed from: s  reason: collision with root package name */
    private double[] f14673s;

    /* renamed from: t  reason: collision with root package name */
    private double[] f14674t;

    /* renamed from: u  reason: collision with root package name */
    private String[] f14675u;

    /* renamed from: v  reason: collision with root package name */
    private int[] f14676v;

    /* renamed from: w  reason: collision with root package name */
    private int f14677w = 4;

    /* renamed from: x  reason: collision with root package name */
    private float[] f14678x = new float[4];

    /* renamed from: y  reason: collision with root package name */
    private ArrayList f14679y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private float[] f14680z = new float[1];

    class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2008c f14681a;

        a(C2008c cVar) {
            this.f14681a = cVar;
        }

        public float getInterpolation(float f10) {
            return (float) this.f14681a.a((double) f10);
        }
    }

    l(View view) {
        int i10 = c.f14511f;
        this.f14648F = i10;
        this.f14649G = i10;
        this.f14650H = null;
        this.f14651I = i10;
        this.f14652J = Float.NaN;
        this.f14653K = null;
        this.f14654L = false;
        E(view);
    }

    private float g(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f14669o;
            if (((double) f13) != 1.0d) {
                float f14 = this.f14668n;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && ((double) f10) < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        C2008c cVar = this.f14661g.f14683a;
        Iterator it = this.f14679y.iterator();
        float f15 = Float.NaN;
        while (it.hasNext()) {
            n nVar = (n) it.next();
            C2008c cVar2 = nVar.f14683a;
            if (cVar2 != null) {
                float f16 = nVar.f14685c;
                if (f16 < f10) {
                    cVar = cVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = nVar.f14685c;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (double) ((f10 - f11) / f17);
            f10 = (((float) cVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    private static Interpolator p(Context context, int i10, String str, int i11) {
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, i11);
        }
        if (i10 == -1) {
            return new a(C2008c.c(str));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float r() {
        char c10;
        float[] fArr = new float[2];
        float f10 = 1.0f / ((float) 99);
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < 100) {
            float f12 = ((float) i10) * f10;
            double d12 = (double) f12;
            C2008c cVar = this.f14661g.f14683a;
            Iterator it = this.f14679y.iterator();
            float f13 = Float.NaN;
            float f14 = 0.0f;
            while (it.hasNext()) {
                n nVar = (n) it.next();
                C2008c cVar2 = nVar.f14683a;
                if (cVar2 != null) {
                    float f15 = nVar.f14685c;
                    if (f15 < f12) {
                        cVar = cVar2;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = nVar.f14685c;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f16 = f13 - f14;
                d12 = (double) ((((float) cVar.a((double) ((f12 - f14) / f16))) * f16) + f14);
            }
            this.f14665k[0].d(d12, this.f14673s);
            int i11 = i10;
            this.f14661g.i(d12, this.f14672r, this.f14673s, fArr, 0);
            if (i11 > 0) {
                c10 = 0;
                f11 += (float) Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0]));
            } else {
                c10 = 0;
            }
            d10 = (double) fArr[c10];
            i10 = i11 + 1;
            d11 = (double) fArr[1];
        }
        return f11;
    }

    private void t(n nVar) {
        int binarySearch = Collections.binarySearch(this.f14679y, nVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + nVar.f14686d + "\" outside of range");
        }
        this.f14679y.add((-binarySearch) - 1, nVar);
    }

    private void v(n nVar) {
        nVar.y((float) ((int) this.f14656b.getX()), (float) ((int) this.f14656b.getY()), (float) this.f14656b.getWidth(), (float) this.f14656b.getHeight());
    }

    public void A(int i10) {
        this.f14648F = i10;
    }

    /* access modifiers changed from: package-private */
    public void B(View view) {
        n nVar = this.f14661g;
        nVar.f14685c = 0.0f;
        nVar.f14686d = 0.0f;
        nVar.y(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f14663i.m(view);
    }

    /* access modifiers changed from: package-private */
    public void C(Rect rect, d dVar, int i10, int i11) {
        int i12 = dVar.f14996e;
        if (i12 != 0) {
            x(rect, this.f14655a, i12, i10, i11);
        }
        n nVar = this.f14661g;
        nVar.f14685c = 0.0f;
        nVar.f14686d = 0.0f;
        v(nVar);
        this.f14661g.y((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        d.a y10 = dVar.y(this.f14657c);
        this.f14661g.a(y10);
        this.f14667m = y10.f15003d.f15097g;
        this.f14663i.l(rect, dVar, i12, this.f14657c);
        this.f14649G = y10.f15005f.f15119i;
        d.c cVar = y10.f15003d;
        this.f14651I = cVar.f15101k;
        this.f14652J = cVar.f15100j;
        Context context = this.f14656b.getContext();
        d.c cVar2 = y10.f15003d;
        this.f14653K = p(context, cVar2.f15103m, cVar2.f15102l, cVar2.f15104n);
    }

    public void D(C2144e eVar, View view, int i10, int i11, int i12) {
        n nVar = this.f14661g;
        nVar.f14685c = 0.0f;
        nVar.f14686d = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1) {
            throw null;
        } else if (i10 != 2) {
            this.f14661g.y((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
            throw null;
        } else {
            throw null;
        }
    }

    public void E(View view) {
        this.f14656b = view;
        this.f14657c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f14659e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void F(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        String[] strArr;
        boolean z10;
        double[][] dArr;
        androidx.constraintlayout.widget.a aVar;
        int i12;
        C2145f fVar;
        androidx.constraintlayout.widget.a aVar2;
        int i13;
        Integer num;
        C2143d dVar;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i14 = this.f14648F;
        if (i14 != c.f14511f) {
            this.f14661g.f14693k = i14;
        }
        this.f14663i.i(this.f14664j, hashSet2);
        ArrayList arrayList2 = this.f14643A;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar instanceof g) {
                    g gVar = (g) cVar;
                    t(new n(i10, i11, gVar, this.f14661g, this.f14662h));
                    int i15 = gVar.f14571g;
                    if (i15 != c.f14511f) {
                        this.f14660f = i15;
                    }
                } else if (cVar instanceof e) {
                    cVar.d(hashSet3);
                } else if (cVar instanceof i) {
                    cVar.d(hashSet);
                } else if (cVar instanceof j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((j) cVar);
                } else {
                    cVar.g(hashMap);
                    cVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f14647E = (j[]) arrayList.toArray(new j[0]);
        }
        char c10 = 1;
        if (!hashSet2.isEmpty()) {
            this.f14645C = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(f.f37529a)[1];
                    Iterator it3 = this.f14643A.iterator();
                    while (it3.hasNext()) {
                        c cVar2 = (c) it3.next();
                        HashMap hashMap2 = cVar2.f14516e;
                        if (!(hashMap2 == null || (aVar3 = (androidx.constraintlayout.widget.a) hashMap2.get(str2)) == null)) {
                            sparseArray.append(cVar2.f14512a, aVar3);
                        }
                    }
                    dVar = C2143d.e(str, sparseArray);
                } else {
                    dVar = C2143d.f(str);
                }
                if (dVar != null) {
                    dVar.c(str);
                    this.f14645C.put(str, dVar);
                }
            }
            ArrayList arrayList3 = this.f14643A;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    c cVar3 = (c) it4.next();
                    if (cVar3 instanceof d) {
                        cVar3.a(this.f14645C);
                    }
                }
            }
            this.f14663i.a(this.f14645C, 0);
            this.f14664j.a(this.f14645C, 100);
            for (String str3 : this.f14645C.keySet()) {
                if (!hashMap.containsKey(str3) || (num = (Integer) hashMap.get(str3)) == null) {
                    i13 = 0;
                } else {
                    i13 = num.intValue();
                }
                j jVar = (j) this.f14645C.get(str3);
                if (jVar != null) {
                    jVar.d(i13);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f14644B == null) {
                this.f14644B = new HashMap();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str4 = (String) it5.next();
                if (!this.f14644B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(f.f37529a)[1];
                        Iterator it6 = this.f14643A.iterator();
                        while (it6.hasNext()) {
                            c cVar4 = (c) it6.next();
                            HashMap hashMap3 = cVar4.f14516e;
                            if (!(hashMap3 == null || (aVar2 = (androidx.constraintlayout.widget.a) hashMap3.get(str5)) == null)) {
                                sparseArray2.append(cVar4.f14512a, aVar2);
                            }
                        }
                        fVar = C2145f.g(str4, sparseArray2);
                        long j11 = j10;
                    } else {
                        fVar = C2145f.h(str4, j10);
                    }
                    if (fVar != null) {
                        fVar.d(str4);
                        this.f14644B.put(str4, fVar);
                    }
                }
            }
            ArrayList arrayList4 = this.f14643A;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    c cVar5 = (c) it7.next();
                    if (cVar5 instanceof i) {
                        ((i) cVar5).Q(this.f14644B);
                    }
                }
            }
            for (String str6 : this.f14644B.keySet()) {
                if (hashMap.containsKey(str6)) {
                    i12 = ((Integer) hashMap.get(str6)).intValue();
                } else {
                    i12 = 0;
                }
                ((C2145f) this.f14644B.get(str6)).e(i12);
            }
        }
        int size = this.f14679y.size();
        int i16 = size + 2;
        n[] nVarArr = new n[i16];
        nVarArr[0] = this.f14661g;
        nVarArr[size + 1] = this.f14662h;
        if (this.f14679y.size() > 0 && this.f14660f == -1) {
            this.f14660f = 0;
        }
        Iterator it8 = this.f14679y.iterator();
        int i17 = 1;
        while (it8.hasNext()) {
            nVarArr[i17] = (n) it8.next();
            i17++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f14662h.f14697o.keySet()) {
            if (this.f14661g.f14697o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f14675u = strArr2;
        this.f14676v = new int[strArr2.length];
        int i18 = 0;
        while (true) {
            strArr = this.f14675u;
            if (i18 >= strArr.length) {
                break;
            }
            String str8 = strArr[i18];
            this.f14676v[i18] = 0;
            int i19 = 0;
            while (true) {
                if (i19 < i16) {
                    if (nVarArr[i19].f14697o.containsKey(str8) && (aVar = (androidx.constraintlayout.widget.a) nVarArr[i19].f14697o.get(str8)) != null) {
                        int[] iArr = this.f14676v;
                        iArr[i18] = iArr[i18] + aVar.h();
                        break;
                    }
                    i19++;
                } else {
                    break;
                }
            }
            i18++;
        }
        if (nVarArr[0].f14693k != c.f14511f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i20 = 1; i20 < i16; i20++) {
            nVarArr[i20].e(nVarArr[i20 - 1], zArr, this.f14675u, z10);
        }
        int i21 = 0;
        for (int i22 = 1; i22 < length; i22++) {
            if (zArr[i22]) {
                i21++;
            }
        }
        this.f14672r = new int[i21];
        int i23 = 2;
        int max = Math.max(2, i21);
        this.f14673s = new double[max];
        this.f14674t = new double[max];
        int i24 = 0;
        for (int i25 = 1; i25 < length; i25++) {
            if (zArr[i25]) {
                this.f14672r[i24] = i25;
                i24++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[1] = this.f14672r.length;
        iArr2[0] = i16;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        double[] dArr3 = new double[i16];
        for (int i26 = 0; i26 < i16; i26++) {
            nVarArr[i26].f(dArr2[i26], this.f14672r);
            dArr3[i26] = (double) nVarArr[i26].f14685c;
        }
        int i27 = 0;
        while (true) {
            int[] iArr3 = this.f14672r;
            if (i27 >= iArr3.length) {
                break;
            }
            if (iArr3[i27] < n.f14682t.length) {
                String str9 = n.f14682t[this.f14672r[i27]] + " [";
                for (int i28 = 0; i28 < i16; i28++) {
                    str9 = str9 + dArr2[i28][i27];
                }
            }
            i27++;
        }
        this.f14665k = new C2007b[(this.f14675u.length + 1)];
        int i29 = 0;
        while (true) {
            String[] strArr3 = this.f14675u;
            if (i29 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i29];
            int i30 = 0;
            int i31 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i30 < i16) {
                if (nVarArr[i30].p(str10)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i16];
                        int[] iArr4 = new int[i23];
                        iArr4[c10] = nVarArr[i30].m(str10);
                        iArr4[0] = i16;
                        dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
                    }
                    n nVar = nVarArr[i30];
                    dArr = dArr2;
                    dArr4[i31] = (double) nVar.f14685c;
                    nVar.l(str10, dArr5[i31], 0);
                    i31++;
                } else {
                    dArr = dArr2;
                }
                i30++;
                dArr2 = dArr;
                i23 = 2;
                c10 = 1;
            }
            i29++;
            this.f14665k[i29] = C2007b.a(this.f14660f, Arrays.copyOf(dArr4, i31), (double[][]) Arrays.copyOf(dArr5, i31));
            dArr2 = dArr2;
            i23 = 2;
            c10 = 1;
        }
        this.f14665k[0] = C2007b.a(this.f14660f, dArr3, dArr2);
        if (nVarArr[0].f14693k != c.f14511f) {
            int[] iArr5 = new int[i16];
            double[] dArr6 = new double[i16];
            int[] iArr6 = new int[2];
            iArr6[1] = 2;
            iArr6[0] = i16;
            double[][] dArr7 = (double[][]) Array.newInstance(Double.TYPE, iArr6);
            for (int i32 = 0; i32 < i16; i32++) {
                n nVar2 = nVarArr[i32];
                iArr5[i32] = nVar2.f14693k;
                dArr6[i32] = (double) nVar2.f14685c;
                double[] dArr8 = dArr7[i32];
                dArr8[0] = (double) nVar2.f14687e;
                dArr8[1] = (double) nVar2.f14688f;
            }
            this.f14666l = C2007b.b(iArr5, dArr6, dArr7);
        }
        this.f14646D = new HashMap();
        if (this.f14643A != null) {
            Iterator it9 = hashSet3.iterator();
            float f11 = Float.NaN;
            while (it9.hasNext()) {
                String str11 = (String) it9.next();
                C2142c h10 = C2142c.h(str11);
                if (h10 != null) {
                    if (h10.g() && Float.isNaN(f11)) {
                        f11 = r();
                    }
                    h10.e(str11);
                    this.f14646D.put(str11, h10);
                }
            }
            Iterator it10 = this.f14643A.iterator();
            while (it10.hasNext()) {
                c cVar6 = (c) it10.next();
                if (cVar6 instanceof e) {
                    ((e) cVar6).U(this.f14646D);
                }
            }
            for (C2142c f12 : this.f14646D.values()) {
                f12.f(f11);
            }
        }
    }

    public void G(l lVar) {
        this.f14661g.C(lVar, lVar.f14661g);
        this.f14662h.C(lVar, lVar.f14662h);
    }

    public void a(c cVar) {
        this.f14643A.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public void b(ArrayList arrayList) {
        this.f14643A.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    public int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] g10 = this.f14665k[0].g();
        if (iArr != null) {
            Iterator it = this.f14679y.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = ((n) it.next()).f14698p;
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < g10.length; i12++) {
            this.f14665k[0].d(g10[i12], this.f14673s);
            this.f14661g.i(g10[i12], this.f14672r, this.f14673s, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: k1.c} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(float[] r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r8 = r22
            int r1 = r8 + -1
            float r1 = (float) r1
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r1
            java.util.HashMap r1 = r0.f14645C
            java.lang.String r2 = "translationX"
            r3 = 0
            if (r1 != 0) goto L_0x0014
            r11 = r3
            goto L_0x001b
        L_0x0014:
            java.lang.Object r1 = r1.get(r2)
            g1.j r1 = (g1.j) r1
            r11 = r1
        L_0x001b:
            java.util.HashMap r1 = r0.f14645C
            java.lang.String r4 = "translationY"
            if (r1 != 0) goto L_0x0023
            r12 = r3
            goto L_0x002a
        L_0x0023:
            java.lang.Object r1 = r1.get(r4)
            g1.j r1 = (g1.j) r1
            r12 = r1
        L_0x002a:
            java.util.HashMap r1 = r0.f14646D
            if (r1 != 0) goto L_0x0030
            r13 = r3
            goto L_0x0037
        L_0x0030:
            java.lang.Object r1 = r1.get(r2)
            k1.c r1 = (k1.C2142c) r1
            r13 = r1
        L_0x0037:
            java.util.HashMap r1 = r0.f14646D
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r14 = r3
            goto L_0x0045
        L_0x003d:
            java.lang.Object r1 = r1.get(r4)
            r3 = r1
            k1.c r3 = (k1.C2142c) r3
            goto L_0x003b
        L_0x0045:
            r7 = 0
        L_0x0046:
            if (r7 >= r8) goto L_0x0122
            float r1 = (float) r7
            float r1 = r1 * r10
            float r2 = r0.f14669o
            int r3 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L_0x0069
            float r3 = r0.f14668n
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0058
            r1 = r4
        L_0x0058:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            double r5 = (double) r1
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x0069
            float r1 = r1 - r3
            float r1 = r1 * r2
            float r1 = java.lang.Math.min(r1, r9)
        L_0x0069:
            r6 = r1
            double r1 = (double) r6
            androidx.constraintlayout.motion.widget.n r3 = r0.f14661g
            g1.c r3 = r3.f14683a
            java.util.ArrayList r5 = r0.f14679y
            java.util.Iterator r5 = r5.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
        L_0x0077:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x00a3
            java.lang.Object r17 = r5.next()
            r9 = r17
            androidx.constraintlayout.motion.widget.n r9 = (androidx.constraintlayout.motion.widget.n) r9
            g1.c r15 = r9.f14683a
            r18 = r1
            if (r15 == 0) goto L_0x009e
            float r1 = r9.f14685c
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            r4 = r1
            r3 = r15
            goto L_0x009e
        L_0x0094:
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 == 0) goto L_0x009e
            float r1 = r9.f14685c
            r16 = r1
        L_0x009e:
            r1 = r18
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0077
        L_0x00a3:
            r18 = r1
            if (r3 == 0) goto L_0x00c1
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 == 0) goto L_0x00af
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x00af:
            float r1 = r6 - r4
            float r16 = r16 - r4
            float r1 = r1 / r16
            double r1 = (double) r1
            double r1 = r3.a(r1)
            float r1 = (float) r1
            float r1 = r1 * r16
            float r1 = r1 + r4
            double r1 = (double) r1
            r2 = r1
            goto L_0x00c3
        L_0x00c1:
            r2 = r18
        L_0x00c3:
            g1.b[] r1 = r0.f14665k
            r9 = 0
            r1 = r1[r9]
            double[] r4 = r0.f14673s
            r1.d(r2, r4)
            g1.b r1 = r0.f14666l
            if (r1 == 0) goto L_0x00d9
            double[] r4 = r0.f14673s
            int r5 = r4.length
            if (r5 <= 0) goto L_0x00d9
            r1.d(r2, r4)
        L_0x00d9:
            androidx.constraintlayout.motion.widget.n r1 = r0.f14661g
            int[] r4 = r0.f14672r
            double[] r5 = r0.f14673s
            int r15 = r7 * 2
            r9 = r6
            r6 = r21
            r16 = r7
            r7 = r15
            r1.i(r2, r4, r5, r6, r7)
            if (r13 == 0) goto L_0x00f6
            r1 = r21[r15]
            float r2 = r13.a(r9)
            float r1 = r1 + r2
            r21[r15] = r1
            goto L_0x0101
        L_0x00f6:
            if (r11 == 0) goto L_0x0101
            r1 = r21[r15]
            float r2 = r11.a(r9)
            float r1 = r1 + r2
            r21[r15] = r1
        L_0x0101:
            if (r14 == 0) goto L_0x010f
            int r15 = r15 + 1
            r1 = r21[r15]
            float r2 = r14.a(r9)
            float r1 = r1 + r2
            r21[r15] = r1
            goto L_0x011c
        L_0x010f:
            if (r12 == 0) goto L_0x011c
            int r15 = r15 + 1
            r1 = r21[r15]
            float r2 = r12.a(r9)
            float r1 = r1 + r2
            r21[r15] = r1
        L_0x011c:
            int r7 = r16 + 1
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0046
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.l.d(float[], int):void");
    }

    /* access modifiers changed from: package-private */
    public void e(float f10, float[] fArr, int i10) {
        this.f14665k[0].d((double) g(f10, (float[]) null), this.f14673s);
        this.f14661g.o(this.f14672r, this.f14673s, fArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z10) {
        float f10;
        if ("button".equals(a.d(this.f14656b)) && this.f14647E != null) {
            int i10 = 0;
            while (true) {
                j[] jVarArr = this.f14647E;
                if (i10 < jVarArr.length) {
                    j jVar = jVarArr[i10];
                    if (z10) {
                        f10 = -100.0f;
                    } else {
                        f10 = 100.0f;
                    }
                    jVar.u(f10, this.f14656b);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public int h() {
        return this.f14661g.f14694l;
    }

    public void i(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f14665k[0].d(d10, dArr);
        this.f14665k[0].f(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f14661g.j(d10, this.f14672r, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.f14670p;
    }

    public float k() {
        return this.f14671q;
    }

    /* access modifiers changed from: package-private */
    public void l(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float g10 = g(f10, this.f14680z);
        C2007b[] bVarArr = this.f14665k;
        int i10 = 0;
        if (bVarArr != null) {
            double d10 = (double) g10;
            bVarArr[0].f(d10, this.f14674t);
            this.f14665k[0].d(d10, this.f14673s);
            float f13 = this.f14680z[0];
            while (true) {
                dArr = this.f14674t;
                if (i10 >= dArr.length) {
                    break;
                }
                dArr[i10] = dArr[i10] * ((double) f13);
                i10++;
            }
            C2007b bVar = this.f14666l;
            if (bVar != null) {
                double[] dArr2 = this.f14673s;
                if (dArr2.length > 0) {
                    bVar.d(d10, dArr2);
                    this.f14666l.f(d10, this.f14674t);
                    this.f14661g.z(f11, f12, fArr, this.f14672r, this.f14674t, this.f14673s);
                    return;
                }
                return;
            }
            this.f14661g.z(f11, f12, fArr, this.f14672r, dArr, this.f14673s);
            return;
        }
        n nVar = this.f14662h;
        float f14 = nVar.f14687e;
        n nVar2 = this.f14661g;
        float f15 = f14 - nVar2.f14687e;
        float f16 = nVar.f14688f - nVar2.f14688f;
        float f17 = (nVar.f14689g - nVar2.f14689g) + f15;
        float f18 = (nVar.f14690h - nVar2.f14690h) + f16;
        fArr[0] = (f15 * (1.0f - f11)) + (f17 * f11);
        fArr[1] = (f16 * (1.0f - f12)) + (f18 * f12);
    }

    public int m() {
        int i10 = this.f14661g.f14684b;
        Iterator it = this.f14679y.iterator();
        while (it.hasNext()) {
            i10 = Math.max(i10, ((n) it.next()).f14684b);
        }
        return Math.max(i10, this.f14662h.f14684b);
    }

    public float n() {
        return this.f14662h.f14687e;
    }

    public float o() {
        return this.f14662h.f14688f;
    }

    /* access modifiers changed from: package-private */
    public n q(int i10) {
        return (n) this.f14679y.get(i10);
    }

    public View s() {
        return this.f14656b;
    }

    public String toString() {
        return " start: x: " + this.f14661g.f14687e + " y: " + this.f14661g.f14688f + " end: x: " + this.f14662h.f14687e + " y: " + this.f14662h.f14688f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: k1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: k1.f$d} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(android.view.View r21, float r22, long r23, g1.d r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.g(r2, r1)
            int r3 = r0.f14651I
            int r4 = androidx.constraintlayout.motion.widget.c.f14511f
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0042
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f14652J
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002d
            float r5 = r0.f14652J
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002d:
            android.view.animation.Interpolator r5 = r0.f14653K
            if (r5 == 0) goto L_0x0036
            float r2 = r5.getInterpolation(r2)
            goto L_0x0040
        L_0x0036:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x003f
            r2 = r13
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0042:
            r14 = r2
            java.util.HashMap r2 = r0.f14645C
            if (r2 == 0) goto L_0x005f
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x004f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            k1.d r3 = (k1.C2143d) r3
            r3.g(r11, r14)
            goto L_0x004f
        L_0x005f:
            java.util.HashMap r2 = r0.f14644B
            r15 = 0
            if (r2 == 0) goto L_0x0093
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r15
        L_0x006e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008f
            java.lang.Object r1 = r7.next()
            k1.f r1 = (k1.C2145f) r1
            boolean r2 = r1 instanceof k1.C2145f.d
            if (r2 == 0) goto L_0x0082
            r8 = r1
            k1.f$d r8 = (k1.C2145f.d) r8
            goto L_0x006e
        L_0x0082:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.i(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x006e
        L_0x008f:
            r16 = r9
            r9 = r8
            goto L_0x0096
        L_0x0093:
            r9 = r1
            r16 = r15
        L_0x0096:
            g1.b[] r1 = r0.f14665k
            r10 = 1
            if (r1 == 0) goto L_0x01ef
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f14673s
            r1.d(r7, r2)
            g1.b[] r1 = r0.f14665k
            r1 = r1[r15]
            double[] r2 = r0.f14674t
            r1.f(r7, r2)
            g1.b r1 = r0.f14666l
            if (r1 == 0) goto L_0x00bf
            double[] r2 = r0.f14673s
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00bf
            r1.d(r7, r2)
            g1.b r1 = r0.f14666l
            double[] r2 = r0.f14674t
            r1.f(r7, r2)
        L_0x00bf:
            boolean r1 = r0.f14654L
            if (r1 != 0) goto L_0x00df
            androidx.constraintlayout.motion.widget.n r1 = r0.f14661g
            int[] r4 = r0.f14672r
            double[] r5 = r0.f14673s
            double[] r6 = r0.f14674t
            r17 = 0
            boolean r3 = r0.f14658d
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.A(r2, r3, r4, r5, r6, r7, r8)
            r0.f14658d = r15
            goto L_0x00e0
        L_0x00df:
            r12 = r7
        L_0x00e0:
            int r1 = r0.f14649G
            int r2 = androidx.constraintlayout.motion.widget.c.f14511f
            if (r1 == r2) goto L_0x0142
            android.view.View r1 = r0.f14650H
            if (r1 != 0) goto L_0x00f8
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f14649G
            android.view.View r1 = r1.findViewById(r2)
            r0.f14650H = r1
        L_0x00f8:
            android.view.View r1 = r0.f14650H
            if (r1 == 0) goto L_0x0142
            int r1 = r1.getTop()
            android.view.View r2 = r0.f14650H
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f14650H
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f14650H
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0142:
            java.util.HashMap r1 = r0.f14645C
            if (r1 == 0) goto L_0x0170
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x014e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0170
            java.lang.Object r1 = r8.next()
            g1.j r1 = (g1.j) r1
            boolean r2 = r1 instanceof k1.C2143d.C0371d
            if (r2 == 0) goto L_0x014e
            double[] r2 = r0.f14674t
            int r3 = r2.length
            if (r3 <= r10) goto L_0x014e
            k1.d$d r1 = (k1.C2143d.C0371d) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.h(r2, r3, r4, r6)
            goto L_0x014e
        L_0x0170:
            if (r9 == 0) goto L_0x018b
            double[] r1 = r0.f14674t
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = r10
            r9 = r17
            boolean r1 = r1.j(r2, r3, r4, r5, r7, r9)
            r16 = r16 | r1
            goto L_0x018d
        L_0x018b:
            r19 = r10
        L_0x018d:
            r10 = r19
        L_0x018f:
            g1.b[] r1 = r0.f14665k
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b3
            r1 = r1[r10]
            float[] r2 = r0.f14678x
            r1.e(r12, r2)
            androidx.constraintlayout.motion.widget.n r1 = r0.f14661g
            java.util.LinkedHashMap r1 = r1.f14697o
            java.lang.String[] r2 = r0.f14675u
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.a) r1
            float[] r2 = r0.f14678x
            k1.C2140a.b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x018f
        L_0x01b3:
            androidx.constraintlayout.motion.widget.k r1 = r0.f14663i
            int r2 = r1.f14618b
            if (r2 != 0) goto L_0x01dd
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c4
            int r1 = r1.f14619c
            r11.setVisibility(r1)
            goto L_0x01dd
        L_0x01c4:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d2
            androidx.constraintlayout.motion.widget.k r1 = r0.f14664j
            int r1 = r1.f14619c
            r11.setVisibility(r1)
            goto L_0x01dd
        L_0x01d2:
            androidx.constraintlayout.motion.widget.k r2 = r0.f14664j
            int r2 = r2.f14619c
            int r1 = r1.f14619c
            if (r2 == r1) goto L_0x01dd
            r11.setVisibility(r15)
        L_0x01dd:
            androidx.constraintlayout.motion.widget.j[] r1 = r0.f14647E
            if (r1 == 0) goto L_0x023f
            r1 = r15
        L_0x01e2:
            androidx.constraintlayout.motion.widget.j[] r2 = r0.f14647E
            int r3 = r2.length
            if (r1 >= r3) goto L_0x023f
            r2 = r2[r1]
            r2.u(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e2
        L_0x01ef:
            r19 = r10
            androidx.constraintlayout.motion.widget.n r1 = r0.f14661g
            float r2 = r1.f14687e
            androidx.constraintlayout.motion.widget.n r3 = r0.f14662h
            float r4 = r3.f14687e
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f14688f
            float r5 = r3.f14688f
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f14689g
            float r6 = r3.f14689g
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f14690h
            float r3 = r3.f14690h
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x022d
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x022d
            boolean r1 = r0.f14658d
            if (r1 == 0) goto L_0x023c
        L_0x022d:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f14658d = r15
        L_0x023c:
            r11.layout(r10, r9, r2, r4)
        L_0x023f:
            java.util.HashMap r1 = r0.f14646D
            if (r1 == 0) goto L_0x026e
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x024b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x026e
            java.lang.Object r1 = r8.next()
            k1.c r1 = (k1.C2142c) r1
            boolean r2 = r1 instanceof k1.C2142c.d
            if (r2 == 0) goto L_0x026a
            k1.c$d r1 = (k1.C2142c.d) r1
            double[] r2 = r0.f14674t
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.j(r2, r3, r4, r6)
            goto L_0x024b
        L_0x026a:
            r1.i(r11, r14)
            goto L_0x024b
        L_0x026e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.l.u(android.view.View, float, long, g1.d):boolean");
    }

    public void w() {
        this.f14658d = true;
    }

    /* access modifiers changed from: package-private */
    public void x(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((i13 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((i15 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i10 == 4) {
            int i16 = rect.left + rect.right;
            rect2.left = i11 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i16 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(View view) {
        n nVar = this.f14661g;
        nVar.f14685c = 0.0f;
        nVar.f14686d = 0.0f;
        this.f14654L = true;
        nVar.y(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f14662h.y(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f14663i.m(view);
        this.f14664j.m(view);
    }

    /* access modifiers changed from: package-private */
    public void z(Rect rect, d dVar, int i10, int i11) {
        int i12 = dVar.f14996e;
        if (i12 != 0) {
            x(rect, this.f14655a, i12, i10, i11);
            rect = this.f14655a;
        }
        n nVar = this.f14662h;
        nVar.f14685c = 1.0f;
        nVar.f14686d = 1.0f;
        v(nVar);
        this.f14662h.y((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f14662h.a(dVar.y(this.f14657c));
        this.f14664j.l(rect, dVar, i12, this.f14657c);
    }
}
