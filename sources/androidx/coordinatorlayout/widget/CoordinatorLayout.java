package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.C1680b0;
import androidx.core.view.C1712s;
import androidx.core.view.D0;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l1.C2166a;
import l1.C2167b;
import l1.C2168c;
import q1.C2429a;

public class CoordinatorLayout extends ViewGroup implements F, G {

    /* renamed from: t  reason: collision with root package name */
    static final String f15687t;

    /* renamed from: u  reason: collision with root package name */
    static final Class[] f15688u = {Context.class, AttributeSet.class};

    /* renamed from: v  reason: collision with root package name */
    static final ThreadLocal f15689v = new ThreadLocal();

    /* renamed from: w  reason: collision with root package name */
    static final Comparator f15690w = new i();

    /* renamed from: x  reason: collision with root package name */
    private static final x1.e f15691x = new x1.f(12);

    /* renamed from: a  reason: collision with root package name */
    private final List f15692a;

    /* renamed from: b  reason: collision with root package name */
    private final a f15693b;

    /* renamed from: c  reason: collision with root package name */
    private final List f15694c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f15695d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f15696e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f15697f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15698g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15699h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f15700i;

    /* renamed from: j  reason: collision with root package name */
    private View f15701j;

    /* renamed from: k  reason: collision with root package name */
    private View f15702k;

    /* renamed from: l  reason: collision with root package name */
    private g f15703l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15704m;

    /* renamed from: n  reason: collision with root package name */
    private D0 f15705n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15706o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f15707p;

    /* renamed from: q  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f15708q;

    /* renamed from: r  reason: collision with root package name */
    private I f15709r;

    /* renamed from: s  reason: collision with root package name */
    private final H f15710s;

    class a implements I {
        a() {
        }

