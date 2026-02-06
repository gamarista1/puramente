package k1;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import g1.C2007b;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k1.d  reason: case insensitive filesystem */
public abstract class C2143d extends g1.j {

    /* renamed from: k1.d$a */
    static class a extends C2143d {
        a() {
        }

        public void g(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* renamed from: k1.d$b */
    public static class b extends C2143d {

        /* renamed from: f  reason: collision with root package name */
        String f23159f;

        /* renamed from: g  reason: collision with root package name */
        SparseArray f23160g;

        /* renamed from: h  reason: collision with root package name */
        float[] f23161h;

        public b(String str, SparseArray sparseArray) {
            this.f23159f = str.split(com.amazon.a.a.o.b.f.f37529a)[1];
            this.f23160g = sparseArray;
        }

        public void b(int i10, float f10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        public void d(int i10) {
            int size = this.f23160g.size();
            int h10 = ((androidx.constraintlayout.widget.a) this.f23160g.valueAt(0)).h();
            double[] dArr = new double[size];
            this.f23161h = new float[h10];
            int[] iArr = new int[2];
            iArr[1] = h10;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = ((double) this.f23160g.keyAt(i11)) * 0.01d;
                ((androidx.constraintlayout.widget.a) this.f23160g.valueAt(i11)).f(this.f23161h);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f23161h;
                    if (i12 >= fArr.length) {
                        break;
                    }
                    dArr2[i11][i12] = (double) fArr[i12];
                    i12++;
                }
            }
            this.f20947a = C2007b.a(i10, dArr, dArr2);
        }

        public void g(View view, float f10) {
            this.f20947a.e((double) f10, this.f23161h);
            C2140a.b((androidx.constraintlayout.widget.a) this.f23160g.valueAt(0), view, this.f23161h);
        }

        public void h(int i10, androidx.constraintlayout.widget.a aVar) {
            this.f23160g.append(i10, aVar);
        }
    }

    /* renamed from: k1.d$c */
    static class c extends C2143d {
        c() {
        }

        public void g(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* renamed from: k1.d$e */
    static class e extends C2143d {
        e() {
        }

        public void g(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* renamed from: k1.d$f */
    static class f extends C2143d {
        f() {
        }

        public void g(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* renamed from: k1.d$g */
    static class g extends C2143d {

        /* renamed from: f  reason: collision with root package name */
        boolean f23162f = false;

        g() {
        }

        public void g(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (!this.f23162f) {
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f23162f = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f10))});
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewSpline", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewSpline", "unable to setProgress", e11);
                    }
                }
            }
        }
    }

    /* renamed from: k1.d$h */
    static class h extends C2143d {
        h() {
        }

        public void g(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* renamed from: k1.d$i */
    static class i extends C2143d {
        i() {
        }

        public void g(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* renamed from: k1.d$j */
    static class j extends C2143d {
        j() {
        }

        public void g(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* renamed from: k1.d$k */
    static class k extends C2143d {
        k() {
        }

        public void g(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* renamed from: k1.d$l */
    static class l extends C2143d {
        l() {
        }

        public void g(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* renamed from: k1.d$m */
    static class m extends C2143d {
        m() {
        }

        public void g(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* renamed from: k1.d$n */
    static class n extends C2143d {
        n() {
        }

        public void g(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* renamed from: k1.d$o */
    static class o extends C2143d {
        o() {
        }

        public void g(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static C2143d e(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    public static C2143d f(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c10 = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c10 = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c10 = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c10 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c10 = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new a();
            case 9:
                return new e();
            case 10:
                return new f();
            case 11:
                return new h();
            case 12:
                return new c();
            case 13:
                return new C0371d();
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return new a();
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return new a();
            default:
                return null;
        }
    }

    public abstract void g(View view, float f10);

    /* renamed from: k1.d$d  reason: collision with other inner class name */
    public static class C0371d extends C2143d {
        public void h(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        public void g(View view, float f10) {
        }
    }
}
