package k1;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.amazon.a.a.o.b.f;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import g1.C2007b;
import g1.o;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k1.f  reason: case insensitive filesystem */
public abstract class C2145f extends o {

    /* renamed from: k1.f$a */
    static class a extends C2145f {
        a() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setAlpha(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$b */
    public static class b extends C2145f {

        /* renamed from: l  reason: collision with root package name */
        String f23163l;

        /* renamed from: m  reason: collision with root package name */
        SparseArray f23164m;

        /* renamed from: n  reason: collision with root package name */
        SparseArray f23165n = new SparseArray();

        /* renamed from: o  reason: collision with root package name */
        float[] f23166o;

        public b(String str, SparseArray sparseArray) {
            this.f23163l = str.split(f.f37529a)[1];
            this.f23164m = sparseArray;
        }

        public void b(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        public void e(int i10) {
            int size = this.f23164m.size();
            int h10 = ((androidx.constraintlayout.widget.a) this.f23164m.valueAt(0)).h();
            double[] dArr = new double[size];
            int i11 = h10 + 2;
            this.f23166o = new float[i11];
            this.f20987g = new float[h10];
            int[] iArr = new int[2];
            iArr[1] = i11;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.f23164m.keyAt(i12);
                float[] fArr = (float[]) this.f23165n.valueAt(i12);
                dArr[i12] = ((double) keyAt) * 0.01d;
                ((androidx.constraintlayout.widget.a) this.f23164m.valueAt(i12)).f(this.f23166o);
                int i13 = 0;
                while (true) {
                    float[] fArr2 = this.f23166o;
                    if (i13 >= fArr2.length) {
                        break;
                    }
                    dArr2[i12][i13] = (double) fArr2[i13];
                    i13++;
                }
                double[] dArr3 = dArr2[i12];
                dArr3[h10] = (double) fArr[0];
                dArr3[h10 + 1] = (double) fArr[1];
            }
            this.f20981a = C2007b.a(i10, dArr, dArr2);
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            boolean z10;
            View view2 = view;
            long j11 = j10;
            this.f20981a.e((double) f10, this.f23166o);
            float[] fArr = this.f23166o;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j12 = j11 - this.f20989i;
            if (Float.isNaN(this.f20990j)) {
                float a10 = dVar.a(view2, this.f23163l, 0);
                this.f20990j = a10;
                if (Float.isNaN(a10)) {
                    this.f20990j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f20990j) + ((((double) j12) * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f20990j = f13;
            this.f20989i = j11;
            float a11 = a(f13);
            this.f20988h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f20987g;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f20988h;
                float f14 = this.f23166o[i10];
                if (((double) f14) != 0.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f20988h = z11 | z10;
                fArr2[i10] = (f14 * a11) + f12;
                i10++;
            }
            C2140a.b((androidx.constraintlayout.widget.a) this.f23164m.valueAt(0), view2, this.f20987g);
            if (f11 != 0.0f) {
                this.f20988h = true;
            }
            return this.f20988h;
        }

        public void j(int i10, androidx.constraintlayout.widget.a aVar, float f10, int i11, float f11) {
            this.f23164m.append(i10, aVar);
            this.f23165n.append(i10, new float[]{f10, f11});
            this.f20982b = Math.max(this.f20982b, i11);
        }
    }

    /* renamed from: k1.f$c */
    static class c extends C2145f {
        c() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setElevation(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$d */
    public static class d extends C2145f {
        public boolean i(View view, float f10, long j10, g1.d dVar) {
            return this.f20988h;
        }

        public boolean j(View view, g1.d dVar, float f10, long j10, double d10, double d11) {
            view.setRotation(f(f10, j10, view, dVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$e */
    static class e extends C2145f {

        /* renamed from: l  reason: collision with root package name */
        boolean f23167l = false;

        e() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(f(f10, j10, view, dVar));
            } else if (this.f23167l) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f23167l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(f(f10, j10, view, dVar))});
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$f  reason: collision with other inner class name */
    static class C0372f extends C2145f {
        C0372f() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setRotation(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$g */
    static class g extends C2145f {
        g() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setRotationX(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$h */
    static class h extends C2145f {
        h() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setRotationY(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$i */
    static class i extends C2145f {
        i() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setScaleX(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$j */
    static class j extends C2145f {
        j() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setScaleY(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$k */
    static class k extends C2145f {
        k() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setTranslationX(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$l */
    static class l extends C2145f {
        l() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setTranslationY(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    /* renamed from: k1.f$m */
    static class m extends C2145f {
        m() {
        }

        public boolean i(View view, float f10, long j10, g1.d dVar) {
            view.setTranslationZ(f(f10, j10, view, dVar));
            return this.f20988h;
        }
    }

    public static C2145f g(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    public static C2145f h(String str, long j10) {
        C2145f fVar;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    c10 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c10 = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c10 = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                fVar = new g();
                break;
            case 1:
                fVar = new h();
                break;
            case 2:
                fVar = new k();
                break;
            case 3:
                fVar = new l();
                break;
            case 4:
                fVar = new m();
                break;
            case 5:
                fVar = new e();
                break;
            case 6:
                fVar = new i();
                break;
            case 7:
                fVar = new j();
                break;
            case 8:
                fVar = new C0372f();
                break;
            case 9:
                fVar = new c();
                break;
            case 10:
                fVar = new d();
                break;
            case 11:
                fVar = new a();
                break;
            default:
                return null;
        }
        fVar.c(j10);
        return fVar;
    }

    public float f(float f10, long j10, View view, g1.d dVar) {
        boolean z10;
        long j11 = j10;
        View view2 = view;
        g1.d dVar2 = dVar;
        this.f20981a.e((double) f10, this.f20987g);
        float[] fArr = this.f20987g;
        float f11 = fArr[1];
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            this.f20988h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f20990j)) {
            float a10 = dVar2.a(view2, this.f20986f, 0);
            this.f20990j = a10;
            if (Float.isNaN(a10)) {
                this.f20990j = 0.0f;
            }
        }
        float f12 = (float) ((((double) this.f20990j) + ((((double) (j11 - this.f20989i)) * 1.0E-9d) * ((double) f11))) % 1.0d);
        this.f20990j = f12;
        dVar2.b(view2, this.f20986f, 0, f12);
        this.f20989i = j11;
        float f13 = this.f20987g[0];
        float a11 = (a(this.f20990j) * f13) + this.f20987g[2];
        if (f13 == 0.0f && i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20988h = z10;
        return a11;
    }

    public abstract boolean i(View view, float f10, long j10, g1.d dVar);
}
