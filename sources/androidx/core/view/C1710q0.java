package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.D0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import m1.C2187c;
import p1.C2388d;

/* renamed from: androidx.core.view.q0  reason: case insensitive filesystem */
public final class C1710q0 {

    /* renamed from: a  reason: collision with root package name */
    private e f16114a;

    /* renamed from: androidx.core.view.q0$b */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        D0 mDispachedInsets;
        private final int mDispatchMode;

        public b(int i10) {
            this.mDispatchMode = i10;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(C1710q0 q0Var) {
        }

        public void onPrepare(C1710q0 q0Var) {
        }

        public abstract D0 onProgress(D0 d02, List list);

        public a onStart(C1710q0 q0Var, a aVar) {
            return aVar;
        }
    }

    /* renamed from: androidx.core.view.q0$c */
    private static class c extends e {

        /* renamed from: f  reason: collision with root package name */
        private static final Interpolator f16117f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g  reason: collision with root package name */
        private static final Interpolator f16118g = new V1.a();

        /* renamed from: h  reason: collision with root package name */
        private static final Interpolator f16119h = new DecelerateInterpolator(1.5f);

        /* renamed from: i  reason: collision with root package name */
        private static final Interpolator f16120i = new AccelerateInterpolator(1.5f);

        /* renamed from: androidx.core.view.q0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            final b f16121a;

            /* renamed from: b  reason: collision with root package name */
            private D0 f16122b;

            /* renamed from: androidx.core.view.q0$c$a$a  reason: collision with other inner class name */
            class C0286a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1710q0 f16123a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ D0 f16124b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ D0 f16125c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f16126d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ View f16127e;