        public D0 i(View view, D0 d02) {
            return CoordinatorLayout.this.Z(d02);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            if (d(coordinatorLayout, view) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public D0 f(CoordinatorLayout coordinatorLayout, View view, D0 d02) {
            return d02;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f15708q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f15708q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    static class i implements Comparator {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float L10 = C1680b0.L(view);
            float L11 = C1680b0.L(view2);
            if (L10 > L11) {
                return -1;
            }
            if (L10 < L11) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f15687t = str;
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A(List list) {
        int i10;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            list.add(getChildAt(i10));
        }
        Comparator comparator = f15690w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f15693b.k(view);
    }

    private void D(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f15705n != null && C1680b0.x(this) && !C1680b0.x(view)) {
            a10.left += this.f15705n.k();
            a10.top += this.f15705n.m();
            a10.right -= this.f15705n.l();
            a10.bottom -= this.f15705n.j();
        }
        Rect a11 = a();
        C1712s.a(V(fVar.f15715c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        R(a10);
        R(a11);
    }

    private void E(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            u(view2, a10);
            v(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            R(a10);
            R(a11);
        }
    }

    private void F(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int b10 = C1712s.b(W(fVar.f15715c), i11);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int x10 = x(i10) - measuredWidth;
        if (i13 == 1) {
            x10 += measuredWidth / 2;
        } else if (i13 == 5) {
            x10 += measuredWidth;
        }
        if (i14 == 16) {
            i12 = measuredHeight / 2;
        } else if (i14 != 80) {
            i12 = 0;
        } else {
            i12 = measuredHeight;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(x10, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private MotionEvent G(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private void H(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (C1680b0.S(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c e10 = fVar.e();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e10 == null || !e10.b(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            R(a11);
            if (a10.isEmpty()) {
                R(a10);
                return;
            }
            int b10 = C1712s.b(fVar.f15720h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - fVar.topMargin) - fVar.f15722j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                Y(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - fVar.bottomMargin) + fVar.f15722j) < (i14 = rect.bottom)) {
                Y(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                Y(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - fVar.leftMargin) - fVar.f15721i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                X(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - fVar.rightMargin) + fVar.f15721i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                X(view, width - i11);
            }
            if (!z12) {
                X(view, 0);
            }
            R(a10);
        }
    }

    static c M(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f15687t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f15689v;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f15688u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean N(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r6 = N(r10, r8, r14, r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean O(android.view.MotionEvent r14, int r15) {
        /*
            r13 = this;
            int r0 = r14.getActionMasked()
            java.util.List r1 = r13.f15694c
            r13.A(r1)
            int r2 = r1.size()
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
            r7 = r6
        L_0x0012:
            if (r5 >= r2) goto L_0x0082
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r9.e()
            if (r6 != 0) goto L_0x0028
            if (r7 == 0) goto L_0x0036
        L_0x0028:
            if (r0 == 0) goto L_0x0036
            if (r10 == 0) goto L_0x007f
            if (r4 != 0) goto L_0x0032
            android.view.MotionEvent r4 = r13.G(r14)
        L_0x0032:
            r13.N(r10, r8, r4, r15)
            goto L_0x007f
        L_0x0036:
            r11 = 1
            if (r7 != 0) goto L_0x006b
            if (r6 != 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            boolean r6 = r13.N(r10, r8, r14, r15)
            if (r6 == 0) goto L_0x006b
            r13.f15701j = r8
            r7 = 3
            if (r0 == r7) goto L_0x006b
            if (r0 == r11) goto L_0x006b
            r7 = r3
        L_0x004b:
            if (r7 >= r5) goto L_0x006b
            java.lang.Object r10 = r1.get(r7)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r12 = r12.e()
            if (r12 == 0) goto L_0x0068
            if (r4 != 0) goto L_0x0065
            android.view.MotionEvent r4 = r13.G(r14)
        L_0x0065:
            r13.N(r12, r10, r4, r15)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x006b:
            boolean r7 = r9.c()
            boolean r8 = r9.h(r13, r8)
            if (r8 == 0) goto L_0x0079
            if (r7 != 0) goto L_0x0079
            r7 = r11
            goto L_0x007a
        L_0x0079:
            r7 = r3
        L_0x007a:
            if (r8 == 0) goto L_0x007f
            if (r7 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0082:
            r1.clear()
            if (r4 == 0) goto L_0x008a
            r4.recycle()
        L_0x008a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.O(android.view.MotionEvent, int):boolean");
    }

    private void P() {
        this.f15692a.clear();
        this.f15693b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f z10 = z(childAt);
            z10.d(this, childAt);
            this.f15693b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (z10.b(this, childAt, childAt2)) {
                        if (!this.f15693b.d(childAt2)) {
                            this.f15693b.b(childAt2);
                        }
                        this.f15693b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f15692a.addAll(this.f15693b.j());
        Collections.reverse(this.f15692a);
    }

    private static void R(Rect rect) {
        rect.setEmpty();
        f15691x.a(rect);
    }

    private void T() {
        View view = this.f15701j;
        if (view != null) {
            c e10 = ((f) view.getLayoutParams()).e();
            if (e10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                e10.D(this, this.f15701j, obtain);
                obtain.recycle();
            }
            this.f15701j = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).l();
        }
        this.f15698g = false;
    }

    private static int U(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int V(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void X(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f15721i;
        if (i11 != i10) {
            C1680b0.Y(view, i10 - i11);
            fVar.f15721i = i10;
        }
    }

    private void Y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f15722j;
        if (i11 != i10) {
            C1680b0.Z(view, i10 - i11);
            fVar.f15722j = i10;
        }
    }

    private static Rect a() {
        Rect rect = (Rect) f15691x.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    private void a0() {
        if (C1680b0.x(this)) {
            if (this.f15709r == null) {
                this.f15709r = new a();
            }
            C1680b0.C0(this, this.f15709r);
            setSystemUiVisibility(1280);
            return;
        }
        C1680b0.C0(this, (I) null);
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c e10 = ((f) childAt.getLayoutParams()).e();
            if (e10 != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                e10.k(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int d(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void e(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private D0 f(D0 d02) {
        c e10;
        if (d02.p()) {
            return d02;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (C1680b0.x(childAt) && (e10 = ((f) childAt.getLayoutParams()).e()) != null) {
                d02 = e10.f(this, childAt, d02);
                if (d02.p()) {
                    break;
                }
            }
        }
        return d02;
    }

    private void w(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14;
        int b10 = C1712s.b(U(fVar.f15715c), i10);
        int b11 = C1712s.b(V(fVar.f15716d), i10);
        int i15 = b10 & 7;
        int i16 = b10 & 112;
        int i17 = b11 & 7;
        int i18 = b11 & 112;
        if (i17 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i17 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i18 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i18 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i15 == 1) {
            i13 -= i11 / 2;
        } else if (i15 != 5) {
            i13 -= i11;
        }
        if (i16 == 16) {
            i14 -= i12 / 2;
        } else if (i16 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    private int x(int i10) {
        int[] iArr = this.f15700i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    public boolean C(View view, int i10, int i11) {
        Rect a10 = a();
        u(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            R(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(View view, int i10) {
        c e10;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f15723k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            u(fVar.f15723k, a10);
            boolean z10 = false;
            r(view2, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(i10, a10, a12, fVar, measuredWidth, measuredHeight);
            if (!(a12.left == a11.left && a12.top == a11.top)) {
                z10 = true;
            }
            e(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                C1680b0.Y(view2, i11);
            }
            if (i12 != 0) {
                C1680b0.Z(view2, i12);
            }
            if (z10 && (e10 = fVar.e()) != null) {
                e10.h(this, view2, fVar.f15723k);
            }
            R(a10);
            R(a11);
            R(a12);
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(int i10) {
        boolean z10;
        int i11 = i10;
        int A10 = C1680b0.A(this);
        int size = this.f15692a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f15692a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f15724l == ((View) this.f15692a.get(i13))) {
                        I(view, A10);
                    }
                }
                r(view, true, a11);
                if (fVar.f15719g != 0 && !a11.isEmpty()) {
                    int b10 = C1712s.b(fVar.f15719g, A10);
                    int i14 = b10 & 112;
                    if (i14 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i14 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i15 = b10 & 7;
                    if (i15 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i15 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f15720h != 0 && view.getVisibility() == 0) {
                    H(view, a10, A10);
                }
                if (i11 != 2) {
                    y(view, a12);
                    if (!a12.equals(a11)) {
                        Q(view, a11);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = (View) this.f15692a.get(i16);
                    f fVar2 = (f) view2.getLayoutParams();
                    c e10 = fVar2.e();
                    if (e10 != null && e10.e(this, view2, view)) {
                        if (i11 != 0 || !fVar2.f()) {
                            if (i11 != 2) {
                                z10 = e10.h(this, view2, view);
                            } else {
                                e10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i11 == 1) {
                                fVar2.o(z10);
                            }
                        } else {
                            fVar2.j();
                        }
                    }
                }
            }
        }
        R(a10);
        R(a11);
        R(a12);
    }

    public void K(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f15723k;
            if (view2 != null) {
                E(view, view2, i10);
                return;
            }
            int i11 = fVar.f15717e;
            if (i11 >= 0) {
                F(view, i11, i10);
            } else {
                D(view, i10);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void L(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    /* access modifiers changed from: package-private */
    public void S() {
        if (this.f15699h && this.f15703l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f15703l);
        }
        this.f15704m = false;
    }

    /* access modifiers changed from: package-private */
    public final D0 Z(D0 d02) {
        boolean z10;
        if (x1.c.a(this.f15705n, d02)) {
            return d02;
        }
        this.f15705n = d02;
        boolean z11 = false;
        if (d02 == null || d02.m() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f15706o = z10;
        if (!z10 && getBackground() == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        D0 f10 = f(d02);
        requestLayout();
        return f10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f15699h) {
            if (this.f15703l == null) {
                this.f15703l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f15703l);
        }
        this.f15704m = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof f) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f15713a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f15695d == null) {
                    this.f15695d = new Paint();
                }
                this.f15695d.setColor(fVar.f15713a.c(this, view));
                this.f15695d.setAlpha(d(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f15695d);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15707p;
        if (drawable == null || !drawable.isStateful()) {
            z10 = false;
        } else {
            z10 = drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void g(View view) {
        ArrayList h10 = this.f15693b.h(view);
        if (h10 != null && !h10.isEmpty()) {
            for (int i10 = 0; i10 < h10.size(); i10++) {
                View view2 = (View) h10.get(i10);
                c e10 = ((f) view2.getLayoutParams()).e();
                if (e10 != null) {
                    e10.h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f15692a);
    }

    public final D0 getLastWindowInsets() {
        return this.f15705n;
    }

    public int getNestedScrollAxes() {
        return this.f15710s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f15707p;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (B(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 == this.f15704m) {
            return;
        }
        if (z10) {
            b();
        } else {
            S();
        }
    }

    public void i(View view, View view2, int i10, int i11) {
        c e10;
        this.f15710s.c(view, view2, i10, i11);
        this.f15702k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (e10 = fVar.e()) != null) {
                e10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    public void j(View view, int i10) {
        this.f15710s.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c e10 = fVar.e();
                if (e10 != null) {
                    e10.C(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f15702k = null;
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c e10;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (e10 = fVar.e()) != null) {
                    int[] iArr2 = this.f15696e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e10.q(this, childAt, view, i10, i11, iArr2, i12);
                    if (i10 > 0) {
                        min = Math.max(i13, this.f15696e[0]);
                    } else {
                        min = Math.min(i13, this.f15696e[0]);
                    }
                    i13 = min;
                    if (i11 > 0) {
                        min2 = Math.max(i14, this.f15696e[1]);
                    } else {
                        min2 = Math.min(i14, this.f15696e[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            J(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c e10;
        int min;
        boolean z10;
        int min2;
        int childCount = getChildCount();
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (e10 = fVar.e()) != null) {
                    int[] iArr2 = this.f15696e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, this.f15696e[0]);
                    } else {
                        min = Math.min(i15, this.f15696e[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        z10 = true;
                        min2 = Math.max(i16, this.f15696e[1]);
                    } else {
                        z10 = true;
                        min2 = Math.min(i16, this.f15696e[1]);
                    }
                    i16 = min2;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z11) {
            J(1);
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f15697f);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c e10 = fVar.e();
                if (e10 != null) {
                    boolean A10 = e10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A10;
                    fVar.q(i12, A10);
                } else {
                    fVar.q(i12, false);
                }
            }
        }
        return z10;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
        if (this.f15704m) {
            if (this.f15703l == null) {
                this.f15703l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f15703l);
        }
        if (this.f15705n == null && C1680b0.x(this)) {
            C1680b0.l0(this);
        }
        this.f15699h = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T();
        if (this.f15704m && this.f15703l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f15703l);
        }
        View view = this.f15702k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f15699h = false;
    }

    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f15706o && this.f15707p != null) {
            D0 d02 = this.f15705n;
            if (d02 != null) {
                i10 = d02.m();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f15707p.setBounds(0, 0, getWidth(), i10);
                this.f15707p.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        boolean O10 = O(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15701j = null;
            T();
        }
        return O10;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c e10;
        int A10 = C1680b0.A(this);
        int size = this.f15692a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f15692a.get(i14);
            if (view.getVisibility() != 8 && ((e10 = ((f) view.getLayoutParams()).e()) == null || !e10.l(this, view, A10))) {
                K(view, A10);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.P()
            r30.h()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.C1680b0.A(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.D0 r3 = r7.f15705n
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.C1680b0.x(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List r2 = r7.f15692a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x0171
            java.util.List r0 = r7.f15692a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0169
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f15717e
            if (r0 < 0) goto L_0x00bc
            if (r13 == 0) goto L_0x00bc
            int r0 = r7.x(r0)
            int r11 = r1.f15715c
            int r11 = W(r11)
            int r11 = androidx.core.view.C1712s.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00c1
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00c1
        L_0x00ba:
            r11 = 0
            goto L_0x00bf
        L_0x00bc:
            r22 = r2
            goto L_0x00ba
        L_0x00bf:
            r21 = r11
        L_0x00c1:
            if (r19 == 0) goto L_0x00f3
            boolean r0 = androidx.core.view.C1680b0.x(r20)
            if (r0 != 0) goto L_0x00f3
            androidx.core.view.D0 r0 = r7.f15705n
            int r0 = r0.k()
            androidx.core.view.D0 r2 = r7.f15705n
            int r2 = r2.l()
            int r0 = r0 + r2
            androidx.core.view.D0 r2 = r7.f15705n
            int r2 = r2.m()
            androidx.core.view.D0 r11 = r7.f15705n
            int r11 = r11.j()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f7
        L_0x00f3:
            r11 = r31
            r23 = r32
        L_0x00f7:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.e()
            if (r0 == 0) goto L_0x011f
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0139
            goto L_0x012c
        L_0x011f:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012c:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.L(r1, r2, r3, r4, r5)
        L_0x0139:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0169:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x0171:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c e10;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (e10 = fVar.e()) != null) {
                    z11 |= e10.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            J(1);
        }
        return z11;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        c e10;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (e10 = fVar.e()) != null) {
                    z10 |= e10.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f15732c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c e10 = z(childAt).e();
            if (!(id2 == -1 || e10 == null || (parcelable2 = (Parcelable) sparseArray.get(id2)) == null)) {
                e10.x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c e10 = ((f) childAt.getLayoutParams()).e();
            if (!(id2 == -1 || e10 == null || (y10 = e10.y(this, childAt)) == null)) {
                sparseArray.append(id2, y10);
            }
        }
        hVar.f15732c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f15701j;
        boolean z11 = false;
        if (view != null) {
            c e10 = ((f) view.getLayoutParams()).e();
            z10 = e10 != null ? e10.D(this, this.f15701j, motionEvent) : false;
        } else {
            z10 = O(motionEvent, 1);
            if (actionMasked != 0 && z10) {
                z11 = true;
            }
        }
        if (this.f15701j == null || actionMasked == 3) {
            z10 |= super.onTouchEvent(motionEvent);
        } else if (z11) {
            MotionEvent G10 = G(motionEvent);
            super.onTouchEvent(G10);
            G10.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15701j = null;
            T();
        }
        return z10;
    }

    /* renamed from: p */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void r(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c e10 = ((f) view.getLayoutParams()).e();
        if (e10 == null || !e10.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f15698g) {
            if (this.f15701j == null) {
                c();
            }
            T();
            this.f15698g = true;
        }
    }

    public List s(View view) {
        List i10 = this.f15693b.i(view);
        if (i10 == null) {
            return Collections.emptyList();
        }
        return i10;
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        a0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f15708q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f15707p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15707p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f15707p.setState(getDrawableState());
                }
                C2429a.g(this.f15707p, C1680b0.A(this));
                Drawable drawable4 = this.f15707p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.f15707p.setCallback(this);
            }
            C1680b0.f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = androidx.core.content.c.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f15707p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f15707p.setVisible(z10, false);
        }
    }

    public List t(View view) {
        List g10 = this.f15693b.g(view);
        if (g10 == null) {
            return Collections.emptyList();
        }
        return g10;
    }

    /* access modifiers changed from: package-private */
    public void u(View view, Rect rect) {
        b.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void v(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f15707p) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* access modifiers changed from: package-private */
    public f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f15714b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
                fVar.f15714b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.n((c) dVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f15714b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2166a.f23492a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArray;
        this.f15692a = new ArrayList();
        this.f15693b = new a();
        this.f15694c = new ArrayList();
        this.f15696e = new int[2];
        this.f15697f = new int[2];
        this.f15710s = new H(this);
        if (i10 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C2168c.f23494a, 0, C2167b.f23493a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C2168c.f23494a, i10, 0);
        }
        if (i10 == 0) {
            C1680b0.m0(this, context, C2168c.f23494a, attributeSet, typedArray, 0, C2167b.f23493a);
        } else {
            C1680b0.m0(this, context, C2168c.f23494a, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(C2168c.f23495b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f15700i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f15700i.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f15700i;
                iArr[i11] = (int) (((float) iArr[i11]) * f10);
            }
        }
        this.f15707p = typedArray.getDrawable(C2168c.f23496c);
        typedArray.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (C1680b0.y(this) == 0) {
            C1680b0.y0(this, 1);
        }
    }

    protected static class h extends F1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray f15732c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f15732c = new SparseArray(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f15732c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int i11;
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f15732c;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f15732c.keyAt(i12);
                parcelableArr[i12] = (Parcelable) this.f15732c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f15713a;

        /* renamed from: b  reason: collision with root package name */
        boolean f15714b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f15715c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f15716d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f15717e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f15718f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f15719g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f15720h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f15721i;

        /* renamed from: j  reason: collision with root package name */
        int f15722j;

        /* renamed from: k  reason: collision with root package name */
        View f15723k;

        /* renamed from: l  reason: collision with root package name */
        View f15724l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f15725m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f15726n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f15727o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f15728p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f15729q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        Object f15730r;

        public f(int i10, int i11) {
            super(i10, i11);
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f15718f);
            this.f15723k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f15724l = null;
                            this.f15723k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f15724l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f15724l = null;
                    this.f15723k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f15724l = null;
                this.f15723k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f15718f) + " to anchor view " + view);
            }
        }

        private boolean r(View view, int i10) {
            int b10 = C1712s.b(((f) view.getLayoutParams()).f15719g, i10);
            if (b10 == 0 || (C1712s.b(this.f15720h, i10) & b10) != b10) {
                return false;
            }
            return true;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f15723k.getId() != this.f15718f) {
                return false;
            }
            View view2 = this.f15723k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f15724l = null;
                    this.f15723k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f15724l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.f15723k != null || this.f15718f == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            if (view2 == this.f15724l || r(view2, C1680b0.A(coordinatorLayout)) || ((cVar = this.f15713a) != null && cVar.e(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f15713a == null) {
                this.f15725m = false;
            }
            return this.f15725m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f15718f == -1) {
                this.f15724l = null;
                this.f15723k = null;
                return null;
            }
            if (this.f15723k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f15723k;
        }

        public c e() {
            return this.f15713a;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f15728p;
        }

        /* access modifiers changed from: package-private */
        public Rect g() {
            return this.f15729q;
        }

        /* access modifiers changed from: package-private */
        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10;
            boolean z11 = this.f15725m;
            if (z11) {
                return true;
            }
            c cVar = this.f15713a;
            if (cVar != null) {
                z10 = cVar.a(coordinatorLayout, view);
            } else {
                z10 = false;
            }
            boolean z12 = z10 | z11;
            this.f15725m = z12;
            return z12;
        }

        /* access modifiers changed from: package-private */
        public boolean i(int i10) {
            if (i10 == 0) {
                return this.f15726n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f15727o;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f15728p = false;
        }

        /* access modifiers changed from: package-private */
        public void k(int i10) {
            q(i10, false);
        }

        /* access modifiers changed from: package-private */
        public void l() {
            this.f15725m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f15713a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f15713a = cVar;
                this.f15730r = null;
                this.f15714b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void o(boolean z10) {
            this.f15728p = z10;
        }

        /* access modifiers changed from: package-private */
        public void p(Rect rect) {
            this.f15729q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f15726n = z10;
            } else if (i10 == 1) {
                this.f15727o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2168c.f23497d);
            this.f15715c = obtainStyledAttributes.getInteger(C2168c.f23498e, 0);
            this.f15718f = obtainStyledAttributes.getResourceId(C2168c.f23499f, -1);
            this.f15716d = obtainStyledAttributes.getInteger(C2168c.f23500g, 0);
            this.f15717e = obtainStyledAttributes.getInteger(C2168c.f23504k, -1);
            this.f15719g = obtainStyledAttributes.getInt(C2168c.f23503j, 0);
            this.f15720h = obtainStyledAttributes.getInt(C2168c.f23502i, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C2168c.f23501h);
            this.f15714b = hasValue;
            if (hasValue) {
                this.f15713a = CoordinatorLayout.M(context, attributeSet, obtainStyledAttributes.getString(C2168c.f23501h));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f15713a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
