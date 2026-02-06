package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.x  reason: case insensitive filesystem */
class C4914x {

    /* renamed from: A  reason: collision with root package name */
    private double[] f59061A;

    /* renamed from: B  reason: collision with root package name */
    private int f59062B;

    /* renamed from: C  reason: collision with root package name */
    private int f59063C;

    /* renamed from: D  reason: collision with root package name */
    private int f59064D;

    /* renamed from: E  reason: collision with root package name */
    private int f59065E;

    /* renamed from: F  reason: collision with root package name */
    private int f59066F;

    /* renamed from: G  reason: collision with root package name */
    private int f59067G;

    /* renamed from: H  reason: collision with root package name */
    private int f59068H;

    /* renamed from: I  reason: collision with root package name */
    private int f59069I;

    /* renamed from: J  reason: collision with root package name */
    private int f59070J;

    /* renamed from: K  reason: collision with root package name */
    private int f59071K;

    /* renamed from: L  reason: collision with root package name */
    private int f59072L;

    /* renamed from: M  reason: collision with root package name */
    private final float f59073M;

    /* renamed from: N  reason: collision with root package name */
    private final float f59074N;

    /* renamed from: O  reason: collision with root package name */
    private final float f59075O;

    /* renamed from: a  reason: collision with root package name */
    final ArrayList f59076a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f59077b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f59078c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f59079d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f59080e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f59081f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f59082g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList f59083h;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList f59084i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList f59085j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList f59086k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList f59087l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList f59088m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList f59089n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList f59090o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList f59091p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private double f59092q = 12.0d;

    /* renamed from: r  reason: collision with root package name */
    private C4912v f59093r = C4912v.f59037p;

    /* renamed from: s  reason: collision with root package name */
    private double f59094s;

    /* renamed from: t  reason: collision with root package name */
    private double f59095t;

    /* renamed from: u  reason: collision with root package name */
    private double f59096u;

    /* renamed from: v  reason: collision with root package name */
    private double f59097v;

    /* renamed from: w  reason: collision with root package name */
    private SVGLength[] f59098w;

    /* renamed from: x  reason: collision with root package name */
    private SVGLength[] f59099x;

    /* renamed from: y  reason: collision with root package name */
    private SVGLength[] f59100y;

    /* renamed from: z  reason: collision with root package name */
    private SVGLength[] f59101z;

