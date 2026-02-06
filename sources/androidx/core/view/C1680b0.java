package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1677a;
import androidx.core.view.C1710q0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import m1.C2187c;
import y1.C2930A;
import y1.D;

/* renamed from: androidx.core.view.b0  reason: case insensitive filesystem */
public abstract class C1680b0 {

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap f16042a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Field f16043b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f16044c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f16045d = {C2187c.f23620b, C2187c.f23621c, C2187c.f23632n, C2187c.f23643y, C2187c.f23600B, C2187c.f23601C, C2187c.f23602D, C2187c.f23603E, C2187c.f23604F, C2187c.f23605G, C2187c.f23622d, C2187c.f23623e, C2187c.f23624f, C2187c.f23625g, C2187c.f23626h, C2187c.f23627i, C2187c.f23628j, C2187c.f23629k, C2187c.f23630l, C2187c.f23631m, C2187c.f23633o, C2187c.f23634p, C2187c.f23635q, C2187c.f23636r, C2187c.f23637s, C2187c.f23638t, C2187c.f23639u, C2187c.f23640v, C2187c.f23641w, C2187c.f23642x, C2187c.f23644z, C2187c.f23599A};

    /* renamed from: e  reason: collision with root package name */
    private static final K f16046e = new C1678a0();

    /* renamed from: f  reason: collision with root package name */
    private static final e f16047f = new e();

