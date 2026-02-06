package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.core.view.I;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import y1.C2930A;

public class ViewPager extends ViewGroup {

    /* renamed from: A0  reason: collision with root package name */
    private static final Interpolator f18493A0 = new b();

    /* renamed from: B0  reason: collision with root package name */
    private static final l f18494B0 = new l();

    /* renamed from: y0  reason: collision with root package name */
    static final int[] f18495y0 = {16842931};

    /* renamed from: z0  reason: collision with root package name */
    private static final Comparator f18496z0 = new a();

    /* renamed from: A  reason: collision with root package name */
    private int f18497A;

    /* renamed from: B  reason: collision with root package name */
    private int f18498B;

    /* renamed from: C  reason: collision with root package name */
    private int f18499C;

    /* renamed from: D  reason: collision with root package name */
    private float f18500D;

    /* renamed from: E  reason: collision with root package name */
    private float f18501E;

    /* renamed from: F  reason: collision with root package name */
    private float f18502F;

    /* renamed from: G  reason: collision with root package name */
    private float f18503G;

    /* renamed from: H  reason: collision with root package name */
    private int f18504H = -1;

    /* renamed from: I  reason: collision with root package name */
    private VelocityTracker f18505I;

    /* renamed from: a  reason: collision with root package name */
    private int f18506a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f18507b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final f f18508c = new f();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f18509d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    a f18510e;

    /* renamed from: f  reason: collision with root package name */
    int f18511f;

    /* renamed from: f0  reason: collision with root package name */
    private int f18512f0;

    /* renamed from: g  reason: collision with root package name */
    private int f18513g = -1;

    /* renamed from: g0  reason: collision with root package name */
    private int f18514g0;

    /* renamed from: h  reason: collision with root package name */
    private Parcelable f18515h = null;

    /* renamed from: h0  reason: collision with root package name */
    private int f18516h0;

    /* renamed from: i  reason: collision with root package name */
    private ClassLoader f18517i = null;

    /* renamed from: i0  reason: collision with root package name */
    private int f18518i0;

    /* renamed from: j  reason: collision with root package name */
    private Scroller f18519j;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f18520j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f18521k;

    /* renamed from: k0  reason: collision with root package name */
    private EdgeEffect f18522k0;

    /* renamed from: l  reason: collision with root package name */
    private j f18523l;

    /* renamed from: l0  reason: collision with root package name */
    private EdgeEffect f18524l0;

    /* renamed from: m  reason: collision with root package name */
    private int f18525m;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f18526m0 = true;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f18527n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f18528n0 = false;

    /* renamed from: o  reason: collision with root package name */
    private int f18529o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f18530o0;

    /* renamed from: p  reason: collision with root package name */
    private int f18531p;

    /* renamed from: p0  reason: collision with root package name */
    private int f18532p0;

    /* renamed from: q  reason: collision with root package name */
    private float f18533q = -3.4028235E38f;

    /* renamed from: q0  reason: collision with root package name */
    private List f18534q0;

    /* renamed from: r  reason: collision with root package name */
    private float f18535r = Float.MAX_VALUE;

    /* renamed from: r0  reason: collision with root package name */
    private i f18536r0;

    /* renamed from: s  reason: collision with root package name */
    private int f18537s;

    /* renamed from: s0  reason: collision with root package name */
    private i f18538s0;

    /* renamed from: t  reason: collision with root package name */
    private int f18539t;

    /* renamed from: t0  reason: collision with root package name */
    private List f18540t0;

    /* renamed from: u  reason: collision with root package name */
    private boolean f18541u;

    /* renamed from: u0  reason: collision with root package name */
    private int f18542u0;

    /* renamed from: v  reason: collision with root package name */
    private boolean f18543v;

    /* renamed from: v0  reason: collision with root package name */
    private ArrayList f18544v0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f18545w;

    /* renamed from: w0  reason: collision with root package name */
    private final Runnable f18546w0 = new c();

    /* renamed from: x  reason: collision with root package name */
    private int f18547x = 1;

    /* renamed from: x0  reason: collision with root package name */
    private int f18548x0 = 0;

    /* renamed from: y  reason: collision with root package name */
    private boolean f18549y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f18550z;

