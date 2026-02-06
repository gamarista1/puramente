package com.swmansion.rnscreens;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C1560a;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.text.m;
import com.swmansion.rnscreens.J;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yd.C5294a;
import yd.C5296c;

public final class H extends C4921e {

    /* renamed from: A  reason: collision with root package name */
    public static final a f59682A = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f59683e = new ArrayList(3);

    /* renamed from: f  reason: collision with root package name */
    private final C4920d f59684f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f59685g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f59686h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f59687i;

    /* renamed from: j  reason: collision with root package name */
    private String f59688j;

    /* renamed from: k  reason: collision with root package name */
    private int f59689k;

    /* renamed from: l  reason: collision with root package name */
    private String f59690l;

    /* renamed from: m  reason: collision with root package name */
    private String f59691m;

    /* renamed from: n  reason: collision with root package name */
    private float f59692n;

    /* renamed from: o  reason: collision with root package name */
    private int f59693o;

    /* renamed from: p  reason: collision with root package name */
    private Integer f59694p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f59695q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f59696r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f59697s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f59698t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f59699u = true;

    /* renamed from: v  reason: collision with root package name */
    private int f59700v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f59701w;

    /* renamed from: x  reason: collision with root package name */
    private final int f59702x;

    /* renamed from: y  reason: collision with root package name */
    private final int f59703y;

