package k1;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k1.c  reason: case insensitive filesystem */
public abstract class C2142c extends g1.e {

    /* renamed from: k1.c$a */
    static class a extends C2142c {
        a() {
        }

        public void i(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* renamed from: k1.c$b */
    static class b extends C2142c {

        /* renamed from: h  reason: collision with root package name */
        float[] f23156h = new float[1];

        /* renamed from: i  reason: collision with root package name */
        protected androidx.constraintlayout.widget.a f23157i;

        b() {
        }

        /* access modifiers changed from: protected */
        public void b(Object obj) {
            this.f23157i = (androidx.constraintlayout.widget.a) obj;
        }

        public void i(View view, float f10) {
            this.f23156h[0] = a(f10);
            C2140a.b(this.f23157i, view, this.f23156h);
        }
    }

    /* renamed from: k1.c$c  reason: collision with other inner class name */
    static class C0370c extends C2142c {
        C0370c() {
        }

        public void i(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* renamed from: k1.c$e */
    static class e extends C2142c {

        /* renamed from: h  reason: collision with root package name */
        boolean f23158h = false;

        e() {
        }

        public void i(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (!this.f23158h) {
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f23158h = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f10))});
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewOscillator", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewOscillator", "unable to setProgress", e11);
                    }
                }
            }
        }
    }

    /* renamed from: k1.c$f */
    static class f extends C2142c {
        f() {
        }

        public void i(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* renamed from: k1.c$g */
    static class g extends C2142c {
        g() {
        }

        public void i(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* renamed from: k1.c$h */
    static class h extends C2142c {
        h() {
        }

        public void i(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* renamed from: k1.c$i */
    static class i extends C2142c {
        i() {
        }

        public void i(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* renamed from: k1.c$j */
    static class j extends C2142c {
        j() {
        }

        public void i(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* renamed from: k1.c$k */
    static class k extends C2142c {
        k() {
        }

        public void i(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* renamed from: k1.c$l */
    static class l extends C2142c {
        l() {
        }

        public void i(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* renamed from: k1.c$m */
    static class m extends C2142c {
        m() {
        }

        public void i(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static C2142c h(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c10 = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c10 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case 8:
                return new a();
            case 9:
                return new f();
            case 10:
                return new C0370c();
            case 11:
                return new d();
            case 12:
                return new a();
            case 13:
                return new a();
            default:
                return null;
        }
    }

    public abstract void i(View view, float f10);

    /* renamed from: k1.c$d */
    public static class d extends C2142c {
        public void j(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        public void i(View view, float f10) {
        }
    }
}
