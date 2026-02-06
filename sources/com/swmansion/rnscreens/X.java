package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.view.e;
import com.swmansion.rnscreens.J;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import sf.C6714a;
import yd.k;
import yd.l;
import yd.m;
import yd.n;
import yd.o;
import yd.p;

public final class X extends e {

    /* renamed from: a  reason: collision with root package name */
    private b f59745a = b.f59764a;

    /* renamed from: b  reason: collision with root package name */
    private a f59746b = a.NONE;

    /* renamed from: c  reason: collision with root package name */
    private Integer f59747c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f59748d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f59749e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f59750f;

    /* renamed from: g  reason: collision with root package name */
    private String f59751g = "";

    /* renamed from: h  reason: collision with root package name */
    private boolean f59752h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f59753i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f59754j = true;

    /* renamed from: k  reason: collision with root package name */
    private Y f59755k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f59756l;

    /* renamed from: m  reason: collision with root package name */
    private final int f59757m = n0.f(this);

    public enum a {
        NONE,
        WORDS,
        SENTENCES,
        CHARACTERS;

        static {
            a[] a10;
            f59763f = C6714a.a(a10);
        }
    }

    public enum b {
        ;

        static final class a extends b {
            a(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public int b(a aVar) {
                C6496s.h(aVar, "capitalize");
                return 32;
            }
        }

        /* renamed from: com.swmansion.rnscreens.X$b$b  reason: collision with other inner class name */
        static final class C0878b extends b {
            C0878b(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public int b(a aVar) {
                C6496s.h(aVar, "capitalize");
                return 2;
            }
        }

        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public int b(a aVar) {
                C6496s.h(aVar, "capitalize");
                return 3;
            }
        }

        static final class d extends b {

            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f59770a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                static {
                    /*
                        com.swmansion.rnscreens.X$a[] r0 = com.swmansion.rnscreens.X.a.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.swmansion.rnscreens.X$a r1 = com.swmansion.rnscreens.X.a.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.swmansion.rnscreens.X$a r1 = com.swmansion.rnscreens.X.a.WORDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        com.swmansion.rnscreens.X$a r1 = com.swmansion.rnscreens.X.a.SENTENCES     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        com.swmansion.rnscreens.X$a r1 = com.swmansion.rnscreens.X.a.CHARACTERS     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        f59770a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.X.b.d.a.<clinit>():void");
                }
            }

            d(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public int b(a aVar) {
                C6496s.h(aVar, "capitalize");
                int i10 = a.f59770a[aVar.ordinal()];
                if (i10 == 1) {
                    return 1;
                }
                if (i10 == 2) {
                    return 8192;
                }
                if (i10 == 3) {
                    return 16384;
                }
                if (i10 == 4) {
                    return 4096;
                }
                throw new C6535s();
            }
        }

        static {
            b[] a10;
            f59769f = C6714a.a(a10);
        }

        public abstract int b(a aVar);
    }

    public static final class c implements SearchView.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ X f59771a;

        c(X x10) {
            this.f59771a = x10;
        }

        public boolean a(String str) {
            this.f59771a.y(str);
            return true;
        }

        public boolean b(String str) {
            this.f59771a.z(str);
            return true;
        }
    }

    public X(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: private */
    public static final C6514M B(X x10, C4919c cVar) {
        E screenStackFragment;
        C4919c a02;
        C6496s.h(cVar, "newSearchView");
        if (x10.f59755k == null) {
            x10.f59755k = new Y(cVar);
        }
        x10.H();
        if (!(!x10.f59753i || (screenStackFragment = x10.getScreenStackFragment()) == null || (a02 = screenStackFragment.a0()) == null)) {
            a02.r0();
        }
        return C6514M.f71813a;
    }

    private final void D(d dVar) {
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = n0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.h(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final void E(X x10, View view, boolean z10) {
        x10.u(z10);
    }

    /* access modifiers changed from: private */
    public static final boolean F(X x10) {
        x10.t();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void G(X x10, View view) {
        x10.w();
    }

    private final void H() {
        C4919c cVar;
        E screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            cVar = screenStackFragment.a0();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            if (!this.f59756l) {
                setSearchViewListeners(cVar);
                this.f59756l = true;
            }
            cVar.setInputType(this.f59745a.b(this.f59746b));
            Y y10 = this.f59755k;
            if (y10 != null) {
                y10.h(this.f59747c);
            }
            Y y11 = this.f59755k;
            if (y11 != null) {
                y11.i(this.f59748d);
            }
            Y y12 = this.f59755k;
            if (y12 != null) {
                y12.e(this.f59749e);
            }
            Y y13 = this.f59755k;
            if (y13 != null) {
                y13.f(this.f59750f);
            }
            Y y14 = this.f59755k;
            if (y14 != null) {
                y14.g(this.f59751g, this.f59754j);
            }
            cVar.setOverrideBackAction(this.f59752h);
        }
    }

    private final H getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof J) {
            return ((J) parent).getConfig();
        }
        return null;
    }

    private final E getScreenStackFragment() {
        H headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c(this));
        searchView.setOnQueryTextFocusChangeListener(new U(this));
        searchView.setOnCloseListener(new V(this));
        searchView.setOnSearchClickListener(new W(this));
    }

