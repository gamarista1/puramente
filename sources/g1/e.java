package g1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private C2007b f20898a;

    /* renamed from: b  reason: collision with root package name */
    private b f20899b;

    /* renamed from: c  reason: collision with root package name */
    private String f20900c;

    /* renamed from: d  reason: collision with root package name */
    private int f20901d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f20902e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f20903f = 0;

    /* renamed from: g  reason: collision with root package name */
    ArrayList f20904g = new ArrayList();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f20922a, cVar2.f20922a);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f20906a;

        /* renamed from: b  reason: collision with root package name */
        h f20907b;

        /* renamed from: c  reason: collision with root package name */
        private final int f20908c = 0;

        /* renamed from: d  reason: collision with root package name */
        private final int f20909d = 1;

        /* renamed from: e  reason: collision with root package name */
        private final int f20910e = 2;

        /* renamed from: f  reason: collision with root package name */
        float[] f20911f;

        /* renamed from: g  reason: collision with root package name */
        double[] f20912g;

        /* renamed from: h  reason: collision with root package name */
        float[] f20913h;

        /* renamed from: i  reason: collision with root package name */
        float[] f20914i;

        /* renamed from: j  reason: collision with root package name */
        float[] f20915j;

        /* renamed from: k  reason: collision with root package name */
        float[] f20916k;

        /* renamed from: l  reason: collision with root package name */
        int f20917l;

        /* renamed from: m  reason: collision with root package name */
        C2007b f20918m;

        /* renamed from: n  reason: collision with root package name */
        double[] f20919n;

        /* renamed from: o  reason: collision with root package name */
        double[] f20920o;

        /* renamed from: p  reason: collision with root package name */
        float f20921p;

        b(int i10, String str, int i11, int i12) {
            h hVar = new h();
            this.f20907b = hVar;
            this.f20917l = i10;
            this.f20906a = i11;
            hVar.e(i10, str);
            this.f20911f = new float[i12];
            this.f20912g = new double[i12];
            this.f20913h = new float[i12];
            this.f20914i = new float[i12];
            this.f20915j = new float[i12];
            this.f20916k = new float[i12];
        }

        public double a(float f10) {
            C2007b bVar = this.f20918m;
            if (bVar != null) {
                bVar.d((double) f10, this.f20919n);
            } else {
                double[] dArr = this.f20919n;
                dArr[0] = (double) this.f20914i[0];
                dArr[1] = (double) this.f20915j[0];
                dArr[2] = (double) this.f20911f[0];
            }
            double[] dArr2 = this.f20919n;
            return dArr2[0] + (this.f20907b.c((double) f10, dArr2[1]) * this.f20919n[2]);
        }

        public void b(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f20912g[i10] = ((double) i11) / 100.0d;
            this.f20913h[i10] = f10;
            this.f20914i[i10] = f11;
            this.f20915j[i10] = f12;
            this.f20911f[i10] = f13;
        }

        public void c(float f10) {
            this.f20921p = f10;
            int length = this.f20912g.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr);
            float[] fArr = this.f20911f;
            this.f20919n = new double[(fArr.length + 2)];
            this.f20920o = new double[(fArr.length + 2)];
            if (this.f20912g[0] > 0.0d) {
                this.f20907b.a(0.0d, this.f20913h[0]);
            }
            double[] dArr2 = this.f20912g;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f20907b.a(1.0d, this.f20913h[length2]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = (double) this.f20914i[i10];
                dArr3[1] = (double) this.f20915j[i10];
                dArr3[2] = (double) this.f20911f[i10];
                this.f20907b.a(this.f20912g[i10], this.f20913h[i10]);
            }
            this.f20907b.d();
            double[] dArr4 = this.f20912g;
            if (dArr4.length > 1) {
                this.f20918m = C2007b.a(0, dArr4, dArr);
            } else {
                this.f20918m = null;
            }
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        int f20922a;

        /* renamed from: b  reason: collision with root package name */
        float f20923b;

        /* renamed from: c  reason: collision with root package name */
        float f20924c;

        /* renamed from: d  reason: collision with root package name */
        float f20925d;

        /* renamed from: e  reason: collision with root package name */
        float f20926e;

        c(int i10, float f10, float f11, float f12, float f13) {
            this.f20922a = i10;
            this.f20923b = f13;
            this.f20924c = f11;
            this.f20925d = f10;
            this.f20926e = f12;
        }
    }

    public float a(float f10) {
        return (float) this.f20899b.a(f10);
    }

    public void c(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        int i13 = i12;
        this.f20904g.add(new c(i10, f10, f11, f12, f13));
        if (i13 != -1) {
            this.f20903f = i13;
        }
        this.f20901d = i11;
        this.f20902e = str;
    }

    public void d(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        int i13 = i12;
        this.f20904g.add(new c(i10, f10, f11, f12, f13));
        if (i13 != -1) {
            this.f20903f = i13;
        }
        this.f20901d = i11;
        b(obj);
        this.f20902e = str;
    }

    public void e(String str) {
        this.f20900c = str;
    }

    public void f(float f10) {
        int size = this.f20904g.size();
        if (size != 0) {
            Collections.sort(this.f20904g, new a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f20899b = new b(this.f20901d, this.f20902e, this.f20903f, size);
            Iterator it = this.f20904g.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                float f11 = cVar.f20925d;
                dArr[i10] = ((double) f11) * 0.01d;
                double[] dArr3 = dArr2[i10];
                float f12 = cVar.f20923b;
                dArr3[0] = (double) f12;
                float f13 = cVar.f20924c;
                dArr3[1] = (double) f13;
                float f14 = cVar.f20926e;
                dArr3[2] = (double) f14;
                this.f20899b.b(i10, cVar.f20922a, f11, f13, f14, f12);
                i10++;
                dArr2 = dArr2;
            }
            double[][] dArr4 = dArr2;
            this.f20899b.c(f10);
            this.f20898a = C2007b.a(0, dArr, dArr2);
        }
    }

    public boolean g() {
        if (this.f20903f == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.f20900c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f20904g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            str = str + "[" + cVar.f20922a + " , " + decimalFormat.format((double) cVar.f20923b) + "] ";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
    }
}
