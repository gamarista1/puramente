package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.V;
import i.C2040d;
import i.C2043g;

final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f11387v = C2043g.f21406m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11388b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11389c;

    /* renamed from: d  reason: collision with root package name */
    private final d f11390d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11391e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11392f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11393g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11394h;

    /* renamed from: i  reason: collision with root package name */
    final V f11395i;

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f11396j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f11397k = new b();

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f11398l;

    /* renamed from: m  reason: collision with root package name */
    private View f11399m;

    /* renamed from: n  reason: collision with root package name */
    View f11400n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f11401o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f11402p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11403q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11404r;

    /* renamed from: s  reason: collision with root package name */
    private int f11405s;

    /* renamed from: t  reason: collision with root package name */
    private int f11406t = 0;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11407u;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (l.this.c() && !l.this.f11395i.B()) {
                View view = l.this.f11400n;
                if (view == null || !view.isShown()) {
                    l.this.dismiss();
                } else {
                    l.this.f11395i.b();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f11402p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f11402p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f11402p.removeGlobalOnLayoutListener(lVar.f11396j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f11388b = context;
        this.f11389c = eVar;
        this.f11391e = z10;
        this.f11390d = new d(eVar, LayoutInflater.from(context), z10, f11387v);
        this.f11393g = i10;
        this.f11394h = i11;
        Resources resources = context.getResources();
        this.f11392f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2040d.f21294b));
        this.f11399m = view;
        this.f11395i = new V(context, (AttributeSet) null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        boolean z10;
        if (c()) {
            return true;
        }
        if (this.f11403q || (view = this.f11399m) == null) {
            return false;
        }
        this.f11400n = view;
        this.f11395i.K(this);
        this.f11395i.L(this);
        this.f11395i.J(true);
        View view2 = this.f11400n;
        if (this.f11402p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f11402p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f11396j);
        }
        view2.addOnAttachStateChangeListener(this.f11397k);
        this.f11395i.D(view2);
        this.f11395i.G(this.f11406t);
        if (!this.f11404r) {
            this.f11405s = h.n(this.f11390d, (ViewGroup) null, this.f11388b, this.f11392f);
            this.f11404r = true;
        }
        this.f11395i.F(this.f11405s);
        this.f11395i.I(2);
        this.f11395i.H(m());
        this.f11395i.b();
        ListView o10 = this.f11395i.o();
        o10.setOnKeyListener(this);
        if (this.f11407u && this.f11389c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f11388b).inflate(C2043g.f21405l, o10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f11389c.x());
            }
            frameLayout.setEnabled(false);
            o10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f11395i.m(this.f11390d);
        this.f11395i.b();
        return true;
    }

    public void a(e eVar, boolean z10) {
        if (eVar == this.f11389c) {
            dismiss();
            j.a aVar = this.f11401o;
            if (aVar != null) {
                aVar.a(eVar, z10);
            }
        }
    }

    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean c() {
        if (this.f11403q || !this.f11395i.c()) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        if (c()) {
            this.f11395i.dismiss();
        }
    }

    public void e(j.a aVar) {
        this.f11401o = aVar;
    }

    public boolean f(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f11388b, mVar, this.f11400n, this.f11391e, this.f11393g, this.f11394h);
            iVar.j(this.f11401o);
            iVar.g(h.x(mVar));
            iVar.i(this.f11398l);
            this.f11398l = null;
            this.f11389c.e(false);
            int a10 = this.f11395i.a();
            int l10 = this.f11395i.l();
            if ((Gravity.getAbsoluteGravity(this.f11406t, this.f11399m.getLayoutDirection()) & 7) == 5) {
                a10 += this.f11399m.getWidth();
            }
            if (iVar.n(a10, l10)) {
                j.a aVar = this.f11401o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(mVar);
                return true;
            }
        }
        return false;
    }

    public void g(boolean z10) {
        this.f11404r = false;
        d dVar = this.f11390d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public void k(e eVar) {
    }

    public ListView o() {
        return this.f11395i.o();
    }

    public void onDismiss() {
        this.f11403q = true;
        this.f11389c.close();
        ViewTreeObserver viewTreeObserver = this.f11402p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f11402p = this.f11400n.getViewTreeObserver();
            }
            this.f11402p.removeGlobalOnLayoutListener(this.f11396j);
            this.f11402p = null;
        }
        this.f11400n.removeOnAttachStateChangeListener(this.f11397k);
        PopupWindow.OnDismissListener onDismissListener = this.f11398l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(View view) {
        this.f11399m = view;
    }

    public void r(boolean z10) {
        this.f11390d.d(z10);
    }

    public void s(int i10) {
        this.f11406t = i10;
    }

    public void t(int i10) {
        this.f11395i.e(i10);
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f11398l = onDismissListener;
    }

    public void v(boolean z10) {
        this.f11407u = z10;
    }

    public void w(int i10) {
        this.f11395i.i(i10);
    }
}
