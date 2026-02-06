package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1705o;
import androidx.core.view.C1707p;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.M;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import m1.C2185a;
import y1.C;
import y1.C2930A;

public class NestedScrollView extends FrameLayout implements G, D {

    /* renamed from: E  reason: collision with root package name */
    private static final float f16162E = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: F  reason: collision with root package name */
    private static final a f16163F = new a();

    /* renamed from: G  reason: collision with root package name */
    private static final int[] f16164G = {16843130};

    /* renamed from: A  reason: collision with root package name */
    private float f16165A;

    /* renamed from: B  reason: collision with root package name */
    private e f16166B;

    /* renamed from: C  reason: collision with root package name */
    final d f16167C;

    /* renamed from: D  reason: collision with root package name */
    C1705o f16168D;

    /* renamed from: a  reason: collision with root package name */
    private final float f16169a;

    /* renamed from: b  reason: collision with root package name */
    private long f16170b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f16171c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f16172d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f16173e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f16174f;

    /* renamed from: g  reason: collision with root package name */
    M f16175g;

    /* renamed from: h  reason: collision with root package name */
    private int f16176h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16177i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16178j;

    /* renamed from: k  reason: collision with root package name */
    private View f16179k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16180l;

    /* renamed from: m  reason: collision with root package name */
    private VelocityTracker f16181m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16182n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16183o;

    /* renamed from: p  reason: collision with root package name */
    private int f16184p;

    /* renamed from: q  reason: collision with root package name */
    private int f16185q;

    /* renamed from: r  reason: collision with root package name */
    private int f16186r;

    /* renamed from: s  reason: collision with root package name */
    private int f16187s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f16188t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f16189u;

    /* renamed from: v  reason: collision with root package name */
    private int f16190v;

    /* renamed from: w  reason: collision with root package name */
    private int f16191w;

    /* renamed from: x  reason: collision with root package name */
    private f f16192x;

    /* renamed from: y  reason: collision with root package name */
    private final H f16193y;

    /* renamed from: z  reason: collision with root package name */
    private final E f16194z;