    static class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f18555b - fVar2.f18555b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.C();
        }
    }

    class d implements I {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f18552a = new Rect();

        d() {
        }

        public D0 i(View view, D0 d02) {
            D0 a02 = C1680b0.a0(view, d02);
            if (a02.p()) {
                return a02;
            }
            Rect rect = this.f18552a;
            rect.left = a02.k();
            rect.top = a02.m();
            rect.right = a02.l();
            rect.bottom = a02.j();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                D0 g10 = C1680b0.g(ViewPager.this.getChildAt(i10), a02);
                rect.left = Math.min(g10.k(), rect.left);
                rect.top = Math.min(g10.m(), rect.top);
                rect.right = Math.min(g10.l(), rect.right);
                rect.bottom = Math.min(g10.j(), rect.bottom);
            }
            return a02.r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f18554a;

        /* renamed from: b  reason: collision with root package name */
        int f18555b;

        /* renamed from: c  reason: collision with root package name */
        boolean f18556c;

        /* renamed from: d  reason: collision with root package name */
        float f18557d;

        /* renamed from: e  reason: collision with root package name */
        float f18558e;

        f() {
        }
    }

    class h extends C1677a {
        h() {
        }

        private boolean c() {
            a aVar = ViewPager.this.f18510e;
            if (aVar == null || aVar.getCount() <= 1) {
                return false;
            }
            return true;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(c());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f18510e) != null) {
                accessibilityEvent.setItemCount(aVar.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.f18511f);
                accessibilityEvent.setToIndex(ViewPager.this.f18511f);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.t0(ViewPager.class.getName());
            a10.V0(c());
            if (ViewPager.this.canScrollHorizontally(1)) {
                a10.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                a10.a(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f18511f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f18511f + 1);
                return true;
            }
        }
    }

    public interface i {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    private class j extends DataSetObserver {
        j() {
        }

        public void onChanged() {
            ViewPager.this.g();
        }

        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class k extends F1.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f18567c;

        /* renamed from: d  reason: collision with root package name */
        Parcelable f18568d;

        /* renamed from: e  reason: collision with root package name */
        ClassLoader f18569e;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            /* renamed from: c */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f18567c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f18567c);
            parcel.writeParcelable(this.f18568d, i10);
        }

        k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f18567c = parcel.readInt();
            this.f18568d = parcel.readParcelable(classLoader);
            this.f18569e = classLoader;
        }
    }

    static class l implements Comparator {
        l() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f18559a;
            if (z10 == gVar2.f18559a) {
                return gVar.f18563e - gVar2.f18563e;
            }
            if (z10) {
                return 1;
            }
            return -1;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
    }

    private boolean A(int i10) {
        if (this.f18507b.size() != 0) {
            f r10 = r();
            int clientWidth = getClientWidth();
            int i11 = this.f18525m;
            int i12 = clientWidth + i11;
            float f10 = (float) clientWidth;
            int i13 = r10.f18555b;
            float f11 = ((((float) i10) / f10) - r10.f18558e) / (r10.f18557d + (((float) i11) / f10));
            this.f18530o0 = false;
            w(i13, f11, (int) (((float) i12) * f11));
            if (this.f18530o0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f18526m0) {
            return false;
        } else {
            this.f18530o0 = false;
            w(0, 0.0f, 0);
            if (this.f18530o0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean B(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f18500D - f10;
        this.f18500D = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.f18533q * clientWidth;
        float f13 = this.f18535r * clientWidth;
        boolean z12 = false;
        f fVar = (f) this.f18507b.get(0);
        ArrayList arrayList = this.f18507b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f18555b != 0) {
            f12 = fVar.f18558e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f18555b != this.f18510e.getCount() - 1) {
            f13 = fVar2.f18558e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f18522k0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f18524l0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f18500D += scrollX - ((float) i10);
        scrollTo(i10, getScrollY());
        A(i10);
        return z12;
    }

    private void E(int i10, int i11, int i12, int i13) {
        float f10;
        if (i11 <= 0 || this.f18507b.isEmpty()) {
            f s10 = s(this.f18511f);
            if (s10 != null) {
                f10 = Math.min(s10.f18558e, this.f18535r);
            } else {
                f10 = 0.0f;
            }
            int paddingLeft = (int) (f10 * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                f(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.f18519j.isFinished()) {
            this.f18519j.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12))), getScrollY());
        }
    }

    private void F() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f18559a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void G(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean H() {
        this.f18504H = -1;
        m();
        this.f18522k0.onRelease();
        this.f18524l0.onRelease();
        if (this.f18522k0.isFinished() || this.f18524l0.isFinished()) {
            return true;
        }
        return false;
    }

    private void I(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        f s10 = s(i10);
        if (s10 != null) {
            i12 = (int) (((float) getClientWidth()) * Math.max(this.f18533q, Math.min(s10.f18558e, this.f18535r)));
        } else {
            i12 = 0;
        }
        if (z10) {
            M(i12, 0, i11);
            if (z11) {
                j(i10);
                return;
            }
            return;
        }
        if (z11) {
            j(i10);
        }
        f(false);
        scrollTo(i12, 0);
        A(i12);
    }

    private void N() {
        if (this.f18542u0 != 0) {
            ArrayList arrayList = this.f18544v0;
            if (arrayList == null) {
                this.f18544v0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f18544v0.add(getChildAt(i10));
            }
            Collections.sort(this.f18544v0, f18494B0);
        }
    }

    private void d(f fVar, int i10, f fVar2) {
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int count = this.f18510e.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f10 = ((float) this.f18525m) / ((float) clientWidth);
        } else {
            f10 = 0.0f;
        }
        if (fVar2 != null) {
            int i13 = fVar2.f18555b;
            int i14 = fVar.f18555b;
            if (i13 < i14) {
                float f13 = fVar2.f18558e + fVar2.f18557d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f18555b && i16 < this.f18507b.size()) {
                    Object obj = this.f18507b.get(i16);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i15 > fVar4.f18555b && i16 < this.f18507b.size() - 1) {
                            i16++;
                            obj = this.f18507b.get(i16);
                        }
                    }
                    while (i15 < fVar4.f18555b) {
                        f13 += this.f18510e.getPageWidth(i15) + f10;
                        i15++;
                    }
                    fVar4.f18558e = f13;
                    f13 += fVar4.f18557d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f18507b.size() - 1;
                float f14 = fVar2.f18558e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f18555b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f18507b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i13 < fVar3.f18555b && size > 0) {
                            size--;
                            obj2 = this.f18507b.get(size);
                        }
                    }
                    while (i13 > fVar3.f18555b) {
                        f14 -= this.f18510e.getPageWidth(i13) + f10;
                        i13--;
                    }
                    f14 -= fVar3.f18557d + f10;
                    fVar3.f18558e = f14;
                }
            }
        }
        int size2 = this.f18507b.size();
        float f15 = fVar.f18558e;
        int i17 = fVar.f18555b;
        int i18 = i17 - 1;
        if (i17 == 0) {
            f11 = f15;
        } else {
            f11 = -3.4028235E38f;
        }
        this.f18533q = f11;
        int i19 = count - 1;
        if (i17 == i19) {
            f12 = (fVar.f18557d + f15) - 1.0f;
        } else {
            f12 = Float.MAX_VALUE;
        }
        this.f18535r = f12;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar5 = (f) this.f18507b.get(i20);
            while (true) {
                i12 = fVar5.f18555b;
                if (i18 <= i12) {
                    break;
                }
                f15 -= this.f18510e.getPageWidth(i18) + f10;
                i18--;
            }
            f15 -= fVar5.f18557d + f10;
            fVar5.f18558e = f15;
            if (i12 == 0) {
                this.f18533q = f15;
            }
            i20--;
            i18--;
        }
        float f16 = fVar.f18558e + fVar.f18557d + f10;
        int i21 = fVar.f18555b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar6 = (f) this.f18507b.get(i22);
            while (true) {
                i11 = fVar6.f18555b;
                if (i21 >= i11) {
                    break;
                }
                f16 += this.f18510e.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f18535r = (fVar6.f18557d + f16) - 1.0f;
            }
            fVar6.f18558e = f16;
            f16 += fVar6.f18557d + f10;
            i22++;
            i21++;
        }
        this.f18528n0 = false;
    }

    private void f(boolean z10) {
        boolean z11;
        if (this.f18548x0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f18519j.isFinished()) {
                this.f18519j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f18519j.getCurrX();
                int currY = this.f18519j.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.f18545w = false;
        for (int i10 = 0; i10 < this.f18507b.size(); i10++) {
            f fVar = (f) this.f18507b.get(i10);
            if (fVar.f18556c) {
                fVar.f18556c = false;
                z11 = true;
            }
        }
        if (!z11) {
            return;
        }
        if (z10) {
            C1680b0.g0(this, this.f18546w0);
        } else {
            this.f18546w0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int h(int i10, float f10, int i11, int i12) {
        float f11;
        if (Math.abs(i12) <= this.f18516h0 || Math.abs(i11) <= this.f18512f0) {
            if (i10 >= this.f18511f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i10 += (int) (f10 + f11);
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f18507b.size() <= 0) {
            return i10;
        }
        ArrayList arrayList = this.f18507b;
        return Math.max(((f) this.f18507b.get(0)).f18555b, Math.min(i10, ((f) arrayList.get(arrayList.size() - 1)).f18555b));
    }

    private void i(int i10, float f10, int i11) {
        i iVar = this.f18536r0;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
        List list = this.f18534q0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                i iVar2 = (i) this.f18534q0.get(i12);
                if (iVar2 != null) {
                    iVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        i iVar3 = this.f18538s0;
        if (iVar3 != null) {
            iVar3.onPageScrolled(i10, f10, i11);
        }
    }

    private void j(int i10) {
        i iVar = this.f18536r0;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
        List list = this.f18534q0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.f18534q0.get(i11);
                if (iVar2 != null) {
                    iVar2.onPageSelected(i10);
                }
            }
        }
        i iVar3 = this.f18538s0;
        if (iVar3 != null) {
            iVar3.onPageSelected(i10);
        }
    }

    private void k(int i10) {
        i iVar = this.f18536r0;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
        List list = this.f18534q0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.f18534q0.get(i11);
                if (iVar2 != null) {
                    iVar2.onPageScrollStateChanged(i10);
                }
            }
        }
        i iVar3 = this.f18538s0;
        if (iVar3 != null) {
            iVar3.onPageScrollStateChanged(i10);
        }
    }

    private void m() {
        this.f18549y = false;
        this.f18550z = false;
        VelocityTracker velocityTracker = this.f18505I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18505I = null;
        }
    }

    private Rect o(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f r() {
        float f10;
        float f11;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            f10 = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = ((float) this.f18525m) / ((float) clientWidth);
        } else {
            f11 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f13 = 0.0f;
        while (i11 < this.f18507b.size()) {
            f fVar2 = (f) this.f18507b.get(i11);
            if (!z10 && fVar2.f18555b != (i10 = i12 + 1)) {
                fVar2 = this.f18508c;
                fVar2.f18558e = f12 + f13 + f11;
                fVar2.f18555b = i10;
                fVar2.f18557d = this.f18510e.getPageWidth(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f12 = fVar3.f18558e;
            float f14 = fVar3.f18557d + f12 + f11;
            if (!z10 && f10 < f12) {
                return fVar;
            }
            if (f10 < f14 || i11 == this.f18507b.size() - 1) {
                return fVar3;
            }
            int i13 = fVar3.f18555b;
            float f15 = fVar3.f18557d;
            i11++;
            z10 = false;
            f fVar4 = fVar3;
            i12 = i13;
            f13 = f15;
            fVar = fVar4;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f18543v != z10) {
            this.f18543v = z10;
        }
    }

    private static boolean u(View view) {
        if (view.getClass().getAnnotation(e.class) != null) {
            return true;
        }
        return false;
    }

    private boolean v(float f10, float f11) {
        if ((f10 >= ((float) this.f18498B) || f11 <= 0.0f) && (f10 <= ((float) (getWidth() - this.f18498B)) || f11 >= 0.0f)) {
            return false;
        }
        return true;
    }

    private void x(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f18504H) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f18500D = motionEvent.getX(i10);
            this.f18504H = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f18505I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        D(this.f18511f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f18511f
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.s(r2)
            r0.f18511f = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f18510e
            if (r1 != 0) goto L_0x0018
            r17.N()
            return
        L_0x0018:
            boolean r1 = r0.f18545w
            if (r1 == 0) goto L_0x0020
            r17.N()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f18510e
            r1.startUpdate((android.view.ViewGroup) r0)
            int r1 = r0.f18547x
            int r4 = r0.f18511f
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f18510e
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.f18511f
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f18506a
            if (r6 != r7) goto L_0x020f
            r7 = r5
        L_0x004a:
            java.util.ArrayList r8 = r0.f18507b
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList r8 = r0.f18507b
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            int r9 = r8.f18555b
            int r10 = r0.f18511f
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f18511f
            androidx.viewpager.widget.ViewPager$f r8 = r0.a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList r11 = r0.f18507b
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = r9
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f18557d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f18511f
            int r3 = r3 + -1
            r15 = r9
        L_0x009d:
            if (r3 < 0) goto L_0x00fe
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00ce
            if (r3 >= r4) goto L_0x00ce
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fe
        L_0x00a8:
            int r5 = r11.f18555b
            if (r3 != r5) goto L_0x00fa
            boolean r5 = r11.f18556c
            if (r5 != 0) goto L_0x00fa
            java.util.ArrayList r5 = r0.f18507b
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f18510e
            java.lang.Object r11 = r11.f18554a
            r5.destroyItem((android.view.ViewGroup) r0, (int) r3, (java.lang.Object) r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00cb
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r11 = r5
            goto L_0x00fa
        L_0x00ce:
            if (r11 == 0) goto L_0x00e4
            int r5 = r11.f18555b
            if (r3 != r5) goto L_0x00e4
            float r5 = r11.f18557d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00cb
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00cc
        L_0x00e4:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r3, r5)
            float r5 = r5.f18557d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00cb
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00cc
        L_0x00fa:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fe:
            float r3 = r8.f18557d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0190
            java.util.ArrayList r5 = r0.f18507b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0117
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            if (r12 > 0) goto L_0x011c
            r10 = r9
            goto L_0x0124
        L_0x011c:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0124:
            int r11 = r0.f18511f
        L_0x0126:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0190
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x015a
            if (r11 <= r1) goto L_0x015a
            if (r5 != 0) goto L_0x0133
            goto L_0x0190
        L_0x0133:
            int r12 = r5.f18555b
            if (r11 != r12) goto L_0x018f
            boolean r12 = r5.f18556c
            if (r12 != 0) goto L_0x018f
            java.util.ArrayList r12 = r0.f18507b
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f18510e
            java.lang.Object r5 = r5.f18554a
            r12.destroyItem((android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r5)
            java.util.ArrayList r5 = r0.f18507b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0158
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x018f
        L_0x0158:
            r5 = 0
            goto L_0x018f
        L_0x015a:
            if (r5 == 0) goto L_0x0176
            int r12 = r5.f18555b
            if (r11 != r12) goto L_0x0176
            float r5 = r5.f18557d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList r5 = r0.f18507b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0158
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x018f
        L_0x0176:
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f18557d
            float r3 = r3 + r5
            java.util.ArrayList r5 = r0.f18507b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0158
            java.util.ArrayList r5 = r0.f18507b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
        L_0x018f:
            goto L_0x0126
        L_0x0190:
            r0.d(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f18510e
            int r2 = r0.f18511f
            java.lang.Object r3 = r8.f18554a
            r1.setPrimaryItem((android.view.ViewGroup) r0, (int) r2, (java.lang.Object) r3)
        L_0x019c:
            androidx.viewpager.widget.a r1 = r0.f18510e
            r1.finishUpdate((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a6:
            if (r2 >= r1) goto L_0x01cf
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.g) r4
            r4.f18564f = r2
            boolean r5 = r4.f18559a
            if (r5 != 0) goto L_0x01cc
            float r5 = r4.f18561c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cc
            androidx.viewpager.widget.ViewPager$f r3 = r0.q(r3)
            if (r3 == 0) goto L_0x01cc
            float r5 = r3.f18557d
            r4.f18561c = r5
            int r3 = r3.f18555b
            r4.f18563e = r3
        L_0x01cc:
            int r2 = r2 + 1
            goto L_0x01a6
        L_0x01cf:
            r17.N()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020e
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e3
            androidx.viewpager.widget.ViewPager$f r3 = r0.p(r1)
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            if (r3 == 0) goto L_0x01ec
            int r1 = r3.f18555b
            int r2 = r0.f18511f
            if (r1 == r2) goto L_0x020e
        L_0x01ec:
            r5 = 0
        L_0x01ed:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020e
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.q(r1)
            if (r2 == 0) goto L_0x020b
            int r2 = r2.f18555b
            int r3 = r0.f18511f
            if (r2 != r3) goto L_0x020b
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020b
            goto L_0x020e
        L_0x020b:
            int r5 = r5 + 1
            goto L_0x01ed
        L_0x020e:
            return
        L_0x020f:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021c }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021c }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021c }
            goto L_0x0224
        L_0x021c:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0224:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f18506a
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f18510e
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int):void");
    }

    public void J(int i10, boolean z10) {
        this.f18545w = false;
        K(i10, z10, false);
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, boolean z10, boolean z11) {
        L(i10, z10, z11, 0);
    }

    /* access modifiers changed from: package-private */
    public void L(int i10, boolean z10, boolean z11, int i11) {
        a aVar = this.f18510e;
        boolean z12 = false;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z11 || this.f18511f != i10 || this.f18507b.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f18510e.getCount()) {
                i10 = this.f18510e.getCount() - 1;
            }
            int i12 = this.f18547x;
            int i13 = this.f18511f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f18507b.size(); i14++) {
                    ((f) this.f18507b.get(i14)).f18556c = true;
                }
            }
            if (this.f18511f != i10) {
                z12 = true;
            }
            if (this.f18526m0) {
                this.f18511f = i10;
                if (z12) {
                    j(i10);
                }
                requestLayout();
                return;
            }
            D(i10);
            I(i10, z10, i11, z12);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(int i10, int i11, int i12) {
        int scrollX;
        int i13;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f18519j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            if (this.f18521k) {
                scrollX = this.f18519j.getCurrX();
            } else {
                scrollX = this.f18519j.getStartX();
            }
            this.f18519j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i10 - i14;
        int i16 = i11 - scrollY;
        if (i15 == 0 && i16 == 0) {
            f(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f10 = (float) clientWidth;
        float f11 = (float) i17;
        float l10 = f11 + (l(Math.min(1.0f, (((float) Math.abs(i15)) * 1.0f) / f10)) * f11);
        int abs = Math.abs(i12);
        if (abs > 0) {
            i13 = Math.round(Math.abs(l10 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i13 = (int) (((((float) Math.abs(i15)) / ((f10 * this.f18510e.getPageWidth(this.f18511f)) + ((float) this.f18525m))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i13, 600);
        this.f18521k = false;
        this.f18519j.startScroll(i14, scrollY, i15, i16, min);
        C1680b0.f0(this);
    }

    /* access modifiers changed from: package-private */
    public f a(int i10, int i11) {
        f fVar = new f();
        fVar.f18555b = i10;
        fVar.f18554a = this.f18510e.instantiateItem((ViewGroup) this, i10);
        fVar.f18557d = this.f18510e.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.f18507b.size()) {
            this.f18507b.add(fVar);
        } else {
            this.f18507b.add(i11, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        f q10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (q10 = q(childAt)) != null && q10.f18555b == this.f18511f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        f q10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (q10 = q(childAt)) != null && q10.f18555b == this.f18511f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean u10 = gVar.f18559a | u(view);
        gVar.f18559a = u10;
        if (!this.f18541u) {
            super.addView(view, i10, layoutParams);
        } else if (!u10) {
            gVar.f18562d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(i iVar) {
        if (this.f18534q0 == null) {
            this.f18534q0 = new ArrayList();
        }
        this.f18534q0.add(iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0063
        L_0x0009:
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r4) goto L_0x0016
            goto L_0x0063
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L_0x002f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002f
        L_0x0048:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L_0x0007
        L_0x0063:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L_0x00b3
            if (r1 == r0) goto L_0x00b3
            if (r5 != r3) goto L_0x0093
            android.graphics.Rect r2 = r4.f18509d
            android.graphics.Rect r2 = r4.o(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f18509d
            android.graphics.Rect r3 = r4.o(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x008e
            if (r2 < r3) goto L_0x008e
            boolean r0 = r4.y()
            goto L_0x00ca
        L_0x008e:
            boolean r0 = r1.requestFocus()
            goto L_0x00ca
        L_0x0093:
            if (r5 != r2) goto L_0x00bf
            android.graphics.Rect r2 = r4.f18509d
            android.graphics.Rect r2 = r4.o(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f18509d
            android.graphics.Rect r3 = r4.o(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x00ae
            if (r2 > r3) goto L_0x00ae
            boolean r0 = r4.z()
            goto L_0x00ca
        L_0x00ae:
            boolean r0 = r1.requestFocus()
            goto L_0x00ca
        L_0x00b3:
            if (r5 == r3) goto L_0x00c6
            r0 = 1
            if (r5 != r0) goto L_0x00b9
            goto L_0x00c6
        L_0x00b9:
            if (r5 == r2) goto L_0x00c1
            r0 = 2
            if (r5 != r0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r0 = 0
            goto L_0x00ca
        L_0x00c1:
            boolean r0 = r4.z()
            goto L_0x00ca
        L_0x00c6:
            boolean r0 = r4.y()
        L_0x00ca:
            if (r0 == 0) goto L_0x00d3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public boolean canScrollHorizontally(int i10) {
        if (this.f18510e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f18533q))) {
                return true;
            }
            return false;
        } else if (i10 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f18535r))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof g) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void computeScroll() {
        this.f18521k = true;
        if (this.f18519j.isFinished() || !this.f18519j.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f18519j.getCurrX();
        int currY = this.f18519j.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.f18519j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C1680b0.f0(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || n(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f q10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (q10 = q(childAt)) != null && q10.f18555b == this.f18511f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f18510e) != null && aVar.getCount() > 1)) {
            if (!this.f18522k0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f18533q * ((float) width));
                this.f18522k0.setSize(height, width);
                z10 = this.f18522k0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f18524l0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f18535r + 1.0f)) * ((float) width2));
                this.f18524l0.setSize(height2, width2);
                z10 |= this.f18524l0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f18522k0.finish();
            this.f18524l0.finish();
        }
        if (z10) {
            C1680b0.f0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f18527n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean e(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom()) {
                    if (e(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z10 || !view.canScrollHorizontally(-i10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z10;
        int count = this.f18510e.getCount();
        this.f18506a = count;
        if (this.f18507b.size() >= (this.f18547x * 2) + 1 || this.f18507b.size() >= count) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i10 = this.f18511f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f18507b.size()) {
            f fVar = (f) this.f18507b.get(i11);
            int itemPosition = this.f18510e.getItemPosition(fVar.f18554a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f18507b.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f18510e.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f18510e.destroyItem((ViewGroup) this, fVar.f18555b, fVar.f18554a);
                    int i12 = this.f18511f;
                    if (i12 == fVar.f18555b) {
                        i10 = Math.max(0, Math.min(i12, count - 1));
                    }
                } else {
                    int i13 = fVar.f18555b;
                    if (i13 != itemPosition) {
                        if (i13 == this.f18511f) {
                            i10 = itemPosition;
                        }
                        fVar.f18555b = itemPosition;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f18510e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f18507b, f18496z0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f18559a) {
                    gVar.f18561c = 0.0f;
                }
            }
            K(i10, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f18510e;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f18542u0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) ((View) this.f18544v0.get(i11)).getLayoutParams()).f18564f;
    }

    public int getCurrentItem() {
        return this.f18511f;
    }

    public int getOffscreenPageLimit() {
        return this.f18547x;
    }

    public int getPageMargin() {
        return this.f18525m;
    }

    /* access modifiers changed from: package-private */
    public float l(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    public boolean n(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return z();
                } else {
                    return c(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return y();
            } else {
                return c(17);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18526m0 = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f18546w0);
        Scroller scroller = this.f18519j;
        if (scroller != null && !scroller.isFinished()) {
            this.f18519j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f18525m
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.f18527n
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r1 = r0.f18507b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            androidx.viewpager.widget.a r1 = r0.f18510e
            if (r1 == 0) goto L_0x00a8
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f18525m
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList r5 = r0.f18507b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            float r7 = r5.f18558e
            java.util.ArrayList r8 = r0.f18507b
            int r8 = r8.size()
            int r9 = r5.f18555b
            java.util.ArrayList r10 = r0.f18507b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.f) r10
            int r10 = r10.f18555b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a8
        L_0x0047:
            int r11 = r5.f18555b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList r5 = r0.f18507b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f18558e
            float r11 = r5.f18557d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x006f
        L_0x0064:
            androidx.viewpager.widget.a r11 = r0.f18510e
            float r11 = r11.getPageWidth(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x006f:
            int r11 = r0.f18525m
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            android.graphics.drawable.Drawable r11 = r0.f18527n
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f18529o
            int r15 = r0.f18525m
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f18531p
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f18527n
            r11 = r18
            r3.draw(r11)
            goto L_0x009b
        L_0x0097:
            r11 = r18
            r16 = r3
        L_0x009b:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.f18549y) {
                return true;
            }
            if (this.f18550z) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f18502F = x10;
            this.f18500D = x10;
            float y10 = motionEvent.getY();
            this.f18503G = y10;
            this.f18501E = y10;
            this.f18504H = motionEvent2.getPointerId(0);
            this.f18550z = false;
            this.f18521k = true;
            this.f18519j.computeScrollOffset();
            if (this.f18548x0 != 2 || Math.abs(this.f18519j.getFinalX() - this.f18519j.getCurrX()) <= this.f18518i0) {
                f(false);
                this.f18549y = false;
            } else {
                this.f18519j.abortAnimation();
                this.f18545w = false;
                C();
                this.f18549y = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f18504H;
            if (i10 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i10);
                float x11 = motionEvent2.getX(findPointerIndex);
                float f11 = x11 - this.f18500D;
                float abs = Math.abs(f11);
                float y11 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f18503G);
                int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i11 != 0 && !v(this.f18500D, f11)) {
                    if (e(this, false, (int) f11, (int) x11, (int) y11)) {
                        this.f18500D = x11;
                        this.f18501E = y11;
                        this.f18550z = true;
                        return false;
                    }
                }
                int i12 = this.f18499C;
                if (abs > ((float) i12) && abs * 0.5f > abs2) {
                    this.f18549y = true;
                    G(true);
                    setScrollState(1);
                    float f12 = this.f18502F;
                    float f13 = (float) this.f18499C;
                    if (i11 > 0) {
                        f10 = f12 + f13;
                    } else {
                        f10 = f12 - f13;
                    }
                    this.f18500D = f10;
                    this.f18501E = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i12)) {
                    this.f18550z = true;
                }
                if (this.f18549y && B(x11)) {
                    C1680b0.f0(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.f18505I == null) {
            this.f18505I = VelocityTracker.obtain();
        }
        this.f18505I.addMovement(motionEvent2);
        return this.f18549y;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.g) r12
            boolean r14 = r12.f18559a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.f18560b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f18559a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.q(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f18558e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f18562d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f18562d = r14
            float r9 = r9.f18561c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.f18529o = r5
            int r3 = r3 - r7
            r0.f18531p = r3
            r0.f18532p0 = r11
            boolean r1 = r0.f18526m0
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f18511f
            r2 = 0
            r0.I(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f18526m0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f18498B = Math.min(measuredWidth / 10, this.f18497A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt.getVisibility() == 8 || (gVar2 = (g) childAt.getLayoutParams()) == null || !gVar2.f18559a)) {
                int i15 = gVar2.f18560b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 == 48 || i17 == 80) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!(i16 == 3 || i16 == 5)) {
                    z11 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z11) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = gVar2.width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = gVar2.height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f18537s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f18539t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f18541u = true;
        C();
        this.f18541u = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f18559a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * gVar.f18561c), 1073741824), this.f18539t);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f q10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i13 = 0;
            i11 = 1;
        } else {
            i13 = childCount - 1;
            i12 = -1;
            i11 = -1;
        }
        while (i13 != i12) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (q10 = q(childAt)) != null && q10.f18555b == this.f18511f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i13 += i11;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.a());
        a aVar = this.f18510e;
        if (aVar != null) {
            aVar.restoreState(kVar.f18568d, kVar.f18569e);
            K(kVar.f18567c, false, true);
            return;
        }
        this.f18513g = kVar.f18567c;
        this.f18515h = kVar.f18568d;
        this.f18517i = kVar.f18569e;
    }

    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f18567c = this.f18511f;
        a aVar = this.f18510e;
        if (aVar != null) {
            kVar.f18568d = aVar.saveState();
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f18525m;
            E(i10, i12, i14, i14);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f10;
        if (this.f18520j0) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f18510e) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.f18505I == null) {
            this.f18505I = VelocityTracker.obtain();
        }
        this.f18505I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f18519j.abortAnimation();
            this.f18545w = false;
            C();
            float x10 = motionEvent.getX();
            this.f18502F = x10;
            this.f18500D = x10;
            float y10 = motionEvent.getY();
            this.f18503G = y10;
            this.f18501E = y10;
            this.f18504H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f18549y) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f18504H);
                    if (findPointerIndex == -1) {
                        z10 = H();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.f18500D);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f18501E);
                        if (abs > ((float) this.f18499C) && abs > abs2) {
                            this.f18549y = true;
                            G(true);
                            float f11 = this.f18502F;
                            if (x11 - f11 > 0.0f) {
                                f10 = f11 + ((float) this.f18499C);
                            } else {
                                f10 = f11 - ((float) this.f18499C);
                            }
                            this.f18500D = f10;
                            this.f18501E = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f18549y) {
                    z10 = B(motionEvent.getX(motionEvent.findPointerIndex(this.f18504H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f18500D = motionEvent.getX(actionIndex);
                    this.f18504H = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    x(motionEvent);
                    this.f18500D = motionEvent.getX(motionEvent.findPointerIndex(this.f18504H));
                }
            } else if (this.f18549y) {
                I(this.f18511f, true, 0, false);
                z10 = H();
            }
        } else if (this.f18549y) {
            VelocityTracker velocityTracker = this.f18505I;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f18514g0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f18504H);
            this.f18545w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f r10 = r();
            float f12 = (float) clientWidth;
            L(h(r10.f18555b, ((((float) scrollX) / f12) - r10.f18558e) / (r10.f18557d + (((float) this.f18525m) / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f18504H)) - this.f18502F)), true, true, xVelocity);
            z10 = H();
        }
        if (z10) {
            C1680b0.f0(this);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public f p(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return q(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public f q(View view) {
        for (int i10 = 0; i10 < this.f18507b.size(); i10++) {
            f fVar = (f) this.f18507b.get(i10);
            if (this.f18510e.isViewFromObject(view, fVar.f18554a)) {
                return fVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.f18541u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public f s(int i10) {
        for (int i11 = 0; i11 < this.f18507b.size(); i11++) {
            f fVar = (f) this.f18507b.get(i11);
            if (fVar.f18555b == i10) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.f18510e;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver((DataSetObserver) null);
            this.f18510e.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f18507b.size(); i10++) {
                f fVar = (f) this.f18507b.get(i10);
                this.f18510e.destroyItem((ViewGroup) this, fVar.f18555b, fVar.f18554a);
            }
            this.f18510e.finishUpdate((ViewGroup) this);
            this.f18507b.clear();
            F();
            this.f18511f = 0;
            scrollTo(0, 0);
        }
        this.f18510e = aVar;
        this.f18506a = 0;
        if (aVar != null) {
            if (this.f18523l == null) {
                this.f18523l = new j();
            }
            this.f18510e.setViewPagerObserver(this.f18523l);
            this.f18545w = false;
            boolean z10 = this.f18526m0;
            this.f18526m0 = true;
            this.f18506a = this.f18510e.getCount();
            if (this.f18513g >= 0) {
                this.f18510e.restoreState(this.f18515h, this.f18517i);
                K(this.f18513g, false, true);
                this.f18513g = -1;
                this.f18515h = null;
                this.f18517i = null;
            } else if (!z10) {
                C();
            } else {
                requestLayout();
            }
        }
        List list = this.f18540t0;
        if (list != null && !list.isEmpty() && this.f18540t0.size() > 0) {
            android.support.v4.media.session.c.a(this.f18540t0.get(0));
            throw null;
        }
    }

    public void setCurrentItem(int i10) {
        this.f18545w = false;
        K(i10, !this.f18526m0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to " + 1);
            i10 = 1;
        }
        if (i10 != this.f18547x) {
            this.f18547x = i10;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f18536r0 = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f18525m;
        this.f18525m = i10;
        int width = getWidth();
        E(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f18527n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (this.f18548x0 != i10) {
            this.f18548x0 = i10;
            k(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f18519j = new Scroller(context, f18493A0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f18499C = viewConfiguration.getScaledPagingTouchSlop();
        this.f18512f0 = (int) (400.0f * f10);
        this.f18514g0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f18522k0 = new EdgeEffect(context);
        this.f18524l0 = new EdgeEffect(context);
        this.f18516h0 = (int) (25.0f * f10);
        this.f18518i0 = (int) (2.0f * f10);
        this.f18497A = (int) (f10 * 16.0f);
        C1680b0.o0(this, new h());
        if (C1680b0.y(this) == 0) {
            C1680b0.y0(this, 1);
        }
        C1680b0.C0(this, new d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f18527n) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f18532p0
            r1 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L_0x001a:
            if (r6 >= r5) goto L_0x006b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.f18559a
            if (r9 != 0) goto L_0x002b
            goto L_0x0068
        L_0x002b:
            int r8 = r8.f18560b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x004f
            r9 = 3
            if (r8 == r9) goto L_0x0049
            r9 = 5
            if (r8 == r9) goto L_0x0039
            r8 = r2
            goto L_0x005c
        L_0x0039:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L_0x0045:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L_0x005c
        L_0x0049:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005c
        L_0x004f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0045
        L_0x005c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0067
            r7.offsetLeftAndRight(r2)
        L_0x0067:
            r2 = r8
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x006b:
            r11.i(r12, r13, r14)
            r11.f18530o0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.w(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        int i10 = this.f18511f;
        if (i10 <= 0) {
            return false;
        }
        J(i10 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        a aVar = this.f18510e;
        if (aVar == null || this.f18511f >= aVar.getCount() - 1) {
            return false;
        }
        J(this.f18511f + 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18559a;

        /* renamed from: b  reason: collision with root package name */
        public int f18560b;

        /* renamed from: c  reason: collision with root package name */
        float f18561c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f18562d;

        /* renamed from: e  reason: collision with root package name */
        int f18563e;

        /* renamed from: f  reason: collision with root package name */
        int f18564f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f18495y0);
            this.f18560b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(androidx.core.content.c.getDrawable(getContext(), i10));
    }
}