    /* renamed from: z  reason: collision with root package name */
    private final View.OnClickListener f59704z = new G(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView a(Toolbar toolbar) {
            C6496s.h(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (C6496s.c(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59705a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.swmansion.rnscreens.J$a[] r0 = com.swmansion.rnscreens.J.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.swmansion.rnscreens.J$a r1 = com.swmansion.rnscreens.J.a.LEFT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.swmansion.rnscreens.J$a r1 = com.swmansion.rnscreens.J.a.RIGHT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.swmansion.rnscreens.J$a r1 = com.swmansion.rnscreens.J.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f59705a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.H.b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H(Context context) {
        super(context);
        C6496s.h(context, "context");
        setVisibility(8);
        C4920d dVar = new C4920d(context, this);
        this.f59684f = dVar;
        this.f59702x = dVar.getContentInsetStart();
        this.f59703y = dVar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843827, typedValue, true)) {
            dVar.setBackgroundColor(typedValue.data);
        }
        dVar.setClipChildren(false);
    }

    /* access modifiers changed from: private */
    public static final void e(H h10, View view) {
        E screenFragment = h10.getScreenFragment();
        if (screenFragment != null) {
            B screenStack = h10.getScreenStack();
            if (screenStack != null && C6496s.c(screenStack.getRootScreen(), screenFragment.g())) {
                C1769q parentFragment = screenFragment.getParentFragment();
                if (parentFragment instanceof E) {
                    E e10 = (E) parentFragment;
                    if (e10.g().getNativeBackButtonDismissalEnabled()) {
                        e10.W();
                    } else {
                        e10.E();
                    }
                }
            } else if (screenFragment.g().getNativeBackButtonDismissalEnabled()) {
                screenFragment.W();
            } else {
                screenFragment.E();
            }
        }
    }

    private final r getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof r) {
            return (r) parent;
        }
        return null;
    }

    private final B getScreenStack() {
        ViewParent viewParent;
        r screen = getScreen();
        if (screen != null) {
            viewParent = screen.getContainer();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof B) {
            return (B) viewParent;
        }
        return null;
    }

    private final void i() {
        r screen;
        if (getParent() != null && !this.f59697s && (screen = getScreen()) != null && !screen.f()) {
            j();
        }
    }

    public final void d(J j10, int i10) {
        C6496s.h(j10, "child");
        this.f59683e.add(i10, j10);
        i();
    }

    public final void f() {
        this.f59697s = true;
    }

    public final J g(int i10) {
        Object obj = this.f59683e.get(i10);
        C6496s.g(obj, "get(...)");
        return (J) obj;
    }

    public final int getConfigSubviewsCount() {
        return this.f59683e.size();
    }

    public final E getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof r)) {
            return null;
        }
        C1769q fragment = ((r) parent).getFragment();
        if (fragment instanceof E) {
            return (E) fragment;
        }
        return null;
    }

    public final C4920d getToolbar() {
        return this.f59684f;
    }

    public final boolean h() {
        return this.f59685g;
    }

    public final void j() {
        boolean z10;
        C1773v vVar;
        boolean z11;
        ImageView imageView;
        Drawable navigationIcon;
        int i10;
        E screenFragment;
        E screenFragment2;
        ReactContext reactContext;
        B screenStack = getScreenStack();
        if (screenStack == null || C6496s.c(screenStack.getTopScreen(), getParent())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f59701w && z10 && !this.f59697s) {
            E screenFragment3 = getScreenFragment();
            if (screenFragment3 != null) {
                vVar = screenFragment3.getActivity();
            } else {
                vVar = null;
            }
            d dVar = (d) vVar;
            if (dVar != null) {
                String str = this.f59691m;
                if (str != null) {
                    if (C6496s.c(str, "rtl")) {
                        this.f59684f.setLayoutDirection(1);
                    } else if (C6496s.c(this.f59691m, "ltr")) {
                        this.f59684f.setLayoutDirection(0);
                    }
                }
                r screen = getScreen();
                if (screen != null) {
                    if (getContext() instanceof ReactContext) {
                        Context context = getContext();
                        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        reactContext = (ReactContext) context;
                    } else {
                        z fragmentWrapper = screen.getFragmentWrapper();
                        if (fragmentWrapper != null) {
                            reactContext = fragmentWrapper.q();
                        } else {
                            reactContext = null;
                        }
                    }
                    O.f59726a.x(screen, dVar, reactContext);
                }
                if (!this.f59685g) {
                    if (this.f59684f.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                        screenFragment.f0(this.f59684f);
                    }
                    if (this.f59699u) {
                        Integer num = this.f59687i;
                        C4920d dVar2 = this.f59684f;
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = 0;
                        }
                        dVar2.setPadding(0, i10, 0, 0);
                    } else if (this.f59684f.getPaddingTop() > 0) {
                        this.f59684f.setPadding(0, 0, 0, 0);
                    }
                    dVar.setSupportActionBar(this.f59684f);
                    C1560a supportActionBar = dVar.getSupportActionBar();
                    if (supportActionBar != null) {
                        this.f59684f.setContentInsetStartWithNavigation(this.f59703y);
                        C4920d dVar3 = this.f59684f;
                        int i11 = this.f59702x;
                        dVar3.setContentInsetsRelative(i11, i11);
                        E screenFragment4 = getScreenFragment();
                        if (screenFragment4 == null || !screenFragment4.S() || this.f59695q) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        supportActionBar.s(z11);
                        this.f59684f.setNavigationOnClickListener(this.f59704z);
                        E screenFragment5 = getScreenFragment();
                        if (screenFragment5 != null) {
                            screenFragment5.g0(this.f59696r);
                        }
                        E screenFragment6 = getScreenFragment();
                        if (screenFragment6 != null) {
                            screenFragment6.h0(this.f59686h);
                        }
                        supportActionBar.v(this.f59688j);
                        if (TextUtils.isEmpty(this.f59688j)) {
                            this.f59684f.setContentInsetStartWithNavigation(0);
                        }
                        TextView a10 = f59682A.a(this.f59684f);
                        int i12 = this.f59689k;
                        if (i12 != 0) {
                            this.f59684f.setTitleTextColor(i12);
                        }
                        if (a10 != null) {
                            String str2 = this.f59690l;
                            if (str2 != null || this.f59693o > 0) {
                                int i13 = this.f59693o;
                                AssetManager assets = getContext().getAssets();
                                C6496s.g(assets, "getAssets(...)");
                                a10.setTypeface(m.a((Typeface) null, 0, i13, str2, assets));
                            }
                            float f10 = this.f59692n;
                            if (f10 > 0.0f) {
                                a10.setTextSize(f10);
                            }
                        }
                        Integer num2 = this.f59694p;
                        if (num2 != null) {
                            this.f59684f.setBackgroundColor(num2.intValue());
                        }
                        if (!(this.f59700v == 0 || (navigationIcon = this.f59684f.getNavigationIcon()) == null)) {
                            navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f59700v, PorterDuff.Mode.SRC_ATOP));
                        }
                        for (int childCount = this.f59684f.getChildCount() - 1; -1 < childCount; childCount--) {
                            if (this.f59684f.getChildAt(childCount) instanceof J) {
                                this.f59684f.removeViewAt(childCount);
                            }
                        }
                        int size = this.f59683e.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            Object obj = this.f59683e.get(i14);
                            C6496s.g(obj, "get(...)");
                            J j10 = (J) obj;
                            J.a type = j10.getType();
                            if (type == J.a.BACK) {
                                View childAt = j10.getChildAt(0);
                                if (childAt instanceof ImageView) {
                                    imageView = (ImageView) childAt;
                                } else {
                                    imageView = null;
                                }
                                if (imageView != null) {
                                    supportActionBar.t(imageView.getDrawable());
                                } else {
                                    throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                                }
                            } else {
                                Toolbar.g gVar = new Toolbar.g(-2, -1);
                                int i15 = b.f59705a[type.ordinal()];
                                if (i15 == 1) {
                                    if (!this.f59698t) {
                                        this.f59684f.setNavigationIcon((Drawable) null);
                                    }
                                    this.f59684f.setTitle((CharSequence) null);
                                    gVar.f10976a = 8388611;
                                } else if (i15 == 2) {
                                    gVar.f10976a = 8388613;
                                } else if (i15 == 3) {
                                    gVar.width = -1;
                                    gVar.f10976a = 1;
                                    this.f59684f.setTitle((CharSequence) null);
                                }
                                j10.setLayoutParams(gVar);
                                this.f59684f.addView(j10);
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } else if (this.f59684f.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.c0();
                }
            }
        }
    }

    public final void k() {
        this.f59683e.clear();
        i();
    }

    public final void l(int i10) {
        this.f59683e.remove(i10);
        i();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        Integer num;
        super.onAttachedToWindow();
        this.f59701w = true;
        int f10 = n0.f(this);
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = n0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.h(new C5294a(f10, getId()));
        }
        if (this.f59687i == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                num = Integer.valueOf(getRootWindowInsets().getInsets(WindowInsets.Type.systemBars()).top);
            } else {
                num = Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
            }
            this.f59687i = num;
        }
        j();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59701w = false;
        int f10 = n0.f(this);
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = n0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.h(new C5296c(f10, getId()));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setBackButtonInCustomView(boolean z10) {
        this.f59698t = z10;
    }

    public final void setBackgroundColor(Integer num) {
        this.f59694p = num;
    }

    public final void setDirection(String str) {
        this.f59691m = str;
    }

    public final void setHeaderHidden(boolean z10) {
        this.f59685g = z10;
    }

    public final void setHeaderTranslucent(boolean z10) {
        this.f59686h = z10;
    }

    public final void setHidden(boolean z10) {
        this.f59685g = z10;
    }

    public final void setHideBackButton(boolean z10) {
        this.f59695q = z10;
    }

    public final void setHideShadow(boolean z10) {
        this.f59696r = z10;
    }

    public final void setTintColor(int i10) {
        this.f59700v = i10;
    }

    public final void setTitle(String str) {
        this.f59688j = str;
    }

    public final void setTitleColor(int i10) {
        this.f59689k = i10;
    }

    public final void setTitleFontFamily(String str) {
        this.f59690l = str;
    }

    public final void setTitleFontSize(float f10) {
        this.f59692n = f10;
    }

    public final void setTitleFontWeight(String str) {
        this.f59693o = m.d(str);
    }

    public final void setTopInsetEnabled(boolean z10) {
        this.f59699u = z10;
    }

    public final void setTranslucent(boolean z10) {
        this.f59686h = z10;
    }
}
