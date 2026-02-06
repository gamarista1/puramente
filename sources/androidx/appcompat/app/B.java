package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.g;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Z;
import androidx.core.view.C1680b0;
import androidx.core.view.C1700l0;
import androidx.core.view.C1702m0;
import androidx.core.view.C1704n0;
import androidx.core.view.C1706o0;
import i.C2037a;
import i.C2042f;
import i.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class B extends C1560a implements ActionBarOverlayLayout.d {

    /* renamed from: D  reason: collision with root package name */
    private static final Interpolator f10937D = new AccelerateInterpolator();

    /* renamed from: E  reason: collision with root package name */
    private static final Interpolator f10938E = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    final C1702m0 f10939A = new a();

    /* renamed from: B  reason: collision with root package name */
    final C1702m0 f10940B = new b();

    /* renamed from: C  reason: collision with root package name */
    final C1706o0 f10941C = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f10942a;

    /* renamed from: b  reason: collision with root package name */
    private Context f10943b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f10944c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f10945d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f10946e;

    /* renamed from: f  reason: collision with root package name */
    I f10947f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f10948g;

    /* renamed from: h  reason: collision with root package name */
    View f10949h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f10950i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private int f10951j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10952k;

    /* renamed from: l  reason: collision with root package name */
    d f10953l;

    /* renamed from: m  reason: collision with root package name */
    androidx.appcompat.view.b f10954m;

    /* renamed from: n  reason: collision with root package name */
    b.a f10955n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10956o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList f10957p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private boolean f10958q;

    /* renamed from: r  reason: collision with root package name */
    private int f10959r = 0;

    /* renamed from: s  reason: collision with root package name */
    boolean f10960s = true;

    /* renamed from: t  reason: collision with root package name */
    boolean f10961t;

    /* renamed from: u  reason: collision with root package name */
    boolean f10962u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10963v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10964w = true;

    /* renamed from: x  reason: collision with root package name */
    h f10965x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10966y;

    /* renamed from: z  reason: collision with root package name */
    boolean f10967z;

    class a extends C1704n0 {
        a() {
        }

        public void b(View view) {
            View view2;
            B b10 = B.this;
            if (b10.f10960s && (view2 = b10.f10949h) != null) {
                view2.setTranslationY(0.0f);
                B.this.f10946e.setTranslationY(0.0f);
            }
            B.this.f10946e.setVisibility(8);
            B.this.f10946e.setTransitioning(false);
            B b11 = B.this;
            b11.f10965x = null;
            b11.A();
            ActionBarOverlayLayout actionBarOverlayLayout = B.this.f10945d;
            if (actionBarOverlayLayout != null) {
                C1680b0.l0(actionBarOverlayLayout);
            }
        }
    }

    class b extends C1704n0 {
        b() {
        }

        public void b(View view) {
            B b10 = B.this;
            b10.f10965x = null;
            b10.f10946e.requestLayout();
        }
    }

    class c implements C1706o0 {
        c() {
        }

        public void a(View view) {
            ((View) B.this.f10946e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f10971c;

        /* renamed from: d  reason: collision with root package name */
        private final e f10972d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f10973e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference f10974f;

        public d(Context context, b.a aVar) {
            this.f10971c = context;
            this.f10973e = aVar;
            e T10 = new e(context).T(1);
            this.f10972d = T10;
            T10.S(this);
        }

        public boolean a(e eVar, MenuItem menuItem) {
            b.a aVar = this.f10973e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(e eVar) {
            if (this.f10973e != null) {
                k();
                B.this.f10948g.l();
            }
        }

        public void c() {
            B b10 = B.this;
            if (b10.f10953l == this) {
                if (!B.z(b10.f10961t, b10.f10962u, false)) {
                    B b11 = B.this;
                    b11.f10954m = this;
                    b11.f10955n = this.f10973e;
                } else {
                    this.f10973e.a(this);
                }
                this.f10973e = null;
                B.this.y(false);
                B.this.f10948g.g();
                B b12 = B.this;
                b12.f10945d.setHideOnContentScrollEnabled(b12.f10967z);
                B.this.f10953l = null;
            }
        }

        public View d() {
            WeakReference weakReference = this.f10974f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f10972d;
        }

        public MenuInflater f() {
            return new g(this.f10971c);
        }

        public CharSequence g() {
            return B.this.f10948g.getSubtitle();
        }

        public CharSequence i() {
            return B.this.f10948g.getTitle();
        }

        public void k() {
            if (B.this.f10953l == this) {
                this.f10972d.e0();
                try {
                    this.f10973e.d(this, this.f10972d);
                } finally {
                    this.f10972d.d0();
                }
            }
        }

        public boolean l() {
            return B.this.f10948g.j();
        }

        public void m(View view) {
            B.this.f10948g.setCustomView(view);
            this.f10974f = new WeakReference(view);
        }

        public void n(int i10) {
            o(B.this.f10942a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            B.this.f10948g.setSubtitle(charSequence);
        }

        public void q(int i10) {
            r(B.this.f10942a.getResources().getString(i10));
        }

        public void r(CharSequence charSequence) {
            B.this.f10948g.setTitle(charSequence);
        }

        public void s(boolean z10) {
            super.s(z10);
            B.this.f10948g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f10972d.e0();
            try {
                return this.f10973e.b(this, this.f10972d);
            } finally {
                this.f10972d.d0();
            }
        }
    }

    public B(Activity activity, boolean z10) {
        this.f10944c = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (!z10) {
            this.f10949h = decorView.findViewById(16908290);
        }
    }

    private I D(View view) {
        String str;
        if (view instanceof I) {
            return (I) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    private void F() {
        if (this.f10963v) {
            this.f10963v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10945d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void G(View view) {
        boolean z10;
        boolean z11;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2042f.f21384q);
        this.f10945d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f10947f = D(view.findViewById(C2042f.f21368a));
        this.f10948g = (ActionBarContextView) view.findViewById(C2042f.f21374g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2042f.f21370c);
        this.f10946e = actionBarContainer;
        I i10 = this.f10947f;
        if (i10 == null || this.f10948g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f10942a = i10.getContext();
        if ((this.f10947f.v() & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f10952k = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f10942a);
        if (b10.a() || z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        L(z11);
        J(b10.e());
        TypedArray obtainStyledAttributes = this.f10942a.obtainStyledAttributes((AttributeSet) null, j.f21554a, C2037a.f21260c, 0);
        if (obtainStyledAttributes.getBoolean(j.f21604k, false)) {
            K(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f21594i, 0);
        if (dimensionPixelSize != 0) {
            I((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void J(boolean z10) {
        boolean z11;
        boolean z12;
        this.f10958q = z10;
        if (!z10) {
            this.f10947f.r((Z) null);
            this.f10946e.setTabContainer((Z) null);
        } else {
            this.f10946e.setTabContainer((Z) null);
            this.f10947f.r((Z) null);
        }
        boolean z13 = false;
        if (E() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        I i10 = this.f10947f;
        if (this.f10958q || !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        i10.p(z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10945d;
        if (!this.f10958q && z11) {
            z13 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z13);
    }

    private boolean M() {
        return this.f10946e.isLaidOut();
    }

    private void N() {
        if (!this.f10963v) {
            this.f10963v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10945d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            O(false);
        }
    }

    private void O(boolean z10) {
        if (z(this.f10961t, this.f10962u, this.f10963v)) {
            if (!this.f10964w) {
                this.f10964w = true;
                C(z10);
            }
        } else if (this.f10964w) {
            this.f10964w = false;
            B(z10);
        }
    }

    static boolean z(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        b.a aVar = this.f10955n;
        if (aVar != null) {
            aVar.a(this.f10954m);
            this.f10954m = null;
            this.f10955n = null;
        }
    }

    public void B(boolean z10) {
        View view;
        h hVar = this.f10965x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f10959r != 0 || (!this.f10966y && !z10)) {
            this.f10939A.b((View) null);
            return;
        }
        this.f10946e.setAlpha(1.0f);
        this.f10946e.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f10946e.getHeight());
        if (z10) {
            int[] iArr = {0, 0};
            this.f10946e.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        C1700l0 m10 = C1680b0.e(this.f10946e).m(f10);
        m10.k(this.f10941C);
        hVar2.c(m10);
        if (this.f10960s && (view = this.f10949h) != null) {
            hVar2.c(C1680b0.e(view).m(f10));
        }
        hVar2.f(f10937D);
        hVar2.e(250);
        hVar2.g(this.f10939A);
        this.f10965x = hVar2;
        hVar2.h();
    }

    public void C(boolean z10) {
        View view;
        View view2;
        h hVar = this.f10965x;
        if (hVar != null) {
            hVar.a();
        }
        this.f10946e.setVisibility(0);
        if (this.f10959r != 0 || (!this.f10966y && !z10)) {
            this.f10946e.setAlpha(1.0f);
            this.f10946e.setTranslationY(0.0f);
            if (this.f10960s && (view = this.f10949h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f10940B.b((View) null);
        } else {
            this.f10946e.setTranslationY(0.0f);
            float f10 = (float) (-this.f10946e.getHeight());
            if (z10) {
                int[] iArr = {0, 0};
                this.f10946e.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f10946e.setTranslationY(f10);
            h hVar2 = new h();
            C1700l0 m10 = C1680b0.e(this.f10946e).m(0.0f);
            m10.k(this.f10941C);
            hVar2.c(m10);
            if (this.f10960s && (view2 = this.f10949h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(C1680b0.e(this.f10949h).m(0.0f));
            }
            hVar2.f(f10938E);
            hVar2.e(250);
            hVar2.g(this.f10940B);
            this.f10965x = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10945d;
        if (actionBarOverlayLayout != null) {
            C1680b0.l0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.f10947f.k();
    }

    public void H(int i10, int i11) {
        int v10 = this.f10947f.v();
        if ((i11 & 4) != 0) {
            this.f10952k = true;
        }
        this.f10947f.i((i10 & i11) | ((~i11) & v10));
    }

    public void I(float f10) {
        C1680b0.w0(this.f10946e, f10);
    }

    public void K(boolean z10) {
        if (!z10 || this.f10945d.x()) {
            this.f10967z = z10;
            this.f10945d.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void L(boolean z10) {
        this.f10947f.n(z10);
    }

    public void a() {
        if (this.f10962u) {
            this.f10962u = false;
            O(true);
        }
    }

    public void b(int i10) {
        this.f10959r = i10;
    }

    public void c() {
    }

    public void d(boolean z10) {
        this.f10960s = z10;
    }

    public void e() {
        if (!this.f10962u) {
            this.f10962u = true;
            O(true);
        }
    }

    public void f() {
        h hVar = this.f10965x;
        if (hVar != null) {
            hVar.a();
            this.f10965x = null;
        }
    }

    public boolean h() {
        I i10 = this.f10947f;
        if (i10 == null || !i10.h()) {
            return false;
        }
        this.f10947f.collapseActionView();
        return true;
    }

    public void i(boolean z10) {
        if (z10 != this.f10956o) {
            this.f10956o = z10;
            if (this.f10957p.size() > 0) {
                android.support.v4.media.session.c.a(this.f10957p.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f10947f.v();
    }

    public Context k() {
        if (this.f10943b == null) {
            TypedValue typedValue = new TypedValue();
            this.f10942a.getTheme().resolveAttribute(C2037a.f21262e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f10943b = new ContextThemeWrapper(this.f10942a, i10);
            } else {
                this.f10943b = this.f10942a;
            }
        }
        return this.f10943b;
    }

    public void m(Configuration configuration) {
        J(androidx.appcompat.view.a.b(this.f10942a).e());
    }

    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        int i11;
        d dVar = this.f10953l;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void r(boolean z10) {
        if (!this.f10952k) {
            s(z10);
        }
    }

    public void s(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        H(i10, 4);
    }

    public void t(Drawable drawable) {
        this.f10947f.x(drawable);
    }

    public void u(boolean z10) {
        h hVar;
        this.f10966y = z10;
        if (!z10 && (hVar = this.f10965x) != null) {
            hVar.a();
        }
    }

    public void v(CharSequence charSequence) {
        this.f10947f.setTitle(charSequence);
    }

    public void w(CharSequence charSequence) {
        this.f10947f.setWindowTitle(charSequence);
    }

    public androidx.appcompat.view.b x(b.a aVar) {
        d dVar = this.f10953l;
        if (dVar != null) {
            dVar.c();
        }
        this.f10945d.setHideOnContentScrollEnabled(false);
        this.f10948g.k();
        d dVar2 = new d(this.f10948g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f10953l = dVar2;
        dVar2.k();
        this.f10948g.h(dVar2);
        y(true);
        return dVar2;
    }

    public void y(boolean z10) {
        C1700l0 l0Var;
        C1700l0 l0Var2;
        if (z10) {
            N();
        } else {
            F();
        }
        if (M()) {
            if (z10) {
                l0Var = this.f10947f.l(4, 100);
                l0Var2 = this.f10948g.f(0, 200);
            } else {
                l0Var2 = this.f10947f.l(0, 200);
                l0Var = this.f10948g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(l0Var, l0Var2);
            hVar.h();
        } else if (z10) {
            this.f10947f.u(4);
            this.f10948g.setVisibility(0);
        } else {
            this.f10947f.u(0);
            this.f10948g.setVisibility(8);
        }
    }

    public B(Dialog dialog) {
        G(dialog.getWindow().getDecorView());
    }
}
