package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1680b0;
import androidx.core.view.C1686e0;

class o0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    private static o0 f11968k;

    /* renamed from: l  reason: collision with root package name */
    private static o0 f11969l;

    /* renamed from: a  reason: collision with root package name */
    private final View f11970a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f11971b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11972c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f11973d = new m0(this);

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f11974e = new n0(this);

    /* renamed from: f  reason: collision with root package name */
    private int f11975f;

    /* renamed from: g  reason: collision with root package name */
    private int f11976g;

    /* renamed from: h  reason: collision with root package name */
    private p0 f11977h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11978i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11979j;

    private o0(View view, CharSequence charSequence) {
        this.f11970a = view;
        this.f11971b = charSequence;
        this.f11972c = C1686e0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f11970a.removeCallbacks(this.f11973d);
    }

    private void c() {
        this.f11979j = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f11970a.postDelayed(this.f11973d, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void g(o0 o0Var) {
        o0 o0Var2 = f11968k;
        if (o0Var2 != null) {
            o0Var2.b();
        }
        f11968k = o0Var;
        if (o0Var != null) {
            o0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        o0 o0Var = f11968k;
        if (o0Var != null && o0Var.f11970a == view) {
            g((o0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            o0 o0Var2 = f11969l;
            if (o0Var2 != null && o0Var2.f11970a == view) {
                o0Var2.d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new o0(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f11979j && Math.abs(x10 - this.f11975f) <= this.f11972c && Math.abs(y10 - this.f11976g) <= this.f11972c) {
            return false;
        }
        this.f11975f = x10;
        this.f11976g = y10;
        this.f11979j = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (f11969l == this) {
            f11969l = null;
            p0 p0Var = this.f11977h;
            if (p0Var != null) {
                p0Var.c();
                this.f11977h = null;
                c();
                this.f11970a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f11968k == this) {
            g((o0) null);
        }
        this.f11970a.removeCallbacks(this.f11974e);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z10) {
        long j10;
        long longPressTimeout;
        long j11;
        if (this.f11970a.isAttachedToWindow()) {
            g((o0) null);
            o0 o0Var = f11969l;
            if (o0Var != null) {
                o0Var.d();
            }
            f11969l = this;
            this.f11978i = z10;
            p0 p0Var = new p0(this.f11970a.getContext());
            this.f11977h = p0Var;
            p0Var.e(this.f11970a, this.f11975f, this.f11976g, this.f11978i, this.f11971b);
            this.f11970a.addOnAttachStateChangeListener(this);
            if (this.f11978i) {
                j10 = 2500;
            } else {
                if ((C1680b0.K(this.f11970a) & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j11 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j11 = 15000;
                }
                j10 = j11 - longPressTimeout;
            }
            this.f11970a.removeCallbacks(this.f11974e);
            this.f11970a.postDelayed(this.f11974e, j10);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f11977h != null && this.f11978i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f11970a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f11970a.isEnabled() && this.f11977h == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f11975f = view.getWidth() / 2;
        this.f11976g = view.getHeight() / 2;
        i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
