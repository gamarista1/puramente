package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p1.C2388d;

public class D0 {

    /* renamed from: b  reason: collision with root package name */
    public static final D0 f15980b;

    /* renamed from: a  reason: collision with root package name */
    private final m f15981a;

    private static class d extends c {
        d() {
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setInsets(o.a(i10), dVar.e());
        }

        d(D0 d02) {
            super(d02);
        }
    }

    private static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setInsets(p.a(i10), dVar.e());
        }

        e(D0 d02) {
            super(d02);
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final D0 f15990a;

        /* renamed from: b  reason: collision with root package name */
        C2388d[] f15991b;

        f() {
            this(new D0((D0) null));
        }

        /* access modifiers changed from: protected */
        public final void a() {
            C2388d[] dVarArr = this.f15991b;
            if (dVarArr != null) {
                C2388d dVar = dVarArr[n.d(1)];
                C2388d dVar2 = this.f15991b[n.d(2)];
                if (dVar2 == null) {
                    dVar2 = this.f15990a.f(2);
                }
                if (dVar == null) {
                    dVar = this.f15990a.f(1);
                }
                g(C2388d.a(dVar, dVar2));
                C2388d dVar3 = this.f15991b[n.d(16)];
                if (dVar3 != null) {
                    f(dVar3);
                }
                C2388d dVar4 = this.f15991b[n.d(32)];
                if (dVar4 != null) {
                    d(dVar4);
                }
                C2388d dVar5 = this.f15991b[n.d(64)];
                if (dVar5 != null) {
                    h(dVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public abstract D0 b();

        /* access modifiers changed from: package-private */
        public void c(int i10, C2388d dVar) {
            if (this.f15991b == null) {
                this.f15991b = new C2388d[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f15991b[n.d(i11)] = dVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void e(C2388d dVar);

        /* access modifiers changed from: package-private */
        public abstract void g(C2388d dVar);

        f(D0 d02) {
            this.f15990a = d02;
        }

        /* access modifiers changed from: package-private */
        public void d(C2388d dVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(C2388d dVar) {
        }

        /* access modifiers changed from: package-private */
        public void h(C2388d dVar) {
        }
    }

    private static class i extends h {
        i(D0 d02, WindowInsets windowInsets) {
            super(d02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public D0 a() {
            return D0.y(this.f15997c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!Objects.equals(this.f15997c, iVar.f15997c) || !Objects.equals(this.f16001g, iVar.f16001g) || !g.C(this.f16002h, iVar.f16002h)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public r f() {
            return r.f(this.f15997c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f15997c.hashCode();
        }

        i(D0 d02, i iVar) {
            super(d02, (h) iVar);
        }
    }

    private static class k extends j {

        /* renamed from: r  reason: collision with root package name */
        static final D0 f16007r = D0.y(WindowInsets.CONSUMED);

        k(D0 d02, WindowInsets windowInsets) {
            super(d02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public C2388d g(int i10) {
            return C2388d.d(this.f15997c.getInsets(o.a(i10)));
        }

        public C2388d h(int i10) {
            return C2388d.d(this.f15997c.getInsetsIgnoringVisibility(o.a(i10)));
        }

        public boolean q(int i10) {
            return this.f15997c.isVisible(o.a(i10));
        }

        k(D0 d02, k kVar) {
            super(d02, (j) kVar);
        }
    }

    private static class l extends k {

        /* renamed from: s  reason: collision with root package name */
        static final D0 f16008s = D0.y(WindowInsets.CONSUMED);

        l(D0 d02, WindowInsets windowInsets) {
            super(d02, windowInsets);
        }

        public C2388d g(int i10) {
            return C2388d.d(this.f15997c.getInsets(p.a(i10)));
        }

        public C2388d h(int i10) {
            return C2388d.d(this.f15997c.getInsetsIgnoringVisibility(p.a(i10)));
        }

        public boolean q(int i10) {
            return this.f15997c.isVisible(p.a(i10));
        }

        l(D0 d02, l lVar) {
            super(d02, (k) lVar);
        }
    }

    public static final class n {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 519;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    private static final class o {
        static int a(int i10) {
            int a10;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        a10 = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        a10 = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        a10 = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        a10 = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        a10 = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        a10 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        a10 = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        a10 = WindowInsets.Type.displayCutout();
                    }
                    i11 |= a10;
                }
            }
            return i11;
        }
    }

    private static final class p {
        static int a(int i10) {
            int a10;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        a10 = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        a10 = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        a10 = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        a10 = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        a10 = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        a10 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        a10 = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        a10 = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        a10 = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= a10;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f15980b = l.f16008s;
        } else if (i10 >= 30) {
            f15980b = k.f16007r;
        } else {
            f15980b = m.f16009b;
        }
    }

    private D0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f15981a = new l(this, windowInsets);
        } else if (i10 >= 30) {
            this.f15981a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f15981a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f15981a = new i(this, windowInsets);
        } else {
            this.f15981a = new h(this, windowInsets);
        }
    }

    static C2388d o(C2388d dVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, dVar.f25150a - i10);
        int max2 = Math.max(0, dVar.f25151b - i11);
        int max3 = Math.max(0, dVar.f25152c - i12);
        int max4 = Math.max(0, dVar.f25153d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return dVar;
        }
        return C2388d.b(max, max2, max3, max4);
    }

    public static D0 y(WindowInsets windowInsets) {
        return z(windowInsets, (View) null);
    }

    public static D0 z(WindowInsets windowInsets, View view) {
        D0 d02 = new D0((WindowInsets) x1.g.f(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            d02.u(C1680b0.H(view));
            d02.d(view.getRootView());
            d02.w(view.getWindowSystemUiVisibility());
        }
        return d02;
    }

    public D0 a() {
        return this.f15981a.a();
    }

    public D0 b() {
        return this.f15981a.b();
    }

    public D0 c() {
        return this.f15981a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f15981a.d(view);
    }

    public r e() {
        return this.f15981a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        return x1.c.a(this.f15981a, ((D0) obj).f15981a);
    }

    public C2388d f(int i10) {
        return this.f15981a.g(i10);
    }

    public C2388d g(int i10) {
        return this.f15981a.h(i10);
    }

    public C2388d h() {
        return this.f15981a.j();
    }

    public int hashCode() {
        m mVar = this.f15981a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public C2388d i() {
        return this.f15981a.k();
    }

    public int j() {
        return this.f15981a.l().f25153d;
    }

    public int k() {
        return this.f15981a.l().f25150a;
    }

    public int l() {
        return this.f15981a.l().f25152c;
    }

    public int m() {
        return this.f15981a.l().f25151b;
    }

    public D0 n(int i10, int i11, int i12, int i13) {
        return this.f15981a.n(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f15981a.o();
    }

    public boolean q(int i10) {
        return this.f15981a.q(i10);
    }

    public D0 r(int i10, int i11, int i12, int i13) {
        return new a(this).d(C2388d.b(i10, i11, i12, i13)).a();
    }

    /* access modifiers changed from: package-private */
    public void s(C2388d[] dVarArr) {
        this.f15981a.r(dVarArr);
    }

    /* access modifiers changed from: package-private */
    public void t(C2388d dVar) {
        this.f15981a.s(dVar);
    }

    /* access modifiers changed from: package-private */
    public void u(D0 d02) {
        this.f15981a.t(d02);
    }

    /* access modifiers changed from: package-private */
    public void v(C2388d dVar) {
        this.f15981a.u(dVar);
    }

    /* access modifiers changed from: package-private */
    public void w(int i10) {
        this.f15981a.v(i10);
    }

    public WindowInsets x() {
        m mVar = this.f15981a;
        if (mVar instanceof g) {
            return ((g) mVar).f15997c;
        }
        return null;
    }

    private static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f15983e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f15984f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor f15985g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f15986h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f15987c;

        /* renamed from: d  reason: collision with root package name */
        private C2388d f15988d;

        b() {
            this.f15987c = i();
        }

        private static WindowInsets i() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f15984f) {
                try {
                    f15983e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f15984f = true;
            }
            Field field = f15983e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f15986h) {
                try {
                    f15985g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f15986h = true;
            }
            Constructor constructor = f15985g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public D0 b() {
            a();
            D0 y10 = D0.y(this.f15987c);
            y10.s(this.f15991b);
            y10.v(this.f15988d);
            return y10;
        }

        /* access modifiers changed from: package-private */
        public void e(C2388d dVar) {
            this.f15988d = dVar;
        }

        /* access modifiers changed from: package-private */
        public void g(C2388d dVar) {
            WindowInsets windowInsets = this.f15987c;
            if (windowInsets != null) {
                this.f15987c = windowInsets.replaceSystemWindowInsets(dVar.f25150a, dVar.f25151b, dVar.f25152c, dVar.f25153d);
            }
        }

        b(D0 d02) {
            super(d02);
            this.f15987c = d02.x();
        }
    }

    private static class c extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f15989c;

        c() {
            this.f15989c = L0.a();
        }

        /* access modifiers changed from: package-private */
        public D0 b() {
            a();
            D0 y10 = D0.y(this.f15989c.build());
            y10.s(this.f15991b);
            return y10;
        }

        /* access modifiers changed from: package-private */
        public void d(C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setMandatorySystemGestureInsets(dVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setStableInsets(dVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setSystemGestureInsets(dVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setSystemWindowInsets(dVar.e());
        }

        /* access modifiers changed from: package-private */
        public void h(C2388d dVar) {
            WindowInsets.Builder unused = this.f15989c.setTappableElementInsets(dVar.e());
        }

        c(D0 d02) {
            super(d02);
            WindowInsets.Builder builder;
            WindowInsets x10 = d02.x();
            if (x10 != null) {
                builder = K0.a(x10);
            } else {
                builder = L0.a();
            }
            this.f15989c = builder;
        }
    }

    private static class h extends g {

        /* renamed from: n  reason: collision with root package name */
        private C2388d f16003n = null;

        h(D0 d02, WindowInsets windowInsets) {
            super(d02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public D0 b() {
            return D0.y(this.f15997c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public D0 c() {
            return D0.y(this.f15997c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final C2388d j() {
            if (this.f16003n == null) {
                this.f16003n = C2388d.b(this.f15997c.getStableInsetLeft(), this.f15997c.getStableInsetTop(), this.f15997c.getStableInsetRight(), this.f15997c.getStableInsetBottom());
            }
            return this.f16003n;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f15997c.isConsumed();
        }

        public void u(C2388d dVar) {
            this.f16003n = dVar;
        }

        h(D0 d02, h hVar) {
            super(d02, (g) hVar);
            this.f16003n = hVar.f16003n;
        }
    }

    private static class g extends m {

        /* renamed from: i  reason: collision with root package name */
        private static boolean f15992i = false;

        /* renamed from: j  reason: collision with root package name */
        private static Method f15993j;

        /* renamed from: k  reason: collision with root package name */
        private static Class f15994k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f15995l;

        /* renamed from: m  reason: collision with root package name */
        private static Field f15996m;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f15997c;

        /* renamed from: d  reason: collision with root package name */
        private C2388d[] f15998d;

        /* renamed from: e  reason: collision with root package name */
        private C2388d f15999e;

        /* renamed from: f  reason: collision with root package name */
        private D0 f16000f;

        /* renamed from: g  reason: collision with root package name */
        C2388d f16001g;

        /* renamed from: h  reason: collision with root package name */
        int f16002h;

        g(D0 d02, WindowInsets windowInsets) {
            super(d02);
            this.f15999e = null;
            this.f15997c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void B() {
            try {
                f15993j = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f15994k = cls;
                f15995l = cls.getDeclaredField("mVisibleInsets");
                f15996m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f15995l.setAccessible(true);
                f15996m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f15992i = true;
        }

        static boolean C(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        @SuppressLint({"WrongConstant"})
        private C2388d w(int i10, boolean z10) {
            C2388d dVar = C2388d.f25149e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    dVar = C2388d.a(dVar, x(i11, z10));
                }
            }
            return dVar;
        }

        private C2388d y() {
            D0 d02 = this.f16000f;
            if (d02 != null) {
                return d02.h();
            }
            return C2388d.f25149e;
        }

        private C2388d z(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f15992i) {
                    B();
                }
                Method method = f15993j;
                if (!(method == null || f15994k == null || f15995l == null)) {
                    try {
                        Object invoke = method.invoke(view, (Object[]) null);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f15995l.get(f15996m.get(invoke));
                        if (rect != null) {
                            return C2388d.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* access modifiers changed from: protected */
        public boolean A(int i10) {
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 4) {
                    return false;
                }
                if (!(i10 == 8 || i10 == 128)) {
                    return true;
                }
            }
            return !x(i10, false).equals(C2388d.f25149e);
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            C2388d z10 = z(view);
            if (z10 == null) {
                z10 = C2388d.f25149e;
            }
            s(z10);
        }

        /* access modifiers changed from: package-private */
        public void e(D0 d02) {
            d02.u(this.f16000f);
            d02.t(this.f16001g);
            d02.w(this.f16002h);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            if (!Objects.equals(this.f16001g, gVar.f16001g) || !C(this.f16002h, gVar.f16002h)) {
                return false;
            }
            return true;
        }

        public C2388d g(int i10) {
            return w(i10, false);
        }

        public C2388d h(int i10) {
            return w(i10, true);
        }

        /* access modifiers changed from: package-private */
        public final C2388d l() {
            if (this.f15999e == null) {
                this.f15999e = C2388d.b(this.f15997c.getSystemWindowInsetLeft(), this.f15997c.getSystemWindowInsetTop(), this.f15997c.getSystemWindowInsetRight(), this.f15997c.getSystemWindowInsetBottom());
            }
            return this.f15999e;
        }

        /* access modifiers changed from: package-private */
        public D0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(D0.y(this.f15997c));
            aVar.d(D0.o(l(), i10, i11, i12, i13));
            aVar.c(D0.o(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return this.f15997c.isRound();
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !A(i11)) {
                    return false;
                }
            }
            return true;
        }

        public void r(C2388d[] dVarArr) {
            this.f15998d = dVarArr;
        }

        /* access modifiers changed from: package-private */
        public void s(C2388d dVar) {
            this.f16001g = dVar;
        }

        /* access modifiers changed from: package-private */
        public void t(D0 d02) {
            this.f16000f = d02;
        }

        /* access modifiers changed from: package-private */
        public void v(int i10) {
            this.f16002h = i10;
        }

        /* access modifiers changed from: protected */
        public C2388d x(int i10, boolean z10) {
            int i11;
            r rVar;
            if (i10 != 1) {
                C2388d dVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        C2388d[] dVarArr = this.f15998d;
                        if (dVarArr != null) {
                            dVar = dVarArr[n.d(8)];
                        }
                        if (dVar != null) {
                            return dVar;
                        }
                        C2388d l10 = l();
                        C2388d y10 = y();
                        int i12 = l10.f25153d;
                        if (i12 > y10.f25153d) {
                            return C2388d.b(0, 0, 0, i12);
                        }
                        C2388d dVar2 = this.f16001g;
                        if (dVar2 == null || dVar2.equals(C2388d.f25149e) || (i11 = this.f16001g.f25153d) <= y10.f25153d) {
                            return C2388d.f25149e;
                        }
                        return C2388d.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return k();
                    } else {
                        if (i10 == 32) {
                            return i();
                        }
                        if (i10 == 64) {
                            return m();
                        }
                        if (i10 != 128) {
                            return C2388d.f25149e;
                        }
                        D0 d02 = this.f16000f;
                        if (d02 != null) {
                            rVar = d02.e();
                        } else {
                            rVar = f();
                        }
                        if (rVar != null) {
                            return C2388d.b(rVar.b(), rVar.d(), rVar.c(), rVar.a());
                        }
                        return C2388d.f25149e;
                    }
                } else if (z10) {
                    C2388d y11 = y();
                    C2388d j10 = j();
                    return C2388d.b(Math.max(y11.f25150a, j10.f25150a), 0, Math.max(y11.f25152c, j10.f25152c), Math.max(y11.f25153d, j10.f25153d));
                } else if ((this.f16002h & 2) != 0) {
                    return C2388d.f25149e;
                } else {
                    C2388d l11 = l();
                    D0 d03 = this.f16000f;
                    if (d03 != null) {
                        dVar = d03.h();
                    }
                    int i13 = l11.f25153d;
                    if (dVar != null) {
                        i13 = Math.min(i13, dVar.f25153d);
                    }
                    return C2388d.b(l11.f25150a, 0, l11.f25152c, i13);
                }
            } else if (z10) {
                return C2388d.b(0, Math.max(y().f25151b, l().f25151b), 0, 0);
            } else {
                if ((this.f16002h & 4) != 0) {
                    return C2388d.f25149e;
                }
                return C2388d.b(0, l().f25151b, 0, 0);
            }
        }

        g(D0 d02, g gVar) {
            this(d02, new WindowInsets(gVar.f15997c));
        }
    }

    private static class j extends i {

        /* renamed from: o  reason: collision with root package name */
        private C2388d f16004o = null;

        /* renamed from: p  reason: collision with root package name */
        private C2388d f16005p = null;

        /* renamed from: q  reason: collision with root package name */
        private C2388d f16006q = null;

        j(D0 d02, WindowInsets windowInsets) {
            super(d02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public C2388d i() {
            if (this.f16005p == null) {
                this.f16005p = C2388d.d(this.f15997c.getMandatorySystemGestureInsets());
            }
            return this.f16005p;
        }

        /* access modifiers changed from: package-private */
        public C2388d k() {
            if (this.f16004o == null) {
                this.f16004o = C2388d.d(this.f15997c.getSystemGestureInsets());
            }
            return this.f16004o;
        }

        /* access modifiers changed from: package-private */
        public C2388d m() {
            if (this.f16006q == null) {
                this.f16006q = C2388d.d(this.f15997c.getTappableElementInsets());
            }
            return this.f16006q;
        }

        /* access modifiers changed from: package-private */
        public D0 n(int i10, int i11, int i12, int i13) {
            return D0.y(this.f15997c.inset(i10, i11, i12, i13));
        }

        j(D0 d02, j jVar) {
            super(d02, (i) jVar);
        }

        public void u(C2388d dVar) {
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final f f15982a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f15982a = new e();
            } else if (i10 >= 30) {
                this.f15982a = new d();
            } else if (i10 >= 29) {
                this.f15982a = new c();
            } else {
                this.f15982a = new b();
            }
        }

        public D0 a() {
            return this.f15982a.b();
        }

        public a b(int i10, C2388d dVar) {
            this.f15982a.c(i10, dVar);
            return this;
        }

        public a c(C2388d dVar) {
            this.f15982a.e(dVar);
            return this;
        }

        public a d(C2388d dVar) {
            this.f15982a.g(dVar);
            return this;
        }

        public a(D0 d02) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f15982a = new e(d02);
            } else if (i10 >= 30) {
                this.f15982a = new d(d02);
            } else if (i10 >= 29) {
                this.f15982a = new c(d02);
            } else {
                this.f15982a = new b(d02);
            }
        }
    }

    public D0(D0 d02) {
        if (d02 != null) {
            m mVar = d02.f15981a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (mVar instanceof l)) {
                this.f15981a = new l(this, (l) mVar);
            } else if (i10 >= 30 && (mVar instanceof k)) {
                this.f15981a = new k(this, (k) mVar);
            } else if (i10 >= 29 && (mVar instanceof j)) {
                this.f15981a = new j(this, (j) mVar);
            } else if (i10 >= 28 && (mVar instanceof i)) {
                this.f15981a = new i(this, (i) mVar);
            } else if (mVar instanceof h) {
                this.f15981a = new h(this, (h) mVar);
            } else if (mVar instanceof g) {
                this.f15981a = new g(this, (g) mVar);
            } else {
                this.f15981a = new m(this);
            }
            mVar.e(this);
            return;
        }
        this.f15981a = new m(this);
    }

    private static class m {

        /* renamed from: b  reason: collision with root package name */
        static final D0 f16009b = new a().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final D0 f16010a;

        m(D0 d02) {
            this.f16010a = d02;
        }

        /* access modifiers changed from: package-private */
        public D0 a() {
            return this.f16010a;
        }

        /* access modifiers changed from: package-private */
        public D0 b() {
            return this.f16010a;
        }

        /* access modifiers changed from: package-private */
        public D0 c() {
            return this.f16010a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(D0 d02) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (p() != mVar.p() || o() != mVar.o() || !x1.c.a(l(), mVar.l()) || !x1.c.a(j(), mVar.j()) || !x1.c.a(f(), mVar.f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public r f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public C2388d g(int i10) {
            return C2388d.f25149e;
        }

        /* access modifiers changed from: package-private */
        public C2388d h(int i10) {
            if ((i10 & 8) == 0) {
                return C2388d.f25149e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return x1.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        /* access modifiers changed from: package-private */
        public C2388d i() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public C2388d j() {
            return C2388d.f25149e;
        }

        /* access modifiers changed from: package-private */
        public C2388d k() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public C2388d l() {
            return C2388d.f25149e;
        }

        /* access modifiers changed from: package-private */
        public C2388d m() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public D0 n(int i10, int i11, int i12, int i13) {
            return f16009b;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean q(int i10) {
            return true;
        }

        /* access modifiers changed from: package-private */
        public void t(D0 d02) {
        }

        /* access modifiers changed from: package-private */
        public void v(int i10) {
        }

        public void r(C2388d[] dVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void s(C2388d dVar) {
        }

        public void u(C2388d dVar) {
        }
    }
}