    static class a extends C1677a {
        a() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C.a(accessibilityEvent, nestedScrollView.getScrollX());
            C.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, a10);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            a10.t0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                a10.V0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    a10.b(C2930A.a.f28611r);
                    a10.b(C2930A.a.f28578C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    a10.b(C2930A.a.f28610q);
                    a10.b(C2930A.a.f28580E);
                }
            }
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Y(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Y(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements C1707p {
        d() {
        }

        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f10);
            return true;
        }

        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        public void c() {
            NestedScrollView.this.f16172d.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f16196a;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f16196a + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16196a);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f16196a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2185a.f23596c);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f16181m;
        if (velocityTracker == null) {
            this.f16181m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f16172d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f16184p = viewConfiguration.getScaledTouchSlop();
        this.f16185q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16186r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f16181m == null) {
            this.f16181m = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f16176h = i10;
        this.f16187s = i11;
        Z(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !F((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f16171c);
        offsetDescendantRectToMyCoords(view, this.f16171c);
        if (this.f16171c.bottom + i10 < getScrollY() || this.f16171c.top - i10 > getScrollY() + i11) {
            return false;
        }
        return true;
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16194z.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16187s) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f16176h = (int) motionEvent.getY(i10);
            this.f16187s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f16181m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f16181m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16181m = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f16173e
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f16173e
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f16173e
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f16173e
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f16174f
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f16174f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f16174f
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f16174f
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    private void N(boolean z10) {
        if (z10) {
            Z(2, 1);
        } else {
            b0(1);
        }
        this.f16191w = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        View u10 = u(z10, i11, i12);
        if (u10 == null) {
            u10 = this;
        }
        if (i11 < scrollY || i12 > i14) {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            P(i13, 0, 1, true);
            z11 = true;
        }
        if (u10 != findFocus()) {
            u10.requestFocus(i10);
        }
        return z11;
    }

    private int P(int i10, int i11, int i12, boolean z10) {
        return Q(i10, -1, (MotionEvent) null, i11, i12, z10);
    }

    private void R(View view) {
        view.getDrawingRect(this.f16171c);
        offsetDescendantRectToMyCoords(view, this.f16171c);
        int g10 = g(this.f16171c);
        if (g10 != 0) {
            scrollBy(0, g10);
        }
    }

    private boolean S(Rect rect, boolean z10) {
        boolean z11;
        int g10 = g(rect);
        if (g10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, g10);
            } else {
                U(0, g10);
            }
        }
        return z11;
    }

    private boolean T(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        if (x(-i10) < d.b(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    private void V(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f16170b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f16172d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                N(z10);
            } else {
                if (!this.f16172d.isFinished()) {
                    a();
                }
                scrollBy(i10, i11);
            }
            this.f16170b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void a() {
        this.f16172d.abortAnimation();
        b0(1);
    }

    private boolean a0(MotionEvent motionEvent) {
        boolean z10;
        if (d.b(this.f16173e) != 0.0f) {
            d.d(this.f16173e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.b(this.f16174f) == 0.0f) {
            return z10;
        }
        d.d(this.f16174f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private M getScrollFeedbackProvider() {
        if (this.f16175g == null) {
            this.f16175g = M.a(this);
        }
        return this.f16175g;
    }

    private void q(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f16183o) {
            U(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    private boolean r(int i10) {
        if (d.b(this.f16173e) != 0.0f) {
            if (T(this.f16173e, i10)) {
                this.f16173e.onAbsorb(i10);
            } else {
                v(-i10);
            }
        } else if (d.b(this.f16174f) == 0.0f) {
            return false;
        } else {
            int i11 = -i10;
            if (T(this.f16174f, i11)) {
                this.f16174f.onAbsorb(i11);
            } else {
                v(i11);
            }
        }
        return true;
    }

    private void s() {
        this.f16187s = -1;
        this.f16180l = false;
        L();
        b0(0);
        this.f16173e.onRelease();
        this.f16174f.onRelease();
    }

    private View u(boolean z10, int i10, int i11) {
        boolean z11;
        boolean z12;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                if (i10 >= top || bottom >= i11) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (view == null) {
                    view = view2;
                    z13 = z11;
                } else {
                    if ((!z10 || top >= view.getTop()) && (z10 || bottom <= view.getBottom())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                        }
                    } else if (z11) {
                        view = view2;
                        z13 = true;
                    } else if (!z12) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float x(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f16169a * 0.015f)));
        float f10 = f16162E;
        return (float) (((double) (this.f16169a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i11 < childAt.getTop() - scrollY || i11 >= childAt.getBottom() - scrollY || i10 < childAt.getLeft() || i10 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z11)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z12)) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i20 = i12 + i10;
        if (!z13) {
            i18 = 0;
        } else {
            i18 = i16;
        }
        int i21 = i13 + i11;
        if (!z14) {
            i19 = 0;
        } else {
            i19 = i17;
        }
        int i22 = -i18;
        int i23 = i18 + i14;
        int i24 = -i19;
        int i25 = i19 + i15;
        if (i20 > i23) {
            i20 = i23;
            z15 = true;
        } else if (i20 < i22) {
            z15 = true;
            i20 = i22;
        } else {
            z15 = false;
        }
        if (i21 > i25) {
            i21 = i25;
            z16 = true;
        } else if (i21 < i24) {
            z16 = true;
            i21 = i24;
        } else {
            z16 = false;
        }
        if (z16 && !y(1)) {
            this.f16172d.springBack(i20, i21, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i20, i21, z15, z16);
        if (z15 || z16) {
            return true;
        }
        return false;
    }

    public boolean K(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        if (z10) {
            this.f16171c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f16171c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f16171c.top = getScrollY() - height;
            Rect rect2 = this.f16171c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f16171c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public int Q(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        int i16 = i11;
        int i17 = i12;
        int i18 = i13;
        if (i18 == 1) {
            Z(2, i18);
        }
        boolean z13 = false;
        if (l(0, i10, this.f16189u, this.f16188t, i13)) {
            i15 = i10 - this.f16189u[1];
            i14 = this.f16188t[1];
        } else {
            i15 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        if (!d() || z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i19 = scrollRange;
        if (!J(0, i15, 0, scrollY, 0, scrollRange, 0, 0, true) || y(i18)) {
            z12 = false;
        } else {
            z12 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        if (!(motionEvent == null || scrollY2 == 0)) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i16, scrollY2);
        }
        int[] iArr = this.f16189u;
        iArr[1] = 0;
        p(0, scrollY2, 0, i15 - scrollY2, this.f16188t, i13, iArr);
        int i20 = i14 + this.f16188t[1];
        int i21 = i15 - this.f16189u[1];
        int i22 = scrollY + i21;
        if (i22 < 0) {
            if (z11) {
                d.d(this.f16173e, ((float) (-i21)) / ((float) getHeight()), ((float) i17) / ((float) getWidth()));
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i16, true);
                }
                if (!this.f16174f.isFinished()) {
                    this.f16174f.onRelease();
                }
            }
        } else if (i22 > i19 && z11) {
            d.d(this.f16174f, ((float) i21) / ((float) getHeight()), 1.0f - (((float) i17) / ((float) getWidth())));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i16, false);
            }
            if (!this.f16173e.isFinished()) {
                this.f16173e.onRelease();
            }
        }
        if (!this.f16173e.isFinished() || !this.f16174f.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            z13 = z12;
        }
        if (z13 && i18 == 0 && (velocityTracker = this.f16181m) != null) {
            velocityTracker.clear();
        }
        if (i18 == 1) {
            b0(i18);
            this.f16173e.onRelease();
            this.f16174f.onRelease();
        }
        return i20;
    }

    public final void U(int i10, int i11) {
        V(i10, i11, 250, false);
    }

    public final void W(int i10, int i11) {
        X(i10, i11, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void X(int i10, int i11, int i12, boolean z10) {
        V(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10, int i11, boolean z10) {
        X(i10, i11, 250, z10);
    }

    public boolean Z(int i10, int i11) {
        return this.f16194z.p(i10, i11);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void b0(int i10) {
        this.f16194z.r(i10);
    }

    public boolean c(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f16171c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f16171c);
            P(g(this.f16171c), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f16172d.isFinished()) {
            this.f16172d.computeScrollOffset();
            int currY = this.f16172d.getCurrY();
            int h10 = h(currY - this.f16191w);
            this.f16191w = currY;
            int[] iArr = this.f16189u;
            iArr[1] = 0;
            l(0, h10, iArr, (int[]) null, 1);
            int i10 = h10 - this.f16189u[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f16172d.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                J(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.f16189u;
                iArr2[1] = 0;
                p(0, scrollY2, 0, i11, this.f16188t, 1, iArr2);
                i10 = i11 - this.f16189u[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (this.f16173e.isFinished()) {
                            this.f16173e.onAbsorb((int) this.f16172d.getCurrVelocity());
                        }
                    } else if (this.f16174f.isFinished()) {
                        this.f16174f.onAbsorb((int) this.f16172d.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f16172d.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                b0(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || t(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f16194z.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f16194z.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return l(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f16194z.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f16173e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f16173e.setSize(width, height);
            if (this.f16173e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.f16174f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f16174f.setSize(width2, height2);
            if (this.f16174f.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int g(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        } else if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        } else {
            if (rect.height() > height) {
                i11 = 0 - (i10 - rect.bottom);
            } else {
                i11 = 0 - (scrollY - rect.top);
            }
            return Math.max(i11, -getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f16193y.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public float getVerticalScrollFactorCompat() {
        if (this.f16165A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f16165A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f16165A;
    }

    /* access modifiers changed from: package-private */
    public int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && d.b(this.f16173e) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * d.d(this.f16173e, (((float) (-i10)) * 4.0f) / ((float) height), 0.5f));
            if (round != i10) {
                this.f16173e.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || d.b(this.f16174f) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) height;
            int round2 = Math.round((f10 / 4.0f) * d.d(this.f16174f, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f16174f.finish();
            }
            return i10 - round2;
        }
    }

    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public void i(View view, View view2, int i10, int i11) {
        this.f16193y.c(view, view2, i10, i11);
        Z(2, i11);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f16194z.l();
    }

    public void j(View view, int i10) {
        this.f16193y.e(view, i10);
        b0(i10);
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        l(i10, i11, iArr, (int[]) null, i12);
    }

    public boolean l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f16194z.d(i10, i11, iArr, iArr2, i12);
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, (int[]) null);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16178j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        int i11;
        if (motionEvent.getAction() == 8 && !this.f16180l) {
            if (androidx.core.view.C.a(motionEvent, 2)) {
                i11 = 9;
                f10 = motionEvent.getAxisValue(9);
                i10 = (int) motionEvent.getX();
            } else if (androidx.core.view.C.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
                i11 = 26;
                f10 = axisValue;
            } else {
                i11 = 0;
                i10 = 0;
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                Q(-((int) (f10 * getVerticalScrollFactorCompat())), i11, motionEvent, i10, 1, androidx.core.view.C.a(motionEvent, 8194));
                if (i11 == 0) {
                    return true;
                }
                this.f16168D.g(motionEvent, i11);
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f16180l) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f16187s;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f16176h) > this.f16184p && (2 & getNestedScrollAxes()) == 0) {
                                this.f16180l = true;
                                this.f16176h = y10;
                                C();
                                this.f16181m.addMovement(motionEvent);
                                this.f16190v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f16180l = false;
            this.f16187s = -1;
            L();
            if (this.f16172d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            b0(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!z((int) motionEvent.getX(), y11)) {
                if (!a0(motionEvent) && this.f16172d.isFinished()) {
                    z10 = false;
                }
                this.f16180l = z10;
                L();
            } else {
                this.f16176h = y11;
                this.f16187s = motionEvent.getPointerId(0);
                A();
                this.f16181m.addMovement(motionEvent);
                this.f16172d.computeScrollOffset();
                if (!a0(motionEvent) && this.f16172d.isFinished()) {
                    z10 = false;
                }
                this.f16180l = z10;
                Z(2, 0);
            }
        }
        return this.f16180l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f16177i = false;
        View view = this.f16179k;
        if (view != null && F(view, this)) {
            R(this.f16179k);
        }
        this.f16179k = null;
        if (!this.f16178j) {
            if (this.f16192x != null) {
                scrollTo(getScrollX(), this.f16192x.f16196a);
                this.f16192x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f10 = f(scrollY, paddingTop, i14);
            if (f10 != scrollY) {
                scrollTo(getScrollX(), f10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16178j = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f16182n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i10);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !E(view)) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f16192x = fVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f16196a = getScrollY();
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f16166B;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && G(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f16171c);
            offsetDescendantRectToMyCoords(findFocus, this.f16171c);
            q(g(this.f16171c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16190v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f16190v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f16181m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f16186r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f16187s);
                if (Math.abs(yVelocity) >= this.f16185q) {
                    if (!r(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = (float) i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            v(i10);
                        }
                    }
                } else if (this.f16172d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f16187s);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f16187s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f16176h - y10;
                    int M10 = i11 - M(i11, motionEvent.getX(findPointerIndex));
                    if (!this.f16180l && Math.abs(M10) > this.f16184p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16180l = true;
                        M10 = M10 > 0 ? M10 - this.f16184p : M10 + this.f16184p;
                    }
                    int i12 = M10;
                    if (this.f16180l) {
                        int Q10 = Q(i12, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f16176h = y10 - Q10;
                        this.f16190v += Q10;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16180l && getChildCount() > 0 && this.f16172d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16176h = (int) motionEvent.getY(actionIndex);
                this.f16187s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f16176h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16187s));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f16180l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16172d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f16181m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f16194z.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f16177i) {
            R(view2);
        } else {
            this.f16179k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return S(rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.f16177i = true;
        super.requestLayout();
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int f10 = f(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int f11 = f(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (f10 != getScrollX() || f11 != getScrollY()) {
                super.scrollTo(f10, f11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f16182n) {
            this.f16182n = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.f16194z.m(z10);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.f16166B = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f16183o = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return Z(i10, 0);
    }

    public void stopNestedScroll() {
        b0(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f16171c.setEmpty();
        int i10 = 130;
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i10 = 33;
                        }
                        K(i10);
                        return false;
                    } else if (keyCode == 92) {
                        return w(33);
                    } else {
                        if (keyCode == 93) {
                            return w(130);
                        }
                        if (keyCode == 122) {
                            K(33);
                            return false;
                        } else if (keyCode != 123) {
                            return false;
                        } else {
                            K(130);
                            return false;
                        }
                    }
                } else if (keyEvent.isAltPressed()) {
                    return w(130);
                } else {
                    return c(130);
                }
            } else if (keyEvent.isAltPressed()) {
                return w(33);
            } else {
                return c(33);
            }
        }
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f16172d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, 0, 0);
            N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f16172d.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f16171c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f16171c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f16171c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f16171c;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.f16194z.k(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16171c = new Rect();
        this.f16177i = true;
        this.f16178j = false;
        this.f16179k = null;
        this.f16180l = false;
        this.f16183o = true;
        this.f16187s = -1;
        this.f16188t = new int[2];
        this.f16189u = new int[2];
        d dVar = new d();
        this.f16167C = dVar;
        this.f16168D = new C1705o(getContext(), dVar);
        this.f16173e = d.a(context, attributeSet);
        this.f16174f = d.a(context, attributeSet);
        this.f16169a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16164G, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f16193y = new H(this);
        this.f16194z = new E(this);
        setNestedScrollingEnabled(true);
        C1680b0.o0(this, f16163F);
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