    /* renamed from: androidx.core.view.b0$a */
    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.b0$b */
    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public CharSequence c(View view) {
            return k.a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.b0$c */
    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public CharSequence c(View view) {
            return m.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            m.c(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.b0$d */
    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.b0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakHashMap f16048a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            boolean z10;
            int i10;
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (booleanValue != z10) {
                if (z10) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                C1680b0.X(view, i10);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            boolean z10;
            WeakHashMap weakHashMap = this.f16048a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            this.f16048a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry b10 : this.f16048a.entrySet()) {
                    b(b10);
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.b0$f */
    static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        private final int f16049a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f16050b;

        /* renamed from: c  reason: collision with root package name */
        private final int f16051c;

        /* renamed from: d  reason: collision with root package name */
        private final int f16052d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            if (Build.VERSION.SDK_INT >= this.f16051c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool == null || !bool.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 == z11) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract Object c(View view);

        /* access modifiers changed from: package-private */
        public abstract void d(View view, Object obj);

        /* access modifiers changed from: package-private */
        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f16049a);
            if (this.f16050b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                C1680b0.j(view);
                view.setTag(this.f16049a, obj);
                C1680b0.X(view, this.f16052d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f16049a = i10;
            this.f16050b = cls;
            this.f16052d = i11;
            this.f16051c = i12;
        }
    }

    /* renamed from: androidx.core.view.b0$g */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            if (C1690g0.f16088b) {
                return C1690g0.b(view, windowInsets);
            }
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.b0$h */
    private static class h {

        /* renamed from: androidx.core.view.b0$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            D0 f16053a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f16054b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ I f16055c;

            a(View view, I i10) {
                this.f16054b = view;
                this.f16055c = i10;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                D0 z10 = D0.z(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f16054b);
                    if (z10.equals(this.f16053a)) {
                        return this.f16055c.i(view, z10).x();
                    }
                }
                this.f16053a = z10;
                D0 i11 = this.f16055c.i(view, z10);
                if (i10 >= 30) {
                    return i11.x();
                }
                C1680b0.l0(view);
                return i11.x();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C2187c.f23618T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static D0 b(View view, D0 d02, Rect rect) {
            WindowInsets x10 = d02.x();
            if (x10 != null) {
                return D0.z(view.computeSystemWindowInsets(x10, rect), view);
            }
            rect.setEmpty();
            return d02;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getZ();
        }

        static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void k(View view, float f10) {
            view.setElevation(f10);
        }

        static void l(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void m(View view, I i10) {
            a aVar;
            if (i10 != null) {
                aVar = new a(view, i10);
            } else {
                aVar = null;
            }
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C2187c.f23611M, aVar);
            }
            if (view.getTag(C2187c.f23610L) == null) {
                if (aVar != null) {
                    view.setOnApplyWindowInsetsListener(aVar);
                } else {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C2187c.f23618T));
                }
            }
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.b0$i */
    private static class i {
        public static D0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            D0 y10 = D0.y(rootWindowInsets);
            y10.u(y10);
            y10.d(view.getRootView());
            return y10;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: androidx.core.view.b0$j */
    static class j {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* renamed from: androidx.core.view.b0$k */
    static class k {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* renamed from: androidx.core.view.b0$l */
    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: androidx.core.view.b0$m */
    private static class m {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.b0$n */
    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1683d b(View view, C1683d dVar) {
            ContentInfo f10 = dVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f10) {
                return dVar;
            }
            return C1683d.g(performReceiveContent);
        }
    }

    /* renamed from: androidx.core.view.b0$o */
    static class o {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList f16056d = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap f16057a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f16058b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference f16059c = null;

        o() {
        }

        static o a(View view) {
            o oVar = (o) view.getTag(C2187c.f23616R);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o();
            view.setTag(C2187c.f23616R, oVar2);
            return oVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f16057a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f16058b == null) {
                this.f16058b = new SparseArray();
            }
            return this.f16058b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(C2187c.f23617S);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.c.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f16057a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f16056d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f16057a == null) {
                            this.f16057a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = f16056d;
                            View view = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f16057a.put(view, Boolean.TRUE);
                                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f16057a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            if (c10 != null) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.ref.WeakReference} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference r0 = r5.f16059c
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r1
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f16059c = r0
                android.util.SparseArray r0 = r5.d()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L_0x0032
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L_0x0032
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                if (r4 != 0) goto L_0x0040
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L_0x0040:
                if (r4 == 0) goto L_0x0054
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x0053
                boolean r1 = r0.isAttachedToWindow()
                if (r1 == 0) goto L_0x0053
                r5.e(r0, r6)
            L_0x0053:
                return r3
            L_0x0054:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1680b0.o.f(android.view.KeyEvent):boolean");
        }
    }

    public static int A(View view) {
        return view.getLayoutDirection();
    }

    public static void A0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.b(view, i10);
        }
    }

    public static int B(View view) {
        return view.getMinimumHeight();
    }

    public static void B0(View view, boolean z10) {
        h.l(view, z10);
    }

    public static int C(View view) {
        return view.getMinimumWidth();
    }

    public static void C0(View view, I i10) {
        h.m(view, i10);
    }

    public static String[] D(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n.a(view);
        }
        return (String[]) view.getTag(C2187c.f23613O);
    }

    public static void D0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static int E(View view) {
        return view.getPaddingEnd();
    }

    public static void E0(View view, boolean z10) {
        n0().f(view, Boolean.valueOf(z10));
    }

    public static int F(View view) {
        return view.getPaddingStart();
    }

    public static void F0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static ViewParent G(View view) {
        return view.getParentForAccessibility();
    }

    public static void G0(View view, CharSequence charSequence) {
        J0().f(view, charSequence);
    }

    public static D0 H(View view) {
        return i.a(view);
    }

    public static void H0(View view, String str) {
        h.n(view, str);
    }

    public static CharSequence I(View view) {
        return (CharSequence) J0().e(view);
    }

    public static void I0(View view, C1710q0.b bVar) {
        C1710q0.d(view, bVar);
    }

    public static String J(View view) {
        return h.f(view);
    }

    private static f J0() {
        return new c(C2187c.f23615Q, CharSequence.class, 64, 30);
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void K0(View view) {
        h.o(view);
    }

    public static float L(View view) {
        return h.g(view);
    }

    public static boolean M(View view) {
        if (m(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean O(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean P(View view) {
        return view.hasTransientState();
    }

    public static boolean Q(View view) {
        Boolean bool = (Boolean) b().e(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean R(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean S(View view) {
        return view.isLaidOut();
    }

    public static boolean T(View view) {
        return h.h(view);
    }

    public static boolean U(View view) {
        return view.isPaddingRelative();
    }

    public static boolean V(View view) {
        Boolean bool = (Boolean) n0().e(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C1683d W(C1683d dVar) {
        return dVar;
    }

    static void X(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (o(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i11 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    obtain.getText().add(o(view));
                    z0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void Y(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Z(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static D0 a0(View view, D0 d02) {
        WindowInsets x10 = d02.x();
        if (x10 != null) {
            WindowInsets b10 = g.b(view, x10);
            if (!b10.equals(x10)) {
                return D0.z(b10, view);
            }
        }
        return d02;
    }

    private static f b() {
        return new d(C2187c.f23608J, Boolean.class, 28);
    }

    public static void b0(View view, C2930A a10) {
        view.onInitializeAccessibilityNodeInfo(a10.k1());
    }

    public static int c(View view, CharSequence charSequence, D d10) {
        int q10 = q(view, charSequence);
        if (q10 != -1) {
            d(view, new C2930A.a(q10, charSequence, d10));
        }
        return q10;
    }

    private static f c0() {
        return new b(C2187c.f23609K, CharSequence.class, 8, 28);
    }

    private static void d(View view, C2930A.a aVar) {
        j(view);
        j0(aVar.b(), view);
        p(view).add(aVar);
        X(view, 0);
    }

    public static boolean d0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static C1700l0 e(View view) {
        if (f16042a == null) {
            f16042a = new WeakHashMap();
        }
        C1700l0 l0Var = (C1700l0) f16042a.get(view);
        if (l0Var != null) {
            return l0Var;
        }
        C1700l0 l0Var2 = new C1700l0(view);
        f16042a.put(view, l0Var2);
        return l0Var2;
    }

    public static C1683d e0(View view, C1683d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, dVar);
        }
        J j10 = (J) view.getTag(C2187c.f23612N);
        if (j10 == null) {
            return w(view).a(dVar);
        }
        C1683d a10 = j10.a(view, dVar);
        if (a10 == null) {
            return null;
        }
        return w(view).a(a10);
    }

    public static D0 f(View view, D0 d02, Rect rect) {
        return h.b(view, d02, rect);
    }

    public static void f0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static D0 g(View view, D0 d02) {
        WindowInsets windowInsets;
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets x10 = d02.x();
        if (x10 != null) {
            if (i10 >= 30) {
                windowInsets = m.a(view, x10);
            } else {
                windowInsets = g.a(view, x10);
            }
            if (!windowInsets.equals(x10)) {
                return D0.z(windowInsets, view);
            }
        }
        return d02;
    }

    public static void g0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).b(view, keyEvent);
    }

    public static void h0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).f(keyEvent);
    }

    public static void i0(View view, int i10) {
        j0(i10, view);
        X(view, 0);
    }

    static void j(View view) {
        C1677a l10 = l(view);
        if (l10 == null) {
            l10 = new C1677a();
        }
        o0(view, l10);
    }

    private static void j0(int i10, View view) {
        List p10 = p(view);
        for (int i11 = 0; i11 < p10.size(); i11++) {
            if (((C2930A.a) p10.get(i11)).b() == i10) {
                p10.remove(i11);
                return;
            }
        }
    }

    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, C2930A.a aVar, CharSequence charSequence, D d10) {
        if (d10 == null && charSequence == null) {
            i0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, d10));
        }
    }

    public static C1677a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        if (m10 instanceof C1677a.C0283a) {
            return ((C1677a.C0283a) m10).f16038a;
        }
        return new C1677a(m10);
    }

    public static void l0(View view) {
        g.c(view);
    }

    private static View.AccessibilityDelegate m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return l.a(view);
        }
        return n(view);
    }

    public static void m0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f16044c) {
            return null;
        }
        if (f16043b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16043b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16044c = true;
                return null;
            }
        }
        try {
            Object obj = f16043b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16044c = true;
            return null;
        }
    }

    private static f n0() {
        return new a(C2187c.f23614P, Boolean.class, 28);
    }

    public static CharSequence o(View view) {
        return (CharSequence) c0().e(view);
    }

    public static void o0(View view, C1677a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m(view) instanceof C1677a.C0283a)) {
            aVar = new C1677a();
        }
        z0(view);
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    private static List p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C2187c.f23606H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C2187c.f23606H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    private static int q(View view, CharSequence charSequence) {
        boolean z10;
        List p10 = p(view);
        for (int i10 = 0; i10 < p10.size(); i10++) {
            if (TextUtils.equals(charSequence, ((C2930A.a) p10.get(i10)).c())) {
                return ((C2930A.a) p10.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f16045d;
            if (i12 >= iArr.length || i11 != -1) {
                return i11;
            }
            int i13 = iArr[i12];
            boolean z11 = true;
            for (int i14 = 0; i14 < p10.size(); i14++) {
                if (((C2930A.a) p10.get(i14)).b() != i13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 &= z10;
            }
            if (z11) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, CharSequence charSequence) {
        c0().f(view, charSequence);
        if (charSequence != null) {
            f16047f.a(view);
        } else {
            f16047f.d(view);
        }
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static Rect t(View view) {
        return view.getClipBounds();
    }

    public static void t0(View view, ColorStateList colorStateList) {
        h.i(view, colorStateList);
    }

    public static Display u(View view) {
        return view.getDisplay();
    }

    public static void u0(View view, PorterDuff.Mode mode) {
        h.j(view, mode);
    }

    public static float v(View view) {
        return h.e(view);
    }

    public static void v0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    private static K w(View view) {
        if (view instanceof K) {
            return (K) view;
        }
        return f16046e;
    }

    public static void w0(View view, float f10) {
        h.k(view, f10);
    }

    public static boolean x(View view) {
        return view.getFitsSystemWindows();
    }

    public static void x0(View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    public static int y(View view) {
        return view.getImportantForAccessibility();
    }

    public static void y0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.a(view);
        }
        return 0;
    }

    private static void z0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
