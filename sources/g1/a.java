package G1;

import G1.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.Z;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.List;
import y1.B;
import y1.C;
import y1.C2930A;

public abstract class a extends C1677a {

    /* renamed from: k  reason: collision with root package name */
    private static final Rect f2433k = new Rect(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l  reason: collision with root package name */
    private static final b.a f2434l = new C0039a();

    /* renamed from: m  reason: collision with root package name */
    private static final b.C0040b f2435m = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Rect f2436a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f2437b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f2438c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final int[] f2439d = new int[2];

    /* renamed from: e  reason: collision with root package name */
    private final AccessibilityManager f2440e;

    /* renamed from: f  reason: collision with root package name */
    private final View f2441f;

    /* renamed from: g  reason: collision with root package name */
    private c f2442g;

    /* renamed from: h  reason: collision with root package name */
    int f2443h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    int f2444i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private int f2445j = Integer.MIN_VALUE;

    /* renamed from: G1.a$a  reason: collision with other inner class name */
    class C0039a implements b.a {
        C0039a() {
        }

        /* renamed from: b */
        public void a(C2930A a10, Rect rect) {
            a10.m(rect);
        }
    }

    class b implements b.C0040b {
        b() {
        }

        /* renamed from: c */
        public C2930A a(Z z10, int i10) {
            return (C2930A) z10.p(i10);
        }

        /* renamed from: d */
        public int b(Z z10) {
            return z10.o();
        }
    }

    private class c extends B {
        c() {
        }

        public C2930A b(int i10) {
            return C2930A.h0(a.this.w(i10));
        }

        public C2930A d(int i10) {
            int i11;
            if (i10 == 2) {
                i11 = a.this.f2443h;
            } else {
                i11 = a.this.f2444i;
            }
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.E(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f2441f = view;
            this.f2440e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1680b0.y(view) == 0) {
                C1680b0.y0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean F(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return I(i10);
        }
        if (i11 == 2) {
            return d(i10);
        }
        if (i11 == 64) {
            return H(i10);
        }
        if (i11 != 128) {
            return y(i10, i11, bundle);
        }
        return c(i10);
    }

    private boolean G(int i10, Bundle bundle) {
        return C1680b0.d0(this.f2441f, i10, bundle);
    }

    private boolean H(int i10) {
        int i11;
        if (!this.f2440e.isEnabled() || !this.f2440e.isTouchExplorationEnabled() || (i11 = this.f2443h) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            c(i11);
        }
        this.f2443h = i10;
        this.f2441f.invalidate();
        J(i10, 32768);
        return true;
    }

    private void K(int i10) {
        int i11 = this.f2445j;
        if (i11 != i10) {
            this.f2445j = i10;
            J(i10, 128);
            J(i11, 256);
        }
    }

    private boolean c(int i10) {
        if (this.f2443h != i10) {
            return false;
        }
        this.f2443h = Integer.MIN_VALUE;
        this.f2441f.invalidate();
        J(i10, 65536);
        return true;
    }

    private boolean e() {
        int i10 = this.f2444i;
        if (i10 == Integer.MIN_VALUE || !y(i10, 16, (Bundle) null)) {
            return false;
        }
        return true;
    }

    private AccessibilityEvent f(int i10, int i11) {
        if (i10 != -1) {
            return g(i10, i11);
        }
        return h(i11);
    }

    private AccessibilityEvent g(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        C2930A w10 = w(i10);
        obtain.getText().add(w10.F());
        obtain.setContentDescription(w10.u());
        obtain.setScrollable(w10.a0());
        obtain.setPassword(w10.Y());
        obtain.setEnabled(w10.R());
        obtain.setChecked(w10.O());
        A(i10, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(w10.q());
            C.c(obtain, this.f2441f, i10);
            obtain.setPackageName(this.f2441f.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent h(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f2441f.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private C2930A i(int i10) {
        boolean z10;
        C2930A f02 = C2930A.f0();
        f02.A0(true);
        f02.C0(true);
        f02.t0("android.view.View");
        Rect rect = f2433k;
        f02.p0(rect);
        f02.q0(rect);
        f02.P0(this.f2441f);
        C(i10, f02);
        if (f02.F() == null && f02.u() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        f02.m(this.f2437b);
        if (!this.f2437b.equals(rect)) {
            int k10 = f02.k();
            if ((k10 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k10 & 128) == 0) {
                f02.N0(this.f2441f.getContext().getPackageName());
                f02.Z0(this.f2441f, i10);
                if (this.f2443h == i10) {
                    f02.m0(true);
                    f02.a(128);
                } else {
                    f02.m0(false);
                    f02.a(64);
                }
                if (this.f2444i == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f02.a(2);
                } else if (f02.T()) {
                    f02.a(1);
                }
                f02.D0(z10);
                this.f2441f.getLocationOnScreen(this.f2439d);
                f02.n(this.f2436a);
                if (this.f2436a.equals(rect)) {
                    f02.m(this.f2436a);
                    if (f02.f28574b != -1) {
                        C2930A f03 = C2930A.f0();
                        for (int i11 = f02.f28574b; i11 != -1; i11 = f03.f28574b) {
                            f03.Q0(this.f2441f, -1);
                            f03.p0(f2433k);
                            C(i11, f03);
                            f03.m(this.f2437b);
                            Rect rect2 = this.f2436a;
                            Rect rect3 = this.f2437b;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        f03.j0();
                    }
                    this.f2436a.offset(this.f2439d[0] - this.f2441f.getScrollX(), this.f2439d[1] - this.f2441f.getScrollY());
                }
                if (this.f2441f.getLocalVisibleRect(this.f2438c)) {
                    this.f2438c.offset(this.f2439d[0] - this.f2441f.getScrollX(), this.f2439d[1] - this.f2441f.getScrollY());
                    if (this.f2436a.intersect(this.f2438c)) {
                        f02.q0(this.f2436a);
                        if (t(this.f2436a)) {
                            f02.j1(true);
                        }
                    }
                }
                return f02;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private C2930A j() {
        C2930A g02 = C2930A.g0(this.f2441f);
        C1680b0.b0(this.f2441f, g02);
        ArrayList arrayList = new ArrayList();
        r(arrayList);
        if (g02.p() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g02.d(this.f2441f, ((Integer) arrayList.get(i10)).intValue());
            }
            return g02;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private Z n() {
        ArrayList arrayList = new ArrayList();
        r(arrayList);
        Z z10 = new Z();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            z10.k(((Integer) arrayList.get(i10)).intValue(), i(((Integer) arrayList.get(i10)).intValue()));
        }
        return z10;
    }

    private void o(int i10, Rect rect) {
        w(i10).m(rect);
    }

    private static Rect s(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean t(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f2441f.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f2441f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int u(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 == 21) {
            return 17;
        }
        if (i10 != 22) {
            return 130;
        }
        return 66;
    }

    private boolean v(int i10, Rect rect) {
        C2930A a10;
        C2930A a11;
        boolean z10;
        Z n10 = n();
        int i11 = this.f2444i;
        int i12 = Integer.MIN_VALUE;
        if (i11 == Integer.MIN_VALUE) {
            a10 = null;
        } else {
            a10 = (C2930A) n10.g(i11);
        }
        C2930A a12 = a10;
        if (i10 == 1 || i10 == 2) {
            if (C1680b0.A(this.f2441f) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            a11 = (C2930A) b.d(n10, f2435m, f2434l, a12, i10, z10, false);
        } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            Rect rect2 = new Rect();
            int i13 = this.f2444i;
            if (i13 != Integer.MIN_VALUE) {
                o(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                s(this.f2441f, i10, rect2);
            }
            a11 = (C2930A) b.c(n10, f2435m, f2434l, a12, rect2, i10);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (a11 != null) {
            i12 = n10.j(n10.i(a11));
        }
        return I(i12);
    }

    /* access modifiers changed from: protected */
    public abstract void C(int i10, C2930A a10);

    /* access modifiers changed from: package-private */
    public boolean E(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return F(i10, i11, bundle);
        }
        return G(i11, bundle);
    }

    public final boolean I(int i10) {
        int i11;
        if ((!this.f2441f.isFocused() && !this.f2441f.requestFocus()) || (i11 = this.f2444i) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            d(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2444i = i10;
        D(i10, true);
        J(i10, 8);
        return true;
    }

    public final boolean J(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f2440e.isEnabled() || (parent = this.f2441f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f2441f, f(i10, i11));
    }

    public final boolean d(int i10) {
        if (this.f2444i != i10) {
            return false;
        }
        this.f2444i = Integer.MIN_VALUE;
        D(i10, false);
        J(i10, 8);
        return true;
    }

    public B getAccessibilityNodeProvider(View view) {
        if (this.f2442g == null) {
            this.f2442g = new c();
        }
        return this.f2442g;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (!this.f2440e.isEnabled() || !this.f2440e.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int q10 = q(motionEvent.getX(), motionEvent.getY());
            K(q10);
            if (q10 != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f2445j == Integer.MIN_VALUE) {
            return false;
        } else {
            K(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean l(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int u10 = u(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && v(u10, (Rect) null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            e();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return v(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return v(1, (Rect) null);
            }
            return false;
        }
    }

    public final int m() {
        return this.f2443h;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        z(accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        super.onInitializeAccessibilityNodeInfo(view, a10);
        B(a10);
    }

    public final int p() {
        return this.f2444i;
    }

    /* access modifiers changed from: protected */
    public abstract int q(float f10, float f11);

    /* access modifiers changed from: protected */
    public abstract void r(List list);

    /* access modifiers changed from: package-private */
    public C2930A w(int i10) {
        if (i10 == -1) {
            return j();
        }
        return i(i10);
    }

    public final void x(boolean z10, int i10, Rect rect) {
        int i11 = this.f2444i;
        if (i11 != Integer.MIN_VALUE) {
            d(i11);
        }
        if (z10) {
            v(i10, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean y(int i10, int i11, Bundle bundle);

    /* access modifiers changed from: protected */
    public void B(C2930A a10) {
    }

    /* access modifiers changed from: protected */
    public void z(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void A(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void D(int i10, boolean z10) {
    }
}