    private final void setToolbarElementsVisibility(int i10) {
        int i11;
        J j10;
        H headerConfig = getHeaderConfig();
        int i12 = 0;
        if (headerConfig != null) {
            i11 = headerConfig.getConfigSubviewsCount() - 1;
        } else {
            i11 = 0;
        }
        if (i11 >= 0) {
            while (true) {
                H headerConfig2 = getHeaderConfig();
                J.a aVar = null;
                if (headerConfig2 != null) {
                    j10 = headerConfig2.g(i12);
                } else {
                    j10 = null;
                }
                if (j10 != null) {
                    aVar = j10.getType();
                }
                if (!(aVar == J.a.SEARCH_BAR || j10 == null)) {
                    j10.setVisibility(i10);
                }
                if (i12 != i11) {
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    private final void t() {
        D(new m(this.f59757m, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void u(boolean z10) {
        d dVar;
        if (z10) {
            dVar = new n(this.f59757m, getId());
        } else {
            dVar = new k(this.f59757m, getId());
        }
        D(dVar);
    }

    private final void w() {
        D(new o(this.f59757m, getId()));
        setToolbarElementsVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void y(String str) {
        D(new l(this.f59757m, getId(), str));
    }

    /* access modifiers changed from: private */
    public final void z(String str) {
        D(new p(this.f59757m, getId(), str));
    }

    public final void A(boolean z10) {
    }

    public final void C() {
        H();
    }

    public final a getAutoCapitalize() {
        return this.f59746b;
    }

    public final boolean getAutoFocus() {
        return this.f59753i;
    }

    public final Integer getHeaderIconColor() {
        return this.f59749e;
    }

    public final Integer getHintTextColor() {
        return this.f59750f;
    }

    public final b getInputType() {
        return this.f59745a;
    }

    public final String getPlaceholder() {
        return this.f59751g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f59752h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f59754j;
    }

    public final Integer getTextColor() {
        return this.f59747c;
    }

    public final Integer getTintColor() {
        return this.f59748d;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        E screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.e0(new T(this));
        }
    }

    public final void r() {
        C4919c a02;
        E screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null && (a02 = screenStackFragment.a0()) != null) {
            a02.clearFocus();
        }
    }

    public final void s() {
        C4919c a02;
        E screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null && (a02 = screenStackFragment.a0()) != null) {
            a02.q0();
        }
    }

    public final void setAutoCapitalize(a aVar) {
        C6496s.h(aVar, "<set-?>");
        this.f59746b = aVar;
    }

    public final void setAutoFocus(boolean z10) {
        this.f59753i = z10;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f59749e = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f59750f = num;
    }

    public final void setInputType(b bVar) {
        C6496s.h(bVar, "<set-?>");
        this.f59745a = bVar;
    }

    public final void setPlaceholder(String str) {
        C6496s.h(str, "<set-?>");
        this.f59751g = str;
    }

    public final void setShouldOverrideBackButton(boolean z10) {
        this.f59752h = z10;
    }

    public final void setShouldShowHintSearchIcon(boolean z10) {
        this.f59754j = z10;
    }

    public final void setTextColor(Integer num) {
        this.f59747c = num;
    }

    public final void setTintColor(Integer num) {
        this.f59748d = num;
    }

    public final void v() {
        C4919c a02;
        E screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null && (a02 = screenStackFragment.a0()) != null) {
            a02.r0();
        }
    }

    public final void x(String str) {
        E screenStackFragment;
        C4919c a02;
        if (str != null && (screenStackFragment = getScreenStackFragment()) != null && (a02 = screenStackFragment.a0()) != null) {
            a02.setText(str);
        }
    }
}