    C4914x(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        this.f59076a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f59077b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f59078c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f59079d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f59080e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f59081f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.f59082g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.f59083h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.f59084i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.f59085j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.f59086k = arrayList11;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f59098w = sVGLengthArr;
        this.f59099x = new SVGLength[0];
        this.f59100y = new SVGLength[0];
        this.f59101z = new SVGLength[0];
        this.f59061A = new double[]{0.0d};
        this.f59067G = -1;
        this.f59068H = -1;
        this.f59069I = -1;
        this.f59070J = -1;
        this.f59071K = -1;
        this.f59073M = f10;
        this.f59074N = f11;
        this.f59075O = f12;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f59099x);
        arrayList4.add(this.f59100y);
        arrayList5.add(this.f59101z);
        arrayList6.add(this.f59061A);
        arrayList7.add(Integer.valueOf(this.f59067G));
        arrayList8.add(Integer.valueOf(this.f59068H));
        arrayList9.add(Integer.valueOf(this.f59069I));
        arrayList10.add(Integer.valueOf(this.f59070J));
        arrayList11.add(Integer.valueOf(this.f59071K));
        arrayList.add(this.f59093r);
        q();
    }

    private double[] a(ArrayList arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((SVGLength) arrayList.get(i10)).f58808a;
        }
        return dArr;
    }

    private SVGLength[] e(ArrayList arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i10 = 0; i10 < size; i10++) {
            sVGLengthArr[i10] = (SVGLength) arrayList.get(i10);
        }
        return sVGLengthArr;
    }

    private C4912v f(C4916z zVar) {
        if (this.f59072L > 0) {
            return this.f59093r;
        }
        for (C4916z parentTextRoot = zVar.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            C4912v b10 = parentTextRoot.n().b();
            if (b10 != C4912v.f59037p) {
                return b10;
            }
        }
        return C4912v.f59037p;
    }

    private static void h(ArrayList arrayList, int i10) {
        while (i10 >= 0) {
            arrayList.set(i10, Integer.valueOf(((Integer) arrayList.get(i10)).intValue() + 1));
            i10--;
        }
    }

    private void q() {
        this.f59087l.add(Integer.valueOf(this.f59062B));
        this.f59088m.add(Integer.valueOf(this.f59063C));
        this.f59089n.add(Integer.valueOf(this.f59064D));
        this.f59090o.add(Integer.valueOf(this.f59065E));
        this.f59091p.add(Integer.valueOf(this.f59066F));
    }

    private void r(C4916z zVar, ReadableMap readableMap) {
        C4912v f10 = f(zVar);
        this.f59072L++;
        if (readableMap == null) {
            this.f59076a.add(f10);
            return;
        }
        C4912v vVar = new C4912v(readableMap, f10, (double) this.f59073M);
        this.f59092q = vVar.f59038a;
        this.f59076a.add(vVar);
        this.f59093r = vVar;
    }

    private void s() {
        this.f59066F = 0;
        this.f59065E = 0;
        this.f59064D = 0;
        this.f59063C = 0;
        this.f59062B = 0;
        this.f59071K = -1;
        this.f59070J = -1;
        this.f59069I = -1;
        this.f59068H = -1;
        this.f59067G = -1;
        this.f59097v = 0.0d;
        this.f59096u = 0.0d;
        this.f59095t = 0.0d;
        this.f59094s = 0.0d;
    }

    /* access modifiers changed from: package-private */
    public C4912v b() {
        return this.f59093r;
    }

    /* access modifiers changed from: package-private */
    public double c() {
        return this.f59092q;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f59075O;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f59074N;
    }

    /* access modifiers changed from: package-private */
    public double i() {
        h(this.f59084i, this.f59064D);
        int i10 = this.f59069I + 1;
        SVGLength[] sVGLengthArr = this.f59100y;
        if (i10 < sVGLengthArr.length) {
            this.f59069I = i10;
            this.f59096u += K.a(sVGLengthArr[i10], (double) this.f59074N, 0.0d, (double) this.f59073M, this.f59092q);
        }
        return this.f59096u;
    }

    /* access modifiers changed from: package-private */
    public double j() {
        h(this.f59085j, this.f59065E);
        int i10 = this.f59070J + 1;
        SVGLength[] sVGLengthArr = this.f59101z;
        if (i10 < sVGLengthArr.length) {
            this.f59070J = i10;
            this.f59097v += K.a(sVGLengthArr[i10], (double) this.f59075O, 0.0d, (double) this.f59073M, this.f59092q);
        }
        return this.f59097v;
    }

    /* access modifiers changed from: package-private */
    public double k() {
        h(this.f59086k, this.f59066F);
        int min = Math.min(this.f59071K + 1, this.f59061A.length - 1);
        this.f59071K = min;
        return this.f59061A[min];
    }

    /* access modifiers changed from: package-private */
    public double l(double d10) {
        h(this.f59082g, this.f59062B);
        int i10 = this.f59067G + 1;
        SVGLength[] sVGLengthArr = this.f59098w;
        if (i10 < sVGLengthArr.length) {
            this.f59096u = 0.0d;
            this.f59067G = i10;
            this.f59094s = K.a(sVGLengthArr[i10], (double) this.f59074N, 0.0d, (double) this.f59073M, this.f59092q);
        }
        double d11 = this.f59094s + d10;
        this.f59094s = d11;
        return d11;
    }

    /* access modifiers changed from: package-private */
    public double m() {
        h(this.f59083h, this.f59063C);
        int i10 = this.f59068H + 1;
        SVGLength[] sVGLengthArr = this.f59099x;
        if (i10 < sVGLengthArr.length) {
            this.f59097v = 0.0d;
            this.f59068H = i10;
            this.f59095t = K.a(sVGLengthArr[i10], (double) this.f59075O, 0.0d, (double) this.f59073M, this.f59092q);
        }
        return this.f59095t;
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f59076a.remove(this.f59072L);
        this.f59087l.remove(this.f59072L);
        this.f59088m.remove(this.f59072L);
        this.f59089n.remove(this.f59072L);
        this.f59090o.remove(this.f59072L);
        this.f59091p.remove(this.f59072L);
        int i10 = this.f59072L - 1;
        this.f59072L = i10;
        int i11 = this.f59062B;
        int i12 = this.f59063C;
        int i13 = this.f59064D;
        int i14 = this.f59065E;
        int i15 = this.f59066F;
        this.f59093r = (C4912v) this.f59076a.get(i10);
        this.f59062B = ((Integer) this.f59087l.get(this.f59072L)).intValue();
        this.f59063C = ((Integer) this.f59088m.get(this.f59072L)).intValue();
        this.f59064D = ((Integer) this.f59089n.get(this.f59072L)).intValue();
        this.f59065E = ((Integer) this.f59090o.get(this.f59072L)).intValue();
        this.f59066F = ((Integer) this.f59091p.get(this.f59072L)).intValue();
        if (i11 != this.f59062B) {
            this.f59077b.remove(i11);
            this.f59098w = (SVGLength[]) this.f59077b.get(this.f59062B);
            this.f59067G = ((Integer) this.f59082g.get(this.f59062B)).intValue();
        }
        if (i12 != this.f59063C) {
            this.f59078c.remove(i12);
            this.f59099x = (SVGLength[]) this.f59078c.get(this.f59063C);
            this.f59068H = ((Integer) this.f59083h.get(this.f59063C)).intValue();
        }
        if (i13 != this.f59064D) {
            this.f59079d.remove(i13);
            this.f59100y = (SVGLength[]) this.f59079d.get(this.f59064D);
            this.f59069I = ((Integer) this.f59084i.get(this.f59064D)).intValue();
        }
        if (i14 != this.f59065E) {
            this.f59080e.remove(i14);
            this.f59101z = (SVGLength[]) this.f59080e.get(this.f59065E);
            this.f59070J = ((Integer) this.f59085j.get(this.f59065E)).intValue();
        }
        if (i15 != this.f59066F) {
            this.f59081f.remove(i15);
            this.f59061A = (double[]) this.f59081f.get(this.f59066F);
            this.f59071K = ((Integer) this.f59086k.get(this.f59066F)).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public void o(C4916z zVar, ReadableMap readableMap) {
        r(zVar, readableMap);
        q();
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10, m0 m0Var, ReadableMap readableMap, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        if (z10) {
            s();
        }
        r(m0Var, readableMap);
        if (!(arrayList == null || arrayList.size() == 0)) {
            this.f59062B++;
            this.f59067G = -1;
            this.f59082g.add(-1);
            SVGLength[] e10 = e(arrayList);
            this.f59098w = e10;
            this.f59077b.add(e10);
        }
        if (!(arrayList2 == null || arrayList2.size() == 0)) {
            this.f59063C++;
            this.f59068H = -1;
            this.f59083h.add(-1);
            SVGLength[] e11 = e(arrayList2);
            this.f59099x = e11;
            this.f59078c.add(e11);
        }
        if (!(arrayList3 == null || arrayList3.size() == 0)) {
            this.f59064D++;
            this.f59069I = -1;
            this.f59084i.add(-1);
            SVGLength[] e12 = e(arrayList3);
            this.f59100y = e12;
            this.f59079d.add(e12);
        }
        if (!(arrayList4 == null || arrayList4.size() == 0)) {
            this.f59065E++;
            this.f59070J = -1;
            this.f59085j.add(-1);
            SVGLength[] e13 = e(arrayList4);
            this.f59101z = e13;
            this.f59080e.add(e13);
        }
        if (!(arrayList5 == null || arrayList5.size() == 0)) {
            this.f59066F++;
            this.f59071K = -1;
            this.f59086k.add(-1);
            double[] a10 = a(arrayList5);
            this.f59061A = a10;
            this.f59081f.add(a10);
        }
        q();
    }
}