                C0286a(C1710q0 q0Var, D0 d02, D0 d03, int i10, View view) {
                    this.f16123a = q0Var;
                    this.f16124b = d02;
                    this.f16125c = d03;
                    this.f16126d = i10;
                    this.f16127e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f16123a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f16127e, c.o(this.f16124b, this.f16125c, this.f16123a.b(), this.f16126d), Collections.singletonList(this.f16123a));
                }
            }

            /* renamed from: androidx.core.view.q0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1710q0 f16129a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f16130b;

                b(C1710q0 q0Var, View view) {
                    this.f16129a = q0Var;
                    this.f16130b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f16129a.e(1.0f);
                    c.i(this.f16130b, this.f16129a);
                }
            }

            /* renamed from: androidx.core.view.q0$c$a$c  reason: collision with other inner class name */
            class C0287c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View f16132a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C1710q0 f16133b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f16134c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ValueAnimator f16135d;

                C0287c(View view, C1710q0 q0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f16132a = view;
                    this.f16133b = q0Var;
                    this.f16134c = aVar;
                    this.f16135d = valueAnimator;
                }

                public void run() {
                    c.l(this.f16132a, this.f16133b, this.f16134c);
                    this.f16135d.start();
                }
            }

            a(View view, b bVar) {
                D0 d02;
                this.f16121a = bVar;
                D0 H10 = C1680b0.H(view);
                if (H10 != null) {
                    d02 = new D0.a(H10).a();
                } else {
                    d02 = null;
                }
                this.f16122b = d02;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                long j10;
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f16122b = D0.z(windowInsets2, view2);
                    return c.m(view, windowInsets);
                }
                D0 z10 = D0.z(windowInsets2, view2);
                if (this.f16122b == null) {
                    this.f16122b = C1680b0.H(view);
                }
                if (this.f16122b == null) {
                    this.f16122b = z10;
                    return c.m(view, windowInsets);
                }
                b n10 = c.n(view);
                if (n10 != null && Objects.equals(n10.mDispachedInsets, z10)) {
                    return c.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.e(z10, this.f16122b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f16122b = z10;
                    return c.m(view, windowInsets);
                }
                D0 d02 = this.f16122b;
                Interpolator g10 = c.g(i10, i11);
                if ((D0.n.c() & i12) != 0) {
                    j10 = 160;
                } else {
                    j10 = 250;
                }
                C1710q0 q0Var = new C1710q0(i12, g10, j10);
                q0Var.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(q0Var.a());
                a f10 = c.f(z10, d02, i12);
                c.j(view2, q0Var, z10, false);
                duration.addUpdateListener(new C0286a(q0Var, z10, d02, i12, view));
                duration.addListener(new b(q0Var, view2));
                L.a(view2, new C0287c(view, q0Var, f10, duration));
                this.f16122b = z10;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static void e(D0 d02, D0 d03, int[] iArr, int[] iArr2) {
            boolean z10;
            boolean z11;
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                C2388d f10 = d02.f(i10);
                C2388d f11 = d03.f(i10);
                int i11 = f10.f25150a;
                int i12 = f11.f25150a;
                if (i11 > i12 || f10.f25151b > f11.f25151b || f10.f25152c > f11.f25152c || f10.f25153d > f11.f25153d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 < i12 || f10.f25151b < f11.f25151b || f10.f25152c < f11.f25152c || f10.f25153d < f11.f25153d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        static a f(D0 d02, D0 d03, int i10) {
            C2388d f10 = d02.f(i10);
            C2388d f11 = d03.f(i10);
            return new a(C2388d.b(Math.min(f10.f25150a, f11.f25150a), Math.min(f10.f25151b, f11.f25151b), Math.min(f10.f25152c, f11.f25152c), Math.min(f10.f25153d, f11.f25153d)), C2388d.b(Math.max(f10.f25150a, f11.f25150a), Math.max(f10.f25151b, f11.f25151b), Math.max(f10.f25152c, f11.f25152c), Math.max(f10.f25153d, f11.f25153d)));
        }

        static Interpolator g(int i10, int i11) {
            if ((D0.n.c() & i10) != 0) {
                return f16117f;
            }
            if ((D0.n.c() & i11) != 0) {
                return f16118g;
            }
            if ((i10 & D0.n.h()) != 0) {
                return f16119h;
            }
            if ((D0.n.h() & i11) != 0) {
                return f16120i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C1710q0 q0Var) {
            b n10 = n(view);
            if (n10 != null) {
                n10.onEnd(q0Var);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), q0Var);
                }
            }
        }

        static void j(View view, C1710q0 q0Var, D0 d02, boolean z10) {
            b n10 = n(view);
            if (n10 != null) {
                n10.mDispachedInsets = d02;
                if (!z10) {
                    n10.onPrepare(q0Var);
                    if (n10.getDispatchMode() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), q0Var, d02, z10);
                }
            }
        }

        static void k(View view, D0 d02, List list) {
            b n10 = n(view);
            if (n10 != null) {
                d02 = n10.onProgress(d02, list);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), d02, list);
                }
            }
        }

        static void l(View view, C1710q0 q0Var, a aVar) {
            b n10 = n(view);
            if (n10 != null) {
                n10.onStart(q0Var, aVar);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), q0Var, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            if (view.getTag(C2187c.f23611M) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(C2187c.f23618T);
            if (tag instanceof a) {
                return ((a) tag).f16121a;
            }
            return null;
        }

        static D0 o(D0 d02, D0 d03, float f10, int i10) {
            D0.a aVar = new D0.a(d02);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, d02.f(i11));
                } else {
                    C2388d f11 = d02.f(i11);
                    C2388d f12 = d03.f(i11);
                    float f13 = 1.0f - f10;
                    aVar.b(i11, D0.o(f11, (int) (((double) (((float) (f11.f25150a - f12.f25150a)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f25151b - f12.f25151b)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f25152c - f12.f25152c)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f25153d - f12.f25153d)) * f13)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
            if (bVar != null) {
                onApplyWindowInsetsListener = h(view, bVar);
            } else {
                onApplyWindowInsetsListener = null;
            }
            view.setTag(C2187c.f23618T, onApplyWindowInsetsListener);
            if (view.getTag(C2187c.f23610L) == null && view.getTag(C2187c.f23611M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
            }
        }
    }

    /* renamed from: androidx.core.view.q0$e */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f16142a;

        /* renamed from: b  reason: collision with root package name */
        private float f16143b;

        /* renamed from: c  reason: collision with root package name */
        private final Interpolator f16144c;

        /* renamed from: d  reason: collision with root package name */
        private final long f16145d;

        /* renamed from: e  reason: collision with root package name */
        private float f16146e = 1.0f;

        e(int i10, Interpolator interpolator, long j10) {
            this.f16142a = i10;
            this.f16144c = interpolator;
            this.f16145d = j10;
        }

        public long a() {
            return this.f16145d;
        }

        public float b() {
            Interpolator interpolator = this.f16144c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f16143b);
            }
            return this.f16143b;
        }

        public int c() {
            return this.f16142a;
        }

        public void d(float f10) {
            this.f16143b = f10;
        }
    }

    public C1710q0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16114a = new d(i10, interpolator, j10);
        } else {
            this.f16114a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C1710q0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1710q0(windowInsetsAnimation);
    }

    public long a() {
        return this.f16114a.a();
    }

    public float b() {
        return this.f16114a.b();
    }

    public int c() {
        return this.f16114a.c();
    }

    public void e(float f10) {
        this.f16114a.d(f10);
    }

    /* renamed from: androidx.core.view.q0$d */
    private static class d extends e {

        /* renamed from: f  reason: collision with root package name */
        private final WindowInsetsAnimation f16137f;

        /* renamed from: androidx.core.view.q0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a  reason: collision with root package name */
            private final b f16138a;

            /* renamed from: b  reason: collision with root package name */
            private List f16139b;

            /* renamed from: c  reason: collision with root package name */
            private ArrayList f16140c;

            /* renamed from: d  reason: collision with root package name */
            private final HashMap f16141d = new HashMap();

            a(b bVar) {
                super(bVar.getDispatchMode());
                this.f16138a = bVar;
            }

            private C1710q0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C1710q0 q0Var = (C1710q0) this.f16141d.get(windowInsetsAnimation);
                if (q0Var != null) {
                    return q0Var;
                }
                C1710q0 f10 = C1710q0.f(windowInsetsAnimation);
                this.f16141d.put(windowInsetsAnimation, f10);
                return f10;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16138a.onEnd(a(windowInsetsAnimation));
                this.f16141d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16138a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f16140c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f16140c = arrayList2;
                    this.f16139b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a10 = B0.a(list.get(size));
                    C1710q0 a11 = a(a10);
                    a11.e(a10.getFraction());
                    this.f16140c.add(a11);
                }
                return this.f16138a.onProgress(D0.y(windowInsets), this.f16139b).x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f16138a.onStart(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f16137f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            C1725y0.a();
            return C1723x0.a(aVar.a().e(), aVar.b().e());
        }

        public static C2388d f(WindowInsetsAnimation.Bounds bounds) {
            return C2388d.d(bounds.getUpperBound());
        }

        public static C2388d g(WindowInsetsAnimation.Bounds bounds) {
            return C2388d.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            a aVar;
            if (bVar != null) {
                aVar = new a(bVar);
            } else {
                aVar = null;
            }
            view.setWindowInsetsAnimationCallback(aVar);
        }

        public long a() {
            return this.f16137f.getDurationMillis();
        }

        public float b() {
            return this.f16137f.getInterpolatedFraction();
        }

        public int c() {
            return this.f16137f.getTypeMask();
        }

        public void d(float f10) {
            this.f16137f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(C1721w0.a(i10, interpolator, j10));
        }
    }

    /* renamed from: androidx.core.view.q0$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2388d f16115a;

        /* renamed from: b  reason: collision with root package name */
        private final C2388d f16116b;

        public a(C2388d dVar, C2388d dVar2) {
            this.f16115a = dVar;
            this.f16116b = dVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public C2388d a() {
            return this.f16115a;
        }

        public C2388d b() {
            return this.f16116b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f16115a + " upper=" + this.f16116b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f16115a = d.g(bounds);
            this.f16116b = d.f(bounds);
        }
    }

    private C1710q0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16114a = new d(windowInsetsAnimation);
        }
    }
}
