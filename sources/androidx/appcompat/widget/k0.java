package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C1680b0;
import androidx.core.view.C1700l0;
import androidx.core.view.C1704n0;
import i.C2037a;
import i.C2041e;
import i.C2042f;
import i.h;
import j.C2115a;
import n.C2227a;

public class k0 implements I {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f11933a;

    /* renamed from: b  reason: collision with root package name */
    private int f11934b;

    /* renamed from: c  reason: collision with root package name */
    private View f11935c;

    /* renamed from: d  reason: collision with root package name */
    private View f11936d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f11937e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f11938f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f11939g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11940h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f11941i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f11942j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f11943k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f11944l;

    /* renamed from: m  reason: collision with root package name */
    boolean f11945m;

    /* renamed from: n  reason: collision with root package name */
    private C1564c f11946n;

    /* renamed from: o  reason: collision with root package name */
    private int f11947o;

    /* renamed from: p  reason: collision with root package name */
    private int f11948p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f11949q;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final C2227a f11950a;

        a() {
            this.f11950a = new C2227a(k0.this.f11933a.getContext(), 0, 16908332, 0, 0, k0.this.f11941i);
        }

        public void onClick(View view) {
            k0 k0Var = k0.this;
            Window.Callback callback = k0Var.f11944l;
            if (callback != null && k0Var.f11945m) {
                callback.onMenuItemSelected(0, this.f11950a);
            }
        }
    }

    class b extends C1704n0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11952a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11953b;

        b(int i10) {
            this.f11953b = i10;
        }

        public void a(View view) {
            this.f11952a = true;
        }

        public void b(View view) {
            if (!this.f11952a) {
                k0.this.f11933a.setVisibility(this.f11953b);
            }
        }

        public void c(View view) {
            k0.this.f11933a.setVisibility(0);
        }
    }

    public k0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f21414a, C2041e.f21338n);
    }

    private void F(CharSequence charSequence) {
        this.f11941i = charSequence;
        if ((this.f11934b & 8) != 0) {
            this.f11933a.setTitle(charSequence);
            if (this.f11940h) {
                C1680b0.r0(this.f11933a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f11934b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f11943k)) {
            this.f11933a.setNavigationContentDescription(this.f11948p);
        } else {
            this.f11933a.setNavigationContentDescription(this.f11943k);
        }
    }

    private void H() {
        if ((this.f11934b & 4) != 0) {
            Toolbar toolbar = this.f11933a;
            Drawable drawable = this.f11939g;
            if (drawable == null) {
                drawable = this.f11949q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f11933a.setNavigationIcon((Drawable) null);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f11934b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f11938f;
            if (drawable == null) {
                drawable = this.f11937e;
            }
        } else {
            drawable = this.f11937e;
        }
        this.f11933a.setLogo(drawable);
    }

    private int y() {
        if (this.f11933a.getNavigationIcon() == null) {
            return 11;
        }
        this.f11949q = this.f11933a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 != this.f11948p) {
            this.f11948p = i10;
            if (TextUtils.isEmpty(this.f11933a.getNavigationContentDescription())) {
                C(this.f11948p);
            }
        }
    }

    public void B(Drawable drawable) {
        this.f11938f = drawable;
        I();
    }

    public void C(int i10) {
        String str;
        if (i10 == 0) {
            str = null;
        } else {
            str = getContext().getString(i10);
        }
        D(str);
    }

    public void D(CharSequence charSequence) {
        this.f11943k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f11942j = charSequence;
        if ((this.f11934b & 8) != 0) {
            this.f11933a.setSubtitle(charSequence);
        }
    }

    public boolean a() {
        return this.f11933a.canShowOverflowMenu();
    }

    public boolean b() {
        return this.f11933a.hideOverflowMenu();
    }

    public boolean c() {
        return this.f11933a.showOverflowMenu();
    }

    public void collapseActionView() {
        this.f11933a.collapseActionView();
    }

    public void d(Menu menu, j.a aVar) {
        if (this.f11946n == null) {
            C1564c cVar = new C1564c(this.f11933a.getContext());
            this.f11946n = cVar;
            cVar.p(C2042f.f21375h);
        }
        this.f11946n.e(aVar);
        this.f11933a.setMenu((e) menu, this.f11946n);
    }

    public boolean e() {
        return this.f11933a.isOverflowMenuShowing();
    }

    public void f() {
        this.f11945m = true;
    }

    public boolean g() {
        return this.f11933a.isOverflowMenuShowPending();
    }

    public Context getContext() {
        return this.f11933a.getContext();
    }

    public CharSequence getTitle() {
        return this.f11933a.getTitle();
    }

    public boolean h() {
        return this.f11933a.hasExpandedActionView();
    }

    public void i(int i10) {
        View view;
        int i11 = this.f11934b ^ i10;
        this.f11934b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f11933a.setTitle(this.f11941i);
                    this.f11933a.setSubtitle(this.f11942j);
                } else {
                    this.f11933a.setTitle((CharSequence) null);
                    this.f11933a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f11936d) != null) {
                if ((i10 & 16) != 0) {
                    this.f11933a.addView(view);
                } else {
                    this.f11933a.removeView(view);
                }
            }
        }
    }

    public Menu j() {
        return this.f11933a.getMenu();
    }

    public int k() {
        return this.f11947o;
    }

    public C1700l0 l(int i10, long j10) {
        float f10;
        C1700l0 e10 = C1680b0.e(this.f11933a);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return e10.b(f10).f(j10).h(new b(i10));
    }

    public ViewGroup m() {
        return this.f11933a;
    }

    public void n(boolean z10) {
    }

    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void p(boolean z10) {
        this.f11933a.setCollapsible(z10);
    }

    public void q() {
        this.f11933a.dismissPopupMenus();
    }

    public void r(Z z10) {
        Toolbar toolbar;
        View view = this.f11935c;
        if (view != null && view.getParent() == (toolbar = this.f11933a)) {
            toolbar.removeView(this.f11935c);
        }
        this.f11935c = z10;
    }

    public void s(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = C2115a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        B(drawable);
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C2115a.b(getContext(), i10) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11940h = true;
        F(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f11944l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f11940h) {
            F(charSequence);
        }
    }

    public void t(j.a aVar, e.a aVar2) {
        this.f11933a.setMenuCallbacks(aVar, aVar2);
    }

    public void u(int i10) {
        this.f11933a.setVisibility(i10);
    }

    public int v() {
        return this.f11934b;
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void x(Drawable drawable) {
        this.f11939g = drawable;
        H();
    }

    public void z(View view) {
        View view2 = this.f11936d;
        if (!(view2 == null || (this.f11934b & 16) == 0)) {
            this.f11933a.removeView(view2);
        }
        this.f11936d = view;
        if (view != null && (this.f11934b & 16) != 0) {
            this.f11933a.addView(view);
        }
    }

    public k0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f11947o = 0;
        this.f11948p = 0;
        this.f11933a = toolbar;
        this.f11941i = toolbar.getTitle();
        this.f11942j = toolbar.getSubtitle();
        this.f11940h = this.f11941i != null;
        this.f11939g = toolbar.getNavigationIcon();
        g0 v10 = g0.v(toolbar.getContext(), (AttributeSet) null, i.j.f21554a, C2037a.f21260c, 0);
        this.f11949q = v10.g(i.j.f21609l);
        if (z10) {
            CharSequence p10 = v10.p(i.j.f21639r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(i.j.f21629p);
            if (!TextUtils.isEmpty(p11)) {
                E(p11);
            }
            Drawable g10 = v10.g(i.j.f21619n);
            if (g10 != null) {
                B(g10);
            }
            Drawable g11 = v10.g(i.j.f21614m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f11939g == null && (drawable = this.f11949q) != null) {
                x(drawable);
            }
            i(v10.k(i.j.f21589h, 0));
            int n10 = v10.n(i.j.f21584g, 0);
            if (n10 != 0) {
                z(LayoutInflater.from(this.f11933a.getContext()).inflate(n10, this.f11933a, false));
                i(this.f11934b | 16);
            }
            int m10 = v10.m(i.j.f21599j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f11933a.getLayoutParams();
                layoutParams.height = m10;
                this.f11933a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(i.j.f21579f, -1);
            int e11 = v10.e(i.j.f21574e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f11933a.setContentInsetsRelative(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(i.j.f21644s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f11933a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(i.j.f21634q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f11933a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(i.j.f21624o, 0);
            if (n13 != 0) {
                this.f11933a.setPopupTheme(n13);
            }
        } else {
            this.f11934b = y();
        }
        v10.x();
        A(i10);
        this.f11943k = this.f11933a.getNavigationContentDescription();
        this.f11933a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f11937e = drawable;
        I();
    }
}
